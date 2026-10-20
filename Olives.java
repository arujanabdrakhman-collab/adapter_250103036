public class Olives extends OrderDecorator{
    public Olives(Order order){
        super(order);
    }

    @Override
    public String getDescription(){
        return order.getDescription()+" + olives ";
    }
    @Override
    public double getCost(){
        return order.getCost()+1.00;
    }
}
