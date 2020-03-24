package homework.lesson5;

public abstract class Handler {
    private Handler next;

    public void handle(Order order){
        if(next != null){
            next.handle(order);
        }
    }

    Handler link(Handler next){
        this.next = next;
        return next;
    }
}
