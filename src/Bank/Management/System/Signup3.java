package Bank.Management.System;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class Signup3 extends JFrame implements ActionListener {

    JLabel label, label2, label3, actype, cardn, cardn2, cardn3, cardn4, pin, pin2, pin3, services, formno1,formno2;

    JRadioButton atb, atb2, atb3, atb4;

    JCheckBox c1,c2,c3,c4,c5,c6,c7;

    JButton submit, cancel;
    String formno;
    Signup3(String formno){

        super("APPLICATION FORM");
        this.formno = formno;


        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/bank.png"));
        Image i2 = i1.getImage().getScaledInstance(250,75,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(1,1,250,50);
        add(image);

        this.formno = formno;

        label = new JLabel("APPLICATION FORM");
        label.setFont(new Font("Raleway",Font.BOLD,30));
        label.setForeground(Color.WHITE);
        label.setBounds(280,25,600,30);
        add(label);

        label2 = new JLabel("Account Details");
        label2.setFont(new Font("Raleway",Font.BOLD,25));
        label2.setBounds(320,90,600,30);
        label2.setForeground(Color.WHITE);
        add(label2);

        label3 = new JLabel("Page 3");
        label3.setFont(new Font("Raleway",Font.BOLD,18));
        label3.setBounds(390,60,600,30);
        label3.setForeground(new Color(206,209,39));
        add(label3);

        actype = new JLabel("Account Type: ");
        actype.setFont(new Font("Raleway",Font.BOLD,20));
        actype.setBounds(100,130,200,25);
        actype.setForeground(Color.WHITE);
        add(actype);

        atb = new JRadioButton("Saving Account");
        atb.setFont(new Font("Raleway",Font.BOLD,16));
        atb.setBackground(new Color(25,68,59));
        atb.setForeground(Color.white);
        atb.setBounds(150,170,250,20);
        add(atb);

        atb2 = new JRadioButton("Current Account");
        atb2.setFont(new Font("Raleway",Font.BOLD,16));
        atb2.setBackground(new Color(25,68,59));
        atb2.setForeground(Color.white);
        atb2.setBounds(450,170,250,20);
        add(atb2);

        atb3 = new JRadioButton("Fixed Deposit Account");
        atb3.setFont(new Font("Raleway",Font.BOLD,16));
        atb3.setBackground(new Color(25,68,59));
        atb3.setForeground(Color.WHITE);
        atb3.setBounds(150,200,250,20);
        add(atb3);

        atb4 = new JRadioButton("Islamic Account");
        atb4.setFont(new Font("Raleway",Font.BOLD,16));
        atb4.setBackground(new Color(25,68,59));
        atb4.setForeground(Color.WHITE);
        atb4.setBounds(450,200,250,20);
        add(atb4);

        ButtonGroup BG = new ButtonGroup();
        BG.add(atb);
        BG.add(atb2);
        BG.add(atb3);
        BG.add(atb4);

        cardn = new JLabel("Account / Card Number:");
        cardn.setFont(new Font("Raleway",Font.BOLD,20));
        cardn.setBounds(100,250,300,20);
        cardn.setForeground(Color.WHITE);
        add(cardn);

        cardn2 = new JLabel("(Your 16 Digit Account / Card Number)");
        cardn2.setFont(new Font("Raleway",Font.BOLD,10));
        cardn2.setBounds(100,280,200,10);
        cardn2.setForeground(new Color(206,209,39));
        add(cardn2);

        cardn3 = new JLabel("4103-XXXX-XXXX-XXXX");
        cardn3.setFont(new Font("Raleway",Font.BOLD,20));
        cardn3.setBounds(400,250,300,20);
        cardn3.setForeground(new Color(255, 255, 251));
        add(cardn3);

        cardn4 = new JLabel("(It would appear on ATM card/Checkbook & Statement)");
        cardn4.setFont(new Font("Raleway",Font.BOLD,10));
        cardn4.setBounds(375,280,300,10);
        cardn4.setForeground(new Color(206,209,39));
        add(cardn4);


        pin = new JLabel("PIN: ");
        pin.setFont(new Font("Raleway",Font.BOLD,20));
        pin.setBounds(100,325,200,20);
        pin.setForeground(Color.WHITE);
        add(pin);

        pin2 = new JLabel("XXXX");
        pin2.setFont(new Font("Raleway",Font.BOLD,20));
        pin2.setBounds(400,325,300,20);
        pin2.setForeground(new Color(255, 255, 251));
        add(pin2);

        pin3 = new JLabel("(4 Digit Numeric Password)");
        pin3.setFont(new Font("Raleway",Font.BOLD,10));
        pin3.setBounds(100,355,200,10);
        pin3.setForeground(new Color(206,209,39));
        add(pin3);

        services = new JLabel("Services Required: ");
        services.setFont(new Font("Raleway",Font.BOLD,20));
        services.setBounds(100,400,250,20);
        services.setForeground(Color.WHITE);
        add(services);

        c1 = new JCheckBox("Cheque Book");
        c1.setFont(new Font("Raleway",Font.BOLD,16));
        c1.setBackground(new Color(25,68,59));
        c1.setForeground(Color.white);
        c1.setBounds(150,430,200,20);
        add(c1);

        c2 = new JCheckBox("SMS Services");
        c2.setFont(new Font("Raleway",Font.BOLD,16));
        c2.setBackground(new Color(25,68,59));
        c2.setForeground(Color.white);
        c2.setBounds(350,430,200,20);
        add(c2);

        c3 = new JCheckBox("Internet Banking");
        c3.setFont(new Font("Raleway",Font.BOLD,16));
        c3.setBackground(new Color(25,68,59));
        c3.setForeground(Color.white);
        c3.setBounds(550,430,200,20);
        add(c3);

        c4 = new JCheckBox("Debit / ATM Card");
        c4.setFont(new Font("Raleway",Font.BOLD,16));
        c4.setBackground(new Color(25,68,59));
        c4.setForeground(Color.white);
        c4.setBounds(150,460,200,20);
        add(c4);

        c5 = new JCheckBox("Credit Card");
        c5.setFont(new Font("Raleway",Font.BOLD,16));
        c5.setBackground(new Color(25,68,59));
        c5.setForeground(Color.white);
        c5.setBounds(350,460,200,20);
        add(c5);

        c6 = new JCheckBox("E-Statement");
        c6.setFont(new Font("Raleway",Font.BOLD,16));
        c6.setBackground(new Color(25,68,59));
        c6.setForeground(Color.white);
        c6.setBounds(550,460,200,20);
        add(c6);

        c7 = new JCheckBox("*I here by declare that above entered all the details correct to the best of my knowledge.*",true);
        c7.setFont(new Font("Raleway",Font.BOLD,16));
        c7.setBackground(new Color(25,68,59));
        c7.setForeground(new Color(206,209,39));
        c7.setBounds(75,520,700,20);
        add(c7);

        formno1 = new JLabel("Form No.");
        formno1.setFont(new Font("Raleway",Font.BOLD,18));
        formno1.setBounds(640,30,100,40);
        formno1.setForeground(new Color(206,209,39));
        add(formno1);

        formno2 = new JLabel(formno);
        formno2.setFont(new Font("Raleway",Font.BOLD,18));
        formno2.setBounds(740,30,75,40);
        formno2.setForeground(new Color(206,209,39));
        add(formno2);

        cancel = new JButton("Cancel");
        cancel.setBackground(new Color(206,209,39));
        cancel.setForeground(Color.WHITE);
        cancel.setFont(new Font("Raleway", Font.BOLD,20));
        cancel.setBounds(212,625,125,25);
        cancel.addActionListener(this);
        add(cancel);

        submit = new JButton("Submit");
        submit.setBackground(new Color(206,209,39));
        submit.setForeground(Color.WHITE);
        submit.setFont(new Font("Raleway", Font.BOLD,20));
        submit.setBounds(487,625,125,25);
        submit.addActionListener(this);
        add(submit);

        setLayout(null);
        setSize(850,740);
        setLocation(275,0);
        getContentPane().setBackground(new Color(25,68,59));
        setUndecorated(true);
        setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String atype = "";
        if(atb.isSelected()){
            atype = "Saving Account";
        }else if(atb2.isSelected()){
            atype = "Current Account";
        }else if(atb3.isSelected()){
            atype = "Fixed Deposit Account";
        }else if (atb4.isSelected()){
            atype = "Islamic Account";
        }
        Random run = new Random();
        long first7 = (run.nextLong()% 90000000L) + 4103040000000000L;
        String cardno = ""+Math.abs(first7);

        long first3 = (run.nextLong()% 9000L) + 1000L;
        String pinno =  ""+Math.abs(first3);

        String fac = "";
        if(c1.isSelected()){
            fac += "Cheque Book";
        }else if(c2.isSelected()){
            fac += "SMS Services";
        }else if(c3.isSelected()){
            fac += "Internet Banking";
        }else if(c4.isSelected()){
            fac += "Debit / ATM Card";
        }else if(c5.isSelected()){
            fac += "Credit Crad";
        }else if(c6.isSelected()){
            fac += "E-Statement";
        }

        try{
            if(e.getSource()==submit){
                if(atype.isEmpty()){
                    JOptionPane.showMessageDialog(null,"Please Fill All the Fields");
                }else{
                    Connect connect = new Connect();
                    String q3 = "insert into signup3 values('"+formno+"','"+atype+"','"+cardno+"','"+pinno+"','"+fac+"')";
                    String q4 = "insert into login values('"+formno+"','"+cardno+"','"+pinno+"')";
                    connect.statement.executeUpdate(q3);
                    connect.statement.executeUpdate(q4);
                    JOptionPane.showMessageDialog(null,"Account / Card No:"+cardno+"\n Pin: "+pinno);
                    new Deposit(pinno);
                    setVisible(false);
                }
            }else if(e.getSource()==cancel){
                System.exit(0);
            }
        }catch(Exception E){
            E.printStackTrace();
        }
    }
    public static void main(String[] args) {
        new Signup3("");

    }
}
