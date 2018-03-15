//import java.util.ArrayList;
import java.util.*;
public class Globe {
	
	public static void main (String [] args) {
	
		Person human1 = new Person ("Chadbeel", 23, "Tester");
		Person human2 = new Person ("Godwin", 23, "Developer");
	
		ArrayList<Person> aL = new ArrayList<Person>();
		
		aL.add(human1);
		aL.add(human2);
			
			System.out.println(checkName(aL));
	
		}
	
	public static boolean checkName(ArrayList<Person> array) {
	
		System.out.println("Put the name of da guy ");
		Scanner scan = new Scanner(System.in);
		String s = scan.nextLine();
		
		scan.close();
		
			for(Person aLL : array) {
				//System.out.println(aLLL);
				
			if(aLL.toString().contains(s)){
				//System.out.println("Yes");
				return true;
				}
		
			}
			return false;
	}
}




	
	
