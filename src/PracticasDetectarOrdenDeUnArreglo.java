import java.util.Scanner;

public class PracticasDetectarOrdenDeUnArreglo {
    public static void main(String[] args) {

        int[] a = new int[7];

        Scanner entrada = new Scanner(System.in);
        System.out.println("ingrese 7 numeros:");

        for (int i = 0; i < a.length; i++){
            a[i] = entrada.nextInt();
        }

        boolean decendente = false;
        boolean ascendente = false;

        for (int i = 0; i < a.length -1; i++){
            if (a[i] > a[i+1]){
                decendente = true;
            }

            if (a[i] < a[i+1]){
                ascendente = true;
            }
        }

        if (ascendente == true && decendente == true){
            System.out.println("arreglo desordenado");
        }

        if (ascendente == false && decendente == false){
            System.out.println("arreglo todos son iguales");
        }

        if (ascendente == true && decendente == false){
            System.out.println("arreglo ordenado de forma ascendente");
        }

        if (ascendente == false && decendente == true){
            System.out.println("arreglo ordenado de forma decendente");
        }
    }
}
