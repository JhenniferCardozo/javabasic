public class Square extends Rectangle2 {
    public Square(double s){
        super(s, s);
        System.out.println("It is a SQUARE!");
    }
    @Override
    public void calcArea(){
        double area;
        area = length() * width();
        System.out.printf("The Square Area is: %.2f cm² %n", area);
    }
    @Override
    public void calcPerimeter(){
        double perimeter;
        perimeter = 2 * (length() + width());
        System.out.printf("The Square Perimeter is: %.2f cm %n", perimeter);
    }}

