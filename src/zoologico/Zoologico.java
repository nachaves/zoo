/*
 * Desarrollar el tema de Jswing que usted seleccione (parejas)
    Debe subir 6 versiones del codigo en github
    Aproveche y repase para el parcial
 

*/
package zoologico;

import javax.swing.JOptionPane;

public class Zoologico {

    public static void main(String[] args) {
        Zoo zooAndes = new ZooImpl("Cundinamarca", 10); // Capacidad para 10 animales
        String[] opciones = {"Agregar Animal", "Ver Animales", "Salir"};

        int seleccion;
        do {
            seleccion = JOptionPane.showOptionDialog(null, "Seleccione una opción", "Gestión del Zoológico",
                    JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, opciones, opciones[0]);

            switch (seleccion) {
                case 0:
                    agregarAnimal(zooAndes);
                    break;
                case 1:
                    verAnimales(zooAndes);
                    break;
                case 2:
                    JOptionPane.showMessageDialog(null, "Saliendo del programa.");
                    break;
                default:
                    break;
            }
        } while (seleccion != 2);
    }

    public static void agregarAnimal(Zoo zoo) {
        String nombre = JOptionPane.showInputDialog("Ingrese el nombre del animal:");
        Animales animal = new Animales(nombre);
        zoo.alojarAnimal(animal);
        JOptionPane.showMessageDialog(null, "Animal agregado: " + nombre);
    }

    public static void verAnimales(Zoo zoo) {
        StringBuilder animalesInfo = new StringBuilder();
        for (Animales animal : zoo.getAnimales()) {
            if (animal != null) {
                animalesInfo.append(animal.getNombre()).append("\n");
            }
        }
        JOptionPane.showMessageDialog(null, animalesInfo.length() > 0 ? animalesInfo.toString() : "No hay animales en el zoológico.");
    }
}
