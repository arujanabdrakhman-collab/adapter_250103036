public class PlainPizza implements Order {
    private final String name;
    private final double baseCost;

    public PlainPizza(String name, double baseCost){
        if(name==null || name.isEmpty()){
            throw new IllegalArgumentException("you need to write name");
        }
        if(baseCost<=0){
            throw new IllegalArgumentException("wrong price");
        }
        this.name=name;
        this.baseCost=baseCost;
    }

    @Override
    public String getDescription(){
        return name;
    }
    @Override
    public double getCost(){
        return baseCost;
    }
}