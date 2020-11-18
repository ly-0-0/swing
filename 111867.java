package pack;

import javax.swing.*;

public class App {
    private JPanel myPanle;
    void go(){
        JFrame frame = new JFrame("App");
        frame.setContentPane(myPanle);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600,400);
        frame.setVisible(true);
    }
    



    public static void main(String[] args) {
            new App().go();

    }
}
