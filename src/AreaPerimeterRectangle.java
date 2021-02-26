public class AreaPerimeterRectangle {
    public static void main(String[] args) {

        Rectangle2 ret = new Rectangle2(18, 2);
        ret.calcArea();
        ret.calcPerimeter();
        System.out.printf("********************************************%n");
        Square sq = new Square(4);
        sq.calcArea();
        sq.calcPerimeter();
    }

}
