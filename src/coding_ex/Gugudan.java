package coding_ex;

import java.util.Scanner;

public class Gugudan {
	
	public static void main(String[] args) {	
		Scanner scanner = new Scanner(System.in);
		System.out.println("수를 입력하세요. Ex) 4,2");
		
//		입력한 문자열을 ,를 기준으로 나눈다.
		String num = scanner.nextLine();		
		String[] result = num.split(",");
		
//		문자열을 정수로 변환.
		int num1 = Integer.parseInt(result[0]);
		int num2 = Integer.parseInt(result[1]);
		
		for(int i = 1; i <= num1; ++i) {
			System.out.println(i + "단");
			for(int j = 1; j <= num2; ++j) {
				System.out.println(i * j);
			}
			System.out.println("");
		}
	}

}
