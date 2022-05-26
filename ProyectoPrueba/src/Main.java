public class Main {

    public static void main(String[] args) {

        suma(10, 20, 30); // invocacion de la funcion suma

        Coche miCoche = new Coche();// instancia de la clase Coche
        miCoche.incrementarPuertas(); // incrementacion del numero de puertas del objeto miCoche
        System.out.println(miCoche.numeroPuertas);

    }
    // creacion de la funcion suma
    public static int suma(int a, int b, int c) {
        return a + b + c;
    }

}

// creacion de la clase Coche
class Coche {
    int numeroPuertas = 4; // propiedad de la clase coche que representa la cantidad de puertas
    // creacion de la funcion que incrementa la cantidad de puertas que tiene el coche
    public void incrementarPuertas() {
        this.numeroPuertas ++;
    }

}