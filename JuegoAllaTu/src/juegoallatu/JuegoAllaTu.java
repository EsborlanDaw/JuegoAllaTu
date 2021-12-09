/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package juegoallatu;

import java.util.Scanner;

/**
 *
 * @author fani6
 */
public class JuegoAllaTu {

    //Variable global para leer las respuestas introducidas por el ussuario
    public static Scanner cin = new Scanner(System.in);
    //Variable inicializada con el numero de datos de cada vector, que se usará para borrar datos de ambos vectores
    public static int totalMaletines = 15;
    //Variable que nos facilitará la eliminacion de las preguntas ya seleccionada para evitar así que se repitan
    public static int totalpreguntas = 51;
    //Variables que alamcena el nombre y cantidad del maletin elegido por el ususario
    public static String nMaletinUsuario;
    public static double dMaletinUsuario;
    //Variable entera que indicará el numero de maletin que quiere coger o eliminar el usuario
    public static int nMal;
    //Asignacion nombres de cada maletin
    public static String[] nMaletin = {"Maletin 1", "Maletin 2", "Maletin 3", "Maletin 4", "Maletin 5", "Maletin 6", "Maletin 7",
        "Maletin 8", "Maletin 9", "Maletin 10", "Maletin 11", "Maletin 12", "Maletin 13", "Maletin 14", "Maletin 15"};
    //Asignacion dinero de cada maletin
    public static double[] dMaletin = {0.10, 6000000, 50, 1000000, 50000, 100, 1, 400, 20000, 4000, 700, 20, 30000, 7500, 8000};
    //Vector de preguntas aleatorias
    public static String[] preguntasAleatorias = {"¿Cuál es el deporte en el que destacó Carl Lewis?",
        "¿De qué país forma parte Hawaii?", "¿Quién es el autor de La Odisea",
        "¿De qué grupo es la canción Let It Be?", "¿Cuál es la lengua originaria del castellano?",
        "¿Quién es considerado como el Rey del Rock?", "¿Cada cuántos años se realizan los Juegos Olímpicos?(Escribelo con letras)",
        "¿Quién fue el primer presidente de Estados Unidos?", " ¿Qué filósofo de la Antigua Grecia creía que"
        + "el elemento del que están compuestas todas las cosas es el agua?", " ¿Cuál es el río más caudaloso del mundo?",
        "¿Cuál es el monte más alto del mundo?", "¿Cuál es el país de mayor tamaño del mundo?", "¿Qué conocido cómico imitó a Hitler en la película El Gran Dictador",
        "¿Quién fue el famoso cantante del grupo musical Queen?", " ¿Cómo se llama la ciudad donde se encuentra el Mago de Oz?",
        "¿Por qué película superventas de los años 90 es conocido el director y productor James Cameron?",
        "¿Cómo se llama la protagonista de la saga de videojuegos The Legend of Zelda?",
        "¿A qué saga de películas pertenece el personaje conocido como Jack Sparrow?",
        "¿Cómo se llama el líder de los Autobots en Transformers?", "¿Qué gran artista es conocido por haber pintado la Capilla Sixtina?",
        "¿De qué estilo arquitectónico es la catedral de Notre Dame?", "¿De qué obra de Shakespeare forma parte el soliloquio Ser o no ser, esa es la cuestión",
        "¿Qué nombre tenía el caballo de Don Quijote de la Mancha?", "¿De qué país es originario el tipo de poesía conocido como haiku?",
        "¿Qué pais está entre Perú y Colombia?", "¿A qué país pertenece la isla de Creta?", "¿Qué batalla crucial tuvo lugar en 1815?",
        "¿Cuál era el famoso lema de los tres mosqueteros?", "¿En qué mes el sol está más cerca de la tierra?", "¿Qué pieza del ajedrez puede hacer"
        + "un movimiento en forma de L?", "¿A qué equipo de fútbol pertenecía el estadio Metropolitano?", "¿En qué serie se encuntra un personaje"
        + "llamado Walter White?", "¿Cuál es el país con menos habitantes del mundo?", " ¿Cuál es el país con más habitantes del mundo?",
        "¿Cuántos años duró la Primera Guerra Mundial?(Escribelo con letras)", "¿Qué día es la fiesta nacional de los Estados Unidos?(Escribelo con letras)", "¿Cuál es el himno de la Unión Europea?",
        " ¿Cuándo empezó la Revolución Rusa?(Escribelo con numeros)", "¿Cuál es el océano más grande del mundo?", "¿Cuántos lados tiene un heptágono?(Escribelo con letras)",
        " ¿Cuál es el animal que más muertes provoca cada año?", " ¿Cuál es el planeta más grande del Sistema Solar?", "¿Qué religión tiene la Torá como su libro sagrado?",
        "¿Cuál es el animal más grande de la Tierra?", "¿Cuál es el álbum musical más vendido de la historia?", "¿Cuáles son los únicos mamíferos que pueden volar?",
        "¿Quién ganó el mundial de fútbol de 2010?", "¿Dónde se lanzaron las primeras bombas atómicas?", " ¿Dónde está la Universidad de Harvard?", "¿Cuándo se inventó la imprenta?(Escribelo en numero)",
        "¿Cuál es el mineral más duro del planeta?"};
    //Vector de respuestas aleatorias
    public static String[] respuestasAleatorias = {"Atletismo", "Estados Unidos", "Homero", "The Beatles", "Latin",
        "Elvis Presley", "Cuatro años", "George Washington", "Tales de Mileto", "Amazonas", "Everest", "Rusia",
        "Charles Chaplin", "Freddie Mercury", "Ciudad Esmeralda", "Titanic", "Link", "Piratas del Caribe", "Optimus Prime", "Miguel Angel", "Gotico",
        "Hamlet", "Rocinante", "Japon", "Ecuador", "Grecia", "Waterloo", "Todos para uno y uno para todos", "Diciembre", "Caballo", "Atletico de Madrid",
        "Breaking Bad", "El Vaticano", "China", "Cuatro años", "Cuatro de julio", "Oda a la Alegria", "1917", "Pacifico", "Siete lados", "Mosquito", "Jupiter",
        "Judaismo", "Ballena azul", "Thriller", "Murcielagos", "España", "Nagasaki e Hiroshima", "Cambridge", "1440", "El diamante"};

