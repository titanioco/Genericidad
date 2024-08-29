/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package objetos.genericidad;

/**
 *
 * @author ESTUDIANTES
 */
public class Pair {

    public static void main(String[] args) {
        System.out.println("---Hola, En este programa podrás registrar datos de edad y nombre"
                + "post--- ");
        Pair<Integer,String> datosPersona = new Dato<>(25, "Leonardo");
        System.out.println("Datos Persona" + datosPersona);
        
        Dato<String, String> 
        
        public class Pair<T, U> {
            
            private T first;
            private U second;
            
            public Pair(T first, U second) {
                this.first = first;
                this.second = second;
            }
            
            public T getFirst() {
                return first;
            }
            
            public U getSecond() {
                return second;
            }
            
            @Override
            public String toString() {
                return "(" + first + ", " + second + ")";
            }
        }
          
    }
}
