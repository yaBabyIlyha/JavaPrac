import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.TimeUnit;

public class Painting extends JFrame{
    private static final int WIDTH = 800;
    private static final int HEIGHT = 600;
    String path1 = "/Users/ilyatatarinov/IdeaProjects/mainProj/src/68683aba046da843aafdd805eef6c1e3.jpeg";
    String path2 = "/Users/ilyatatarinov/IdeaProjects/mainProj/src/1666206241_12-mykaleidoscope-ru-p-kartinka-na-zastavku-oboi-12.jpg";

    public Painting() throws InterruptedException {
        setSize(WIDTH,HEIGHT);
        setTitle("Painting");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        getContentPane().setBackground(Color.BLUE);
        setResizable(true);

        JLabel label1 = new JLabel(new ImageIcon(path1));
        JLabel label2 = new JLabel(new ImageIcon(path2));

        while(true){
            add(label1);
            setVisible(true);
            TimeUnit.SECONDS.sleep(1);
            setVisible(false);
            remove(label1);
            add(label2);
            setVisible(true);
            TimeUnit.SECONDS.sleep(1);
            setVisible(false);
            remove(label2);
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Painting painting = new Painting();
    }
}
