import java.util.Scanner;

public class Triangle {
    public static int JudgeTriangle( int a ,int b, int c){
        if( a+b > c &&  a+c > b && b+ c > a){
            System.out.println("可以构成三三角形");
            return 1;
        }
        else{
            System.out.println("不能够构成三角形");
            return 0;
        }
    }

    public static int JdugeDTriangle(int a, int b ,int c) {
        if (a == b || a == c || b == c) {
            if (a == b && b == c) {
                System.out.println("是等边三角形");
                return 1;
            } else {
                return 1;
            }
        }
        return 0;
    }

    public static int JudgeRTriangle(int a,int b,int c){
        int r1,r2,r3;
        r1 = a*a+b*b -c*c;
        r2 = a*a+c*c-b*b;
        r3 = b*b +c*c - a*a;
        if(r1 == 0 || r2 == 0 || r3 == 0){
            System.out.println("是直角三角形");
            return 1;
        }
        else return 0;
    }

    public static void main(String [] args){
        int a , b ,c ;
        System.out.println("请输入三角形的三边：");
        Scanner scanner = new Scanner(System.in);
        a = scanner.nextInt();
        b = scanner.nextInt();
        c = scanner.nextInt();

        //判定合法性
        if( a <= 0 || a> 200 || b <=0 || b >200 || c <= 0 || c > 200 ){
            System.out.println("输入的三角形不合法");
        }
        else {
            System.out.println("数据合法，判定类型");
             if(JudgeTriangle(a,b,c) == 1){
                 JudgeRTriangle(a,b,c);
                 JdugeDTriangle(a,b,c);
             }
        }
    }
}
