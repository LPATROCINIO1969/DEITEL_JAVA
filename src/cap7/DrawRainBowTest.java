package cap7;

import javax.swing.JFrame;

public class DrawRainBowTest {
    public static void main(String[] args) {
        DrawRainBow panel = new DrawRainBow();
        JFrame application = new JFrame();

        application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        application.setTitle("Teste de arco-iris");
        application.add(panel);
        application.setSize(800,500);
        application.setVisible(true);

    }
}