/*
*       *
 *     * 
  *   *  
   * * 
    * 
 */
public class DownChevron {
    public static void main(String[] args) {
        int n = 5;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(" ");
            }
            System.out.print("*");

            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            if (i == 5) { //the loop is running for the 5th time to print the point on the bottom - without the if else there would be two points on the bottom
               System.out.print(" ");
            }
            else {
               System.out.print("*");
            }
            System.out.println();
        }
    }
}
