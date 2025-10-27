//Count the number of digits of a user entered number
class WhileDigits {
    public static void main(String[] args) {
        Count c = new Count();
        c.count(748);
    }
}

class Count {
    int digits = 0;
    int temp;

    int count(int number) {
        while (number > 0) {
            temp = number%10; 
            number = number/10;
            digits++;            
        }
        System.out.println("The number of digits in your number is " +digits);
        return number;
    }
}