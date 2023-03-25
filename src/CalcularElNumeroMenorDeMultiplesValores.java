import java.util.Scanner;

public class CalcularElNumeroMenorDeMultiplesValores {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("ingrese la cantidad de numeros a comparar");
        int cant = entrada.nextInt();

        if(cant < 10){
            System.out.println("incorrecto, debes comparar al menos 10 numeros enteros");
        }else{
            int menor = Integer.MAX_VALUE;
            int numero;

            for(int i = 0; i < cant; i++){
                System.out.println("Ingrese el valor " + "#" + (i + 1) + ": ");
                numero = entrada.nextInt();
                menor = (numero < menor) ? numero : menor;
            }
            System.out.println("El número menor es: " + menor);

            if(menor < 10){
                System.out.println("el numero " + menor + " es menor a 10!");
            } else {
                System.out.println("el numero " + menor + " es mayor o igual que 10!");
            }
        }


    }
}
