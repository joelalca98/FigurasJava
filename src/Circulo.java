public class Circulo extends Figura {

    private double radio;

    public Circulo (double r)
    {
        this.radio = r;
    }

    public double area()
    {
        double resultado;

        resultado = Math.PI * Math.pow (this.radio, 2.0);

        return Math.round(resultado*100)/100d;
    }

    public String toString()
    {
        return "Circulo area = "+ this.area();
    }
}