package quiz;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Login extends JFrame implements ActionListener{
 
    JButton rules, back;
    JTextField tfname;
    
    Login() {
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/login.png"));
        Image i2 = i1.getImage().getScaledInstance(500, 500, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(-100, -70, 800, 800);
        add(image);
        
        JLabel heading = new JLabel("QUIZ WIZ QUIZZLER");
        heading.setBounds(730, 200, 1000, 45);
        heading.setFont(new Font("Viner Hand ITC", Font.BOLD, 40));
        heading.setForeground(new Color(30, 144, 250));
        add(heading);
        
        JLabel name = new JLabel("Enter your name");
        name.setBounds(845, 280, 300, 20);
        name.setFont(new Font("Mongolian Baiti", Font.BOLD, 18));
        name.setForeground(new Color(30, 144, 250));
        add(name);
        
        tfname = new JTextField();
        tfname.setBounds(780, 310, 300, 25);
        tfname.setFont(new Font("Times New Roman", Font.BOLD, 20));
        add(tfname);
        
        rules = new JButton("Rules");
        rules.setBounds(880, 350, 120, 25);
        rules.setBackground(new Color(30, 144, 250));
        rules.setForeground(Color.WHITE);
        rules.addActionListener(this);
        add(rules);
        
        setSize(1400,700);
        setLocation(200, 150);
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == rules) {
            String name = tfname.getText();
            setVisible(false);
            new Rules(name);
        } 
    }
    
    public static void main(String[] args) {
        new Login();
    }
}
