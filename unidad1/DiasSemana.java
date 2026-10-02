public class DiasSemana {
    static void main() {
        int dia= Repositorio.ingresarEntero("Ingrese el número: ");
        String mensaje= determinarDia(dia);
        Repositorio.mostrarMensaje(mensaje);

    }
    public static String determinarDia (int dia){
        String mensaje="";
        switch (dia){
            case 1:
                mensaje= "Lunes.";
                break;
            case 2:
                mensaje="Martes.";
                break;
            case 3:
                mensaje="Miércoles.";
                break;
            case 4:
                mensaje="Jueves.";
                break;
            case 5:
                mensaje="Viernes.";
                break;
            case 6:
                mensaje="Sábado.";
                break;
            case 7:
                mensaje="Domingo.";
                break;
            default:
                mensaje= "Error, día no válido.";
        }
        return mensaje;
    }
}
