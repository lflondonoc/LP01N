import javax.swing.*;

public class Jardineria3 {

    static void main() {

        //1. Solicitar la longitud
        int longitud= Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese la longitud: "));

        //2. Solicitar el ancho
        int ancho= Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el ancho: "));

        //3. Calcular la superficie
        int area= longitud*ancho;

        //4. Construir y Mostrar el mensaje
        JOptionPane.showMessageDialog(null,"El valor de la longitud es: "+longitud+", el valor del ancho es de: "+ancho+". Por lo tanto la superficies es: "+area);


    }
}
