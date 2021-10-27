package Problemas.Primero;

public class Main {
    public static void main(String[] args) {
      /*un Ortoedro, un Cubo y un
TetraedroRegular. Para los nombres de los objetos, use los nombres de la clase empezando con letra
minúscula. Como parámetros en los constructores use los tres últimos números de su DNI para el
objeto Ortoedro, el penúltimo número de su DNI para el objeto Cubo y el último número de su DNI
para el objeto TetraedroRegular.*/
        Ortoedro ortoedro = new Ortoedro(0, 5, 7);
        System.out.println(ortoedro.toString());
        System.out.println("Superficie "+ortoedro.calcularSuperficie());
        System.out.println("Volumen: "+ortoedro.calcularVolumen());

        Cubo cubo = new Cubo(5);
        System.out.println(cubo.toString());
        System.out.println("Superficie: "+cubo.calcularSuperficie());
        System.out.println("Volumen: "+ cubo.calcularVolumen());

        TetraedroRegular tetraedroRegular = new TetraedroRegular(7);
        System.out.println(tetraedroRegular.toString());
        System.out.println("Superficie: "+tetraedroRegular.calcularSuperficie());
        System.out.println("Volumen: " + tetraedroRegular.calcularVolumen());

    }
}
