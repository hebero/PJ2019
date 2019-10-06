package workshop.orders;

/**
 * CouperOrder
 * author: Heber Orellana
 * carnet: 190033015
 */
public class CouperOrder extends PaintOrder{

    protected CouperOrder(int number, String plate, int total, double time) {
        super(number, plate, total, time);
        // TODO Auto-generated constructor stub
    }

    @Override
    public String getType() {
        // TODO Auto-generated method stub
        return "COUPE";
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