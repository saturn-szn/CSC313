public class ass {

    public static void main(String[] args) {
        System.out.println("This is using a single for loop");
        for(int i = 0; i <= 47; i ++){
            if (i % 12 == 0) {
                System.out.println("");
            }
            int sort = i;
            while (sort > 12) {
                    sort -= 12;
                }

            if (sort <= 3 | sort >= 8){
                System.out.printf("*");
            }
            else{
                System.out.printf("=");
            }
        }
        System.out.println("");

	System.out.println("This is using a nested for loop");
        System.out.println("");
	for(int i = 0; i <= 3; i++){
	    for(int j = 0; j <= 11; j++){
		    if (j < 4 | j > 7){
		        System.out.printf("*");
		    }
		    else{
		        System.out.printf("=");
		    }
	    }
	    System.out.println("");
	}
    }
}
