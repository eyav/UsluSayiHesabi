import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int a, b, i, total;
        Scanner input = new Scanner(System.in);
        System.out.println("Sayiyi giriniz:");
        a = input.nextInt();

        System.out.println("Üs olacak sayiyi giriniz:");
        b = input.nextInt();
        total=1;
        for(i = 1 ; i <= b;i++){
            total = total * a;
        }
        System.out.println("Sonuç:" + total);
    }



}
