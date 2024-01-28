import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        for(int i = 0; i < a; i++){
            String v = sc.next();
            System.out.println("Y");
        }

        sc.close();
    }
}
