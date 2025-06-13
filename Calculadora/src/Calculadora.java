import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner sacnner = new Scanner(System.in);

        System.out.println("Ingrese el primer número: ");
        double numeroUno = sacnner.nextDouble();

        System.out.println("Ingrese el segundo número: ");
        double numeroDos = sacnner.nextDouble();

        double suma = numeroUno + numeroDos;
        double resta = numeroUno - numeroDos;
        double multiplicacion = numeroUno * numeroDos;
        double division = numeroDos != 0 ? numeroUno/numeroDos : 0;
        double modulo = numeroDos != 0 ? numeroUno % numeroDos :0;

        System.out.println("Suma: " + suma);
        System.out.println("Resta: " + resta);
        System.out.println("Multiplicacion: " + multiplicacion);

        if (numeroDos != 0) {
            System.out.println("División: " + division);
            System.out.println("Modulo: " + modulo);
        } else {
            System.out.println("No se puede dividir entre cero");
        }

        sacnner.close();







    }
}
