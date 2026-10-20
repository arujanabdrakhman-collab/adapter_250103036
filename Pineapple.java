public class Pineapple extends OrderDecorator{
    public Pineapple(Order order){
        super(order);
    }

    @Override
    public String getDescription(){
        return order.getDescription()+" + pineapple ";
    }
    @Override
    public double getCost(){
        return order.getCost()+1.50;
    }
}
