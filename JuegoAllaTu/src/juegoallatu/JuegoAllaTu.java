/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package juegoallatu;

/**
 *
 * @author fani6
 */
public class JuegoAllaTu {
    //Asignacion nombres de cada maletin
    String [] nMaletin = {"Maletin 1","Maletin 2","Maletin 3","Maletin 4","Maletin 5","Maletin 6","Maletin 7",
    "Maletin 8","Maletin 9","Maletin 10","Maletin 11","Maletin 12","Maletin 13","Maletin 14","Maletin 15","Maletin 16",
    "Maletin 17","Maletin 18","Maletin 19","Maletin 20","Maletin 21","Maletin 22"};
    //Asignacion canntidad de dinero de cada maletin
    double [] dMaeltin = {0.10,600000,50,1000,50000,100,1,400,200000,0.50,4000,700,20,30000,7500,8000,2000,6000,25,50000,450,100000};
    //Asignacion preguntas
    String [] preguntasAleatorias = {"¿Cuál es el deporte en el que destacó Carl Lewis?",
        "¿De qué país forma parte Hawaii?","¿Quién es el autor de La Odisea",
        "¿De qué grupo es la canción Let It Be?","¿Cuál es la lengua originaria del castellano?"
            ,"¿Quién es considerado como el Rey del Rock?","¿Cada cuántos años se realizan los Juegos Olímpicos?"
            ,"¿Quién fue el primer presidente de Estados Unidos?"," ¿Qué filósofo de la Antigua Grecia creía que"
            + "el elemento del que están compuestas todas las cosas es el agua?"," ¿Cuál es el río más caudaloso del mundo?",
            "¿Cuál es el monte más alto del mundo?","¿Cuál es el país de mayor tamaño del mundo?","¿Qué conocido cómico imitó a Hitler en la película El Gran Dictador"
            ,"¿Quién fue el famoso cantante del grupo musical Queen?"," ¿Cómo se llama la ciudad donde se encuentra el Mago de Oz?"
            ,"¿Por qué película superventas de los años 90 es conocido el director y productor James Cameron?",
            "¿Cómo se llama la protagonista de la saga de videojuegos The Legend of Zelda",
            "¿A qué saga de películas pertenece el personaje conocido como Jack Sparrow?",
            "¿Cómo se llama el líder de los Autobots en Transformers","¿Qué gran artista es conocido por haber pintado la Capilla Sixtina?",
            "¿De qué estilo arquitectónico es la catedral de Notre Dame?","¿De qué obra de Shakespeare forma parte el soliloquio Ser o no ser, esa es la cuestión",
            "¿Qué nombre tenía el caballo de Don Quijote de la Mancha?","¿De qué país es originario el tipo de poesía conocido como haiku?"};
    String [] respuestasAleatorias = {"Atletismo","Estados Unidos","Homero","The Beatles","Latin"
            ,"Elvis Presley","4 años","George Washington","Tales de Mileto","Amazonas","Everest","Rusia"
            ,"Charles Chaplin","Freddie Mercury","Ciudad Esmeralda","Titanic","Link","Piratas del Caribe","Japón"};
      
      public static int generarNumerosAleatorios(int min, int max) {
          
        int pos = ((int) (min + Math.random() * (max - min + min)));
        
        return pos;
    }
      public static void generarPreguntasAleatorias(int pos)
      {
          
      }

    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
