package reto;

import arboles.app.ConsolaArbol;
import arboles.modelo.Nodo;
import arboles.negocio.ArbolBinario;

import java.util.Scanner;

public class MainRetoInteractivo {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        ArbolBinario<String> arbol = new ArbolBinario<>();
        System.out.println("=== Reto interactivo: ¿árbol sano o árbol en cadena? ===");
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
                    arbol = arbolA();
                    ConsolaArbol.mostrarEstado(arbol);
                    break;
                case "2":
                    arbol = arbolB();
                    ConsolaArbol.mostrarEstado(arbol);
                    break;
                case "3":
                    arbol = new ArbolBinario<>();
                    System.out.println("Árbol nuevo y vacío");
                    break;
                case "4":
                    ConsolaArbol.crearRaiz(entrada, arbol);
                    break;
                case "5":
                    ConsolaArbol.agregar(entrada, arbol, true);
                    break;
                case "6":
                    ConsolaArbol.agregar(entrada, arbol, false);
                    break;
                case "7":
                    ConsolaArbol.consultarNodo(entrada, arbol);
                    break;
                case "8":
                    ConsolaArbol.operaciones(arbol);
                    break;
                case "9":
                    System.out.println("esCadena -> " + MainReto.esCadena(arbol));
                    System.out.println("altura " + arbol.altura() + ", nodos " + arbol.contarNodos());
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
        System.out.println("1) Cargar el árbol A del reto");
        System.out.println("2) Cargar el árbol B del reto");
        System.out.println("3) Empezar con un árbol vacío");
        System.out.println("4) Crear raíz");
        System.out.println("5) Agregar hijo izquierdo");
        System.out.println("6) Agregar hijo derecho");
        System.out.println("7) Consultar un nodo");
        System.out.println("8) Ver operaciones del árbol");
        System.out.println("9) ¿Es cadena?");
        System.out.println("0) Salir");
    }

    private static ArbolBinario<String> arbolA() {
        ArbolBinario<String> arbol = new ArbolBinario<>();
        Nodo<String> ltx = arbol.crearRaiz("LTX");
        Nodo<String> atf = arbol.agregarIzquierdo(ltx, "ATF");
        Nodo<String> mch = arbol.agregarDerecho(ltx, "MCH");
        arbol.agregarIzquierdo(atf, "TUA");
        arbol.agregarDerecho(atf, "IBB");
        Nodo<String> snc = arbol.agregarIzquierdo(mch, "SNC");
        arbol.agregarDerecho(mch, "OCC");
        arbol.agregarIzquierdo(snc, "LGQ");
        return arbol;
    }

    private static ArbolBinario<String> arbolB() {
        ArbolBinario<String> arbol = new ArbolBinario<>();
        Nodo<String> gps = arbol.crearRaiz("GPS");
        Nodo<String> scy = arbol.agregarDerecho(gps, "SCY");
        Nodo<String> mrr = arbol.agregarDerecho(scy, "MRR");
        Nodo<String> ptz = arbol.agregarDerecho(mrr, "PTZ");
        arbol.agregarDerecho(ptz, "TPN");
        return arbol;
    }
}
