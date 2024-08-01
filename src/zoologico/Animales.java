
package zoologico;

class Animales extends Zoo {
    private String nombre;

    public Animales(String nombre) {
        super(0); // No necesitamos capacidad en esta clase
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    @Override
    public double cantar(double num) {
        double canto = Math.sqrt(num);
        System.out.println("Animales cantando..." + canto);
        return canto;
    }
}
