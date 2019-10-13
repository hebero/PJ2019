package workshop;

import java.util.Random;

import java.util.Scanner;

import workshop.policies.FirstComeFirstServed;

/**
 * WorkshopScheduler
 */
public class WorkshopScheduler {
    public static PolicyOrderType typeSelect;
    public static FirstComeFirstServed fcfs;
    public static Integer price;
    public static double sedanTime;
    public static double busTime;
    public static double coupeTimer;
    public static double timer1;
    public static double timer2;
	public static boolean isRun;

    public static void main(String[] args) {
        Double[] timers;
        var out = System.out;
        try {
            switch (args[0]) {
                case "-fcfs":
                    typeSelect = PolicyOrderType.fcfs;
                    break;
                case "-lcfs":
                    typeSelect = PolicyOrderType.lcfs;
                    break;
                case "-rr":
                    typeSelect = PolicyOrderType.rr;
                    break;
                default:
                    out.println("Parameter incorrect.");
                    break;
                }
        
                price = Integer.parseInt(args[5]);
                sedanTime = Double.parseDouble(args[2]);
                busTime = Double.parseDouble(args[3]);
                coupeTimer = Double.parseDouble(args[4]);
                timers = getTimers(args[1]);
                isRun = true;
                switch (args[1]) {
                case "value":
        
                    break;
        
                default:
                    break;
                }
        }
        catch (WorkshopSchedulerException e){
            System.out.println(e.getMessage());
        }
        

    }

    private static Double[] getTimers(String s) throws WorkshopSchedulerException {
        if (s.contains("-")) {
            Double[] r = new Double[2];

            String[] result = s.split("-");
            r[0] = getNumber(result[0]);
            r[1] = getNumber(result[1]);
            return r;
        } else {
            throw new WorkshopSchedulerException("Parámetro de intervalos de tiempo incorrecto.");
        }
    }

    private static Double getNumber(String s) throws WorkshopSchedulerException {
        try {
            return Double.parseDouble(s);
        } catch (Exception e) {
            //TODO: handle exception
            throw new WorkshopSchedulerException("Parámetro erroneo: " + s);
        }
    }
	public static Integer getRandomNumber(int i, int j) {
        Random r = new Random();
        Integer rr = r.nextInt(j);
        rr = rr+ i;

		return rr;
	}

	public static String getNewPlate() {
		package javaapplication1;


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
        }; // inserts an object into the queue -19001024 TG

        public Object pull() {
            if (first == null)
                return null;

            Object o = "Tipo: " + first.tipo + " Tiempo: " + first.tiempo + " Placa: " + first.placa + " Identificador: " + first.ide;
            first = first.Next;
            size--;
            return o;
        } // gets the object from the queue -19001024 TG

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

	}
}
