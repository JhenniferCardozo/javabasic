import java.util.Scanner;
import java.text.DecimalFormat;

public class ConvertCelsius {

    public static void main(String[] args)
    {

        //Create to object to accept input from user
        Scanner inputDegree = new Scanner(System.in);

        //Input temperature from user
        System.out.print("Please, enter temperature in Fahrenheit: ");
        double fahrenheit = inputDegree.nextDouble();

        //Formula to to convert
        double celsius = (5.0 / 9.0) * (fahrenheit - 32.0);

        //Format and Print result
        DecimalFormat myFormatter = new DecimalFormat("#");
        System.out.println(myFormatter.format(fahrenheit) + "\u00B0" + "F is equal to "
                + myFormatter.format(celsius) + "\u00B0" + "C");

        //Close scanner
        inputDegree.close();
    }

}
