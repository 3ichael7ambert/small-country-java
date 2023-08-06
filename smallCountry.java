import java.util.Scanner;

public class smallCountry {
    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);
        int population = read.nextInt();
        int area = read.nextInt();
         	if ((area<10000) && (population<10000)) { 
	System.out.println("small country");
}
        
    }  
}
