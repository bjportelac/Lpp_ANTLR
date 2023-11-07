# Lenguajes de programacion 2023-2 : Universidad Nacional de Colombia

## Practica 3: Traductor o Interprete

---
### Hecho por:
- Wiliam Humberto Garcia Gongora
- Andrea Katherine Garcia
- Brayan Rolando Jr. Portela Cabrera 
---

### Configuracion

- Se utilizo el runtime 4.13 de ANTLR para Java
- Se Utilizo como IDE IntelliJ Idea Community Edition 2023-2
- Se debe marcar la carpeta gen como archivos fuente en la configuracion del proyecto en IntelliJ
- Se probo dejando como argumento de entrada la 

### Traduccion

- El programa recibe entrada tanto de consola como de archivos
- para recibir archivos, debe hacerse uso de la ruta del mismo o puede reemplazarse el contenido del archivo input.txt en la carpeta input del proyecto

**Ejemplo:**
``` C:\Users\benga\.jdks\jbr-17.0.8.1\bin\java.exe "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2023.2.3\lib\idea_rt.jar=53770:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2023.2.3\bin" -Dfile.encoding=UTF-8 -classpath D:\Universidad\Lenguajes\IntroANTLR\Lpp_Antlr\out\production\Lpp_Antlr;D:\Universidad\Lenguajes\antlr-runtime-4.13.1.jar Translate D:\Universidad\Lenguajes\IntroANTLR\Lpp_Antlr\input\input.txt ```

- Tambien se recibe entrada por consola si el archivo input.txt no esta presente
- se reemplazo la clase Main por la clase Translate.

## Particularidades

- Se utilizo Java como lenguaje tanto de produccion de la practica como lenguaje destino a la traduccion
- Se trato de preservar una estructura de identacion en el proyecto sin embargo en codigos de entrada extensos, se pierde la identacion en el resultado de traduccion
- Se dejaron marcados por defecto las importaciones necesarias para que el proyecto sea compatible con Java SDK 17 ,
- se marco la importacion de Java Scanner para la estructura **lea** de LPP
- se definio la estructura de la traduccion como si el resultado se generara para la clase Main de java estandar
- Se añadió la estructura del metodo void main de Java
- Se escogio Java como lenguaje destino por sus similitudes con la sintaxis de LPP

- Se escogio el metodo de visitors para la traduccion como metodo de aproximacion ya que se hizo una primera implementacion mediante listeners sin embargo estos son menos controlados y el hecho de visitar todos los nodos hace que se obtengan resultados no deseados, sin embargo dentro de la clase **LPPTranslator** se dejo comentado el codigo fuente hecho para los listeners.
- La gramatica utilizada esta inspirada y trabajada sobre la gramatica de LPP en ANTLR propuesta por Mauricio Hernandez en el repositorio [https://github.com/LenguajeLPP/lpp/blob/master/src/main/antlr4/org/lpp/parser/LPP.g4](https://github.com/LenguajeLPP/lpp).
---

**Nota:**
1. Debido a que JAVA es un lenguaje enfocado en POO mayormente, algunos de los modificadores de accesso pueden causar problemas, en particular ** Static / final**
2. La estructura registro es migrada a la estructura class de java sin embargo no se generan ni getters ni setters para estas clases
3. En algunos casos para acceder a los atributos de clases la traduccion no genera con exito el codigo
4. Lo que respecta a arreglos u objetos de las clases migradas no se inicializan **de momento**.
5. la expresion **a ^ b** se traduce directamente como **(int) Math.pow(a,b)**
6. En el caso particular en el cual se deja **_** como variable, se genera un error si se coloca la salida en un IDE de java debido a que este caracter por si solo es una palabra reservada desde Java 9.
---
### Ejemplos:

**ENTRADA DE LPP:**

![Imagen de WhatsApp 2023-11-06 a las 20 56 46_36d2c0ea](https://github.com/bjportelac/Lpp_ANTLR/assets/32397114/77d8c22c-30ed-4309-bed8-045f59dffbd7)

---

**SALIDA EN JAVA:**

![Imagen de WhatsApp 2023-11-06 a las 20 56 51_483176eb](https://github.com/bjportelac/Lpp_ANTLR/assets/32397114/9c4777fe-4cf9-4143-90b0-846a592e85c8)

---

**SALIDA CORREGIDA (MANUALMENTE):**

![image](https://github.com/bjportelac/Lpp_ANTLR/assets/32397114/762019f3-8318-4901-92e2-47734100c886)

---
**TODO:** HashTable de variables | escoger un mejor lenguaje destino.








Nota personal: Este pseudolenguaje es horrible.
