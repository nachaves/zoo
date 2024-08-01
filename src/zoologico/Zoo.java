
package zoologico;

/**
Estas clases estan sujetas a cambios y perspectivas
* del programador 
* 
* CUMPLA CON LOS CASOS DE USO
 */
abstract class Zoo {
    protected Animales[] jaulas;

    public Zoo(int capacidad) {
        jaulas = new Animales[capacidad];
    }

    public abstract double cantar(double num);

    public int alojarAnimal(Animales animal) {
        for (int i = 0; i < jaulas.length; i++) {
            if (jaulas[i] == null) {
                jaulas[i] = animal;
                return i;
            }
        }
        return -1; // Si no hay espacio disponible
    }

    public Animales[] getAnimales() {
        return jaulas;
    }
}

class ZooImpl extends Zoo {
    private String ubicacion;

    public ZooImpl(String ubicacion, int capacidad) {
        super(capacidad);
        this.ubicacion = ubicacion;
    }

    @Override
    public double cantar(double num) {
        // Implementación del método abstracto
        return 0;
    }
}

