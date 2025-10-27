//Display the sum of the digits of a user entered number
class WhileSum {
    public static void main(String[] args) {
        Addition a = new Addition();
        a.add(4768);       
    }
}

class Addition {
    void add(int number) {       
        int sum = 0;

        while (number > 0) {
            int temp = number%10;
            sum += temp;
            number = number/10;
        }
    System.out.println("The sum of the digits of your number is " +sum);
    }
}