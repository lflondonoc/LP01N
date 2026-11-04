public class NotaMayor {
    static void main() {
        String []nombres={"juan","camila","karen","mateo"};
        double[]notas={3.2,4.5,2.8,3.8};
        String mensaje= imprimirEstudiantesNotaMayor3(nombres, notas);
        Repositorio.mostrarMensaje(mensaje);
    }

    public static String imprimirEstudiantesNotaMayor3(String[]nombres, double[] notas){
        String mensaje="Los estudiantes que tienen la nota superior a 3.0 son:\n";
        for(int i=0; i<notas.length; i++){
            if(notas[i]>3){
                mensaje+="-"+nombres[i]+" con una nota de "+notas[i]+"\n";
            }
        }
        return  mensaje;
    }
}
