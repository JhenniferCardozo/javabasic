import java.text.DecimalFormat;

public class Rectangle {
    private float length, width;
    public Rectangle() {
        setLength( (float) 1);
        setWidth( (float) 1);
    }
    public Rectangle(float l, float w) {
        setLength(l);
        setWidth(w);
    }
    public float getLength() { return length; }
    public float getWidth()  { return width;  }
    public void setLength(float l) {
        length = l;
        if ( l < 0.0 || l > 20.0 )
        {
            throw new IllegalArgumentException
                    ("Out of Range - The number must be larger than 0.0 and less than 20.0");
        }
    }

    public void setWidth(float w) {
        width= w;
        if ( w < 0.0 || w > 20.0 )
        {
            throw new IllegalArgumentException
                    ("Out of Range - The number must be larger than 0.0 and less than 20.0");
        }
    }
    public String toString() {

        DecimalFormat fmt = new DecimalFormat("#,#0.00");

        return "Length: " + fmt.format(length) + "\nWidth: " +
                fmt.format(width);
    }
    public float area() { return length * width; }
    public float perimeter() { return (length * 2) + (width * 2); }
}

