

public class Triangulo extends Figurita {

    private double lado;

    public Triangulo (double lado)
    {
        this.lado = lado;
    }

    public double area() { return this.lado * this.lado * 0.5; }

}