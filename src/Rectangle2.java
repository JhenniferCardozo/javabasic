public class Rectangle2 {
    protected double width;
    protected double length;
    public Rectangle2(double w, double l)
    {
        if ((l > 20 || l < 0) || (w > 20 || w < 0)) {
            throw new IllegalArgumentException("Out of Range - The number must be larger than 0.0 and less than 20.0");
        }
        this.length = l;
        this.width = w;
        System.out.printf("Rectangle Created! %n");
    }
    // get methods
    public double length(){
        return length;
    }
    public double width(){
        return width;
    }
    // set methods
    public void length(double l){
        if (l > 20 || l < 0) {
            throw new IllegalArgumentException("Out of Range - The number must be larger than 0.0 and less than 20.0");
        }
        this.length = l;
    }
    public void width(double w){
        if (w > 20 || w < 0) {
            throw new IllegalArgumentException("Out of Range - The number must be larger than 0.0 and less than 20.0");
        }
        this.width = w;
    }

    public void calcArea(){
        double area;
        area = length() * width();
        System.out.printf("The Rectangle Area is: %.2f cm² %n", area);
    }
    public void calcPerimeter(){
        double perimeter;
        perimeter = 2 * (length() + width());
        System.out.printf("The Rectangle Perimeter is: %.2f cm %n", perimeter);
    }
}

