public class NumberToWords {

    public static void main(String[] args){
        numberToWords(-12);
    }

    public static void  numberToWords(int number){
        if(number < 0){
            System.out.println("Invalid Value");

        }else{
        int digits = getDigitCount(number);
        number = reverse(number);

        while(digits != 0){
            int lastDigit = number%10;
            switch(lastDigit) {
                case 0:
                    System.out.println("Zero");
                    break;
                case 1:
                    System.out.println("One");
                    break;
                case 2:
                    System.out.println("Two");
                    break;
                case 3:
                    System.out.println("Three");
                    break;
                case 4:
                    System.out.println("Four");
                    break;
                case 5:
                    System.out.println("Five");
                    break;
                case 6:
                    System.out.println("Six");
                    break;
                case 7:
                    System.out.println("Seven");
                    break;
                case 8:
                    System.out.println("Eight");
                    break;
                case 9:
                    System.out.println("Nine");
                    break;
                default:
                    break;
            }
            number /= 10;
            digits--;
        }}
    }

    public static int reverse(int number){
        int reversed = 0;
        while(number != 0){
            int digit = number%10;
            reversed = reversed * 10 + digit;
            number /= 10;
        }
        return reversed;
    }

    public static int getDigitCount(int number){
        if(number < 0){
            return -1;
        }
        int counter = 1;
        for(int i = 10; i <= number;){
            counter++;
            i *= 10;
        }
        return counter;
    }

}