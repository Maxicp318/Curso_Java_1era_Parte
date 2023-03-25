public class PracticasStringMetodos {
    public static void main(String[] args) {
        String nombre = "Maxi";

        System.out.println(nombre.length());//obtiene la cantidad de caracteres
        System.out.println(nombre.toUpperCase());//transformacion en mayscula
        System.out.println(nombre.toLowerCase());//transformacion en minuscula
        System.out.println(nombre.equals("Maxi"));//compacion true o false
        System.out.println(nombre.equals("maxi"));
        System.out.println(nombre.equalsIgnoreCase("maxi"));//comparacion true o false ignorando mayuscula y minusculas, puntos y comas
        System.out.println(nombre.compareTo("Maxi"));//compara con los numeros de la tabla unicode
        System.out.println(nombre.compareTo("Marcos"));
        System.out.println(nombre.charAt(3));//seleciona el carcater indicado por su indice
        System.out.println(nombre.charAt(nombre.length()-1));//selecciona el ultimo caracter
        System.out.println(nombre.substring(1));//seleciona caracteres desde la posicion de indice que indiquemos
        System.out.println(nombre.substring(0, 2));//selecciona caracteres desde y hasta poniendo como parametros los indices
        System.out.println(nombre.replace("a", "@"));//remplaza caracteres
        System.out.println(nombre.indexOf("a"));//nos devuelve el indice del caracter
        System.out.println(nombre.lastIndexOf("a"));
        System.out.println(nombre.contains("x"));//verifica que contenga el carcter indicado en verdadero o falso
        System.out.println(nombre.startsWith("a"));//verifica que el string comience con los mismos caracteres indicados y devulve ture o false
        System.out.println(nombre.endsWith("i"));//este es lo contrario verifica que termine con los mismos caracteres
        System.out.println(nombre.trim());//elimina los espacios en blanco al comienzo y al final del texto
        System.out.println("nombre.toCharArray() = " + nombre.toCharArray());
        
        char[] arreglo = nombre.toCharArray();
        int largo = arreglo.length;
        System.out.println("largo = " + largo);
        for (int i = 0; i < largo; i++){
            System.out.println("arreglo = " + arreglo[i]);
        }

        System.out.println("nombre.split(\"a\") = " + nombre.split("a"));// la "a" vendria a ser el separador de los demas caracter
        String[] arreglo2 = nombre.split("a");
        int l = arreglo2.length;
        for (int j = 0; j < l; j++){
            System.out.println("arreglo2 = " + arreglo2[j]);
        }

        String archivo = "alguan.imagen.jpg";
        String[] archivoArr = archivo.split("\\.");//[] esto se usa para escapar un caracter reservado o especial
        l = archivoArr.length;
        for (int j = 0; j < l; j++){
            System.out.println(archivoArr[j]);
        }
        System.out.println("Extension = " + archivoArr[l-1]);
    }
}
