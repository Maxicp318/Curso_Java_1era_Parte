import java.util.Scanner;

public class MultiplicarDosNumeros {
    public static void main(String[] args) {
        int numero1 = 0, numero2 = 0, resultado = 0;

        Scanner ingreso = new Scanner(System.in);

        System.out.println("ingrese el primer numero entero");
        numero1 = ingreso.nextInt();
        System.out.println("ingrese el segundo numero entero");
        numero2 = ingreso.nextInt();

        //verificamos los signo, si son positivos o negativos
        boolean positivo1 = numero1 > -1;
        boolean positivo2 = numero2 > -1;

        //calculamos el valor absoluto de numero1
        int absoluto1 = positivo1 ? numero1 : -numero1;

        //se suma el valor de numero2 tantas veces segun el valor de numero1
        for(int i = 0; i < absoluto1; i++){
            resultado = resultado + numero2;
        }

        //si los numero son negativo o solo numero1 es negativo damos vuelta el signo
        if((!positivo1 && !positivo2) || !positivo1){
            resultado = -resultado;
        }

        System.out.println("el resultado es = " + resultado);
    }
}
