public class MayorEdad3 {
    static void main() {
        String[]nombres={"juan","camila","pedro"};
        int[]edades= {20,18,17};
        int contador= contadorEdadesMayor(edades);
        String []nuevoArreglo= determinarNombresMayoresEdad(nombres,edades, contador);
        String mensaje= obtenerNuevoArreglo(nuevoArreglo);
        Repositorio.mostrarMensaje(mensaje);


    }
    public static int contadorEdadesMayor(int []edades){
        int contador=0;
        for(int i=0; i<edades.length;i++){
            if(edades[i]>=18){
                contador++;
            }
        }
        return contador;
    }
    public static String[]determinarNombresMayoresEdad(String []nombres, int[]edades, int contador){
        String [] nuevoArreglo= new String[contador];
        int j=0;

        for(int i=0; i< nombres.length; i++){
            if(edades[i]>=18){
                nuevoArreglo[j]=nombres[i];
                j++;
            }
        }
        return nuevoArreglo;
    }
    public static String obtenerNuevoArreglo(String[]nuevoArreglo){
        String mensaje="Los nombres de las personas mayores de edad son: \n";
        for(String elemento: nuevoArreglo){
            mensaje+="-"+elemento+"\n";
        }
        return mensaje;
    }

}
