import java.util.Map;

public class VariablesDeEntorno {
    public static void main(String[] args) {

        Map<String, String> varEnv = System.getenv();
        System.out.println("variables de ambiente del sistema = " + varEnv);

        System.out.println("----- Listado de variables de entorno del sistema -----");

        for (String key: varEnv.keySet()){
            System.out.println(key + " = " + varEnv.get(key));
        }

        String userName = System.getenv("USERNAME");
        System.out.println("userName = " + userName);
    }
}
