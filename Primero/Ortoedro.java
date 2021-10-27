package Problemas.Primero;

public class Ortoedro extends FiguraTridimensional{
    private double ancho;
    private double base;
    private double altura;
    public static final int CARAS = 6;

    public Ortoedro(double ancho, double b, double altura) {
        this.ancho = ancho;
        base = b;
        this.altura = altura;
    }

    public Ortoedro() {
        ancho = 1;
        base = 1;
        altura = 1;
    }

    @Override
    public double calcularVolumen() {
        double volumen = (ancho * base * altura);
        return volumen;
    }

    @Override
    public double calcularSuperficie() {
        double superficie;
        superficie= (2 * (this.ancho * this.base)) + (2 * (this.ancho * this.altura)) +
                (2 * ( this.base * this.altura));
        return superficie;
    }

    @Override
    public String toString() {
        return "La figura es un Ortoedro";
    }
}
