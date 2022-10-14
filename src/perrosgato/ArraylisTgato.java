package perrosgato;

import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.JOptionPane;

public class ArraylisTgato extends PerrosGato {

    ArrayList<Felino> Fel = new ArrayList();

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
        String nombre = Input("Ingrese el nombre del Felino");
        String raza = Input("Ingrese el nombre de la raza");
        String color = Input("Ingrese el color del Felino");
        int edad = Input1("Ingrese la edad del gato");
        int Ne = JOptionPane.showConfirmDialog(null, "El felino padece de toxoplasmosis.",
                "YES_NO_OPTION", JOptionPane.YES_NO_OPTION,
                JOptionPane.INFORMATION_MESSAGE);
         
                String mensaje = "";
        switch (Ne) {
        case 0:
            mensaje = " Sí ";
            
            break;
        case 1:
            mensaje = " No ";
            break;
        }
        JOptionPane.showMessageDialog(null, mensaje);
        Felino Fe = new Felino();
        Fe.setNombre(nombre);
        Fe.setRaza(raza);
        Fe.setMensaje(mensaje);
        Fe.setColor(color);
        Fe.setEdad(edad);
        Fe.setNe(Ne);
        Fel.add(Fe);
    }

    public void getFelino() {
        Iterator it = Fel.iterator();
        //verifica si existe otro elemento con el método hasNext()
        while (it.hasNext()) {
            Object objeto = it.next();
            Felino feli = (Felino) objeto;
            JOptionPane.showMessageDialog(null, feli.datos());
        }
    }

    public void limpiar() {
        int opcion;
        JOptionPane.showMessageDialog(null, "Tener en cuenta que el primer dato incertado empiezo en 0");
        opcion = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el la posicion a eliminar"));
        Fel.remove(opcion);
    }
}
