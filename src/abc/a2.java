package abc;
import java.util.Scanner;

public class a2 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	while(true) {
		int i = sc.nextInt();
		if(i%3==0) {
			System.out.print(i/3);
		}
		if(i==-1) {
			break;
		}
	}
}
	
	
}
