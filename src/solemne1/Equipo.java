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
public enum Equipo {
    
        Colo_Colo("Colo-Colo",1),
        U_de_Chile("Universidad de Chile",2),
        U_Catolica("Universidad Catolica",3); 
        
        private final String equipo;        
        private final int tabla;
        
        
        private Equipo(String equipo, int tabla){
            this.equipo = equipo;
            this.tabla = tabla;
            
        }

        public static Equipo getColo_Colo() {
            return Colo_Colo;
        }

        public static Equipo getU_de_Chile() {
            return U_de_Chile;
        }

        public static Equipo getU_Catolica() {
            return U_Catolica;
        }

        public String getEquipo() {
            return equipo;
        }

        public int getTabla() {
            return tabla;
        }
        
    
}
