public class DecimalCOmparator {
    public static void main(String[] args) {
        System.out.println(areEqualByThreeDecimalPlaces(3.1757, 3.1758));
    }
    public static boolean areEqualByThreeDecimalPlaces(double a, double b){
        double tempA = a * 1000;
        double tempB = b * 1000;
        System.out.println(tempA);
        System.out.println(tempB);
        short shortA = (short) tempA;
        short shortB = (short) tempB;
        System.out.println(shortA);
        System.out.println(shortA);
        if(shortA == shortB){
            return true;
        }
        return false;
    }
}
