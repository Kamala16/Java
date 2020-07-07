import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        menu();
        Scanner s = new Scanner(System.in);
        int orderNumber = s.nextInt();
        Burger burger = new Burger("Burger standard", "white bread", "beef", 8);
            switch (orderNumber) {
                case 1:
                    burger = new Burger("Burger standard", "white bread", "beef", 8);
                    System.out.println("You choose " + burger.getName() + "\nPlease choose 4 additions:");
                    burger.additions();
                    burger.fullPrice();
                    System.out.println("You order " + burger.getName() + " in " + burger.getRollType() + " with " + burger.getMeatType() +  " and:");
                    burger.orderedAdditions();
                    System.out.println("Full price: " + burger.getPrice());
                    break;
                case 2:
                    burger = new HealthyBurger("Healthy burger", "brown bread", "beef", 10);
                    System.out.println("You choose " + burger.getName() + "\nPlease choose 6 additions:");
                    burger.additions();
                    burger.fullPrice();
                    System.out.println("You order " + burger.getName() + " in " + burger.getRollType() + " with " + burger.getMeatType() +  " and:");
                    burger.orderedAdditions();
                    System.out.println("Full price: " + burger.getPrice());
                    break;
                case 3:
                    burger = new DeluxeBurger("Burger deluxe", "white bread", "beef", 16);
                    System.out.println("You choose " + burger.getName()+ "\nPlease choose 4 additions:");
                    burger.additions();
                    burger.fullPrice();
                    System.out.println("You order " + burger.getName() + " in " + burger.getRollType() + " with chips, drink and " + burger.getMeatType() +  " and:");
                    burger.orderedAdditions();
                    System.out.println("Full price: " + burger.getPrice());
                    break;
                default:
                    System.out.println("Wrong number");
                    break;

        }
    }

    public static void menu(){
        System.out.println("Please choose number of burger:\n" +
                "1. Burger standard(white bread + pork meat + 4 additions),\n" +
                "2. Healthy burger (brown bread + pork meat + 6 additions),\n" +
                "3. Deluxe burger (white bread + pork meat + 4 additions + chips + drink)");
    }
}
