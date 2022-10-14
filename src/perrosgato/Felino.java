/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package perrosgato;

public class Felino {

    private String nombre;
    private String raza;
    private String color;
    private String mensaje;
    private int edad;
    private int Ne;

    public Felino() {
        nombre = "";
        raza = "";
        color = "";
        mensaje="";
        edad = 0;
        Ne = 0;
        
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getNe() {
        return Ne;
    }

    public void setNe(int Ne) {
        this.Ne = Ne;
    }

      public String datos(){

        return "El gato se llama "+getNombre()+", es un "+getRaza()+ ", es de color" +getColor() + ", tiene "+getEdad()+" años,"+" el felino "+getMensaje()+"padece de toxoplasmosis";

      }
   

}
