import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class CalcularEdad {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        //definicion del formato de la fecha
        SimpleDateFormat formato = new SimpleDateFormat("yyyy-MM-dd");

        System.out.println("ingrese la fecha de su nacimiento en formato yyyy-MM-dd");
        String fecha = entrada.next();
        //conversion de string a date de java util
       try {
            Date fechaNac = formato.parse(fecha);
            System.out.println(formato.format(fechaNac));

           //fecha actual
           Calendar calendario = Calendar.getInstance();
           Date fechaActual = calendario.getTime();
           System.out.println(formato.format(fechaActual));

           //cambiamos el formato de la fecha
           formato = new SimpleDateFormat("yyyyMMdd");

           //covertimos a enteros las fechas de nacimiento y la fecha actual
           int fN = Integer.parseInt(formato.format(fechaNac));
           int fA = Integer.parseInt(formato.format(fechaActual));

           //restamos y dividimos para sacar la edad
           int edad = (fA - fN) /10000;
           System.out.println("edad = " + edad);

       } catch (ParseException e) {
            throw new RuntimeException(e);
       }
    }
}
