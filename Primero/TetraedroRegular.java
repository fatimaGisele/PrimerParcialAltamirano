package Problemas.Primero;

public class TetraedroRegular extends FiguraTridimensional{
    private double arista;
    public static final int CARAS = 4;

    public TetraedroRegular(double arista) {
        this.arista = arista;
    }

    public TetraedroRegular() {
        arista = 1;
    }

    @Override
    public double calcularVolumen() {
        return  (Math.sqrt(2)) * ((Math.pow(arista,3))/ 12);
    }

    @Override
    public double calcularSuperficie() {
        return Math.sqrt(3) *(Math.pow(arista, 2));
    }

    @Override
    public String toString() {
        return "La figura es un TetraedroRegular" ;
    }
}
