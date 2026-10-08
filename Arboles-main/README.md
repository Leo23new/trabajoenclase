# Introducción a los árboles: Grupo 1

Estructura de Datos, UTA FISEI, Software Nivel III. Docente: José Rubén Caiza Caizabuano. Exposición: jueves 08/10/2026.

## Integrantes

| Integrante | Rol | Usuario de GitHub |
| --- | --- | --- |
| [COMPLETAR] | Coordinación | [COMPLETAR] |
| [COMPLETAR] | Código | [COMPLETAR] |
| [COMPLETAR] | Dinámica | [COMPLETAR] |
| [COMPLETAR] | Preguntas | [COMPLETAR] |
| [COMPLETAR] | Diapositivas | [COMPLETAR] |
| [COMPLETAR] | Repositorio y evidencia | [COMPLETAR] |

## Contenido de la exposición

- Terminología: raíz, nodo, arco, padre e hijo, hoja, grado.
- Nivel y altura: la altura se cuenta en aristas.
- Árbol general y árbol binario.
- Clase `Nodo<T>`.
- Armado de un árbol a mano.
- Reto del campeonato.

## Estructura del proyecto

```
arboles-grupo1/
  README.md
  .gitignore
  src/
    modelo/Nodo.java
    negocio/ConstructorArboles.java
    app/Main.java
    pruebas/Pruebas.java
  diapositivas/
    guion.md
  evidencia/
    banco_preguntas.md
    capturas_kahoot/.gitkeep
```

- `modelo`: clase Nodo.
- `negocio`: construye los árboles.
- `app`: menú de consola.
- `pruebas`: casos de prueba.

## Cómo ejecutar

Requisito: JDK 17 o superior. Comandos desde la raíz del proyecto.

- Linux o macOS: `javac -d out $(find src -name "*.java")` y luego `java -cp out app.Main`.
- Windows PowerShell: `javac -d out (Get-ChildItem -Recurse src -Filter *.java).FullName` y luego `java -cp out app.Main`.
- En VS Code: abrir `src/app/Main.java` y usar Run.
- Menú: 1 árbol de ejemplo, 2 árbol del campeonato, 3 pruebas, 0 salir.

## Evidencia y enlaces

| Elemento | Enlace o ruta |
| --- | --- |
| Informe en Canva | `[PEGAR ENLACE]` |
| Informe en PDF (copia exportada de Canva) | `evidencia/informe_canva.pdf` |
| Diapositivas en Canva | `[PEGAR ENLACE]` |
| Diapositivas en PDF | `diapositivas/Introduccion_Arboles_G1.pdf` |
| Guion de la exposición | `diapositivas/guion.md` |
| Actividad interactiva (Kahoot o Quizizz) | `[PEGAR ENLACE]` |
| Banco de preguntas | `evidencia/banco_preguntas.md` |
| Capturas de la actividad | `evidencia/capturas_kahoot/` |

## Participación

Cada integrante hizo sus propios commits en este repositorio.
