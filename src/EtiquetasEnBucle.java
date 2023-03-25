public class EtiquetasEnBucle {
    public static void main(String[] args) {
        String frase = "tres triste trigres tragan trigo en un trigal";
        String palabra = "trigo";

        int maxPalabra = palabra.length();
        int maxFrase = frase.length() - maxPalabra;
        int cantidad = 0;

        char letra = 't';

        bucle1:
        for(int i = 0; i <= maxFrase; i++ ){
            int k = i;
            for(int j = 0; j < maxPalabra; j++){
                if(frase.charAt(k++) != palabra.charAt(j)){
                    continue bucle1;
                }
            }
            cantidad++;
        }
        System.out.println("encontrado " + cantidad + " veces la palabra " + palabra + "en la frase");
    }
}
