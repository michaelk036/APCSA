//Display the individual digits of a user entered number e.g. 1681 should be displayed as 1  6  8  1
class Individual {
    public static void main(String[] args) {
        IndividualDigits d = new IndividualDigits();
        d.individualize(1681);
    }
}
class IndividualDigits {
    int reverse = 0;

    int individualize(int number) {
        while (number > 0) {
            int temp = number%10;
            reverse = (reverse * 10) + temp;
            number = number / 10;
        }

        while (reverse > 0) {
            int temp = reverse%10;
            System.out.print(" " +temp+ " ");
            reverse = reverse/10;
        }
        return number;
    }
}