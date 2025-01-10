import java.util.Random;
import java.util.Scanner;

public class Ahorcado {
    public static void main(String[] args) throws Exception {

        // Clase Scanner nos permite que el usuario escriba
        Scanner sc = new Scanner(System.in);

        // Lista de palabras posibles
        String[] listaDePalabras = {"inteligencia", "programacion", "euforia", "computadora", "tecnologia", "algoritmo", "murcielago", "desarrollo", "persistencia", "psicologia"};

        // Seleccionamos una palabra aleatoria de la lista
        Random random = new Random();
        String palabresSecreta = listaDePalabras[random.nextInt(listaDePalabras.length)];

        // Decalaraciones y asignaciones
        int intentosMaximmos = 10;
        int intentos = 0;
        boolean palabraAdivinada = false;

        // Arreglos:
        char[] letrasAdivinadas = new char[palabresSecreta.length()];

        // Estructura de control: Iterativa (Bucle)
        for (int i = 0; i < letrasAdivinadas.length; i++) {
            letrasAdivinadas[i] = '_';
        }

        // Estructura de control: Iterativa (Bucle)
        while (!palabraAdivinada && intentos < intentosMaximmos) {
                                                         // Esto se usa cuando tenemos una palabra de chars
            System.out.println("Palabra a adivinar: " + String.valueOf(letrasAdivinadas) + " (" + palabresSecreta.length() + " letras)");
            
            System.out.println("Introduce una letra, por favor");
            
            // Usamos la clase Scanner para pedir una letra
            char letra = Character.toLowerCase(sc.next().charAt(0));

            boolean letraCorrecta = false;

            // Estructura de control: Iterativa (Bucle)
            for (int i = 0; i < palabresSecreta.length(); i++) {
            //Estructura de control: condicional   
            if (palabresSecreta.charAt(i) ==  letra) {
                    letrasAdivinadas[i] = letra;
                    letraCorrecta = true;
                }
            }
            if (!letraCorrecta) {
                intentos++;
                System.out.println("Incorrecto! Te quedan " + (intentosMaximmos - intentos) + " intentos.");

            }
            if (String.valueOf(letrasAdivinadas).equals(palabresSecreta)) {
                palabraAdivinada = true;
                System.out.println("Felicidades, has adivinado la palabra secreta: " + palabresSecreta);
            }
            
        }

        if (!palabraAdivinada) {
            System.out.println("Que pena te has quedado sin intentos! GAME OVER");

        }
        sc.close();
    }
}
