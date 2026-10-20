public class Main {
    public static Order buildOrder(String name, double baseCost, boolean Cheese, boolean Olives, boolean Pineapple){

        Order order=new PlainPizza(name, baseCost);

        if(Cheese){
            order=new Cheese(order);
        }
        if(Olives){
            order=new Olives(order);
        }
        if(Pineapple){
            order=new Pineapple(order);
        }
        return order;
    }
    public static void main(String[] args){
        Order a=buildOrder("pizza ", 3.00, true, true, true);
        System.out.println(a.getDescription());
        System.out.println(a.getCost());

    Order b=buildOrder("pizza ", 2.00, false, true, true);
        System.out.println(b.getDescription());
        System.out.println(b.getCost());

        Order c=buildOrder("pizza ", 5.00, true, false, true);
        System.out.println(a.getDescription());
        System.out.println(a.getCost());

}

}