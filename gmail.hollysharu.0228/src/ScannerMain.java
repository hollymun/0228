import java.util.Scanner;

public class ScannerMain {

	public static void main(String[] args) {
		//키보드로부터 입력받는 스캐너 만들기 
		Scanner sc = new Scanner(System.in); 
		//정수 1개 입력 받기 
		System.out.printf("정수를 입력하세요 : \n");
		int n = sc.nextInt();
		System.out.printf("입력한 정수: %d\n", n);
		
		//남은 enter 담는 버퍼 
		sc.nextLine();

		//문자열 입력 받기 
		System.out.printf("문자열을 입력하세요 : \n");
		String str = sc.nextLine();
		System.out.printf("입력한 문자열: %s\n", str);
		
		System.out.printf("======================================\n");
		
		int su = 0; 
		for(int i=0; i<str.length(); i=i+1) {
			char ch = str.charAt(i);
			if(ch >= '0' && ch <= '9') { //숫자인지 확인
				su = su * 10 + (ch-48); //ASCII코드는 숫자 0이 48이므로 -48
			}
			else {
				break;
			}
		}
		System.out.printf("변환된 숫자: %d\n", su);
		
		
		

		
		
		
		sc.close();
	}
}
