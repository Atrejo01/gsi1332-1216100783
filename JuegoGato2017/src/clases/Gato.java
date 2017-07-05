/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

/**
 *
 * @author ca_tics
 */
public class Gato {
    /**
     * Este arreglo de dos dimensiones que funciona para guardar las
     * posiciones con las que se puede ganar.
     */
    private int[][] datos;
    /**
     * Esta cadena nos sirve para ingresar el nombre al jugador 1.
     */
    private String jugador1;
    /**
     * Esta cadena nos sirve para ingresar el nombre al jugador .
     */
    private String jugador2;
    /**
     * Estos atributos nos indican con que letra van a jugar.
     * 1= "X", 2="0"
     */
    private int tiroJ1;
    private int tiroJ2;
    /**
     * Este atributo va ser de ayuda para indicar de quien es turno.
     * true= turno J1
     * false= turno J2
     */
    private boolean turnoJ1;
    /**
     * Este atributo nos ayudara a tener control en los tiros que han hecho.
     */
    private int tiros;  // Número de tiros realizados
    /**
     * Es el constructor indicando cuales parametros se van a ocupar.
     */
    public Gato() {
        datos = new int[3][3];
        turnoJ1 = true;
        tiros = 0;
    }
    
    public void setJugador1(String jugador1) {
        this.jugador1 = jugador1;
    }

    public void setJugador2(String jugador2) {
        this.jugador2 = jugador2;
    }

//    public void setTiroJ2(int tiroJ2) {
//        this.tiroJ2 = tiroJ2;
//    }

    /**
     *  Metodo que nos indica la posicion del tiro.
     * @param pos 
     */

    public void setTiro(int pos) {
        // if (tiros < 9 && ganador() == 0) {
        int x;
        int y;
        x = pos / 3;   //fila
        y = pos % 3;   //columna
        if (turnoJ1) {
            datos[x][y] = tiroJ1;
        } else {
            datos[x][y] = tiroJ2;
        }
        //}
        System.out.println("tiro " + x + "," + y);
    }

    /**
     * Indica con que letra se va realizar el tiro.
     * @param tiroJ1 
     */
    public void setTiroJ1(int tiroJ1) {
        this.tiroJ1 = tiroJ1;
        if (tiroJ1 == 1) {  //Tira "X"
            tiroJ2 = 2;   //Tira "O"
        } else {
            tiroJ2 = 1;
        }
    }
    /**
     * Este metodo nos ayuda a cambiar el turno entre los jugadores.
     */
    public void cambiarTurno() {
        if (turnoJ1) {
            turnoJ1 = false;
        } else {
            turnoJ1 = true;
        }
        tiros++;
    }

    public boolean isTurnoJ1() {
        return turnoJ1;
    }

    public String getJugador1() {
        return jugador1;
    }

    public String getJugador2() {
        return jugador2;
    }

    public int getTiroJ1() {
        return tiroJ1;
    }

    public int getTiroJ2() {
        return tiroJ2;
    }

    public int getTiros() {
        return tiros;
    }

    /**
     * Metodo que revisa si los tiros estan en posiciones ganadoras.
     * @return 
     */
    public int ganador() {
        //int win=0;  //No hay ganador
        if (datos[0][0] != 0 && datos[0][0] == datos[0][1]
                && datos[0][0] == datos[0][2]) {
            return 1;  //ganador en fila 1
        }
        if (datos[1][0] != 0 && datos[1][0] == datos[1][1]
                && datos[1][0] == datos[1][2]) {
            return 2;  //ganador en fila 2
        }
        if (datos[2][0] != 0 && datos[2][0] == datos[2][1]
                && datos[2][0] == datos[2][2]) {
            return 3; //ganador en fila 3
        }
        if (datos[0][0] != 0 && datos[0][0] == datos[1][0]
                && datos[0][0] == datos[2][0]) {
            return 4;  //ganador en columna 1
        }
        if (datos[0][1] != 0 && datos[0][1] == datos[1][1]
                && datos[0][1] == datos[2][1]) {
            return 5;  //ganador en columna 2
        }
        if (datos[0][2] != 0 && datos[0][2] == datos[1][2]
                && datos[0][2] == datos[2][2]) {
            return 6;  //ganador en columna 6
        }
        if (datos[0][0] != 0 && datos[0][0] == datos[1][1]
                && datos[0][0] == datos[2][2]) {
            return 7;  //ganador en diagonal 1
        }
        if (datos[0][2] != 0 && datos[0][2] == datos[1][1]
                && datos[0][2] == datos[2][0]) {
            return 8;  //ganador en diagonal 2
        }
        return 0; // no hay ganador
    }

    /**
     * Metodo que nos indica empate al no haber un ganador.
     * @return 
     */
    public boolean esEmpate() {
        if (ganador() == 0 && tiros == 9) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * Con este metodo se reinicia la partida.
     * Borrando las posiciones de los tiros que ya se habian realizando.
     */
    public void reiniciar() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                datos[i][j] = 0;
            }
        }
        tiros = 0;
        turnoJ1 = true;
    }
}
