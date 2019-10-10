package workshop.policies;

import java.util.Stack;
import workshop.orders.PaintOrder;

/**
 * LastComeFirstServed
 * author: Heber Orellana
 * Carnet: 19003305
 */
public class LastComeFirstServed extends Policy{

    private Stack<PaintOrder> stack;
    public LastComeFirstServed(){
        stack =  new Stack<PaintOrder>();
    }
    @Override
    public void add(PaintOrder order) {
        // TODO Auto-generated method stub
        stack.add(order);
        queuedOrders ++;
    }

    @Override
    public PaintOrder remove() {
        // TODO Auto-generated method stub
        if (!stack.isEmpty()) {
            var temp  = stack.pop();
            processedOrders ++;
            currentOrders --;
            queuedOrders --;
            return temp;    
        }
        return null;
    }

    @Override
    public PaintOrder next() {
        // TODO Auto-generated method stub
        if (!stack.isEmpty()) {
            currentOrders ++;
            return stack.peek();
        }
        return null;
    }

    
}