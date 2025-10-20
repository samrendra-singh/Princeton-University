/* *****************************************************************************
 *  Name:              failsafe
 *  Coursera User ID:  123456
 *  Last modified:     October 6, 2025
 **************************************************************************** */

public class ExchangeValues {
    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);

        int temp = a;
        a = b;
        b = temp;

        System.out.println(a);
        System.out.println(b);
    }
}
