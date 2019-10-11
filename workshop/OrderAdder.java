package workshop;

import workshop.orders.BusOrder;
import workshop.orders.PaintOrder;

/**
 * OrderAdder
 */
public class OrderAdder extends Thread{
    private Integer orderCount;
    public OrderAdder(){
        super();
        orderCount = 0;
    }
    @Override
    public void run() {
        // TODO Auto-generated method stub
        super.run();
        var order =  getNewOrder();
        while (WorkshopScheduler.isRun) {

            switch (WorkshopScheduler.typeSelect) {
                case fcfs:
                    WorkshopScheduler.fcfs.add(order);
                    break;
            
                default:
                    break;
            }            
         
        }
        
    }

    private PaintOrder getNewOrder() {
        Integer r = WorkshopScheduler.getRandomNumber(0, 3);
        switch (r) {
            case 1:
                return new BusOrder(orderCount, WorkshopScheduler.getNewPlate(), WorkshopScheduler.getRandomNumber(0, 5), WorkshopScheduler.busTime);
                break;
        
            default:
                break;
        }
        return null;
    }
    
}