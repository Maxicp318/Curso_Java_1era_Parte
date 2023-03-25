import java.util.Scanner;
//El desafío es un programa que pide dos números y los muestra ordenados de mayor a menor.
//Podría ser utilizando un operador ternario.

public class NumeroDeMayorAMenor {
    public static void main(String[] args) {
        int num1 = 0, num2 = 0;

        Scanner entrada = new Scanner(System.in);

        System.out.println("ingrese el primer numero:");
        num1 = entrada.nextInt();

        System.out.println("ingrese el segundo numero:");
        num2 = entrada.nextInt();

        String orden = (num1 > num2) ? num1 + " y " + num2 : num2 + " y " + num1;

        System.out.println("El orden es: " + orden);

    }
}
