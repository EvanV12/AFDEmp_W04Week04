package p02CellPhones;

public class MainPhone {

	public MainPhone() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		J01Phone cell1 = new J02Android("Samsung");
		cell1.setPrice();
		
		
		J01Phone cell2 = new J03NonAndroid("Blackberry");
		cell2.setPrice();
		
		
		J01Phone [] arr = new J01Phone[2];
		arr[0] = cell1;
		arr[1] = cell2;
		
		for (J01Phone p : arr) {
			System.out.println(p.toString());
		}
		
		

	}

}