    //Funcion que muestra la introduccion del juego
    public static void mostrarIntroduccion() {
        System.out.println("Bienvenidos y bienvenidas a Allá Tú. Intenta llevarte 2000000 millones" + "\n"
                + "de euros. Al inicio del juego tendrás la opción de elegir uno de nuestros 15 maletines." + "\n"
                + "Cada uno tiene entre 0,10 cent a 6000000 de euros. Para tener la opcion de escoger otro" + "\n"
                + "solo tendrás que acertar alguna de nuestras preguntas aleatorias pero se eliminará el maletín" + "\n"
                + "previamente seleccionado. Y si fallas tendrás que eliminar alguno de los maletines directamente." + "\n"
                + "Tendrás una ronda de 15 preguntas. Mucha suerte y que comience el juego." + "\n"
                + "Pulsa INTRO.");

        cin.nextLine();
    }

    //Funcion que pide la respuesta del usuario en formato String
    public static String pedirRespuestaString() {

        System.out.println("Introduce respuesta: ");
        String res = cin.nextLine();

        return res;
    }

    //Funcion que pide la respuesta del ususario en formato Int
    public static int pedirRespuestaInt() {
        int res = cin.nextInt();

        return res;
    }

    //Funcion que almacena los datos del maletin, además de realizar la operacion de cambio o borrado de maletin
    public static void asignacionMaletines(boolean acierto) {

        //A raiz de si el ususario ha acertado o no la pregunta se llevará a cabo el cambio de maletin o la eliminacion de uno de ellos
        //Mostramos los maletines que quedan
        for (int i = 0; i < totalMaletines; i++) {
            System.out.print(i + "." + nMaletin[i]);
            System.out.println(" ");
        }
        System.out.println("Selecciona maletin segun posicion en la lista: ");
        nMal = pedirRespuestaInt();

        //Respuesta acertada
        if (acierto == true) {
            nMaletinUsuario = nMaletin[nMal];
            dMaletinUsuario = dMaletin[nMal];

            System.out.println("Tu maletin es: " + nMaletinUsuario);
        } //Respuesta errónea
        else {
            System.out.println("El maletin que has borrado es: " + nMaletin[nMal]
                    + " y contenia " + dMaletin[nMal]);
        }
        //Siendo i = Maletin que quiere el ususario y menor que el tamaño del vector
        for (int i = nMal; i < totalMaletines - 1; i++) {
            //Se irá intercambiando de atrás hacía delante hasta llevar el eliminado al final del vector
            nMaletin[i] = nMaletin[i + 1];
            dMaletin[i] = dMaletin[i + 1];
        }
        totalMaletines--;

        System.out.println("Ahora quedan: ");

        //Mostramos los maletines que quedan
        for (int i = 0; i < totalMaletines; i++) {
            System.out.print(nMaletin[i]);
            System.out.println(" ");
        }
    }

