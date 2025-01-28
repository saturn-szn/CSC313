import java.util.Scanner;
import java.util.Arrays;

public class ass4{

    public static void main(String[] args){
        int[] my_array = new int[10];
	Scanner scan = new Scanner(System.in);
	for(int i = 0; i < my_array.length; i++){
	    System.out.println("Enter a value for the index " + (i + 1));
	    my_array[i] = scan.nextInt();
	}

	System.out.println("Printing out all the values");
	for(int i = 0; i < my_array.length; i++){
	    System.out.println("The value for index " + (i + 1) + ": " +my_array[i]);
	}

    }
}
