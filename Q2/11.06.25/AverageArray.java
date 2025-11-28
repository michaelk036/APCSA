//1: WAP that receives an int array and returns the sum and average of all elements.
//Use an enhanced for-loop.
class AverageArray {
    public static void main(String[] args) {
	int array[] = {1,2,3,4,67};
	Array a = new Array();
	int output = a.average(array); 
    System.out.println(output);  
    }
}

class Array {
	int average(int array[]) {
        int arraySum = 0;

		for (int i:array) {
			arraySum += i;
		}
        
        int output = arraySum/array.length;
        return output;
	}
}
