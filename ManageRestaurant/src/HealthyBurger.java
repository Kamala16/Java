import java.util.Scanner;

public class HealthyBurger extends Burger{

    private String[] allAdditions = new String[6];


    public HealthyBurger(String name, String rollType, String meatType, int price) {
        super(name, rollType, meatType, price);

    }

    @Override
    public String[] getAllAdditions() {
        return allAdditions;
    }

    @Override
    public void orderedAdditions() {
        for(int i = 0; i < this.allAdditions.length; i++){
            System.out.println(this.allAdditions[i]);
        }
    }

    @Override
    public void fullPrice(){
        int fullPrice = 0;
        Scanner s = new Scanner(System.in);
        int counter = 0;
        while(counter != 6){
            String addition = null;
            System.out.println("Please choose addition.");
            addition = s.nextLine();
            this.allAdditions[counter] = addition;
            if(addition.equals("lettuce")){
                fullPrice += 1;
                counter++;
            }
            else if(addition.equals("tomato")){
                fullPrice += 2;
                counter++;
            }
            else if(addition.equals("mayonnaise")){
                fullPrice += 1;
                counter++;
            }
            else if(addition.equals("ketchup")){
                fullPrice += 1;
                counter++;
            }
            else if(addition.equals("onion")){
                fullPrice += 2;
                counter++;
            }
            else if(addition.equals("cheese")){
                fullPrice += 3;
                counter++;
            }
            else
                System.out.println("Wrong addition.");
        }
        s.close();
        this.price += fullPrice;
    }

}
