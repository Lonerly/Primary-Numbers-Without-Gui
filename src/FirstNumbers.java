import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class FirstNumbers{

	public static void main(String[] args) throws FileNotFoundException{
		
		System.out.println("Wpisz teraz lokacj� pliku (je�li dysk np.systemowy jest zabezpieczony operacja si� nie powiedzie) przyk�adowo:");
		System.out.println("D:\\text.txt");
		
		Scanner scan = new Scanner(System.in);
		String fileLocation = scan.nextLine();		
		
		try(  PrintWriter out = new PrintWriter(fileLocation)  ){
			out.println("wynik:");
			out.println(" ");
		
		System.out.println("Wpisz teraz maksymaln� liczb�, kt�r� masz zamiar poda�:");
		
		int maxAmount = scan.nextInt();
		
		System.out.println("Wpisz teraz liczb� zmiennych, kt�r� masz zamiar poda�:");
		
		int amountOfInts = scan.nextInt();
		
		while(amountOfInts>0){
			amountOfInts--;
			
			System.out.println("Wpisz warto�� kolejnej zmiennej:");
			int amount = scan.nextInt();
			int amount2 = amount;
			int endlAmount = amount;
			
			while(maxAmount>amount){
				amount++;
				
				out.print("  ");
				
			}
			
			while(amount2>0){
				amount2--;
				
				out.print(" () ");
				
			}
			
			out.println("- "+endlAmount);
			out.println(" ");
			
		}
		
		System.out.println("Tworzenie zosta�o zako�czone.");
		
		}
		
	}
	
}