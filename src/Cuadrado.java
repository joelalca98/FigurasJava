public class Cuadrado extends Figurita {

    private double lado;

    public Cuadrado (double lado) { this.lado = lado; }

    public double area() { return this.lado * this.lado; }
}