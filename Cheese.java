public class Cheese extends OrderDecorator{
    public Cheese(Order order){
        super(order);
    }

    @Override
    public String getDescription(){
        return order.getDescription()+" + cheese ";
    }
    @Override
    public double getCost(){
        return order.getCost()+2.00;
    }
}
