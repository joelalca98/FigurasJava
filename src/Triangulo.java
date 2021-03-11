

public class Triangulo extends Figura {

    private double lado;

    public Triangulo (double lado)
    {
        this.lado = lado;
    }

    public double area()
    {
        return this.lado * this.lado * 0.5;
    }

    public String toString()
    {
        return "Triangulo area = "+ this.area();
    }

}