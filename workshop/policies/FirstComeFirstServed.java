package workshop.policies;

import java.util.concurrent.ConcurrentLinkedQueue;

import workshop.orders.PaintOrder;

/**
 * FirstComeFirstServed
 * author: Heber Orellana
 * carnet: 19003305
 */
public class FirstComeFirstServed extends Policy {
    ConcurrentLinkedQueue<PaintOrder> queue;
    FirstComeFirstServed(){
        queue  = new ConcurrentLinkedQueue<PaintOrder>();
    }
    @Override
    public void add(PaintOrder order) {
        // TODO Auto-generated method stub
        queue.add(order);
    }

    @Override
    public PaintOrder remove() {
        // TODO Auto-generated method stub
        var temp = queue.remove();
        return temp;
    }

    @Override
    public PaintOrder next() {
        // TODO Auto-generated method stub
        var temp = queue.peek();
        return temp;
    }

    
}