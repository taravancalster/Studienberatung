import java.util.Scanner;

public Studienberatung{
	
	public static void main (String [] args){
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Hast du Abitur?");
		String answer = scanner.next();
		
			if (answer.equalsIgnoreCase("n")){
				System.out.println("Hast du Fachabitur?");		
				answer = scanner.next();
				
				if (answer.equalsIgnoreCase("j")){
				System.out.println("Hast du eine Berufsausbildung?");		
				answer = scanner.next();
				
			}
		
			else if (answer.equalsIgnoreCase("ja")){
				System.out.println("Bist du Wissbegierig?");
				answer = scanner.next();
			}
	}
	
}