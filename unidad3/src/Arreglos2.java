public class Arreglos2 {
    static void main() {
        String []nombres={"juan","karen","junior","camila","sergio"};
        int []edades={20,18,17,16,15};
        String nombreLetra= imprimirNombresLetraJ(nombres);
        String edadesMayores= imprimirEdadesMayores18(edades);
        Repositorio.mostrarMensaje(nombreLetra);
        Repositorio.mostrarMensaje(edadesMayores);

    }
    public static String imprimirNombresLetraJ(String []nombres){
        String mensaje= "Los nombres que empiezan por la letra j: \n";
        for(int i=0; i<nombres.length; i++){
            char primerLetra= nombres[i].charAt(0);
            if(primerLetra =='j'){
                mensaje +="-"+nombres[i]+"\n";
            }
        }
        return mensaje;
    }
    public static String imprimirEdadesMayores18(int[]edades){
        String mensaje="Las edades mayores a 18 son: \n";
        for(int i=0; i<edades.length; i++){
            if(edades[i]>=18){
                mensaje+= "-"+edades[i]+"\n";
            }
        }
        return mensaje;
    }
}
