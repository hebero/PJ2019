package workshop.orders;

import workshop.WorkshopScheduler;

/**
 * BusOrder author: carnet:
 */
public class BusOrder extends PaintOrder {

    private double price;
    /** 
     * Constructor
     * @param number <numero de orden>, 
     * **/
    public BusOrder(int number, String plate, int total, double time) {
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
        Double subTotal =0.0d;
        if (this.state == state.DONE) {
            if (this.getType() == "BUS") {
                Integer r = WorkshopScheduler.getRandomNumber(4,9);
                subTotal = getSubTotal() - (getSubTotal() *r)/100;
            }
            return subTotal.toString();
        }
        else{
            return "?";
        }
    }

    private Double getSubTotal() {
        return this.price * this.total;
    }

    @Override
    public void end() {
        // TODO Auto-generated method stub

        this.state = State.DONE;
    }
    
}