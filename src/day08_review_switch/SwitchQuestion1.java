package day08_review_switch;

public class SwitchQuestion1 {

	public static void main(String[] args) {

		String gender = "female";
		
		switch(gender) {
		
		case "female":
			System.out.println("This is a girl");
			break;
		case "male":
			System.out.println("This is a boy");
			break;
		default:
			System.out.println("Enter a valid gender");
	
		}
		
	}

}
