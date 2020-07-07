public class Cuboid extends Rectangle{

    private double height;

    public Cuboid(double width, double height, double length){
        super(width, length);
        if(height < 0) {
            this.height = 0;
        }else if(height >= 0)
            this.height = height;
    }

    public double getHeight() {
        if(height < 0)
            return this.height;
        else
            return this.height;
    }

    public double getVolume(){
        return this.height * getArea();
    }

    public static void main(String[] args) {
        Cuboid c = new Cuboid(5,2,15);
        System.out.println(c.getHeight());

    }
}

