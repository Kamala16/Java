import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Please give numerical precedent:\nmax: ");
        int max = s.nextInt();
        s.close();
        Random generator = new Random();
        System.out.println(generator.nextInt(max));
    }

}
