Automatización Falabella

El repositorio contiene el desarrollo de la automatización funcional para el flujo de compra de un artículo de la página web " FALABELLA ".

Comenzando 🚀 Es importante tener en cuenta que al momento de clonar el repositorio se debe tener descargado e instalado el jdk en su versión 1.8 y gradle , incluyendo la creación de las variables de entorno

Pre-requisitos 📋 Java 1.8 Intellij IDEA Gradle

Instalación 🔧 Descargar los instaladores mencionados en los pre-requisitos , directamente de las páginas oficiales

https://www.java.com/es/download/ie_manual.jsp https://gradle.org/install/ https://www.jetbrains.com/es-es/idea/

Ejecutando las pruebas ⚙️

Cuando se realice la instalación completa , se debe construir el proyecto dando click dentro del entorno (intellij IDEA) gradle. con el objetivo de que las dependencias actualicen y puedan indexar. Posteriormente dar click derecho en la carpeta\src\test\java\sistecredito\retofalabella\runners\ProductShopping.java y luego "RUN". En este punto la automatización empezará a ejecutarse usando el framework y las dependencias ya mencionadas. Analisis de las pruebas end-to-end 🔩 Como resultado de las pruebas E2E ejecutadas , se dá el criterio técnico de que la página web "falabella" para todo el flujo de compra, se encuentra perfectamente en estado de producción sin ningún tipo de bug o hallazgos importantes.

¿Qué verifica esta prueba?⌨️ Esta prueba verifica el flujo de compra para un articulo seleccionado en cualquier categoria , tomando como referencia caminos alternos.

Construido con 🛠️ Gradle. Serenity Screen play