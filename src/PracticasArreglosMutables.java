import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class PracticasArreglosMutables {
    public static void ArregloInverso(String[] arreglo){
        int total2 = arreglo.length;
        int total = arreglo.length;

        for (int i = 0; i < total2; i++){
            String actual = arreglo[i];
            String inverso = arreglo[total -1 -i];
            arreglo[i] = inverso;
            arreglo[total -1 -i] = actual;
            total2--;
        }
    }
    public static void main(String[] args) {

        String[] productos = {"kingston", "samsung", "disco duro"};

        int total = productos.length;

        Arrays.sort(productos);
        ArregloInverso(productos);
        //Collections.reverse(Arrays.asList(productos));
        for (int i = 0; i < total; i++){
            System.out.println("para indice " + i + " : " + productos[i]);
        }
    }
}
