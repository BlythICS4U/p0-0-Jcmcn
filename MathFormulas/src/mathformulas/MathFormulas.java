package mathformulas;

/**
 *
 * @author cgallinaro
 */
public class MathFormulas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double a = 1.0;
        double b = 2.0;
        double m = 3.0;
        
        double x = (a-5.0)*(b+4.0);
        double y = m*x + b;
        double z = 4.0*(2.0*x+7.0)*(3.0*x-2.0);
        double w = (m-4.0*x)/(7.0-y);
        double v = (a*x*2.0+b*x+z)/(m*x-w);
        System.out.println("X is equal to " + x + "\n" + "Y is equal to " + y + "\n" + "Z is equal to " + z + "\n" + "W is equal to " + w + "\n" + "V is equal to " + v);
        
    }
    
}
