import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class PracticasDateParse {
    public static void main(String[] args) {

        Scanner entradaFecha = new Scanner(System.in);
        SimpleDateFormat formato = new SimpleDateFormat("yyyy-MM-dd");

        System.out.println("ingrese una fecha con formato yyyy-MM-dd");
        try {
            Date fecha = formato.parse(entradaFecha.next());
            System.out.println("fecha = " + fecha);
            System.out.println("formato = " + formato.format(fecha));

            Date fecha2 = new Date();
            System.out.println("fecha2 = " + fecha2);

            if(fecha.after(fecha2)){
                System.out.println("fecha1 (usuario) es despues de fecha2 (actual)");
            }else if(fecha.before(fecha2)){
                System.out.println("fecha1 es anterior a fecha2");
            }else if(fecha.equals(fecha2)){
                System.out.println("fecha1 es igual a fecha2");
            }
        } catch (ParseException e) {
            System.err.println("el formato de fecha es incorrecto " + e);
            System.err.println("el formato debe ser 'yyyy-MM-dd'");
            main(args);
        }

    }
}
