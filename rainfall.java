import java.util.Scanner;

public class Months {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int years = sc.nextInt();
		while (years<1){
			System.out.println("Number of years should be at least one");
			years = sc.nextInt();
		}
		int rainfall=0;
		int total=0;
		int average=0;
		for (int i=0;i<years;i++){
			System.out.println("Enter the amount of rainfall for year "+(i+1));
			for(int j=0;j<3;j++) {
				rainfall=sc.nextInt();
				while (rainfall<0) {
					System.out.println("Enter a positive value for the rainfall");
					rainfall=sc.nextInt();
				}
				total=total+rainfall;
			}
		}
		average=total/(years*3);
		System.out.println("The number of months "+(years*3));
		System.out.println("The total amount of rainfall is "+total);
		System.out.println("The average amount of rainfall is "+average);
	}
}
