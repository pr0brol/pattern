package homework.lesson5;

public abstract class Order {
    private static String status;

    public static String getStatus() {
        return status;
    }

    public static void setStatus(String status) {
        Order.status = status;
    }

    public abstract String getData();
}
