public class ArgumentosLineaComandoCalculadora {
    public static void main(String[] args) {

        if (args.length != 3){
            System.err.println("Por favor ingrese una operacion y dos numero enteros");
            System.exit(-1);
        }
        String operacion = args[0];
        int a = Integer.parseInt(args[1]);
        int b = Integer.parseInt(args[2]);
        double resultado = 0.00;

        switch (operacion){
            case "suma":
                resultado = a+b;
                break;
            case "resta":
                resultado = a-b;
                break;
            case "multiplicacion":
                resultado = a*b;
                break;
            case "division":
                if(b == 0){
                    System.err.println("No se puede dividir por cero");
                    System.exit(-1);
                }
                resultado = (double) a/b;
                break;
            default:
                resultado =  a+b;
        }
        System.out.println("resultado de la operacion '" + operacion + "' es: " + resultado );
    }
}
