//Display the sum of the cube of the individual digits of a number
class WhileCube {
    public static void main(String[] args) {
        Add a = new Add();
        a.add(6);       
    }
}

class Add {
    int sum = 0;
    
    int add(int number) {
        while (number > 0) {
            int temp = number%10;
            sum += (int) Math.pow(temp,3);
            number = number/10;
        }
        System.out.println("The sum of the cube of individual digits of your number is " +sum);
        return number;
    }
}