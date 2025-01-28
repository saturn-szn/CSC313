import java.util.Scanner;

public class ass5{

    public static void main(String[] ars){
	Scanner scan = new Scanner(System.in);
	int[][] my_array = new int[10][10];
	for(int i = 0; i < my_array.length; i++){
	    for(int j = 0; j < my_array.length; j++){
		System.out.println("Enter the value for the index" + "[" + (i + 1) + "]" + "[" + (j + 1) + "]");
		my_array[i][j] = scan.nextInt();
	    }
	}

	System.out.println("Printing out the values");

	for(int i = 0; i < my_array.length; i++){
            for(int j = 0; j < my_array.length; j++){
		System.out.println("The value for the index" + "[" + (i + 1) + "]" + "[" + (j + 1) + "]: " + my_array[i][j]);
	    }
	}
    }
}
