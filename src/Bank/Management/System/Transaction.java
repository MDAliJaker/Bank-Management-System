package Bank.Management.System;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Transaction extends JFrame implements ActionListener{
    JLabel l, l2;
    JButton b, b2, b3, b4, b5, b6, b7;
    String pin;
    Transaction(String pin){
        super("Transaction Panel");
        this.pin = pin;

        l2 = new JLabel("Please Select Your Transaction Option");
        l2.setBounds(110,200,1000,45);
        l2.setFont(new Font("System", Font.BOLD, 45));
        l2.setForeground(new Color(206,209,39));
        add(l2);

        b = new JButton("Deposit");
        b.setBounds(120,305,350,45);
        b.setForeground(Color.WHITE);
        b.setBackground(new Color(206,209,39));
        b.setFont(new Font("Raleway",Font.BOLD,35));
        b.addActionListener(this);
        add(b);

        b2 = new JButton("Cash Withdrawal");
        b2.setBounds(575,305,350,45);
        b2.setForeground(Color.WHITE);
        b2.setBackground(new Color(206,209,39));
        b2.setFont(new Font("Raleway",Font.BOLD,35));
        b2.addActionListener(this);
        add(b2);

        b3 = new JButton("Mini Statement");
        b3.setBounds(120,425,350,45);
        b3.setForeground(Color.WHITE);
        b3.setBackground(new Color(206,209,39));
        b3.setFont(new Font("Raleway",Font.BOLD,35));
        b3.addActionListener(this);
        add(b3);

        b4 = new JButton("PIN Change");
        b4.setBounds(120,550,350,45);
        b4.setForeground(Color.WHITE);
        b4.setBackground(new Color(206,209,39));
        b4.setFont(new Font("Raleway",Font.BOLD,35));
        b4.addActionListener(this);
        add(b4);

        b5 = new JButton("Balance Enquiry");
        b5.setBounds(575,425,350,45);
        b5.setForeground(Color.WHITE);
        b5.setBackground(new Color(206,209,39));
        b5.setFont(new Font("Raleway",Font.BOLD,35));
        b5.addActionListener(this);
        add(b5);

        b6 = new JButton("Go Back");
        b6.setBounds(575,550,350,45);
        b6.setForeground(Color.WHITE);
        b6.setBackground(new Color(206,209,39));
        b6.setFont(new Font("Raleway",Font.BOLD,35));
        b6.addActionListener(this);
        add(b6);


        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/bg.png"));
        Image i2 = i1.getImage().getScaledInstance(1080,768,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        l = new JLabel(i3);
        l.setBounds(0,0,1080,768);
        add(l);

        setLayout(null);
        setSize(1080,768);
        setLocation(144,0);
        setUndecorated(true);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==b){
            setVisible(false);
            new Deposit(pin);
        }
        else if (e.getSource()==b6){
            setVisible(false);
            new Login();
        }
        else if (e.getSource()==b2){
            setVisible(false);
            new Withdrawal(pin);
        }
        else if (e.getSource()==b5) {
            setVisible(false);
            new BalanceInquiry(pin);
        } else if (e.getSource()==b4) {
            setVisible(false);
            new PinChange(pin);

        } else if (e.getSource()==b3) {
            new MiniStatement(pin);
            
        }

    }

    public static void main(String[] args) {
        new Transaction("");
    }

}
