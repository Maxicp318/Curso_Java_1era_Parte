public class PracticasStringEjemplos {
    public static void main(String[] args) {
        String archivo = "imagen.pdf";
        int i = archivo.lastIndexOf(".");//nos devuelve los caracteres desde el punto con indexOff y con lastIndexOff nos devuleve los caracteres despues de ultimo punto suponiendo que existieran dos puntos

        System.out.println(archivo.length());
        System.out.println(archivo.substring(i+1));

    }
}
