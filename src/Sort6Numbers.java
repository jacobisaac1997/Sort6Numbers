import java.util.Scanner;
public class Sort6Numbers {
	public static void main(String[] args) {
		System.out.println("Give me 6 numbers to sort.");
		numberSortingMethod();

	}
	
	public static void numberSortingMethod(){
		Scanner input = new Scanner(System.in);

		int[] newArray = new int[6];
		for(int i = 0; i<6; i++){
			newArray[i] = input.nextInt();
		}
		for(int sort = 0; sort<6; sort++){
			for(int i = 0; i<5; i++){
				int n1 = newArray[i];
				int n2 = newArray[i+1];
					if(n1>n2){
						newArray[i+1] = n1;
						newArray[i] = n2;
				}
		}
		}
		System.out.print("The numbers when sorted are : ");
		for(int i = 0; i<6; i++){	
			System.out.print(newArray[i] + " ");
		}
	}
}