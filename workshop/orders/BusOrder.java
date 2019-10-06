package workshop.orders;

/**
 * BusOrder
 * author:
 * carnet:
 */
public class BusOrder extends PaintOrder {

    protected BusOrder(int number, String plate, int total, double time) {
        super(number, plate, total, time);
        // TODO Auto-generated constructor stub
    }

    @Override
    public String getType() {
        // TODO Auto-generated method stub
        return "BUS";
        //return null;
    }

    @Override
    public String getPrice() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void end() {
        // TODO Auto-generated method stub

    }

    
}