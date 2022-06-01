/*
Primera parte:
    - Crear una función con tres parámetros que sean números que se suman entre sí.
    - Llamar a la función en el main y darle valores.

Segunda parte:

    - Crear una clase coche.
    - Dentro de la clase coche, una variable numérica que almacene el número de puertas que tiene.
    - Una función que incremente el número de puertas que tiene el coche.
    - Crear un objeto miCoche en el main y añadirle una puerta.
    - Mostrar el número de puertas que tiene el objeto.
 */

public class Main {
    public static void main(String[] args) {

        //PRIMERA PARTE
        System.out.println(sumar(10,20,30)); //llama al metodo "suma" e imprime el total de la suma

        //SEGUNDA PARTE
        Coche miCoche = new Coche(); //Crea un objeto de la clase Coche
        miCoche.incrementarPuerta(); //Invoca la función para incrementar la puerta
        System.out.println(miCoche.n_puertas);
    }

    //PRIMERA PARTE
    public static int sumar(int num_1, int num_2, int num_3){ //función que retorna el total de la suma
        return num_1 + num_2 + num_3;
    }

    //SEGUNDA PARTE
   static class Coche {
        int n_puertas = 0;

        public void incrementarPuerta(){
            n_puertas++;
        }
    }

}