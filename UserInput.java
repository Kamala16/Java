import java.util.Scanner;

public class UserInput {

    public static void inputThenPrintSumAndAverage(){
        Scanner s = new Scanner(System.in);
        int sum = 0;
        long avg = 0;

            boolean idInt = s.hasNextInt();
            if(idInt){
                int number = s.nextInt();
                sum += number;
                avg = Math.round((avg + number)/2);
            }else{
                System.out.println("Invalid Value");
            }

        System.out.println("SUM = " + sum + " AVG = " + avg);

    }

}