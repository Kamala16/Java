import javax.sound.midi.Soundbank;
import java.lang.reflect.Array;
import java.util.Scanner;

public class Burger {

    private String name;
    private String rollType;
    private String meatType;
    public int price;
    private String[] allAdditions = new String[4];

    public Burger(String name, String rollType, String meatType, int price) {
        this.name = name;
        this.rollType = rollType;
        this.meatType = meatType;
        this.price = price;
    }

    public void additions(){
        System.out.println("lettuce - 1\n" +
                "tomato - 2\n" +
                "mayonnaise - 1\n" +
                "ketchup - 1\n" +
                "onion - 2\n" +
                "cheese - 3\n");
    }

    public void fullPrice(){
        int fullPrice = 0;
        Scanner s = new Scanner(System.in);
        int counter = 0;
        while(counter != 4){
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

    public void orderedAdditions(){
        for(int i = 0; i < this.allAdditions.length; i++){
            System.out.println(this.allAdditions[i]);
        }
    }

    public String getName() {
        return name;
    }

    public String getRollType() {
        return rollType;
    }

    public String getMeatType() {
        return meatType;
    }

    public int getPrice() {
        return price;
    }

    public String[] getAllAdditions(){
        return this.allAdditions;
    }
}
