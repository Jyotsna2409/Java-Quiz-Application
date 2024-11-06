        package quiz;

        import java.awt.*;
        import javax.swing.*;
        import java.awt.event.*;

        public class Score extends JFrame implements ActionListener {

            Score(String name, int score) {
                setBounds(400, 150, 750, 550);
                getContentPane().setBackground(Color.WHITE);
                setLayout(null);
                
                ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/score.jpg"));
                Image i2 = i1.getImage().getScaledInstance(500, 500, Image.SCALE_DEFAULT);
                ImageIcon i3 = new ImageIcon(i2);
                JLabel image = new JLabel(i3);
                image.setBounds(10, 120, 500, 500);
                add(image);
                
                JLabel heading = new JLabel("Thank You " + name + " for playing QUIZ WIZ QUIZZLER");
                heading.setBounds(70, 27, 1200, 70);
                heading.setFont(new Font("Tahoma", Font.PLAIN, 50));
                heading.setForeground(new Color(30, 144, 255));
                add(heading);
                
                JLabel lblscore = new JLabel("Your score is " +score);
                lblscore.setBounds(650, 250, 600, 70);
                lblscore.setFont(new Font("Tahoma", Font.PLAIN, 50));
                add(lblscore);
                
                JButton submit = new JButton("LEAVE");
                submit.setBounds(750, 360, 120, 30);
                submit.setBackground(new Color(30, 144, 252));
                submit.setForeground(Color.WHITE);
                submit.addActionListener(this);
                add(submit);
                
                setSize(1400,700);
                setLocation(200, 150);
                setVisible(true);
            }
            
            public void actionPerformed(ActionEvent ae) {
                setVisible(false);
               
            }

            public static void main(String[] args) {
                new Score("User", 0);
            }
        }