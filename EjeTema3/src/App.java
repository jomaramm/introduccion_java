public class App {

    public static void main(String[] args) {
        int resultado = suma(7, 4, 2);
        System.out.println(resultado);

        // cprueba coche
        Coche miCoche = new Coche(5);
        // Numero de puertas
        int puertas = miCoche.getNumeroPuertas();
        System.out.printf("Coche tiene %d puertas\n", puertas);
        System.out.println("Coche tiene " + puertas + " puertas");

        // incremeto de puertas
        miCoche.incrementar();
        puertas = miCoche.getNumeroPuertas();
        System.out.printf("Coche tiene %d puertas\n", puertas);
        miCoche.incrementar();

        System.out.printf("Coche tiene %d puertas\n", miCoche.getNumeroPuertas());
        
        
        // Establecer puertas
        miCoche.setNumeroPuertas(5);
        System.out.printf("Coche tiene %d puertas\n", miCoche.getNumeroPuertas());
    }

    // Crear una función con tres parámetros que sean números que se suman entre sí.
    public static int suma(int a, int b, int c) {
        return a + b + c;
    }

}
