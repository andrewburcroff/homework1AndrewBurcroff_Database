import java.util.ArrayList;
import java.util.Scanner;

public class MainClass {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ArrayList<String> burcroff = new ArrayList<String>();
		Scanner kb = new Scanner(System.in);
		while(true){
			System.out.println("These are your options:");
			System.out.println("Enter 1 to insert a name");
			System.out.println("Enter 2 to delete a name");
			System.out.println("Enter 3 to show the names");
			System.out.println("Enter 4 to exit");
			int answer = Integer.valueOf(kb.nextLine());
		if (answer == 1){
			System.out.println("Please input the name to be inputed:");
			String add = kb.nextLine();
			burcroff.add(add);			
		}
		else if(answer == 2){
			System.out.println("Please input the name to be deleted:");
			String remove = kb.nextLine();
			burcroff.remove(remove);
		}
		else if(answer == 3){
			System.out.println("This is your hashTable:");
			System.out.println(burcroff);
		}
		else if(answer == 5){
			System.out.println("Your exiting the my Program");
			System.exit(0);
		}
	}

	}

}
