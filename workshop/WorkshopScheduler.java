package workshop;

import java.util.Random;

import workshop.policies.FirstComeFirstServed;

/**
 * WorkshopScheduler
 */
public class WorkshopScheduler {
    static PolicyOrderType typeSelect;
    public static FirstComeFirstServed fcfs;
    public static Integer price;
    public static double sedanTime;
    public static double busTime;
    public static double coupeTimer;
    public static double timer1;
    public static double timer2;

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
}