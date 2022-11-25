package OOP_SNL;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;
import java.util.Map;

/*****************************************************
 *Title: Java Hash Map - w3schools
 * Author: w3schools
 * Site owner/sponsor: w3schools.com
 * Availability: https://www.w3schools.com/java/java_hashmap.asp
 * Modified: From string answers to integers as snakes/ladders
 *****************************************************/

/*****************************************************
 Title: HashMap in Java with Examples - geeksforgeeks
 * Author: geeksforgeeks
 * Site owner/sponsor: geeksforgeeks.org
 * Availability: https://www.geeksforgeeks.org/java-util-hashmap-in-java-with-examples/
 * Modified: From string answers to integers as snakes/ladders
 *****************************************************/

/*****************************************************
 *Title: Snake and Ladder Problem - wgeeksforgeeks
 * Author: geeksforgeeks
 * Site owner/sponsor: geeksforgeeks.org
 * Availability: https://www.geeksforgeeks.org/snake-ladder-problem-2/
 * Modified: Snakes and Ladders Problem example
 *****************************************************/

public class SNL
    {
        public static void main(String[] args)
            {
               new SNL();
            }


        public SNL()
            {

                JOptionPane.showMessageDialog(null, "What is Sneks & Ladders?" +
                                "\n~~~~~~~~~~~~~~~~\n" +
                                "Players roll a die and navigate the board. \nLanding on a ladder advances a player to \na square " +
                                " further up the board,while \n landing on a snake means they have to go \n back to a previous square."
                                + "\n\nThe Rules:\n~~~~~~~~~~~~~~~~\n#1 No Cheating\n#2 Have Fun\n" +
                                "#3 I don't have a number 3 "
                        , "Game Description:", JOptionPane.INFORMATION_MESSAGE);

                JFrame frame = new JFrame("Sneks & Ladders");

                SNLGame s = new SNLGame();

                JLabel ttl = new JLabel();
                ttl.setText("Sneks & Ladders");
                ttl.setBounds(160, 50, 300, 60);
                ttl.setForeground(Color.GREEN);
                ttl.setFont(new Font("Arial", Font.ITALIC, 35));
                frame.add(ttl);

                JLabel bdy = new JLabel();
                bdy.setBounds(150, 100, 300, 400);
                bdy.setText("<html><body><br><br>| 100|   <font color=red>| 99 |</font>   | 98 |   | 97 |   | 96 |   <font color=red>| 95 |</font>   | 94 |   | 93 |   | 92 |   | 91 |" +
                        "<br><br>| 81 |   | 82 |   | 83 |   | 84 |   | 85 |   | 86 |   | 87 |   | 88 |   | 89 |   | 90 |" +
                        "<br><br>| 80 |   | 79 |   | 78 |   | 77 |   | 76 |   | 75 |   | 74 |   | 73 |   | 72 |   | 71 |" +
                        "<br><br>| 61 |   | 62 |   | 63 |   | 64 |   | 65 |   | 66 |   | 67 |   | 68 |   | 69 |   <font color=red>| 70 |</font>" +
                        "<br><br><font color=green>| 60 |</font>   | 59 |   | 58 |   | 57 |   | 56 |   | 55 |   | 54 |   | 53 |   <font color=red>| 52 |</font>   | 51 |" +
                        "<br><br>| 41 |   | 42 |   | 43 |   | 44 |   | 45 |   <font color=green>| 46 |</font>   | 47 |   | 48 |   | 49 |   | 50 |" +
                        "<br><br>| 40 |   | 39 |   | 38 |   | 37 |   | 36 |   | 35 |   | 34 |   | 33 |   | 32 |   | 31 |" +
                        "<br><br>| 21 |   | 22 |   | 23 |   | 24 |   <font color=red>| 25 |</font>   | 26 |   | 27 |   | 28 |   | 29 |   | 30 |" +
                        "<br><br>| 20 |   | 19 |   | 18 |   <font color=green>| 17 |</font>   | 16 |   | 15 |   | 14 |   | 13 |   | 12 |   <font color=green>| 11 |</font>" +
                        "<br><br>| 01 |   | 02 |   | 03 |   | 04 |   | 05 |   <font color=green>| 06 |</font>   | 07 |   | 08 |   | 09 |   | 10 |" +
                        "<br><br><font color=green>|---| </font> is a ladder square &nbsp;&nbsp;&nbsp;&nbsp;" +
                        "<font color=red>|---| </font> is a snek square</body></html>");
                frame.add(bdy);

                JButton start = new JButton("Start Game");
                start.setBounds(230, 280, 80, 50);
                frame.add(start);

                frame.setSize(600, 600);
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setResizable(false);
                frame.setVisible(true);

                start.addActionListener(new ActionListener()
                    {
                        @Override
                        public void actionPerformed(ActionEvent e)
                            {
                                start.setVisible(false);
                                s.startGame();
                            }
                    });
            }

          public static class SNLGame
              {
                    final static int Win_Number = 100;
                    static Map<Integer, Integer> snake = new HashMap<Integer, Integer>();
                    static Map<Integer, Integer> ladder = new HashMap<Integer, Integer>();
                        {
                            //hello
                            snake.put(99, 54);
                            snake.put(70, 55);
                            snake.put(52, 42);
                            snake.put(25, 2);
                            snake.put(95, 72);

                            ladder.put(6, 25);
                            ladder.put(11, 40);
                            ladder.put(60, 85);
                            ladder.put(46, 90);
                            ladder.put(17, 69);
                        }


                public void startGame()
                    {
                        int player1 = 0, player2 = 0;
                        int cPlayer = -1;
                        int bonds;
                        int diceValue;


                        do
                            {
                                int RandomNumber = (int)(Math.random() * 6+1);
                                diceValue = RandomNumber;

                                bonds = JOptionPane.showConfirmDialog(null, cPlayer == -1 ? "\n\n" + Registration.P1NameAsString + " Turn" : "\n\n" + Registration.P2NameAsString +" Turn", "Start Game",JOptionPane.OK_CANCEL_OPTION,JOptionPane.INFORMATION_MESSAGE );
                                    if(bonds == JOptionPane.OK_OPTION)
                                        {
                                            JOptionPane.showMessageDialog(null,"You have rolled a " + diceValue, "Dice Roll", JOptionPane.INFORMATION_MESSAGE);
                                        }

                                    if(bonds == JOptionPane.CANCEL_OPTION)
                                        {
                                            System.exit(0);
                                        }



                                if (cPlayer == -1)
                                    {
                                        player1 = calcPlayerValue(player1, diceValue);
                                        JOptionPane.showMessageDialog(null, "P1: " + Registration.P1NameAsString + " " + player1 +"\nP2: " + Registration.P2NameAsString + " " + player2 + "\n------------------",
                                                "Player Value", JOptionPane.INFORMATION_MESSAGE);

                                        if (isWin(player1))
                                            {
                                                JOptionPane.showMessageDialog(null,"Winner, winner, chicken dinner for player 1 \n\n Congrats " + Registration.P1NameAsString , "Winner:", JOptionPane.INFORMATION_MESSAGE);
                                                System.exit(0);

                                            }
                                    }

                                else
                                    {
                                        player2 = calcPlayerValue(player2, diceValue);
                                        JOptionPane.showMessageDialog(null, "P1: " + Registration.P1NameAsString + " " + player1 +"\nP2: " + Registration.P2NameAsString + " " + player2 + "\n------------------",
                                                "Player Value", JOptionPane.INFORMATION_MESSAGE);

                                        if (isWin(player2))
                                            {
                                                JOptionPane.showMessageDialog(null,"Winner, winner, chicken dinner for player 2 \n\n Congrats " + Registration.P2NameAsString , "Winner:", JOptionPane.INFORMATION_MESSAGE);
                                                System.exit(0);
                                            }
                                    }

                                cPlayer = -cPlayer;


                            }

                        while (bonds==0);

                    }


            public int calcPlayerValue(int player, int diceValue)
                {
                    player = player + diceValue;


                    if (player > Win_Number)
                        {
                            player = player - diceValue;
                            return player;
                        }

                    if (null != snake.get(player))
                        {
                            player = snake.get(player);
                            JOptionPane.showMessageDialog(null,"Oh no, you touched the nope rope " + player, "Nope Rope", JOptionPane.INFORMATION_MESSAGE);
                        }

                    if (null != ladder.get(player))
                        {
                            player = ladder.get(player);
                            JOptionPane.showMessageDialog(null,"Yasss Qween, Climb that ladder." + player, "Get them steps in", JOptionPane.INFORMATION_MESSAGE);
                        }

                    return player;
                }

            public boolean isWin(int player)
                {
                    return Win_Number == player;
                }

        }
    }
