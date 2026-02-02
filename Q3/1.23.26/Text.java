import java.io.File;
import java.io.IOException;
import java.util.Scanner;

class Text {
    public static void main(String[] args) throws IOException{
        File f = new File("text.txt"); 
        Scanner sc = new Scanner(f);

        while (sc.hasNextLine()) {
            String line = sc.nextLine();
            System.out.println(line);
        }
    }
}

/*
Notes

- io = input output, that's the package
- `import java.io.*;` this would import everything from the io package
- `File f = new File("data.txt");` you're just saying "This is the file", not reading it
- `Scanner sc = new Scanner(f);` NOT `System.in` cuz you're not providing input through the keyboard -> but input through the file
- use `while` and not `for` cuz you don't know how long the file is
- we're using `.nextLine` cause words are stored as strings
    - you should use the `.nextInt` or whatever else is appropriate based on the file you have
    - cuz you can't do very much with 189 stored as a string - but it does run without errors
        - **also once you manipulate something from the text file - the text file stays the same**
- **`.hasNextLine` returns a boolean - also it's not on a reference the sheet**

- On the exam you will see just the structure of the program 
    - ie. just the 2 objects (ie. File & Scanner), and then a loop with some sort of calculation
 */