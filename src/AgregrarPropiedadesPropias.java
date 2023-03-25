import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class AgregrarPropiedadesPropias {
    public static void main(String[] args) {

        try {
            FileInputStream archivo = new FileInputStream("src/config.properties.propias");

            Properties p = new Properties(System.getProperties());
            p.load(archivo);
            p.setProperty("mi.propiedad.personalizada", "mi valor guardao");

            System.setProperties(p);
            System.getProperties().list(System.out);
        } catch (Exception e) {
            System.err.println("no existe el archivo " + e);
            System.exit(1);
        }
    }
}
