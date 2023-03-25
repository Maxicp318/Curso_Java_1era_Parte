public class PracticasValidacionString {
    public static void main(String[] args) {
        String curso = null;

        boolean esNulo = curso == null;
        System.out.println("esNulo = " + esNulo);

        if(esNulo){
            curso = " ";
        }

        boolean esVacio = curso.isEmpty();
        boolean esBlanco = curso.isBlank();

        if(esBlanco == false) {
            System.out.println("Bienvenido al curso ".concat(curso));
        }
    }
}
