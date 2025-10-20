/* *****************************************************************************
 *  Name:              Ada Lovelace
 *  Coursera User ID:  123456
 *  Last modified:     October 16, 1842
 **************************************************************************** */

public class GreatCircle {
    public static void main(String[] args) {
        double x1, y1, x2, y2, distance;
        final double r = 6371.0;

        x1 = Math.toRadians(Double.parseDouble(args[0]));
        y1 = Math.toRadians(Double.parseDouble(args[1]));
        x2 = Math.toRadians(Double.parseDouble(args[2]));
        y2 = Math.toRadians(Double.parseDouble(args[3]));

        // wrong interpretation of math formula by me
        // distance = 2 * r * Math.asin(Math.sqrt(
        //         ((Math.sin(x2 - x1) / 2) * (Math.sin(x2 - x1) / 2)) + Math.cos(x1) * Math.cos(x2)
        //                 * (Math.sin((y2 - y1) / 2) * Math.sin(
        //                 (y2 - y1) / 2))));

        double term1 = Math.sin((x2 - x1) / 2) * Math.sin((x2 - x1) / 2);
        double term2 = Math.cos(x1) * Math.cos(x2) * Math.sin((y2 - y1) / 2) * Math.sin(
                (y2 - y1) / 2);
        distance = 2 * r * Math.asin(Math.sqrt(term1 + term2));

        System.out.println(distance + " kilometers");
    }
}
