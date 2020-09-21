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
public enum Estadio {
    Monumental("Monumental","Av.Marathon 5300, Macul",1976),
    Nacional("Nacional","Av. Grecia 2001, Nuñoa",1940),
    San_Carlos("San Carlos de Apoquindo","Circunvalacion Las Flores 13000, Las Condes",1988);
    
    private final String estadio;
    private final String ubicacion;
    private final int anioConstruccion;
    
    private Estadio(String estadio, String ubicacion, int anioConstruccion){
        
        this.estadio = estadio;
        this.ubicacion = ubicacion;
        this.anioConstruccion = anioConstruccion;
     
    }

    public static Estadio getMonumental() {
        return Monumental;
    }

    public static Estadio getNacional() {
        return Nacional;
    }

    public static Estadio getSan_Carlos_de_Apoquindo() {
        return San_Carlos;
    }

    
    public String getEstadio() {
        return estadio;
    }
    
    public String getUbicacion() {
        return ubicacion;
    }

    public int getAnioConstruccion() {
        return anioConstruccion;
    }
    
    
}
