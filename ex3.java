import java.util.Scanner;

class ex3 {
    public static void main(String[] args) {
    	
    	Scanner sc = new Scanner(System.in);
    	System.out.println("Type your number");
    	int n = sc.nextInt();
        int sum = 0;
        while (n > 9 ) {
                     sum=0;
            while (n > 0) {
                int rem;
                rem = n % 10;
                sum = sum + rem;
                n = n / 10;
            }
            n = sum;
        }

        System.out.println(sum);
    } 
    		
   
            
    		
}
    
    
