public class Coche {
    private int numeroPuertas;

   public Coche(int puerta) {
        this.numeroPuertas = puerta;
    }

    public void incrementar() {
        numeroPuertas++;
    }

    public int getNumeroPuertas() {
        return numeroPuertas;
    }

    public void setNumeroPuertas (int puertas){
        this.numeroPuertas = puertas;

    }

}
