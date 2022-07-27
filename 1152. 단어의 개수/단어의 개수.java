import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        // 스캐너 객체 생성
        Scanner sc = new Scanner(System.in);
        String str;
        
        // 사용자 입력값 받기
        str = sc.nextLine();
        
        /*
        	next() 는 문자 혹은 문자열을 공백 기준으로 한 단어 또는 한 문자씩 입력을 받는다.
        	ex) Hello World 에서 띄어쓰기를 한 이후에 입력을 한 world를 인식하지 않는다. 
        
        	nextLine()의 경우에는 문자 혹은 엔터를 치기 전까지의 문장 전체를 입력받는다. 
        	ex) Hello World 에서 엔터치기 전까지의 Hello World 모두 인식
        
        	스페이스바로 띄어쓰기 한 문장 전체를 읽어 낼 수 있는 nextLine()을 사용해야 한다. 
        */
        
        // 사용자 입력 문자열 공백 제거한 후 다시 str 담기
        str = str.trim();
        
        if (str.isEmpty())
        {
            System.out.println(0);
        }
        else
        {
            System.out.println(str.split(" ").length);
        }
    }
}