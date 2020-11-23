public class App {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("坐标如下：");
        while (true) {
                int x = (int) (Math.random() *100);
                int y = (int) (Math.random() *100);
                Thread.sleep(100);
                System.out.println("二维坐标为,("+x+","+y+")");
            }
        }
    }
