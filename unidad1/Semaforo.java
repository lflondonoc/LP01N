import javax.swing.*;

public class Semaforo {
    static void main() {
        String color= Repositorio.ingresarTexto("Ingrese el color: ");
        String mensaje= determinarColor(color);
        Repositorio.mostrarMensaje(mensaje);

    }
    public static String determinarColor(String color){
        String mensaje="";
        switch (color){
            case "rojo":
                mensaje= "Detenerse.";
                break;
            case "amarillo":
                mensaje ="Precaución.";
                break;
            case "verde":
                mensaje = "Continuar.";
                break;
            default:
                mensaje = "No sirve.";
        }
        return mensaje;
    }
}
