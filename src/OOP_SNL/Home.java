package OOP_SNL;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * Main menu class from where the user navigates the rest of the program.
  @author Laura Looney
 */

public class Home
    {
        public static void main(String[] args)
            {
                new Home();
            }


        public Home()
            {
                /**
                 * @param frame Creates the sneks and ladders home page GUI
                 * @param title Creates the title "Sneks & Lddrs" for the home page
                 * @param play Creates the Let's play button that brings you to the Registration GUI after being called by the action listener
                 * @param result Creates the Leaderboard button that brings you to the Leaderboard GUI after being called by the action listener
                 */
                JFrame frame = new JFrame("Sneks N Lddrs Home Page");

                JLabel title = new JLabel();
                title.setText("Sneks & Lddrs");
                title.setBounds(160,100, 300, 60);
                title.setForeground(Color.GREEN);
                title.setFont(new Font("Arial", Font.ITALIC,35));
                frame.add(title);

                JButton play = new JButton("Let's Play");
                play.setBounds(110,200, 150,60);
                frame.add(play);


                JButton result = new JButton("LeaderBoard");
                result.setBounds(330,200, 150,60);
                frame.add(result);


                frame.setSize(600, 400);
                frame.setLayout(null);

                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setVisible(true);

                result.addActionListener(new ActionListener()
                    {
                        @Override
                        public void actionPerformed(ActionEvent e)
                            {
                                new Leaderboard();
                                frame.setVisible(false);
                            }
                    });

                play.addActionListener(new ActionListener()
                    {
                        @Override
                        public void actionPerformed(ActionEvent e)
                            {
                                new Registration();
                                frame.setVisible(false);
                            }
                    });
            }
    }
