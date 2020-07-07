public class Printer {

    private int tonerLevel;
    private int numberOfPages;
    private boolean itsDuplexPrinter;

    public Printer(int tonerLevel, int numberOfPages, boolean itsDuplexPrinter) {
        if(tonerLevel > 0 && tonerLevel <= 100)
            this.tonerLevel = tonerLevel;
        else
            this.tonerLevel = 0;
        this.numberOfPages = 0;
        this.itsDuplexPrinter = itsDuplexPrinter;
    }

    public void fillUpToner(){
        this.tonerLevel = 100;
        System.out.println("Toner level is now " + this.tonerLevel);
    }

    public void printPage(int pagesToPrint){
        if(pagesToPrint <= 0){
            System.out.println("Nothing to print.");
        }
        if(this.tonerLevel <= 0){
            System.out.println("Fill up toner.");
            return;
        }
        while(pagesToPrint != 0){
            if(this.itsDuplexPrinter){
                if(pagesToPrint%2 == 0) {
                    System.out.println("Pages number " + pagesToPrint + " and " + (pagesToPrint-1) + " were printed");
                    numberOfPages += 2;
                    pagesToPrint -= 2;
                    this.tonerLevel -= 2;
                }else{
                    System.out.println("Page number " + pagesToPrint + " was printed");
                    numberOfPages++;
                    pagesToPrint--;
                    this.tonerLevel--;
                }
            }else{
                System.out.println("Page number " + pagesToPrint + " was printed");
                numberOfPages++;
                pagesToPrint--;
                this.tonerLevel--;
            }

        }
    }

    public int getTonerLevel() {
        return tonerLevel;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public boolean isItsDuplexPrinter() {
        return itsDuplexPrinter;
    }


}
