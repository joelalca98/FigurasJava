public class Cuadrado extends Rectangulo {

    public Cuadrado (double lado)
    {
        super(lado,lado);
    }

    public String toString()
    {
        return "Cuadrado area = "+ this.area();
    }
}