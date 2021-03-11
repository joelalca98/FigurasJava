public class Circulo extends Figurita {
    private double radio;

    public Circulo (double r) { this.radio = radio;}

    public double are () { return Math.PI * Math.pow (this.radio, 2.0D); }
    public String toString () { return "Circulo radio:" + this.radio + "area ((" + this.area() + " ))" ;}

    public double area() {
        return 0;
    }
}