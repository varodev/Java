package tresenraya;

import java.awt.Color;
import javax.swing.JOptionPane;

public class LogicaJuego {
    int turno, pX, p0; // Turno del jugador
    boolean habilitado; // Habilita y deshabilita el tablero

    /**
     * Inicializaremos el juego con las siguientes variables_
     *
     * @param turno (Nos indicará el turno del jugador: 0 - X, 1 - O)
     * @param pX (Contiene el valor total de las victorias de este jugador)
     * @param p0 (Contiene el valor total de las victorias de este jugador)
     */
    //Constructor
    public LogicaJuego(int turno, int pX, int p0) {
        this.turno = turno;
        this.pX = pX;
        this.p0 = p0;
    }

    /**
     * Obtener turno
     *
     * @return
     */
    //Getters & Setters
    //Para obtener el turno actual
    public int getTurno() {
        return turno;
    }

    /**
     * Insertar turno
     *
     * @param turno
     */
    public void setTurno(int turno) {
        this.turno = turno;
    }

    public int getpX() {
        return pX;
    }

    public void setpX(int pX) {
        this.pX = pX;
    }

    public int getP0() {
        return p0;
    }

    public void setP0(int p0) {
        this.p0 = p0;
    }

    /**
     * Llamaremos a este métod para cambiar de turno
     */
    //Para Cambiar el turno del jugador X al jugador O.
    public void cambioTurno() {
        // Inserta código aquí...
        if (getTurno() != 0) {
            turno = 0;
        } else {
            turno = 1;
        }
    }

    /**
     * Comprobar si se ha conseguido un tres en raya, en caso que se haya
     * conseguido devolverá 1, en caso contrario retorna 0 y continúa el juego
     *
     * @param matriz (Tablero de juego)
     * @return
     */
    //Para Comprobar si alguno de los jugadores ha conseguido 3 en raya (horizontal, vertical y diagonal)
    public int comprobarJuego(int matriz[][]) {
        // Inserta código aquí...
        //Comprobar si existe tres en raya
        //Comprobar horizontal
        if (matriz[2][0] == matriz[2][1] && matriz[2][1] == matriz[2][2]) {
            return 1;//3 en raya
        }
        if (matriz[1][0] == matriz[1][1] && matriz[1][1] == matriz[1][2]) {
            return 1;//3 en raya
        }
        if (matriz[0][0] == matriz[0][1] && matriz[0][1] == matriz[0][2]) {
            return 1;//3 en raya
        }
        //Comprobar vertical
        if (matriz[0][2] == matriz[1][2] && matriz[1][2] == matriz[2][2]) {
            return 1;//3 en raya
        }
        if (matriz[0][1] == matriz[1][1] && matriz[1][1] == matriz[2][1]) {
            return 1;//3 en raya
        }
        if (matriz[0][0] == matriz[1][0] && matriz[1][0] == matriz[2][0]) {
            return 1;//3 en raya
        }
        //Comprobar diagonal
        if (matriz[0][2] == matriz[1][1] && matriz[1][1] == matriz[2][0]) {
            return 1;//3 en raya
        }
        if (matriz[0][0] == matriz[1][1] && matriz[1][1] == matriz[2][2]) {
            return 1;//3 en raya
        }
        //Si no hay tres en raya
        return 0;
    }

    /**
     * Deshabilitará el botón para evitar que se vuelva a posicionar una ficha
     * en ese hueco
     *
     * @param bt (Botón seleccionado)
     * @param x (Posición x en el tablero)
     * @param y (Posición y en el tablero)
     * @param matriz (Tablero de juego)
     * @param jp (Panel dónde se sitúa el tablero de juego)
     * @param lX (JLabel del jugador X)
     * @param lO (JLabel del jugador O)
     * @return
     */
    
