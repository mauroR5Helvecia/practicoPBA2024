# Proyecto: MiNetflix - Simulador de Gestión de Contenidos Audiovisuales

Este proyecto fue desarrollado como parte del Trabajo Práctico Nro. 1 del curso de Programación Básica - TUTI - UTN FR Santa Fe - 2024. El objetivo del proyecto es simular un sistema básico de gestión de contenidos audiovisuales similar a una plataforma de streaming como Netflix, permitiendo el registro, actualización, y visualización de películas, series y capítulos.

## Consigna

El principal desafío del proyecto fue implementar la gestión de datos utilizando arrays en lugar de listas dinámicas (`ArrayList`, `LinkedList`, etc.). Se estableció que el uso de estructuras de datos dinámicas estaba prohibido, obligando a los estudiantes a gestionar los elementos de manera estática y eficiente, respetando un tamaño máximo definido para cada array.

## Objetivos y Consideraciones Enseñadas en el Código

Este proyecto tenía varios objetivos pedagógicos clave que se intentaban enseñar a través de la implementación y estructura del código:

1. **Manejo Básico de Arrays:**
   - Aprender a trabajar con arrays para almacenar y gestionar elementos (películas, series y capítulos) de manera estática, respetando el límite máximo de capacidad.
   - Uso de índices (`indicePeliculas` y `indiceSeries`) para controlar la posición y cantidad de elementos almacenados en los arrays.

2. **Interacción con el Usuario mediante Consola:**
   - Diseñar y mostrar menús interactivos para guiar al usuario a través de las diferentes funcionalidades del programa.
   - Capturar entradas del usuario usando `Scanner` y gestionar entradas inválidas para mejorar la experiencia y robustez del programa.

3. **Control de Flujo y Manejo de Errores:**
   - Implementación de estructuras de control como `switch`, `while`, y `do-while` para gestionar la lógica del programa y controlar el flujo de las acciones del usuario.
   - Uso de `try-catch` para manejar excepciones como `InputMismatchException`, enseñando a los estudiantes a gestionar errores y validar entradas.

4. **Registro y Actualización de Datos:**
   - Implementación de métodos para registrar y actualizar películas, series y capítulos, reforzando conceptos de encapsulación y manejo de objetos en Java.
   - Gestión de propiedades como título, año, género, duración, estado (visto/no visto) y calificación, simulando la interacción real con un sistema de gestión multimedia.

5. **Submenús y Funcionalidades Específicas:**
   - Desarrollo de submenús especializados para listar contenidos vistos, no vistos y favoritos, enseñando a crear flujos de trabajo complejos y organizar el código de manera modular.
   - Manejo de submenús para funciones específicas como la visualización y actualización de capítulos, promoviendo la reutilización de código y la estructuración lógica de la aplicación.

6. **Diseño de Interfaz en Consola:**
   - Uso de gráficos ASCII para crear una interfaz más amigable, enseñando a los estudiantes cómo mejorar la presentación y hacer que la interacción de la consola sea más atractiva y entendible.

7. **Limitaciones y Gestión de Capacidad:**
   - Trabajar con arrays limitados a 100 elementos fomentó la enseñanza de la gestión de recursos y la optimización del espacio en estructuras de datos.
   - Consideración de escenarios en los que se llega al límite de capacidad y cómo comunicar estos límites al usuario de manera efectiva.

## Funcionalidades Principales

- **Registrar Películas, Series y Capítulos:** Permite al usuario agregar nuevos elementos con sus respectivos atributos (título, género, año, etc.).
- **Actualizar Contenidos:** Marcar como visto, puntuar películas y capítulos, y agregar capítulos a series existentes.
- **Listar Contenidos:** Mostrar películas y series vistas, pendientes de ver y favoritos.
- **Navegación de Menús:** Flujo dinámico entre el menú principal y submenús específicos para cada tipo de contenido.

## Autores

- Mauro Rosales
- Antonela Marisol Colque
- Federico Steinaker

Este proyecto es un ejemplo de la implementación de conceptos fundamentales en la programación orientada a objetos en Java, enfatizando el uso de arrays, la interacción con el usuario mediante la consola y el manejo básico de estructuras de control y excepciones.


