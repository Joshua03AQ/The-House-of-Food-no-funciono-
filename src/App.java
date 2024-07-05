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
            // Crear una única instancia de Funcionalidades
            MenuActual = new Funcionalidades(0, 0, 0, 0, 0, 0, 0, 0);
            // Crear una instancia para guardar todo lo del MenuActual
            MenuViejo = new Funcionalidades(0, 0, 0, 0, 0, 0, 0, 0);
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
    // Metodo de Facturacion
    public static void facturar() throws Exception{// throws Excepcion para indicar que indicar que puede suceder una excepcion
        do {
            // Menu para facturar productos
            System.out.println("¿Qué producto desea facturar?");
            System.out.println("1- Hamburguesa C$30");
            System.out.println("2- Papas C$15");
            System.out.println("3- Refresco C$12");
            System.out.println("4- Pizza C$70");
            System.out.println("5- Nughet C$25");
            System.out.println("6- Ensalada C$30");
            System.out.println("7- Yoguth C$15");
            System.out.println("8- Agua C$12");
            System.out.println("9- Imprimir factura");
            System.out.println("0- Regresar");
            int opcion2 = sc.nextInt(); // Lector para poder escoger la accion
            sc.nextLine(); // Limpiador del buffer
        switch (opcion2) {
            case 1:
                ingresarHamburguesas();
                System.out.println("¿Desea continuar?"); // Preguntar di estan bien los datos para que no haya conflictos al lanzar la factura
                System.out.println("1- Si");
                System.out.println("2- Corregir datos");
                int opcion3 = 0;
                opcion3 = sc.nextInt();
                sc.nextLine();
                switch (opcion3) {
                    case 1:
                        break;
                    case 2:
                        MenuActual.Hamburg = 0;
                        continue;
                    default:
                        break;
                }
                break;
            case 2:
                ingresarPapas();
                System.out.println("¿Desea continuar?");
                System.out.println("1- Si");
                System.out.println("2- Corregir datos");
                opcion3 = sc.nextInt();
                sc.nextLine();
                switch (opcion3) {
                    case 1:
                        break;
                    case 2:
                        MenuActual.Papa = 0;
                        continue;
                    default:
                        break;
                }
                break;
            case 3:
                ingresarRefrescos();
                System.out.println("¿Desea continuar?");
                System.out.println("1- Si");
                System.out.println("2- Corregir datos");
                opcion3 = sc.nextInt();
                sc.nextLine();
                switch (opcion3) {
                    case 1:
                        break;
                    case 2:
                        MenuActual.Refresc = 0;
                        continue;
                    default:
                        break;
                }
                break;
            case 4:
                ingresarPizzas();
                System.out.println("¿Desea continuar?");
                System.out.println("1- Si");
                System.out.println("2- Corregir datos");
                opcion3 = sc.nextInt();
                sc.nextLine();
                switch (opcion3) {
                    case 1:
                        break;
                    case 2:
                        MenuActual.Pizzas = 0;
                        continue;
                    default:
                        break;
                }
                break;
            case 5:
                ingresarNughets();
                System.out.println("¿Desea continuar?");
                System.out.println("1- Si");
                System.out.println("2- Corregir datos");
                opcion3 = sc.nextInt();
                sc.nextLine();
                switch (opcion3) {
                    case 1:
                        break;
                    case 2:
                        MenuActual.Nughuets = 0;
                        continue;
                    default:
                        break;
                }
                break;
            case 6:
                ingresarEnsaladas();
                System.out.println("¿Desea continuar?");
                System.out.println("1- Si");
                System.out.println("2- Corregir datos");
                opcion3 = sc.nextInt();
                sc.nextLine();
                switch (opcion3) {
                    case 1:
                        break;
                    case 2:
                        MenuActual.Enesalada = 0;
                        continue;
                    default:
                        break;
                }
                break;
            case 7:
                ingresarYogurts();
                System.out.println("¿Desea continuar?");
                System.out.println("1- Si");
                System.out.println("2- Corregir datos");
                opcion3 = sc.nextInt();
                sc.nextLine();
                switch (opcion3) {
                    case 1:
                        break;
                    case 2:
                        MenuActual.Yogurth = 0;
                        continue;
                    default:
                        break;
                }
                break;
            case 8:
                ingresarAgua();
                System.out.println("¿Desea continuar?");
                System.out.println("1- Si");
                System.out.println("2- Corregir datos");
                opcion3 = sc.nextInt();
                sc.nextLine();
                switch (opcion3) {
                    case 1:
                        break;
                    case 2:
                        MenuActual.Agua = 0;
                        continue;
                    default:
                        break;
                }
                break;
            case 9:
                MenuActual.factura();
                MenuActual.Hamburg=0; //Para poder limpiar el menu Actual y reinicar toda la factura
                MenuActual.Papa=0;
                MenuActual.Refresc=0;
                MenuActual.Pizzas=0;
                MenuActual.Nughuets=0;
                MenuActual.Enesalada=0;
                MenuActual.Yogurth=0;
                MenuActual.Agua=0;
                break;
            case 0:
                return;
            default:
                System.out.println("Opcion no valida");
                break;
        }
        } while (repetir);
    }
        // Acceder directamente al atributo de la instancia del menu actual
        public static void ingresarHamburguesas() {
            System.out.println("Ingrese la cantidad de hamburguesa");
            MenuActual.Hamburg = sc.nextDouble();
            MenuViejo.Hamburg = MenuActual.Hamburg;
            sc.nextLine();
            MenuActual.facturacionHamburguesa(0.15);
            System.out.println("===================================");
        }
        public static void ingresarPapas() {
            System.out.println("Ingrese la cantidad de papa");
            MenuActual.Papa = sc.nextDouble();
            MenuViejo.Papa = MenuActual.Papa;
            sc.nextLine();
            MenuActual.facturacionPapas(0.15);
            System.out.println("===================================");
        }
        public static void ingresarRefrescos() {
            System.out.println("Ingrese la cantidad de refresco");
            MenuActual.Refresc = sc.nextDouble();
            MenuViejo.Refresc = MenuActual.Refresc;
            sc.nextLine();
            MenuActual.facturacionRefrescos(0.15);
            System.out.println("===================================");
        }
        public static void ingresarPizzas() {
            System.out.println("Ingrese la cantidad de pizza");
            MenuActual.Pizzas = sc.nextDouble();
            MenuViejo.Pizzas = MenuActual.Pizzas;
            sc.nextLine();
            MenuActual.facturacionPizzas(0.15);
            System.out.println("===================================");
        }
        public static void ingresarNughets() {
            System.out.println("Ingrese la cantidad de nughet");
            MenuActual.Nughuets = sc.nextDouble();
            MenuViejo.Nughuets = MenuActual.Nughuets;
            sc.nextLine();
            MenuActual.facturacionNughuets(0.15);
            System.out.println("===================================");
        }
        public static void ingresarEnsaladas() {
            System.out.println("Ingrese la cantidad de ensalada");
            MenuActual.Enesalada = sc.nextDouble();
            MenuViejo.Enesalada = MenuActual.Enesalada;
            sc.nextLine();
            MenuActual.facturacionEnsaladas(0.15);
            System.out.println("===================================");
        }
        public static void ingresarYogurts() {
            System.out.println("Ingrese la cantidad de yogurt");
            MenuActual.Yogurth = sc.nextDouble();
            MenuViejo.Yogurth = MenuActual.Yogurth;
            sc.nextLine();
            MenuActual.facturacionYoghurt(0.15);
            System.out.println("===================================");
        }
        public static void ingresarAgua() {
            System.out.println("Ingrese la cantidad de agua");
            MenuActual.Agua = sc.nextDouble();
            MenuViejo.Agua = MenuActual.Agua;
            sc.nextLine();
            MenuActual.facturacionAgua(0.15);
            System.out.println("===================================");
        }
}
