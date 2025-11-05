/*
* * * * *
 * * * *
  * * *
   * *
	* 
   * *
  * * *
 * * * *
* * * * *
 */
class HourGlass {
  public static void main(String[] args) {
	int n = 5; //n+1 because it was printing with 4

	for (int i = 1; i < n+1; i++) {
	  for (int j = 1; j <= i; j++) {
		System.out.print(" ");
	  }
	  for (int j = 1; j <= n+1 - i; j++) {
		System.out.print("* ");
	  }
	  System.out.println();
	}

	//bottom half
	for (int i = (n+1) - 2; i >= 1; i--) {
	  for (int j = 1; j <= i; j++) {
		System.out.print(" ");
	  }
	  for (int j = 1; j <= (n+1) - i; j++) {
		System.out.print("* ");
	  }
	  System.out.println();
	}
  }
}