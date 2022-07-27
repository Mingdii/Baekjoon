import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
	// Scanner 객체 생성
        Scanner sc = new Scanner(System.in);
        
	// 변수 선언
        int a, b;

	// 사용자 입력값 받기
        a = sc.nextInt();
        b = sc.nextInt();
    
	// 연산결과 출력
        System.out.println(a+b);
    }
}