    //Funcion que genera una posicion aleatoria para generar preguntas aleatorias
    public static int generarNumerosAleatorios(int min, int max) {

        int pos = ((int) (min + Math.random() * (max - min + min)));

        return pos;
    }

    //Funcion donde se inicializan las preguntas aleatorias con sus respectivas respuestas
    public static String generarPreguntasyRespuestasAleatorias() {
        //Variable en la que se almacena la pregunta y respuesta seleccionada
        String pregunta, respuesta;

        //Pedimos la posicion de la pregunta aleatoria
        int pos = generarNumerosAleatorios(0, totalpreguntas);
        //Asignamos a las variables la pregunta y respuesta seleccionado
        pregunta = preguntasAleatorias[pos];
        respuesta = respuestasAleatorias[pos];

        //Procedemos a retirar esa pregunta y respuesta del vector
        for (int i = pos; i < totalpreguntas - 1; i++) {
            preguntasAleatorias[i] = preguntasAleatorias[i + 1];
            respuestasAleatorias[i] = respuestasAleatorias[i + 1];
        }
        //Reducimos el tamaño del vector
        totalpreguntas--;

        //La mostramos
        System.out.println(pregunta);
        cin.nextLine();

        //Devolvemos la respuesta para comprobar si es correcta
        String resusuario = pedirRespuestaString();
        comprobarRespuesta(respuesta, resusuario);

        return respuesta;
    }

    //Funcion que comprueba si la respuesta es o no correcto, le introducimos la respuesta correcta
    //y la respuesta elegida por el ususario
    public static void comprobarRespuesta(String respuesta, String resusuario) {

        boolean acierto = true;

        if (respuesta.equalsIgnoreCase(resusuario) == true) {
            System.out.println("Respuesta: CORRECTA");
            System.out.println("Ahora tienes dos opciones: ");
            System.out.println("1.Cambiar de maletin.");
            System.out.println("2.Pasar a la siguiente pregunta.");
            int op = cin.nextInt();
            if (op == 1) {
                asignacionMaletines(acierto);
            }

        } else {

            acierto = false;
            asignacionMaletines(acierto);
        }

    }

    //Funcion que muestra el final del juego
    public static void mostrarFindeJuego() {
        System.out.println("Hemos llegado al final del juego.Bien jugado, vamos a ver cuánto"
                + "has ganado: ");
        System.out.println("El " + nMaletinUsuario + " contiene... la cantidad de..." + "¡¡¡¡" + dMaletinUsuario + "!!!!");

        if (dMaletinUsuario < 100) {
            System.out.println("Más vale eso que nada. Más suerte la próxima vez.");
        } else if (dMaletinUsuario <= 50000) {
            System.out.println("Enorhabuena disfruta del dinero.");
        } else if (dMaletinUsuario <= 1000000) {
            System.out.println("Te has quedado cerca del premio gordo. Muchas felicidades,"
                    + "disfruta del dinero.");
        } else if (dMaletinUsuario == 20000000) {
            System.out.println("TE HA TOCADO EL PREMIO GORDO."
                    + "FELICIDADES. DISFRUTA DE LAS GANANCIAS.");
        }
    }

    //Funcion principal
    public static void main(String[] args) {
        //Variable que determina el número de rondas
        int veces = 1;
        mostrarIntroduccion();
        asignacionMaletines(true);

        do {
            System.out.println("Tu maletin es el: " + nMaletinUsuario);
            if (veces < 16) {
                System.out.println("Ronda: " + veces);
                System.out.println("Responde a las preguntas sin poner acentos.");
                generarPreguntasyRespuestasAleatorias();
            }
            veces++;

        } while (veces < 16);

        mostrarFindeJuego();
    }
}
