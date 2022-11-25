package OOP_SNL;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Leaderboard
    {
        public static void main(String[] args)
            {
                 new Leaderboard();
            }


        public Leaderboard()
            {
                JFrame Leaderboard = new JFrame("Sneks N Lddrs: Leaderboard");

                JLabel LB = new JLabel();
                LB.setText("Current Game:");
                LB.setBounds(200,50, 300, 60);
                LB.setForeground(Color.GREEN);
                LB.setFont(new Font("Arial", Font.ITALIC,35));
                Leaderboard.add(LB);

                JLabel Pending = new JLabel();
                Pending.setText("Results are yet to be submitted");
                Pending.setBounds(150,150, 300, 60);
                Pending.setFont(new Font("Arial", Font.ITALIC,20));
                Leaderboard.add(Pending);

                JButton back = new JButton("Back <--");
                back.setBounds(230,280, 130,50);
                back.addActionListener(new ActionListener()
                    {
                        public void actionPerformed(ActionEvent e)
                            {
                                new Home();
                                Leaderboard.setVisible(false);
                            }
                    });
                Leaderboard.add(back);

                Leaderboard.setSize(600, 400);
                Leaderboard.setLayout(null);
                Leaderboard.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                Leaderboard.setVisible(true);
            }
    }
