public class Operateur {
    public static void main(String[] args) {
        double a = 20.00d;
        double b = 80.00d;
        double result1 = ( a + b ) * 100.00d;
        System.out.println(result1);
        double result2 = result1 % 40.00d;
        System.out.println(result2);
        boolean noReminder = (result2 == 0.0d) ? true : false;
        System.out.println(noReminder);
        if (!noReminder) {
            System.out.println("Got some reminder");
        }
    }
}
