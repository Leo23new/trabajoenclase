package reto;

import arboles.modelo.Nodo;
import arboles.negocio.ArbolBinario;
import arboles.app.VistaArbol;

public class MainReto {

    public static void main(String[] args) {
        System.out.println("=== RETO: ¿ÁRBOL SANO O ÁRBOL EN CADENA? ===\n");

        System.out.println("--- PARTE 1: Construcción del Árbol A ---");
        ArbolBinario<String> arbolA = new ArbolBinario<>();

        Nodo<String> ltx = arbolA.crearRaiz("LTX");

        Nodo<String> atf = arbolA.agregarIzquierdo(ltx, "ATF");
        arbolA.agregarIzquierdo(atf, "TUA");
        arbolA.agregarDerecho(atf, "IBB");

        Nodo<String> mch = arbolA.agregarDerecho(ltx, "MCH");
        Nodo<String> snc = arbolA.agregarIzquierdo(mch, "SNC");
        arbolA.agregarIzquierdo(snc, "LGQ");
        arbolA.agregarDerecho(mch, "OCC");

        System.out.println("Árbol A construido correctamente.");
        VistaArbol.mostrar(arbolA);
        System.out.println();

        System.out.println("--- PARTE 2: Consultas sobre el Árbol A ---");
        System.out.println("Raíz: " + (arbolA.getRaiz() != null ? arbolA.getRaiz().getDato() : "N/A"));
        System.out.println("Cantidad de nodos: " + arbolA.contarNodos());
        System.out.println("Cantidad de hojas: " + arbolA.contarHojas());
        System.out.println("Altura: " + arbolA.altura());
        System.out.println("Grado de LTX: " + ltx.grado());
        System.out.println("Grado de SNC: " + snc.grado());
        System.out.println();

        System.out.println("--- PARTE 3: Construcción y evaluación del Árbol B ---");
        ArbolBinario<String> arbolB = new ArbolBinario<>();

        Nodo<String> gps = arbolB.crearRaiz("GPS");
        Nodo<String> scy = arbolB.agregarDerecho(gps, "SCY");
        Nodo<String> mrr = arbolB.agregarDerecho(scy, "MRR");
        Nodo<String> ptz = arbolB.agregarDerecho(mrr, "PTZ");
        arbolB.agregarDerecho(ptz, "TPN");

        System.out.println("Árbol B construido correctamente.");
        VistaArbol.mostrar(arbolB);
        System.out.println();

        System.out.println("--- RESULTADOS DE esCadena ---");
        boolean cadenaA = esCadena(arbolA);
        boolean cadenaB = esCadena(arbolB);
        System.out.println("¿El Árbol A es una cadena?: " + cadenaA);
        System.out.println("¿El Árbol B es una cadena?: " + cadenaB);
        System.out.println();

        System.out.println("--- PREGUNTAS DE DECISIÓN ---");
        String parecidoALista = cadenaB ? "El Árbol B" : "El Árbol A";
        System.out.println("¿Cuál árbol se parece a una lista?: " + parecidoALista + ".");
        System.out.println("¿Qué pasaría al buscar un dato en él?:");
        System.out.println("  Como cada nodo solo tiene un hijo, no hay ramas que descartar:");
        System.out.println("  hay que recorrer nodo por nodo (hasta N pasos, O(N)),");
        System.out.println("  igual que en una lista enlazada. En un árbol ordenado y balanceado,");
        System.out.println("  cada paso descartaría la mitad de los nodos (O(log N)).");
        System.out.println();

        System.out.println("--- EVALUACIÓN DE CASOS LÍMITE ---");

        ArbolBinario<String> arbolVacio = new ArbolBinario<>();
        System.out.println("1. Árbol vacío - esCadena: " + esCadena(arbolVacio) + " (Esperado: false)");

        ArbolBinario<String> arbolUnNodo = new ArbolBinario<>();
        arbolUnNodo.crearRaiz("ÚNICO");
        System.out.println("2. Árbol de un solo nodo - esCadena: " + esCadena(arbolUnNodo) + " (Esperado: true)");

        System.out.println("3. Intentar agregar un hijo donde ya existe uno:");
        arbolA.agregarIzquierdo(ltx, "NUEVO_IZQUIERDO");
        System.out.println();

        System.out.println("--- CAMINO I -> D -> I EN EL ÁRBOL A ---");
        Nodo<String> paso1 = arbolA.getRaiz().getIzquierdo();
        Nodo<String> paso2 = paso1 != null ? paso1.getDerecho() : null;
        Nodo<String> paso3 = paso2 != null ? paso2.getIzquierdo() : null;

        if (paso3 != null) {
            System.out.println("El aeropuerto encontrado al seguir el camino I -> D -> I es: " + paso3.getDato());
        } else if (paso2 != null) {
            System.out.println("El camino se corta en " + paso2.getDato() + ": no tiene hijo izquierdo.");
        } else {
            System.out.println("El camino se corta antes de completarse.");
        }
    }

    public static boolean esCadena(ArbolBinario<String> arbol) {
        if (arbol == null || arbol.esVacio()) {
            return false;
        }
        return arbol.altura() == arbol.contarNodos() - 1;
    }
}