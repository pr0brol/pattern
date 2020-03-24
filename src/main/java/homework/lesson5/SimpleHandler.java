package homework.lesson5;

public class SimpleHandler extends Handler {
    private Order order;

    @Override
    public void handle(Order order){
        if(this.order == order){
            System.out.println("Все официанты заняты");
        }else {
            this.order = order;
        }
        super.handle(order);
    }


}
