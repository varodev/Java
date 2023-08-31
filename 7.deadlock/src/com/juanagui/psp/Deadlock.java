package com.juanagui.psp;
//El principal problema que podemos encontrar es el interbloqueo (deadlock)
public class Deadlock {//Interbloqueo:Cuando dos o más hilos están bloqueados para siempre, esperando unos a otros
    static class Friend {
        private final String name;
        public Friend(String name) {
            this.name = name;
        }
        public String getName() {
            return this.name;
        }
        public synchronized void bow(Friend bower) {//metodo inclinar
            System.out.format("%s: %s"
                            + "  has bowed to me!%n",
                    this.name, bower.getName());
            bower.bowBack(this);//devolver inclinacion al amigo
        }
        public synchronized void bowBack(Friend bower) {
            System.out.format("%s: %s"
                            + " has bowed back to me!%n",
                    this.name, bower.getName());
        }
    }
    public static void main(String[] args) {//dos  amigos llaman cada uno al metodo bow
        final Friend alphonse = new Friend("Alphonse");
        final Friend gaston = new Friend("Gaston");
        new Thread(new Runnable() {
            public void run() {
                alphonse.bow(gaston);
            }
        }).start();
        new Thread(new Runnable() {
            public void run() {
                gaston.bow(alphonse);
            }
        }).start();
    }//no hay progreso, dos hebras pasan al estado de bloqueado
}