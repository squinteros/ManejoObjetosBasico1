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
public class Futbolista {
    private String nombre;
    private int camiseta;
    private Equipo equipo;
    private Posicion posicion;
    private Estadio estadio;

    
    public Futbolista(String nombre, int camiseta, Equipo equipo, Posicion posicion, Estadio estadio) {

    this.nombre = nombre;
    this.camiseta = camiseta;
    this.equipo = equipo;
    this.posicion = posicion;
    this.estadio = estadio;
  
    }
    public String getNombre(){
        return nombre;
    }
    public int getCamiseta(){
        return camiseta;
    }
    public Equipo getEquipo(){
        return equipo;
    }
    public Posicion getPosicion(){
        return posicion;
    }
    public Estadio getEstadio(){
        return estadio;
    }
  
    
    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    public void setCamiseta(int camiseta){
        if(camiseta>=1 && camiseta<=11){
            this.camiseta=camiseta;
        }
        else{
            System.out.println("Numero de camiseta no valido..");
        }
        
    }
    public void setEquipo(Equipo equipo){
        this.equipo = equipo;
    }
    public void setPosicion(Posicion posicion){
        this.posicion = posicion;
    }
    public void setEstadio(Estadio estadio){
        this.estadio = estadio;
    }

    
    @Override
    public String toString(){
        return "Nombre: "+getNombre()+"||"+
                "Camiseta: "+getCamiseta()+"||"+
                "Equipo: "+getEquipo()+"||"+
                "Posicion: "+getPosicion()+"||"+
                "Estadio: "+getEstadio();
    }
}
