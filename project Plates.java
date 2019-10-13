
package javaapplication1;

import java.util.Random;
import java.util.Scanner;

public class JavaApplication1 {

    private static class LinkedQueue {

        class Node {
            Object tipo;
            Object tiempo;
            Object placa;
            Object ide;
            Node Next;

            public Node(Object a, Object b, Object c, Object o) {
                tipo = a;
                tiempo= b;
                placa= c;
                ide= o;
                Next = null;
            }
        }

        Node first;
        Node end;
        int size;

        public void LinkedQueue() {
            end = null;
            size = 0;
        }

        public void push(Object o, Object a, Object b, Object c) {
            Node new_node = new Node(o,a,b,c);
            if (first == null) {
                first = new_node;
                end = new_node;
            } else {
                end.Next = new_node;
                end = new_node;
            }
            size++;
        }; // inserts an object onto the queue

        public Object pull() {
            if (first == null)
                return null;

            Object o = "Tipo: " + first.tipo + " Tiempo: " + first.tiempo + " Placa: " + first.placa + " Identificador: " + first.ide;
            first = first.Next;
            size--;
            return o;
        } // gets the object from the queue

        public boolean isEmpty() {
            return (size == 0);
        }   

        public int size() {
            return size;
        }

        public Object first() {
            if (first == null)
                return null;
            else
                return first.tipo;
        }
    }
   
    public static void Viewcola(LinkedQueue queue){
        String line = ""; 
        boolean vacia = true;
        while ((line = (String) queue.pull()) != null) {
            System.out.println (line);
             vacia = false;
        }
        
        if (vacia)
            System.out.println ("\nLA COLA ESTA VACIA");
    }
    
    public static void Insertcola(LinkedQueue queue, String tipo, Integer tiempo, String placa){
        int ide = 1; 
        ide= 1 + Integer.valueOf(queue.size());
        queue.push(tipo,tiempo, placa, ide);
        System.out.println ("\nSE AGREGO A LA COLA");    
    }
    
    public static boolean LeerDatos(boolean info, LinkedQueue queue){
        String tipo = ""; //Sedan, Microbus, Coupe
        Integer tiempo = 0; //Segundos
        String placa = ""; //Numero de placa
        boolean accion = true;

        Random rnd = new Random();
        Scanner entradaEscaner = new Scanner (System.in);
        tipo = entradaEscaner.nextLine (); 

        while(info){
            if (tipo.equalsIgnoreCase("sedan")){
                tiempo = 200;
                info = false;
            }else if (tipo.equalsIgnoreCase("microbus")){
                tiempo = 300;
                info = false;
            }else if (tipo.equalsIgnoreCase("coupe")){
                tiempo = 100;
                info = false;
            }else if (tipo.equalsIgnoreCase("salir")){
                info = false;
                return info;
            }else if (tipo.equalsIgnoreCase("ver")){
                Viewcola(queue);
                info = false;    
                accion= false;
            }else{
                System.out.println ("Por favor introduzca su tipo de vehiculo valido");
                tipo = entradaEscaner.nextLine ();  
            }
        }
        info = true;
        placa = String.valueOf(rnd.nextInt(10)) + rnd.nextInt(10) + rnd.nextInt(10) +  (char)(rnd.nextInt(25) + 65) + (char)(rnd.nextInt(25) + 65) + (char)(rnd.nextInt(25) + 65);
        
        if(accion){           
            Insertcola(queue, tipo, tiempo, placa);
        }
        
        return info;
    } 
      
    public static void main(String[] args) {
    LinkedQueue queue = new LinkedQueue(); // initialization
    System.out.println ("Empezamos el programa");
    boolean prueba = true;

        while ( prueba ) {
            System.out.println ("Por favor introduzca su tipo de vehiculo o ver para ejecutar la cola o ingrese salir para abandonar el programa");
            prueba= LeerDatos(prueba, queue);
        }
             

    }
}
