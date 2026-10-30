import java.util.Scanner;

public class Calculadora {
    static void main() {
        mostrarMenuCalculadora();
    }
    public static void mostrarMenuCalculadora(){
        Scanner sc= new Scanner(System.in);
        int opcion=0;

        do{
            System.out.println("===CALCULADORA===");
            System.out.println("1.Sumar números. ");
            System.out.println("2.Restar números. ");
            System.out.println("3.Multiplicar números. ");
            System.out.println("4.Dividir números. ");
            System.out.println("5.Salir del programa. ");

            System.out.println("Elija una opción: ");
            opcion= sc.nextInt();

            switch (opcion){
                case 1:
                    System.out.print("Ingrese el primer número: ");
                    int num1= sc.nextInt();
                    System.out.print("Ingrese el segundo número: ");
                    int num2= sc.nextInt();
                    int suma= num1+num2;
                    System.out.println("La suma de "+num1+" + "+num2+" = "+suma);
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    System.out.println("Saliendo del programa.....");
                    break;
                default:
                    System.out.println("Opción no válida.....");
            }
        }while(opcion!=5);
    }
}
