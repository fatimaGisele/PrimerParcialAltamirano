package Problemas.Primero;

public class Cubo extends FiguraTridimensional{
    private double lado;
    public static final int CARAS = 6;

    public Cubo(double lado) {
        this.lado = lado;
    }

    public Cubo() {
        lado = 1;
    }

    @Override
    public double calcularVolumen() {
        return Math.pow(lado, 3);
    }

    @Override
    public double calcularSuperficie() {
        return (6* (Math.pow(lado, 2)));
    }

    @Override
    public String toString() {
        return "La figura es un Cubo";
    }
}
