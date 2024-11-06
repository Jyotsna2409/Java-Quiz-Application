package quiz;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Rules extends JFrame implements ActionListener{

    String name;
    JButton start, back;
    
    Rules(String name) {
        this.name = name;
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/rules.png"));
        Image i2 = i1.getImage().getScaledInstance(500, 500, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(800, 75, 500, 500);
        add(image);
        
        JLabel heading = new JLabel("Welcome " + name + " to QUIZ WIZ QUIZZLER");
        heading.setBounds(100, 25, 700, 30);
        heading.setFont(new Font("Viner Hand ITC", Font.BOLD, 28));
        heading.setForeground(new Color(30, 144, 254));
        add(heading);
        
        JLabel rules = new JLabel();
        rules.setBounds(20, 50, 700, 550);
        rules.setFont(new Font("Tahoma", Font.PLAIN, 16));
        rules.setText(
            "<html>"+ 
                "1. The quiz contains ten questions in total." + "<br><br>" +
                "2. Each question consists of four options." + "<br><br>" +
                "3. Only one option out of all the four options is the correct. So choose only one option." + "<br><br>" +
                "4. There is a time constraint of 15 seconds for each question. So make sure you answer the question in the given time. " + "<br><br>" +
                "5. You can go to the next question only if the present question is answered." + "<br><br>" +
                "6. If the question is not answered in the given time constraint then you will be automatically taken to the next question. " + "<br><br>" +
                "7. You cannot come to the previous question after going to the next question." + "<br><br>" +
                "8. If you are done answering the last question then you can submit your quiz." + "<br><br>" +
                "9. If the last question is not answered in the given time then you will be directly taken to the score ." + "<br><br>" +
                "10. Make sure to not copy the answers from others." + "<br><br>" +
            "<html>"
        );
        add(rules);
        
        JLabel subheading = new JLabel("ALL THE BEST");
        subheading.setBounds(280, 595, 700, 30);
        subheading.setFont(new Font("Viner Hand ITC", Font.BOLD, 28));
        subheading.setForeground(Color.BLACK);
        add(subheading);
        
        back = new JButton("Back");
        back.setBounds(280, 550, 100, 30);
        back.setBackground(new Color(30, 144, 254));
        back.setForeground(Color.WHITE);
        back.addActionListener(this);
        add(back);
        
        start = new JButton("Start");
        start.setBounds(400, 550, 100, 30);
        start.setBackground(new Color(30, 144, 254));
        start.setForeground(Color.WHITE);
        start.addActionListener(this);
        add(start);
        
        setSize(1400, 700);
        setLocation(200, 150);
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == start) {
            setVisible(false);
            new Quiz(name);
        } else {
            setVisible(false);
            new Login();
        }
    }
    
    public static void main(String[] args) {
        new Rules("User");
    }
}