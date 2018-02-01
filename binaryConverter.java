import java.util.Scanner;
public class binaryConverter {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int decimal = in.nextInt();
		System.out.println("");
		convertBinary(decimal);
	}
	public static void convertBinary(int x){
		int binary[] = new int[100];
		int num = 0;
		while(x>0){
			binary[num++] = x%2;
			x = x/2;
		}
		for(int i=num-1; i>=0; i--){
			System.out.print(binary[i]);
		}
	}

}
