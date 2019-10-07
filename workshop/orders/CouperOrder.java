package workshop.orders;

import workshop.WorkshopScheduler;

/**
 * CouperOrder
 * author: Heber Orellana
 * carnet: 190033015
 */
public class CouperOrder extends PaintOrder{
    Double price;
    protected CouperOrder(int number, String plate, int total, double time, double price) {
        super(number, plate, total, time);
        this.price =  price;
    }

    @Override
    public String getType() {
        return "COUPE";
    }

    @Override
    public String getPrice() {
        // TODO Auto-generated method stub
        Double subTotal =0.0d;
        if (this.getState() == state.WAITING){
            return "?";
        }
        if (this.getType() == "COUPE") {
            Integer r = WorkshopScheduler.getRandomNumber(4,9);
            subTotal = getSubTotal() - (getSubTotal() *r)/100;
        }
        return subTotal.toString();
    }

    @Override
    public void end() {
        // TODO Auto-generated method stub
        this.state = state.DONE;

    }
    private double getSubTotal(){
        return this.price * this.total;
    }
    
}