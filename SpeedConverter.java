public class SpeedConverter {

    public static void main(String[] args){
        double result = toMilesPerHour(75.114);
        System.out.println(result);
        printConversion(-2);
    }

    public static long toMilesPerHour(double kilometerPerHour){
        if(kilometerPerHour < 0)
            return -1;
        long result = (long)(Math.round(kilometerPerHour/1.61));
        return result;
    }

    public static void printConversion(double kilometersPerHour){
        if(kilometersPerHour < 0)
            System.out.println("Invalid Value");
        else {
            int result = (int)(Math.round(kilometersPerHour / 1.61));
            System.out.println(kilometersPerHour + " km/h = " + result + " mi/h");
        }
    }
}