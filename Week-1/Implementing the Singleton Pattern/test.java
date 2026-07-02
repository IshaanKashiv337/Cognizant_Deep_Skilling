public class test{
    public static void main(String[] args) {

        Logger logger1 = Logger.getInstance();
        Logger logger2 = Logger.getInstance();

        System.out.println("Logger 1 HashCode: " + logger1.hashCode());
        System.out.println("Logger 2 HashCode: " + logger2.hashCode());

        if (logger1 == logger2) {
            System.out.println("Both variables point to the identical Logger instance.");
        } else {
            System.out.println("Different instances of Logger exist!");
        }
    }
}
