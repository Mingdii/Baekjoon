import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        // 삼항연산자 중첩 풀이법
        
        Scanner sc = new Scanner(System.in);
        
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        String c = (a>b) ? ">" : ((a<b) ? "<" : "==");
        
        System.out.println(c);
    }
}