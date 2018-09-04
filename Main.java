import java.util.Scanner;


public class Main {
	public static void main(String[] args) {
		System.out.println("\nRecords List\n");
		System.out.println("\nowner records\n");
		Scanner s=new Scanner(System.in);
		System.out.println("\nEnter owner name\n");
		String ownername=s.nextLine();
		System.out.println("\nEnter ownerid\n");
		int ownerId=s.nextInt();
		double value=s.nextDouble();
		Owner firstOwner = new Owner(ownerId,ownername);
		firstOwner.createRecord(value);
		System.out.println("\nowner created\n");
		System.out.println("\nRecords of owner\n");
		firstOwner.getRecords();
	}

}
