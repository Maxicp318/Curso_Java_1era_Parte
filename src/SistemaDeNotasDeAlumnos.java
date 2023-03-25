import java.util.Scanner;

public class SistemaDeNotasDeAlumnos {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double notas = 0;
        int notasMayor5 = 0;
        int notasMenor4 = 0;
        int notas1 = 0;
        double sumaNotaMayor5 = 0;
        double sumaNotasMenor4 = 0;
        double sumaTotal = 0;
        double promedioMayor5, promedioMenor4;
        boolean error = false;

        for(int i = 0; i < 20; i++){
            System.out.println("ingrese 20 notas finales, del 1 al 7. \ningrese nota " + (i + 1) + ":");
            notas = entrada.nextDouble();

            if(notas == 0){
               error = true;
               break;
            }
            if(notas == 1){
                notas1++;
            } else {
                if(notas > 5){
                    notasMayor5++;
                    sumaNotaMayor5 += notas;
                } else if (notas < 4) {
                    notasMenor4++;
                    sumaNotasMenor4 += notas;
                }
            }
            sumaTotal += notas;
        }

        if (error) {
            System.err.println("Error: No pueden haber notas con valor 0");
            System.exit(1);
        }
        // mostramos la cantidad de notas 1
        System.out.println("El número de notas 1 es de: " + notas1);
        //trabajamos con las notas superiores a 5
        if (notasMayor5 == 0) {
            System.out.println("No se puede calcular el promedio de notas sobre 5");
        } else {
            promedioMayor5 = sumaNotaMayor5 / notasMayor5;
            System.out.println("Promedio de notas mayores a 5: " + promedioMayor5);
        }

        // trabajamos con las notas inferiores a 4
        if (sumaNotasMenor4 == 0) {
            System.out.println("No se puede calcular el promedio de notas bajo 4");
        } else {
            promedioMenor4 = sumaNotasMenor4 / notasMenor4;
            System.out.println("Promedio de notas menores a 3: " + promedioMenor4);
        }

        // promedio total de las notas
        double promedioTotalNotas = sumaTotal / 20;
        System.out.println("Promedio total de notas: " + promedioTotalNotas);
    }
}
