public class Main {
    public static long toMilesPerHour( double kilometersPerHour ){
        if(kilometersPerHour >= 0) {
            return Math.round(kilometersPerHour / 1.609);
        }
        return -1;

    }
    public static void printConversion(double kilometersPerHour){
        if(kilometersPerHour >= 0) {
            long miles;
            miles = (long) Math.round(kilometersPerHour / 1.609);
            System.out.println(kilometersPerHour + " km/h = " + miles + " mi/h");
        } else {
            System.out.println("Invalid Value");
        }
    }
}
