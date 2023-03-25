import java.util.Scanner;

public class DetalleDeFactura {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el nombre de la factura: ");
        String nombreFac = sc.nextLine();

        System.out.println("Ingrese el precio del producto 1: ");
        double precio1 = sc.nextDouble();

        System.out.println("Ingrese el precio del producto 2:");
        double precio2 = sc.nextDouble();

        double totalBruto = precio1 + precio1;
        double impuesto = totalBruto * 0.19;
        double totalNeto = totalBruto + impuesto;

        String resultado = "La factura " + nombreFac + "\n Total bruto: " + totalBruto + "\n Impuesto: "
                + impuesto + "\nMonto total: " + totalNeto;

        System.out.println(resultado);
    }
}