    public int tiradaJugador(javax.swing.JButton bt, int x, int y, int matriz[][],
            javax.swing.JPanel jp, javax.swing.JLabel lX, javax.swing.JLabel lO) {
        // Inserta código aquí...
        //Deshabilita el botón
        bt.setEnabled(false);//
        //Insertar la ficha en el botón 
        ponerFicha(matriz, x, y, bt);
        //Comprobar si se ha ganado la partida
        if (comprobarJuego(matriz) != 0) {
            //Si existe ganador
            ganador(lX, lO);
            //Deshabilita tablero
            habilitado = false;
            habilitarTablero(jp);
            //Mensaje avisando que ganaste
            mensajeGanaste();
        } else {
            //Cambiará el turno 
            cambioTurno();
        }
        return 0;
    }

    /**
     * Actualizar la puntuación de cada jugador al ganar la partida Al finalizar
     * el incremento de puntuación es necesario cambiar de turno
     *
     * @param lX (JLabel del jugador X)
     * @param lO (JLabel del jugador O)
     */
    //Actualiza la puntuación de cada jugador y cambiará de turno 
    public void ganador(javax.swing.JLabel lX, javax.swing.JLabel lO) {
        // Inserta código aquí...
        //Incrementa jugador ganador e inserta resultado en jLabel    
        if (getTurno() != 0) {
             p0++;
            lO.setText("" + p0);
        } else {
           pX++;
            lX.setText("" + pX);
        }
        //Para Cambiar el turno del jugador que perdió
        cambioTurno();
    }

    /**
     * Habilitará o deshabilitará el tablero dependiendo del estado de la
     * variable habilitado
     *
     * @param jp (Panel dónde se sitúa el tablero de juego)
     */
    //Habilitará o deshabilitará todos los botones dependiendo de la variable habilitado(setEnabled(habilitado)
    //es decir, todos los componentes del Jpanel que recibira por parametro
    public void habilitarTablero(javax.swing.JPanel jp) {
        // Inserta código aquí...
        for (int i = 0; i < jp.getComponents().length; i++) {
            //Bloquea todos los elementos del JPanel
            jp.getComponent(i).setEnabled(habilitado);
        }
    }

    /**
     * Insertaremos la ficha en la posición correspondiente de la matriz
     * Llamaremos al método pintarFicha
     *
     * @param matriz (Tablero de juego)
     * @param t (Turno)
     * @param x (Posición x en el tablero)
     * @param y (Posición y en el tablero)
     * @param bt (Botón pulsado)
     */
    //inserta la ficha en la matriz y llama al metodo decuado para pintar la ficha en el boton
    public void ponerFicha(int matriz[][], int x, int y, javax.swing.JButton bt) {
        // Inserta código aquí...
        //Insertar ficha en la posición de la matriz        
        matriz[x][y] = getTurno();
        pintarFicha(bt);
    }

    /**
     * Pintará la ficha en el tablero de juego visual, es decir, en el botón
     *
     * @param bt (Botón pulsado)
     */
    //Pinta la ficha en el boton del juego
    private void pintarFicha(javax.swing.JButton bt) {
        // Inserta código aquí...
        if (getTurno() == 1) {
            //Si el turno es de 1, pintará una O en azul 
            bt.setForeground(Color.blue);
            bt.setText("0");//
        } else {
            //Si el turno es de 0 pintará una X en rojo
            bt.setForeground(Color.red);//
            bt.setText("X");//
        }
    }

    /**
     * Inicializa una nueva partida, reinicia la matriz (Tablero de juego) y
     * habilita el tablero
     *
     * ¡¡¡¡No es necesario modificar este método!!!!.
     *
     * @param matriz (Tablero de juego)
     * @param jp (Panel dónde se sitúa el tablero de juego)
     */
    //Inicializa una nueva partida, reinicia la matriz(Tablero de juego) y habilita el tablero
    public void iniciarPartida(int matriz[][], javax.swing.JPanel jp) {
        //Rellenamos la matriz por primera vez, evitando que se repitan los números
        for (int x = 0; x < 3; x++) {
            for (int y = 0; y < 3; y++) {
                matriz[x][y] = (x + 10) * (y + 10);
            }
        }
        //Habilita tablero
        habilitado = true;
        habilitarTablero(jp);
    }
    
    public void mensajeGanaste(){
        String youWin = "Ganaste!";
        JOptionPane.showMessageDialog(null, youWin);
    }
}