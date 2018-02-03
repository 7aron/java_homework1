import java.util.*;

public class ex3 {
	public static void main(String[] args) {		
		Scanner sc = new Scanner(System.in);		
		System.out.print("Number of pastas? > ");
		int num;
		while(true) {
			num = sc.nextInt();
			if(num < 1 || num > 1000)			
				System.out.println("Take a number from 1 to 1000");
			else break;
		}
		
		System.out.println("Tagliatelle, penne or spagetti ? ");
		
		int tagliatelle = 0, 
			penne = 0, 
			spagetti = 0;
		
		
		for(int i = 0; i <= num; i++) {
			String pasta;
			pasta = sc.next();
			
			if(pasta.equals("tagliatelle")) tagliatelle++;
			else if(pasta.equals("penne")) penne++;
			else if(pasta.equals("spagetti")) spagetti++;	
		}
		
		if(Math.max(tagliatelle, penne) == tagliatelle && Math.max(tagliatelle, spagetti) == tagliatelle)
			System.out.println("Lets Have a Tagliatelle");
		else if(Math.max(penne, tagliatelle) == penne && Math.max(penne, spagetti) == penne)
			System.out.println("Lets have a Penne");
		else 
			System.out.println("Lets have a Spagetti");
		sc.close();
		
	}
}
