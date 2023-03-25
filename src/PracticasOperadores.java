public class PracticasOperadores {
    public static void main(String args[]){
        int i = 5, j = 4, suma = i + j;

        System.out.println("Resultado = " + suma);

        System.out.println(" i + j = " +  (i + j));//en la resta, multiplicaion, division y las demas operaciones tienen que ir entre parentesis

        int div = i / j;
        float div2 = (float) i / j;
        System.out.println("div = " + div);
        System.out.println("div2 = " + div2);

        //OPERADORES DE INCREMENTO

        //pre incremento
        int l = 1;
        int k = ++l;
        System.out.println("l = " + l);
        System.out.println("k = " + k);

        //pos incremento
        int m = 2;
        int n = m++;
        System.out.println("m = " + m);
        System.out.println("n = " + n);
    }
}
