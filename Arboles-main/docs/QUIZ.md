# Banco de Preguntas - Quiz Interactivo

**Tema:** Concepto y jerarquía de árboles · Estructura de Datos (Unidad 3)
**Enlace al Quiz en Vivo:** [Quizizz / Wayground](https://wayground.com/admin/quiz/6ac5b513346b0a5f373a4a08?source=quiz_share)

### Pregunta 1
¿Cuál de las siguientes estructuras cumple simultáneamente las propiedades de ser conexa y no tener ciclos, por lo que constituye un árbol?

- **a)** A conectado con B y C; B conectado con D
- **b)** A conectado con B y C; B conectado con C y D
- **c)** A conectado con B; C conectado con D; sin ningún enlace entre los dos grupos
- **d)** A conectado con B y C; B conectado con D; C conectado con D

**Respuesta correcta:** a

---

### Pregunta 2
En un árbol cuya raíz es A, el camino más largo desde la raíz hasta una hoja es A → B → E → G. ¿Cuál es la altura del árbol, contando las aristas del camino?

- **a)** 1
- **b)** 2
- **c)** 3
- **d)** 4

**Respuesta correcta:** c

---

### Pregunta 3
Un nodo raíz R tiene tres hijos directos: A, B y C. ¿Cómo debe clasificarse esta estructura según el número máximo de hijos permitido por cada tipo de árbol?

- **a)** Como árbol general, porque admite cualquier cantidad de hijos
- **b)** Como árbol binario, porque tiene una raíz definida
- **c)** Como árbol binario, porque sus hijos están conectados
- **d)** Como árbol general, porque todos sus nodos son hojas

**Respuesta correcta:** a

---

### Pregunta 4
En la clase genérica Nodo&lt;T&gt;, ¿qué información almacenan sus tres atributos privados?

- **a)** Un dato y dos referencias: izquierdo y derecho
- **b)** Dos datos y una referencia: padre e hijo
- **c)** Un dato y dos referencias: padre y nivel
- **d)** Tres datos sin referencias a otros nodos

**Respuesta correcta:** a

---

### Pregunta 5
¿Cuál es la responsabilidad principal de la clase Nodo.java dentro de la estructura de un árbol binario?

- **a)** Administrar las operaciones de inserción, eliminación y recorridos del árbol.
- **b)** Dibujar y renderizar la interfaz gráfica de usuario del árbol.
- **c)** Almacenar el valor o dato y mantener las referencias hacia los nodos izquierdo y derecho.
- **d)** Ejecutar el método main y las pruebas unitarias.

**Respuesta correcta:** c

---

### Pregunta 6
Un nodo tiene sus enlaces izquierdo y derecho apuntando a otros nodos. Si se ejecuta grado(), ¿cómo se obtiene el resultado?

- **a)** Se inicia en cero y se incrementa por cada enlace no nulo
- **b)** Se inicia en uno y se incrementa por cada enlace no nulo
- **c)** Se cuentan solo los enlaces que apuntan al lado izquierdo
- **d)** Se cuentan solo los enlaces que apuntan al lado derecho

**Respuesta correcta:** a

---

### Pregunta 7
En una arquitectura de tres capas para un árbol binario, ¿qué capa debe utilizar directamente la capa de negocio?

- **a)** La capa de aplicación
- **b)** La capa de modelo
- **c)** La capa de persistencia
- **d)** La capa de presentación

**Respuesta correcta:** b

---

### Pregunta 8
Un programa ejecuta agregarIzquierdo(padre, dato). El parámetro padre no es nulo, pero ya existe un hijo izquierdo. ¿Qué debe hacer el método?

- **a)** Crear otro hijo izquierdo y reemplazar el anterior
- **b)** Devolver un error porque el lugar está ocupado
- **c)** Crear el nodo como hijo derecho del mismo padre
- **d)** Devolver el padre sin modificar el árbol

**Respuesta correcta:** b

---

### Pregunta 9
En un árbol binario, ¿qué valor devuelve el algoritmo contarHojas(nodo) cuando nodo no es nulo y además es una hoja?

- **a)** Devuelve 0 porque no tiene hijos
- **b)** Devuelve 1 porque cuenta la hoja
- **c)** Devuelve 2 porque tiene dos enlaces
- **d)** Devuelve 1 más sus subárboles

**Respuesta correcta:** b

---

### Pregunta 10
Dentro de la arquitectura del proyecto, ¿en qué paquete se encuentra la lógica de negocio como las operaciones de ArbolBinario.java?

- **a)** arboles.app
- **b)** arboles.negocio
- **c)** arboles.modelo
- **d)** reto.pruebas

**Respuesta correcta:** b

---
