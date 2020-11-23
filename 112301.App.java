import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        System.out.println("输入一个数字");
        while (true) {

            Scanner sc = new Scanner(System.in);
            int num = sc.nextInt();

            if (num ==1) {
                int x = (int) (Math.random() * 200 * 200);
                int y = (int) (Math.random() * 200 * 200);
                System.out.println("二维坐标为,("+x+","+y+")");
            } else {
                System.out.println("数据有误！！！");

            }
        }
    }
}
