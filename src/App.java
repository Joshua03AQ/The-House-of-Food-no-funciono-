import java.util.ArrayList;
import java.util.Scanner;

public class App {
   
    public static Scanner sc = new Scanner(System.in); // Creacion del Scanner global para la lectura del usuario
    public static ArrayList<Menu> menu = new ArrayList<Menu>(); // Creacion del nuevo arraylist
    public static Menu MenuActual; // Creacion del arraylist MenuActual para guardar los valores recientes
    public static Menu MenuViejo; // Creacion del arraylist MenuViejo para guardar los valores del MenuActual
    public static boolean repetir = true; // Creacion de boolean de forma global para los ciclos

        public static void main(String[] args) throws Exception {
            System.out.println();
            System.out.println("Bienvenido al sistema de facturacion de The House Of Food");
            System.out.println();

            //Ciclo While para poder utilizar el Menu de manera eficiente 
            while (repetir) {
                // TryCatch por si suceden excepciones al usar el Menu
                
                System.out.println("¿Que accion desea realizar?");
                System.out.println("1. Mostrar productos vendidos en la factura anterior");
                System.out.println("2. Facturar");
                System.out.println("3. Ganancia de la anterior Factura");
                System.out.println("0. Salir");
                int respuesta = sc.nextInt(); // Creacio de variable para registrar la accion a realizar
                sc.nextLine();

                switch (respuesta) {
                    case 1:
                        
                        break;
                
                    default:
                        break;
                }
            }
    }
}
