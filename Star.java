public class Star {

    public static void main(String[] args){
        printSquareStar(8);
    }
        public static void printSquareStar(int number){
            if(number < 5){
                System.out.println("Invalid Value");
            }else{
                for(int i = 1; i <= number; i++){
                    if(i == 1 || i == number) {
                        for(int j = 1; j <= number-1; j++) {
                            System.out.print("*");
                        }
                        System.out.println("*");
                    }else {
                        for (int j = 1; j <= number; j++)
                            if (j == 1 || j == i || j == number - i + 1) {
                                System.out.print("*");
                            } else if (j == number) {
                                System.out.println("*");
                            } else {
                                System.out.print(" ");
                            }
                    }
                }
            }

        }


}
