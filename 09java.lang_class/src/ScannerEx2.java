import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class ScannerEx2 {

	public static void main(String[] args) throws Exception {
		Scanner sc  = new Scanner(new File("data2.txt"));
		int sum = 0;
		int cnt = 0;
		
		while(sc.hasNextInt()){ //입력받은 값이 정수일때 true
			sum += sc.nextInt();
			cnt++;
		}

		System.out.println("sum="+sum);
		System.out.println("average="+(double)sum/cnt);
	}

}