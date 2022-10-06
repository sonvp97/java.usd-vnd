import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int rate = 23000;
        Scanner scanner = new Scanner(System.in);
        int usd = scanner.nextInt();
        int vnd = 0;
        vnd = usd * rate;
        System.out.printf("Tỷ giá usd sang vnd là : %d VND", vnd);

    }
}