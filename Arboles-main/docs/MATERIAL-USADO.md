# 🌳 Material usado en la clase

**Introducción a los árboles** · Estructura de Datos, Unidad 3 · Grupo 1 · UTA FISEI  
Exposición del jueves 8 de octubre de 2026 · 2 horas  

Este documento reúne en un solo lugar los recursos que se usaron en la clase, para qué sirvió cada uno y dónde encontrarlo.

## Resumen

| Recurso | Para qué se usó | Fase de la clase | Enlace |
|---|---|---|---|
| 🎨 Presentación en Canva | Explicar la teoría, los diagramas de flujo y el reto | Explicación visual y demostración (5 a 65 min) | [Abrir en Canva](https://www.canva.com/design/DAHXRRsy3dU/xA8SoQxTXWldkgG0fct09w/edit) |
| 🔍 VisuAlgo | Ver cómo crece un árbol y comparar cadena frente a árbol equilibrado | Explicación visual (5 a 35 min) | [visualgo.net/en/bst](https://visualgo.net/en/bst) |
| 🧠 Quizizz | Evaluar lo aprendido con preguntas interactivas | Evaluación interactiva (95 a 110 min) | [Abrir el quiz](https://wayground.com/admin/quiz/6ac5b513346b0a5f373a4a08?source=quiz_share) |
| 💻 Código en GitHub | Demostración en Java y reto práctico | Demostración y reto (35 a 95 min) | [Ver repositorio](https://github.com/juanchicoyunda1234/Arboles_T.git) |

---

## 🎨 Presentación

- **Enlace web:** [Abrir en Canva](https://www.canva.com/design/DAHXRRsy3dU/xA8SoQxTXWldkgG0fct09w/edit)
- **Archivos en este repositorio:** [`presentacion/Introduccion_a_los_arboles_Grupo_1.pptx`](../presentacion/Introduccion_a_los_arboles_Grupo_1.pptx) y [`presentacion/Introduccion_a_los_arboles_Grupo_1.pdf`](../presentacion/Introduccion_a_los_arboles_Grupo_1.pdf)

**Qué contiene:** definición de árbol, terminología (raíz, nodo, hoja, grado, nivel, altura), árbol general y binario, el árbol en el proyecto final, un diagrama de flujo por cada operación de `Nodo` y `ArbolBinario`, el `Main` de demostración, el reto y el cierre.

---

## 🔍 VisuAlgo

- **Enlace:** <https://visualgo.net/en/bst>

**Qué es:** una página web que dibuja con animación cómo se inserta un valor en un árbol binario de búsqueda.

**Cómo se usó en la clase:** para comparar dos casos con los mismos datos en distinto orden.

| Caso | Valores insertados, en este orden | Resultado |
|---|---|---|
| Árbol en cadena | 1, 2, 3, 4, 5 | Cada valor cuelga a la derecha del anterior y el árbol parece una lista |
| Árbol equilibrado | 4, 2, 6, 1, 3, 5, 7 | El árbol se reparte en los dos lados y su altura es mínima |

**Por qué importa:** es la misma idea del reto "¿árbol sano o árbol en cadena?" y la razón por la que el Hito 4A del proyecto cuida el orden en que se insertan los datos.

**Cómo repetirlo:** abrir la página, elegir la opción de insertar, escribir cada valor y confirmar.

---

## 🧠 Quiz interactivo

- **Enlace al Quiz en vivo:** [Abrir el quiz en Quizizz / Wayground](https://wayground.com/admin/quiz/6ac5b513346b0a5f373a4a08?source=quiz_share)
- **Preguntas con respuestas y explicación:** [`QUIZ.md`](QUIZ.md)

**Qué evalúa:** terminología (raíz, hoja, grado), altura de un árbol vacío y de un solo nodo, cantidad de hojas de un árbol dado y la diferencia entre árbol sano y árbol en cadena.

---

## 💻 Código y reto

- **Repositorio:** [Ver repositorio en GitHub](https://github.com/juanchicoyunda1234/Arboles_T.git)
- **Código de la clase:** [`src/arboles`](../src/arboles) (paquetes `modelo`, `negocio` y `app`)
- **Reto práctico:** [`src/reto/RETO.md`](../src/reto/RETO.md)
- **Casos de prueba:** [`docs/CASOS-DE-PRUEBA.md`](CASOS-DE-PRUEBA.md)
- **Diagramas:** [clases](DIAGRAMA-CLASES.md), [secuencia](DIAGRAMA-SECUENCIA.md) y [flujo por método](DIAGRAMAS-FLUJO.md)

---

## 🗓️ Dónde entra cada recurso en las 2 horas

| Minutos | Fase | Recurso principal |
|---|---|---|
| 0 a 5 | Activación | Presentación |
| 5 a 35 | Explicación visual | Presentación, dinámica Árbol humano y VisuAlgo |
| 35 a 65 | Demostración Java | Presentación y código en GitHub |
| 65 a 95 | Reto práctico | `RETO.md` y código en GitHub |
| 95 a 110 | Evaluación interactiva | Quizizz |
| 110 a 120 | Cierre | Presentación y GitHub |
