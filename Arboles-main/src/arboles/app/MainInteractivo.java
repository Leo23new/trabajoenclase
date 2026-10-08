package arboles.app;

import arboles.negocio.ArbolBinario;
import java.util.Scanner;

public class MainInteractivo {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        ArbolBinario<String> arbol = new ArbolBinario<>();
        System.out.println("=== Árbol binario interactivo ===");
        mostrarMenu();
        boolean salir = false;
        while (!salir) {
            System.out.println();
            String opcion = ConsolaArbol.leer(entrada, "Opción (m para ver el menú): ");
            if (opcion == null) {
                break;
            }
            System.out.println();
            switch (opcion) {
                case "m":
                    mostrarMenu();
                    break;
                case "1":
                    ConsolaArbol.crearRaiz(entrada, arbol);
                    break;
                case "2":
                    ConsolaArbol.agregar(entrada, arbol, true);
                    break;
                case "3":
                    ConsolaArbol.agregar(entrada, arbol, false);
                    break;
                case "4":
                    ConsolaArbol.consultarNodo(entrada, arbol);
                    break;
                case "5":
                    ConsolaArbol.operaciones(arbol);
                    break;
                case "6":
                    VistaArbol.mostrar(arbol);
                    break;
                case "7":
                    arbol = ConsolaArbol.arbolDemo();
                    ConsolaArbol.mostrarEstado(arbol);
                    break;
                case "8":
                    arbol = new ArbolBinario<>();
                    System.out.println("Árbol nuevo y vacío");
                    break;
                case "0":
                    salir = true;
                    break;
                default:
                    System.out.println("Opción no válida");
            }
        }
        System.out.println("Hasta luego");
    }

    private static void mostrarMenu() {
        System.out.println();
        System.out.println("1) Crear raíz");
        System.out.println("2) Agregar hijo izquierdo");
        System.out.println("3) Agregar hijo derecho");
        System.out.println("4) Consultar un nodo");
        System.out.println("5) Ver operaciones del árbol");
        System.out.println("6) Ver el árbol en forma de lista");
        System.out.println("7) Cargar el árbol de la demostración");
        System.out.println("8) Empezar de nuevo");
        System.out.println("0) Salir");
    }
}
