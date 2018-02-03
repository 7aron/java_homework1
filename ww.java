import java.util.Scanner;

class ww {
    public static void main(String[] args) {
    	
    		
    		Scanner sc = new Scanner(System.in);
    		int seconds, minutes, hours;
			String result;
			
    		System.out.println("Enter seconds: ");
    		seconds = sc.nextInt();
    		while(true) {
    		if(seconds > 59 || seconds < 0) {
    			System.out.println("Take an int from 0 to 59");
   			  seconds = sc.nextInt();
   	
   		 } 
    		
    		System.out.println("Enter minutes: ");
    		minutes = sc.nextInt();
    		if(minutes > 59 || minutes < 0) {
    			System.out.println("Take an int from 0 to 59");
     			  minutes = sc.nextInt();
    		}
    		System.out.println("Enter hours: ");
    		hours = sc.nextInt();
    		if(hours > 23 || hours < 0) {
    			System.out.println("Take an int from 0 to 24");
     			  minutes = sc.nextInt();
    		}
    		result = hours + ":" + minutes + ":" + (seconds + 1);
    		System.out.println("Time is: " + result);
    		 
    		 } 
      } 
    
    }
    
