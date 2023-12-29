package prac7;

import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class a extends JFrame{
    int m = 0;
    int r = 0;

    JButton milanButton = new JButton("AC Milan");
    JButton realButton = new JButton("Real Madrid");

    JLabel score = new JLabel("0 X 0");
    JLabel last_score = new JLabel("Last Scorer: N/A");
    JLabel winner = new JLabel("Winner: DRAW");

    public void updateScore(String scorer){
        score.setText(m + " X " + r);
        last_score.setText("Last Scorer:" + scorer);
        if (r > m){
            winner.setText("Winner: Real Madrid");
        } else if (m > r){
            winner.setText("Winner: AC Milan");
        }else{
            winner.setText("Winner: DRAW");
        }
    }

    public a(){
        realButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                r++;
                updateScore("Real Madrid");
            }
        });
        milanButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                m++;
                updateScore("AC Milan");
            }
        });
        setLayout(new FlowLayout());
        add(milanButton);
        add(last_score);
        add(score);
        add(winner);
        add(realButton);
        setSize(500,500);
    }

    public static void main(String[] args){
        new a().setVisible(true);
    }
}
