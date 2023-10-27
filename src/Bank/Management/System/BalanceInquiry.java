package Bank.Management.System;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class BalanceInquiry extends JFrame implements ActionListener {
    JLabel l, l1, l2, l3;
    String pin;
    JButton b;
    BalanceInquiry(String pin){
        this.pin = pin;

        l = new JLabel("Current Available Amount in Your Balance-");
        l.setBounds(90,150,1000,45);
        l.setFont(new Font("System", Font.BOLD, 45));
        l.setForeground(new Color(206,209,39));
        add(l);

        l1 = new JLabel("The Amount:");
        l1.setBounds(90,240,200,35);
        l1.setFont(new Font("System", Font.BOLD, 30));
        l1.setForeground(new Color(206,209,39));
        add(l1);

        l3 = new JLabel();
        l3.setBounds(300,240,1000,35);
        l3.setFont(new Font("System", Font.BOLD, 30));
        l3.setForeground(new Color(206,209,39));
        add(l3);

        b = new JButton("Go Back");
        b.setBounds(780,600,175,35);
        b.setFont(new Font("Raleway",Font.BOLD,30));
        b.setForeground(Color.WHITE);
        b.setBackground(new Color(206,209,39));
        b.addActionListener(this);
        add(b);

        int balance = 0;

        try{
            Connect connect = new Connect();
            ResultSet resultSet = connect.statement.executeQuery("select * from transaction_history where Pin = '"+pin+"'");
            while(resultSet.next()){
                if(resultSet.getString("Type").equals("Deposit")){
                    balance += Integer.parseInt(resultSet.getString("Amount"));
                }else{
                    balance -= Integer.parseInt(resultSet.getString("Amount"));
                }

            }
        }catch(Exception E){
            E.printStackTrace();
        }

        l3.setText("Tk. "+balance);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/bg.png"));
        Image i2 = i1.getImage().getScaledInstance(1080,768,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        l2 = new JLabel(i3);
        l2.setBounds(0,0,1080,768);
        add(l2);

        setLayout(null);
        setSize(1080,768);
        setLocation(144,0);
        setUndecorated(true);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        setVisible(false);
        new Transaction(pin);

    }

    public static void main(String[] args) {
        new BalanceInquiry("");
    }
}
