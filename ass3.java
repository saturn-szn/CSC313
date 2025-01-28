import java.util.Arrays;

public class ass3{

    public static void main(String[] args){
	int[] my_array = {2, 5, 5, 9, 4, 7, 0, 9, 6, 11, 12};
	int N = my_array.length;
	double mean = 0;
	for(int i = 0; i < my_array.length; i++){
	    mean += my_array[i];
	}

	mean = mean / N;

	int median;
	int mid = my_array.length;
	Arrays.sort(my_array);
	if(my_array.length % 2 == 1){
	    median = my_array[mid / 2];
	}
	else{
	    mid = mid / 2;
	    median = my_array[mid - 1] + my_array[mid];
	    median = median / 2;
	}

	double SD = 0;
	for(int i = 0; i < my_array.length; i++){
	    SD += Math.pow((my_array[i] - mean), 2);
	}

	SD = SD / N;

	System.out.println("The mean of the array is " + mean);
	System.out.println("The median of the array is " + median);
	System.out.println("The standard Deviation is " + SD);
    }
}
