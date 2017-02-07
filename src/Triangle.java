/**
 * Created by Luke on 05/02/2017.
 */
class Triangle {
    private static final String ANSI_RESET = "\u001B[0m";
    private static final String ANSI_RED = "\u001B[31m";
    private static final String ANSI_GREEN = "\u001B[32m";
    private static final String ANSI_BLUE = "\u001B[34m";
    private static final String ANSI_YELLOW = "\u001B[33m";

    Triangle(int a, int b, int c) {this.getType(a,b,c);
    }

    private void getType(int a, int b, int c) {
        if(a != (int)a || b != (int)b || c != (int)c)
            System.out.println("Values must be integers only " + ANSI_RED + "✗" + ANSI_RESET);

        if(a <= 0 || b <= 0 || c <= 0)
            System.out.println("Sides of a triangle can't be equal to or less than zero " + ANSI_RED + "✗" + ANSI_RESET);
//            throw new IllegalArgumentException("Length of sides cannot be equal to or less than zero.");

        if (a + b > c && a + c > b && b + c > a) {
            if (a == b && b == c) {
                System.out.println("The triangle is " + ANSI_YELLOW + "EQUILATERAL " + ANSI_GREEN + "✔" + ANSI_RESET);
            } else if ((a == b) || (b == c) || (c == a)) {
                System.out.println("The triangle is " + ANSI_YELLOW + "ISOSCELES " + ANSI_GREEN + "✔" + ANSI_RESET);
            } else {
                System.out.println("The triangle is " + ANSI_YELLOW + "SCALENE " + ANSI_GREEN + "✔" + ANSI_RESET);
            }
            // *extra*
            if (c > 0 && (a*a + b*b == c*c)) {
                System.out.println("    * it's also PYTHAGOREAN! " + ANSI_BLUE + "◣" + ANSI_RESET);
            }

        } else {
            System.out.println("Can't build a triangle with the given values " + ANSI_RED + "✗" + ANSI_RESET);
//            throw new IllegalArgumentException("Can not build a triangle with given values.");
        }
    }
}
