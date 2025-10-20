/* *****************************************************************************
 *  Name:              Ada Lovelace
 *  Coursera User ID:  123456
 *  Last modified:     October 16, 1842
 **************************************************************************** */

public class RightTriangle {
    public static void main(String[] args) {
        int a, b, c;
        a = Integer.parseInt(args[0]);
        b = Integer.parseInt(args[1]);
        c = Integer.parseInt(args[2]);

        boolean isPositive = (a > 0) && (b > 0) && (c > 0);
        long aSq = (long) a * a;
        long bSq = (long) b * b;
        long cSq = (long) c * c;
        boolean isPythagorean = (aSq + bSq == cSq) || (bSq + cSq == aSq) || (cSq + aSq == bSq);

        boolean isRightTriangle = isPythagorean && isPositive;
        System.out.println(isRightTriangle);
    }
}
