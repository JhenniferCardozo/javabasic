public class AreaRectangle {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        displayData(rectangle);
        rectangle = new Rectangle(5, 18);
        displayData(rectangle);
    }
    public static void displayData(Rectangle rect) {
        System.out.println("Rectangle: \n" + rect);
        System.out.printf("Area Rectangle: %.2f cm²\n"
                + "Perimeter Rectangle: %.2f cm\n\n", rect.area(), rect.perimeter());
    }
}
