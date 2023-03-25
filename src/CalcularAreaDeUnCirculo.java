import java.util.Scanner;

public class CalcularAreaDeUnCirculo {
    public static void main(String[] args) {
        int radio = 0;
        double area = 0;

        Scanner entrada = new Scanner(System.in);
        System.out.println("ingrese el radio de un circulo");
        radio = entrada.nextInt();

        area = Math.PI * Math.pow(radio, 2);

        System.out.println("area = " + area);
    }
}
