import java.util.Scanner;
public class UCNL {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap so a: ");
        int a = scanner.nextInt();
        System.out.println("nhap so b: ");
        int b = scanner.nextInt();
        while (a*b != 0){
            if(a>b){
                a %= b;
            }else{
                b %= a;
            }
        }
        System.out.println("UCNL la: " +(a+b));
    }
}
