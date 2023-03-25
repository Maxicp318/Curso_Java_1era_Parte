import java.util.Scanner;

public class CalcularNumeroMayorDeUnArreglo {
    public static void main(String[] args) {

        int[] a = new int[5];
        Scanner entrada = new Scanner(System.in);

        System.out.println("ingrese 5 numeros enteros");

        for (int i = 0; i < a.length; i++){
            a[i] = entrada.nextInt();
        }

        int max = 0;

        for (int i = 1; i < a.length; i++){
            max = (a[max] > a[i]) ? max : i;
        }
        System.out.println("el numero mayor del arreglo es: " + a[max]);
    }
}
