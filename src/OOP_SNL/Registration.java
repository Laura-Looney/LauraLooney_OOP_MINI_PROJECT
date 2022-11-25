package OOP_SNL;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Registration
    {
        static String P1NameAsString;
        static String P2NameAsString;

        public static void main(String[] args)
            {
                new Registration();
            }


        public Registration()
            {
                JFrame Registration = new JFrame("Sneks N Lddrs: Let's Play");

                JLabel RG = new JLabel();
                RG.setText("My Details:");
                RG.setBounds(200,50, 300, 60);
                RG.setForeground(Color.GREEN);
                RG.setFont(new Font("Arial", Font.ITALIC,35));
                Registration.add(RG);

                JLabel P1 = new JLabel("Name of P1: ");
                P1.setFont(new Font("Arial", Font.PLAIN, 14));
                P1.setSize(100, 15);
                P1.setLocation(100, 120);
                Registration.add(P1);

                JTextField P1name = new JTextField();
                P1name.setFont(new Font("Arial", Font.PLAIN, 14));
                P1name.setSize(190, 20);
                P1name.setLocation(100, 140);
                Registration.add(P1name);

                JLabel P2 = new JLabel("Name of P2: ");
                P2.setFont(new Font("Arial", Font.PLAIN, 14));
                P2.setSize(100, 15);
                P2.setLocation(100, 180);
                Registration.add(P2);

                JTextField P2name = new JTextField();
                P2name.setFont(new Font("Arial", Font.PLAIN, 14));
                P2name.setSize(190, 20);
                P2name.setLocation(100, 200);
                Registration.add(P2name);

                JButton play = new JButton("Let's Play");
                play.setBounds(230,280, 130,50);
                play.addActionListener(new ActionListener()
                    {
                        public void actionPerformed(ActionEvent e)
                            {
                                P1NameAsString = P1name.getText();
                                P2NameAsString = P2name.getText();

                                if(!P1NameAsString.isEmpty())
                                    {
                                        if(!P2NameAsString.isEmpty())
                                            {
                                               if(P1NameAsString.equals(P2NameAsString))
                                                    {
                                                        JOptionPane.showMessageDialog(null, "P2 name can't be the same as P1 \n Please enter a new name.", "Error", JOptionPane.INFORMATION_MESSAGE);

                                                    }
                                               else
                                                    {
                                                        new SNL();
                                                        Registration.setVisible(false);
                                                    }

                                            }

                                        else
                                        {
                                            JOptionPane.showMessageDialog(null, "P2 name was not entered\n Please enter a valid name", "Error", JOptionPane.INFORMATION_MESSAGE);
                                        }

                                    }

                                else
                                    {
                                        JOptionPane.showMessageDialog(null, "P1 name was not entered\n Please enter a valid name", "Error", JOptionPane.INFORMATION_MESSAGE);
                                    }
                            }
                    });
                Registration.add(play);


                Registration.setSize(600, 400);
                Registration.setLayout(null);

                Registration.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                Registration.setVisible(true);
            }
    }
