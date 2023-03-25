import java.util.Arrays;

public class PracticasOrdenamientoBurbuja {
    public static void main(String[] args) {

        String[] productos = {"kingston", "samsung", "disco duro"};

        int total = productos.length;
        int contador = 0;

        for (int i = 0; i < total; i++){
            for (int j = 0; j < total-1-i; j++){
                if (productos[j+1].compareTo(productos[j]) < 0){
                    String aux = productos[j];
                    productos[j] = productos[j+1];
                    productos[j+1] = aux;
                }
                contador++;
            }
        }
        System.out.println("contador = " + contador);

        for (int i = 0; i < total; i++){
            System.out.println("para indice " + i + " : " + productos[i]);
        }
    }
}
