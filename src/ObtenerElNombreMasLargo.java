import javax.swing.*;

//Obtener el nombre mas largo de tres personas, según los siguientes requerimientos
//Mediante el teclado pedir el nombre completo (nombre + apellido) de tres miembros de la familia o
//amigos usando la clase JOptionPane y método showInputDialog().
//Calcular e Imprimir el nombre de la persona que tenga el nombre más largo (en cantidad de caracteres)
//(Imprimir sólo uno de los tres, el de más caracteres en el nombre.)
//Podría usar .split(" "); del objeto String para separar nombre y apellido en un arreglo, y
//con el indice cero accedemos al nombre de la persona.
//Restricción no usar loops en el desarrollo de la tarea.
//Ejemplo del resultado: "Guillermo Doe tiene el nombre más largo."
//Questions for this assignment
public class ObtenerElNombreMasLargo {
    public static void main(String[] args) {
        String persona1 = JOptionPane.showInputDialog(null, "Ingrese el nombre y el apellido del primer familiar o amigo:");
        String persona2 = JOptionPane.showInputDialog(null, "Ingrese el nombre y el apellido del segundo familiar o amigo:");
        String persona3 = JOptionPane.showInputDialog(null, "Ingrese el nombre y el apellido del primer familiar o amigo:");

        String masLargo = persona1.split(" ")[0].length() < persona2.split(" ")[0].length() ? persona2 : persona1;
        masLargo = persona3.split(" ")[0].length() < masLargo.split(" ")[0].length() ? masLargo : persona3;

        JOptionPane.showMessageDialog(null, "El nombre mas largo es: ".concat(masLargo));
    }
}
