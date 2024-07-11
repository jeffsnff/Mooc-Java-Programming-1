
import java.util.Scanner;

public class AVClub {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		while(true){
			String userString = scanner.nextLine();
			if(userString.equals("")){
				break;
			}else{
				String[] arrayStrings = userString.split(" ");
				for(int count = 0; count<arrayStrings.length; count++){
					if(arrayStrings[count].contains("av")){
						System.out.println(arrayStrings[count]);
					}
				}
			}
		}
  }
}