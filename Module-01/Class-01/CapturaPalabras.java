
import java.util.Scanner;

public class CapturaPalabras {

    public static void main(String[] args) {
        // Usamos Scanner para recibir datos del teclado
        Scanner lector = new Scanner(System.in);

        System.out.print("Por favor introduzca palabra 1: ");
        String p1 = lector.nextLine();

        System.out.print("Por favor introduzca palabra 2: ");
        String p2 = lector.nextLine();

        System.out.print("Por favor introduzca palabra 3: ");
        String p3 = lector.nextLine();

        //aqui en este punto  Mostramos el resultado concatenado en la linea de caracteres
        System.out.println("\nResultado:");
        System.out.println(p1 + " " + p2 + " " + p3);

        lector.close(); //  cerrar el programa esta es una buena practica para evitar errores 
    }
}
