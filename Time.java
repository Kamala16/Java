public class Time {

    public static void main(String[] args){
        getDurationString(65,45);
        getDurationString(3945);
    }
    public static void getDurationString(int minutes, int seconds){
        if(minutes < 0 || seconds < 0 || seconds >59) {
            System.out.println("Invalid value");
        }
        int hours = minutes/60;
        minutes = minutes - hours * 60;
        System.out.println(hours + "h " + minutes + "m " + seconds + "s");
    }

    public static void getDurationString(int seconds){
        if(seconds < 0 ){
            System.out.println("Invalid value");
        }
        int minutes = seconds / 60;
        seconds = seconds - minutes * 60;
        getDurationString(minutes, seconds);
    }
}
