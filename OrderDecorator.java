public class OrderDecorator implements Order{
    protected Order order;

    public OrderDecorator(Order order){
        if(order==null){
            throw new IllegalArgumentException("can not be null");
        }
        this.order=order;
    }

    @Override
    public String getDescription(){
        return order.getDescription();
    }
    @Override
    public double getCost(){
        return order.getCost();
    }
}