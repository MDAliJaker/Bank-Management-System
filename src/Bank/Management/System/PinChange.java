package Bank.Management.System;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PinChange extends JFrame implements ActionListener {
    JLabel l, l2,l3, l4;

    JButton b,b2;

    JPasswordField passwordField, passwordField1;

    String pin;
    PinChange(String pin){
        this.pin = pin;

        l = new JLabel("CHANGE YOUR PIN-");
        l.setBounds(275,200,700,60);
        l.setFont(new Font("System", Font.BOLD, 60));
        l.setForeground(new Color(206,209,39));
        add(l);

        l2 = new JLabel("Enter New PIN:");
        l2.setBounds(100,300,500,45);
        l2.setFont(new Font("System", Font.BOLD, 45));
        l2.setForeground(new Color(206,209,39));
        add(l2);

        passwordField= new JPasswordField();
        passwordField.setBounds(500,300,460,45);
        passwordField.setFont(new Font("Arial",Font.BOLD,40));
        add(passwordField);

        l3 = new JLabel("Confirm New PIN:");
        l3.setBounds(100,420,500,45);
        l3.setFont(new Font("System", Font.BOLD, 45));
        l3.setForeground(new Color(206,209,39));
        add(l3);

        passwordField1= new JPasswordField();
        passwordField1.setBounds(500,420,460,45);
        passwordField1.setFont(new Font("Arial",Font.BOLD,40));
        add(passwordField1);


        b = new JButton("Go Back");
        b.setBounds(500,600,200,45);
        b.setFont(new Font("Raleway",Font.BOLD,40));
        b.setForeground(Color.WHITE);
        b.setBackground(new Color(206,209,39));
        b.addActionListener(this);
        add(b);

        b2 = new JButton("Change");
        b2.setBounds(755,600,200,45);
        b2.setFont(new Font("Raleway",Font.BOLD,40));
        b2.setForeground(Color.WHITE);
        b2.setBackground(new Color(206,209,39));
        b2.addActionListener(this);
        add(b2);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/bg.png"));
        Image i2 = i1.getImage().getScaledInstance(1080,768,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        l4 = new JLabel(i3);
        l4.setBounds(0,0,1080,768);
        add(l4);

        setLayout(null);
        setSize(1080,768);
        setLocation(144,0);
        setUndecorated(true);
        setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try{
            String pin1 = passwordField.getText();
            String pin2 = passwordField1.getText();

            if(!pin1.equals(pin2)){
                JOptionPane.showMessageDialog(null, "Entered PINs Doesn't Match!");
                return;
            }else if(e.getSource()==b2){
                if(passwordField.getText().isEmpty()){
                    JOptionPane.showMessageDialog(null, "Please Enter the New PIN!");
                }
                else if(passwordField1.getText().isEmpty()){
                    JOptionPane.showMessageDialog(null, "Please Enter the Confirm PIN!");
                }
                Connect connect = new Connect();
                String q1 = "update transaction_history set Pin ='"+pin1+"' where Pin = '"+pin+"' ";
                String q2 = "update login set Pin ='"+pin1+"' where Pin = '"+pin+"' ";
                String q3 = "update signup3 set Pin ='"+pin1+"' where Pin = '"+pin+"' ";

                connect.statement.executeUpdate(q1);
                connect.statement.executeUpdate(q2);
                connect.statement.executeUpdate(q3);

                JOptionPane.showMessageDialog(null, "PIN Changed Successfully to:"+pin1);

                setVisible(false);
                new Transaction(pin);
            }
            else if(e.getSource()==b){
                setVisible(false);
                new Transaction(pin);
            }


        }catch(Exception E){
            E.printStackTrace();
        }

    }

    public static void main(String[] args) {
        new PinChange("");
    }
}
