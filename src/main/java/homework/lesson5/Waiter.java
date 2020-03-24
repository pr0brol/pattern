package homework.lesson5;

import javafx.scene.control.TableRow;

//Официант, который принимает заказы
public class Waiter extends Handler {

    private static boolean condition;
    private static String name;

    public Waiter(String name) {
        condition = false;
        this.name = name;
    }

    @Override
    public void handle(Order order){
        if(!condition){
            System.out.printf("Официант %s занят\n", name);
            super.handle(order);
        }else {
            System.out.printf("Официант %s обрабатывает заказ\n", name);
            condition = true;
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            condition = false;
        }
    }
}
