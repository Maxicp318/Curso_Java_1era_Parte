import java.util.Scanner;

public class ProgramaManejoDeNombres {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese nombre del primer familiar: ");
        String primerNombre = scanner.nextLine();
        String primerNombreConv = primerNombre.toUpperCase().charAt(1) + "." + primerNombre.substring(primerNombre.length()-2);

        System.out.println("Ingrese nombre del segundo familiar: ");
        String segundoNombre = scanner.nextLine();
        String segundoNombreConv = segundoNombre.toUpperCase().charAt(1) + "." + segundoNombre.substring(segundoNombre.length()-2);

        System.out.println("Ingrese nombre del tercer familiar: ");
        String tercerNombre = scanner.nextLine();
        String tercerNombreConv = tercerNombre.toUpperCase().charAt(1) + "." + tercerNombre.substring(tercerNombre.length()-2);

        String resultado = primerNombreConv + "_" + segundoNombreConv + "_" + tercerNombreConv;
        System.out.println(resultado);
    }
}
