/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package perrosgato;

import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.JOptionPane;

public class ArraylisTperro extends PerrosGato {

    ArrayList<Canino> Can = new ArrayList();

    public String Input(String text) {
        return JOptionPane.showInputDialog(text);
    }

    public int Input1(String edad) {
        return Integer.parseInt(JOptionPane.showInputDialog(edad));
    }

    public int Input2(String Ne) {
        return Integer.parseInt(JOptionPane.showInputDialog(Ne));
    }

    public void addFe() {
        String nombre = Input("Ingrese el nombre del Perro");
        String raza = Input("Ingrese el nombre de la raza");
        String color = Input("Ingrese el color del Perro");
        int edad = Input1("Ingrese la edad del Perro");
        int Ne = Input2("Ingrese El nivel de 1 a 10 de entrenamiento del perro");
        if (Ne > 10) {
            JOptionPane.showMessageDialog(null, "Solo de 0 a 10");
        }
        Canino Cani = new Canino();
        Cani.setNombre(nombre);
        Cani.setRaza(raza);
        Cani.setColor(color);
        Cani.setEdad(edad);
        Cani.setNe(Ne);
        Can.add(Cani);
    }

    public void getCanino() {
        Iterator it = Can.iterator();
        //verifica si existe otro elemento con el método hasNext()
        while (it.hasNext()) {
            Object objeto = it.next();
            Canino cani = (Canino) objeto;
            JOptionPane.showMessageDialog(null, cani.datos());
        }

    }

    public void limpiar() {
        int opcion;
        JOptionPane.showMessageDialog(null, "Tener en cuenta que el primer dato incertado empiezo en 0");
        opcion = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el la posicion a eliminar"));
        Can.remove(opcion);
    }
}
