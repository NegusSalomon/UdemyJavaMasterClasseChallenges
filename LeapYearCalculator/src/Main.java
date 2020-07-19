public class Main {
    public static void main{
        isLeapYear(1980);
    }
    public static boolean isLeapYear(int year){
        if((year >= 1) && (year <= 9999)){
            if((year % 4) == 0) {
                if((year % 100) == 0){
                    if((year % 400) == 0){
                        return true;
                    }
                } else {
                    return true;
                }
            }
        }
        return false;
    }
}
