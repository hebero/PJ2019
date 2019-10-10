package workshop.policies;

import java.util.LinkedList;

import workshop.orders.PaintOrder;

/**
 * RounRobin
 */
public class RounRobin extends Policy {
    private LinkedList<PaintOrder> list;

    public RounRobin(){
        list =  new LinkedList<PaintOrder>();
    }
    @Override
    public void add(PaintOrder order) {
        // TODO Auto-generated method stub
        list.add(order);
    }

    @Override
    public PaintOrder remove() {
        // TODO Auto-generated method stub
        if (list.size() != 0) {
            var temp = list.remove();
            return temp;
        }
        return null;
    }

    @Override
    public PaintOrder next() {
        // TODO Auto-generated method stub
        if (list.size() != 0 ) {
            return list.peekFirst();
        }
        return null;
    }

    
}