# Bienvenidos/as al generador de figuras geométricas

Esta aplicación nos permite generar diferentes figuras geométricas y gestionarlas, modificando en cualquier momento los valores que desde un principio utilicemos para generar nuestra figura. Todas las salidas del programa podremos guardarlas en un archivo .txt.

**1. Instalación**

Para descargar el proyecto, simplemente tendremos que irnos a nuestro repositorio, le damos donde pone Code, se desplegara una ventana y simplemente le damos a Download ZIP. 
![Texto alternativo](/Imagenes/imagen1.png)
Una vez descargado, descomprimimos el zip en el lugar que le parezca oportuno y simplemente nos quedamos con los .java que son los archivos que vamos a ejecutar.

**2. Comprobar si java esta instalado.**

En este paso vamos a comprobar que tenemos Java instalado en nuestro ordenador ya que sin Java no podremos ejecutar el videojuego.
* Para comprobar si tenemos instalado Java en nuestro equipo, debemos abrir nuestra terminal y poner el comando java --version y nos aparecerá la versión de nuestro Java.

	![Texto alternativo](/Imagenes/imagen3.png)
* Si no tienes descargado Java puedes descargarlo desde este enlace: [Descargar Java](https://www.java.com/es/download/ie_manual.jsp?locale=es)

	![Texto alternativo](/Imagenes/imagen4.png)

Para descargar Java simplemente entramos en la página y le damos a Aceptar e iniciar descarga gratuita, se nos descargara el .exe y simplemente le pinchamos y empezamos a instalarlo.

**3. Como compilar y ejecutar el programa.**

Para ejecutar nuestro programa es necesario utilizar la cmd de Windows, compilaremos los archivos y los ejecutaremos.
Nos vamos al buscador de Windows y escribimos cmd, nos aparecerá el símbolo del sistema, le damos a enter para abrirlo.
![Texto alternativo](/Imagenes/imagen2.png)
Una vez con la terminal abierta, tendremos que irnos a la ubicación donde estén nuestros archivos. Utilizaremos el comando cd para movernos hacia donde estén nuestros archivos.
Cuando tengamos nuestros archivos .java visualizados, utilizaremos el comando javac y el nombre de nuestro archivo.java para crear el .class, debemos generar el .class (compilar) de todos los archivos que descargamos al inicio. Por ejemplo:
![Texto alternativo](/Imagenes/imagen5.png)
Una vez generado todos los .class, toca ejecutar la aplicación, utilizando el comando java nombredelarchivo.java.
Realmente tu no vas a poder tener interacción con el programa, te va a mostrar información.
La mejor forma de utilizar este programa es con un entorno de desarrollo, para poder modificar los datos que desee. En mi caso utilizo NetBeans.
Ahora debemos configurar para seleccionar la salida del archivo que nos genere el programa.
![Texto alternativo](/Imagenes/imagen6.png)
Le damos a customize y nos aparecera una ventana, tenemos que darle a la opción "run", seleccionamos nuestra main class y en arguments ponemos el nombre que queremos que tenga nuestro fichero junto .txt, le damos a ok.
![Texto alternativo](/Imagenes/imagen7.png)

**4. Instrucciones de uso.**

Esta aplicación genera una serie de figuras geométricas y podemos gestionar cada tipo de figura geométrica a nuestro gusto, pero para ello debemos hacerlo dentro del entorno de desarrollo que utilicemos, solamente abriremos el proyecto dentro de nuestro entorno de desarrollo, modificaremos los datos que deseemos y ejecutaremos la main class. El resultado saldrá en el archivo que hemos configurado anteriormente.
