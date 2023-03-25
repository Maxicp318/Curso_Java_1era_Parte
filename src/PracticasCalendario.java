import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class PracticasCalendario {
    public static void main(String[] args) {

        Calendar calendario = Calendar.getInstance();

        //calendario.set(2023, 7, 29);
        calendario.set(Calendar.YEAR, 2023);
        calendario.set(Calendar.MONTH, Calendar.AUGUST);
        calendario.set(Calendar.DAY_OF_MONTH, 29);
        
        calendario.set(Calendar.HOUR_OF_DAY, 21);
        calendario.set(Calendar.MINUTE, 30);
        calendario.set(Calendar.SECOND, 22);

        Date fecha = calendario.getTime();
        System.out.println("fecha = " + fecha);

        SimpleDateFormat formato = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
        String fechaConFormato = formato.format(fecha);
        System.out.println("fecha Con Formato = " + fechaConFormato);
    }
}
