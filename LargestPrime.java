public class LargestPrime {

    public static void main(String[] args){
        System.out.println(getLargestPrime(45));
    }

    public static int getLargestPrime(int number){
        if(number < 2){
            return -1;
        }
        int largestPrime = 0;
        for(int i = 1; i <= number; i++){
            if(number%i == 0){
                int count = 0;
                for(int j = 1; j <= i; j++){
                    if(i%j == 0){
                        count++;
                    }
                }
                if(count < 3){
                    largestPrime = i;
                }
            }
        }
        return largestPrime;
    }

}