/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package solemne1;

/**
 *
 * @author Soporte
 */
public enum Posicion {
        Arquero,
        Defensa,
        Mediocampista,
        Delantero;

        public static Posicion getArquero() {
            return Arquero;
        }

        public static Posicion getDefensa() {
            return Defensa;
        }

        public static Posicion getMediocampista() {
            return Mediocampista;
        }

        public static Posicion getDelantero() {
            return Delantero;
        }

}
