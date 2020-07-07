public class PaintJob {

    public static void main(String[] args){
        int number = getBucketCount(0.75, 0.75, 0.5, 0);
        System.out.println(number);
        int number2 = getBucketCount(3.4, 2.1, 1.5);
        System.out.println(number2);
        int number3 = getBucketCount(3.4, 1.5);
        System.out.println(number3);
    }

    public static int getBucketCount(double width, double height, double areaPerBucket, int extraBuckets){

        if(width <= 0 || height <= 0 || areaPerBucket <= 0 || extraBuckets < 0){
            return -1;
        }
        double areaToPaint = width * height;
        int numberOfBucketToPaint = (int)(Math.round(areaToPaint / areaPerBucket));
        if(numberOfBucketToPaint < areaToPaint/areaPerBucket){
            numberOfBucketToPaint++;
        }
        int numberOfBucketToBuy = numberOfBucketToPaint - extraBuckets;
        return  numberOfBucketToBuy;
    }

    public static int getBucketCount(double width, double height, double areaPerBucket){
        if(width <= 0 || height <= 0 || areaPerBucket <= 0){
            return -1;
        }
        double areaToPaint = width * height;
        int numberOfBucketToPaint = (int)(Math.round(areaToPaint / areaPerBucket));
        if(numberOfBucketToPaint < areaToPaint/areaPerBucket){
            numberOfBucketToPaint++;
        }
        return  numberOfBucketToPaint;
    }

    public static int getBucketCount(double area, double areaPerBucket){
        if(area <= 0 || areaPerBucket <= 0){
            return -1;
        }
        int numberOfBucketToPaint  = (int)(Math.round(area / areaPerBucket));
        if(numberOfBucketToPaint < area/areaPerBucket){
            numberOfBucketToPaint++;
        }
        return numberOfBucketToPaint;
    }

}