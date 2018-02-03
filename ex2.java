import java.util.Scanner;

class ex2 {
    public static void main(String[] args) {
    	
    		
    		Scanner sc = new Scanner(System.in);
    		int height, width, area, i, j;
    		String symbol;
    		
    		System.out.println("Enter the height:");
    		height = sc.nextInt();
    		System.out.println("Enter the width:");
    		width = sc.nextInt();
    		System.out.println("Write 1, 2 or 3");
    		int pm = 2*(height + width);
    		area = height * width;
    		while(true) {
    			int input = sc.nextInt();
    			if(input == 1) {
    				System.out.println("Area equals to: " + area);
    			} 
    	
    			else if( input == 2) {
    				System.out.println("Permiter equals to: " + pm);
    			} 
    			
    			else if( input == 3) {
    				System.out.println("Enter your favorite symbol:" ); 
    				char c = sc.next().charAt(0);
    				for(int i1=1;i1<=height;i1++){
    		            for(int j1=1;j1<=width;j1++){
    		                if(i1==1 || i1==height || j1==1 || j1==width){
    		                    System.out.print(c);
    		                } 
    		                else
    		                {
    		                    System.out.print(" ");
    		                }
    		            }
    		            System.out.println();
    		        }
    		    } else if( input == 4) {
    		    	break;
    		    }
    			} 
    	
    		
    		
      } 
    }
    
