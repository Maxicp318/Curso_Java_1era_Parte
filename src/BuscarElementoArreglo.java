import java.util.Scanner;

public class BuscarElementoArreglo {
    public static void main(String[] args) {

        int[] a = new int[10];
        Scanner entrada = new Scanner(System.in);

        for (int i = 0; i < a.length; i++){
            System.out.print("ingrese un numero");
            a[i] = entrada.nextInt();
        }

        System.out.println("\r\ningrese un numero a buscar");
        int num = entrada.nextInt();

        for(int i = 0; i < a.length && a[i] != num; i++){
            if (i == a.length){
                System.out.println("numero no encontrado");
            } else if (a[i] == num) {
                System.out.println("numero encontrado en la posicion " + i);
            }
        }
    }
}
