public class ass2{

    public static void main(String[] args){
	System.out.print("This is using a single loop");
        String val;
        for(int i = 0; i <= 49; i++){
            val = "=";
	    if(i % 10 == 0){
		System.out.println("");
	    }
	    if(i < 30 && i % 10 <= 3){
                val = "*";
            }

	    System.out.print(val);
        }
	System.out.println("");

	System.out.print("This is using a nested loop");
	String val2;
	for(int row = 0; row <= 4; row++){
	    System.out.println("");
	    for(int col = 0; col <= 9; col++){
		val2 = "=";
	        if(row <= 2 && col <= 3){
		    val2 = "*";
		}
	        System.out.print(val2);
	    }
	}
	System.out.println("");
    }
}

