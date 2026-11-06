public class MayorEdad {
    static void main() {
        String[]nombres={"juan","camila","pedro"};
        int[]edades= {20,18,17};
        String mensaje= determinarNombresMayoresEdad(nombres,edades);
        Repositorio.mostrarMensaje(mensaje);

    }
    public static String determinarNombresMayoresEdad(String[]nombres, int[]edades){
        String mensaje="Los nombres de las personas mayores de edad son: \n";
        for(int i=0; i<nombres.length; i++){
            if(edades[i]>=18){
                mensaje+="-"+nombres[i]+"\n";
            }
        }
        return mensaje;
    }
}
