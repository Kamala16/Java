public class Main {

    public static void main(String[] args) {
        Printer print1 = new Printer(80, 5, false);
        Printer print2 = new Printer(120, 0, false);
        Printer print3 = new Printer(0, 0, true);
        Printer print4 = new Printer(50, 0, true);

        System.out.println("print1:");
        System.out.println("Toner level is: " + print1.getTonerLevel());
        System.out.println("Printed pages: " + print1.getNumberOfPages());
        print1.fillUpToner();
        print1.printPage(7);

        System.out.println("print2:");
        System.out.println("Toner level is: " + print2.getTonerLevel());
        System.out.println("Printed pages: " + print2.getNumberOfPages());
        print2.fillUpToner();
        print2.printPage(0);

        System.out.println("print3:");
        System.out.println("Toner level is: " + print3.getTonerLevel());
        System.out.println("Printed pages: " + print3.getNumberOfPages());
        print3.printPage(7);

        System.out.println("print4:");
        System.out.println("Toner level is: " + print4.getTonerLevel());
        System.out.println("Printed pages: " + print4.getNumberOfPages());
        print4.fillUpToner();
        print4.printPage(8);
    }

}
