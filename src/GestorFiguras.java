import java.util.Arrays;

public class GestorFiguras
{
    public static void main(String[] args)
    {
        Figura cuadrado = new Cuadrado(2);
        Figura circulo = new Circulo(2.0);
        Figura triangulo = new Triangulo(2);
        Figura rectangulo = new Rectangulo(20,10);
        Figura[] figuras = {cuadrado,circulo,triangulo,rectangulo};

        for (Figura f:figuras)
        {
            System.out.println(f.toString());
        }

        System.out.println("Suma del area de todas las figuras : "+suma(figuras));
        sort(figuras);
        for (Figura f:figuras)
        {
            System.out.println(f.toString());
        }
    }

    public static double suma(Figura[] figuras)
    {
        double resultado = 0;

        for(int i = 0;i< figuras.length;i++)
        {
            resultado = resultado + figuras[i].area();
        }

        return resultado;
    }

    public static void sort(Figura[] figuras)

    {
        Arrays.sort(figuras);
    }
}
