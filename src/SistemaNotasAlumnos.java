import java.util.Scanner;

public class SistemaNotasAlumnos {
    public static void main(String[] args) {

        double[] matematica, historia, lengua;
        double sumaTotalMatematica = 0, sumaTotalHistoria = 0, sumaTotalLengua = 0;
        matematica = new double[7];
        historia = new double[7];
        lengua = new double[7];

        Scanner entrada = new Scanner(System.in);
        System.out.println("ingrese 7 notas de cada estudiante para matematicas");
        for (int i = 0; i < matematica.length; i++){
            matematica[i] = entrada.nextDouble();
        }

        System.out.println("ingrese 7 notas de cada estudiante para historia");
        for (int i = 0; i < historia.length; i++){
            historia[i] = entrada.nextDouble();
        }

        System.out.println("ingrese 7 notas de cada estudiante para lengua");
        for (int i = 0; i < lengua.length; i++){
            lengua[i] = entrada.nextDouble();
        }

        for (int i = 0; i < 7; i++){
            sumaTotalMatematica += matematica[i];
            sumaTotalHistoria += historia[i];
            sumaTotalLengua += lengua[i];
        }

        double promedioMatematica = (sumaTotalMatematica/matematica.length);
        double promedioHistoria = (sumaTotalHistoria/historia.length);
        double promedioLengua = (sumaTotalLengua/lengua.length);

        System.out.println("promedio de matematica " + promedioMatematica);
        System.out.println("promedio de historia " + promedioHistoria);
        System.out.println("promedio de lengua " + promedioLengua);
        System.out.println("promedio del curso " + promedioMatematica+promedioHistoria+promedioLengua/3);

        System.out.println("ingrese el identificador del alumno (de 0-6)");
        int id = entrada.nextInt();
        double promedioAlumno = (matematica[id] + historia[id] + lengua[id])/3;
        System.out.println("promedio del alumno " + id + " : " + promedioAlumno);

    }
}
