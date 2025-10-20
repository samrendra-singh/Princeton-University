/* *****************************************************************************
 *  Name:              Ada Lovelace
 *  Coursera User ID:  123456
 *  Last modified:     October 16, 1842
 **************************************************************************** */

public class CMYKtoRGB {
    public static void main(String[] args) {
        double c, m, y, k, white;
        int r, g, b;

        c = Double.parseDouble(args[0]);
        m = Double.parseDouble(args[1]);
        y = Double.parseDouble(args[2]);
        k = Double.parseDouble(args[3]);

        white = 1 - k;

        r = (int) (255 * white * (1 - c));
        g = (int) (255 * white * (1 - m));
        b = (int) (255 * white * (1 - y));

        System.out.println("red   = " + r);
        System.out.println("green = " + g);
        System.out.println("blue  = " + b);
    }
}
