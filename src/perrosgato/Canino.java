/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package perrosgato;

/**
 *
 * @author LENOVO
 */
public class Canino {

    private String nombre;
    private String raza;
    private String color;
    private int edad;
    private int Ne;

    public Canino() {
        nombre = "";
        raza = "";
        color = "";
        edad = 0;
        Ne = 0;
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
        return "El gato se llama "+nombre+" es un "+raza+ " es de color" +color + " y tiene "+edad+" años  \n";
      }
   

}
