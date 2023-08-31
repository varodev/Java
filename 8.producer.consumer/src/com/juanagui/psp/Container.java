package com.juanagui.psp;

public class Container {//clase que comparte consumidor y productor
    private int _value;
    private boolean _valueAvailable;//si hay un valor metido o si no lo hay ; si no lo hay es que lo han leido
    //hebra productora
    public synchronized void put(int i) {//En un método synchronized, esperamos a que se cumpla una condición en un bucle que contiene
        while (_valueAvailable) {//bucle infinito hasta que no haya valor disponible
            try {//bloquea la ejecución y libera el candado
                wait();//hebra que espera es la hebra productora, ha intentado meter un valor y se ha encontrado que ya hay un valor y tiene que esperar hasta que alguien lea el valor
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        _value = i;
        _valueAvailable = true;
        System.out.printf("Producer: container.put(%d)%n", i);
        notifyAll();
    }
    //hebra consumidora que no lea nada mientras no este disponible (se espera)
    public synchronized int get() {//hasta que no acabe put, no se entra get
        while (!_valueAvailable) {//no lea nada mientras no este disponible--> me espero; liberaria el candado
            try {
                wait();//sale del wait cuando alguna hebra llame a notifyAll();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        _valueAvailable = false;//no hay valor disponible xq alguien lo va a leer
        System.out.printf("Consumer: container.get(%d)%n", _value);
        notifyAll();
        return _value;
    }
}
