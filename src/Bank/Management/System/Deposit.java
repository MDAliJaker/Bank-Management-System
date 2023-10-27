package Bank.Management.System;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

public class Deposit extends JFrame implements ActionListener {
    String pin;
    JLabel l, l1, l2, l3, l4,l5, nid;
    TextField textField, textField1, textField2;
    JButton b, b2;
    JRadioButton rb,rb2;
    Deposit(String pinno){
        super("Deposit Panel");
        this.pin = pinno;


            l = new JLabel("Enter the Amount You Want to Deposit-");
            l.setBounds(100,150,1000,45);
            l.setFont(new Font("System", Font.BOLD, 45));
            l.setForeground(new Color(206,209,39));
            add(l);

            l1 = new JLabel("The Amount:");
            l1.setBounds(90,240,200,35);
            l1.setFont(new Font("System", Font.BOLD, 30));
            l1.setForeground(new Color(206,209,39));
            add(l1);

            textField = new TextField("");
            textField.setBounds(450,240,510,35);
            textField.setFont(new Font("Raleway", Font.BOLD,30));
            textField.setForeground(Color.BLACK);
            add(textField);

            l2 = new JLabel("Depositing Memo No:");
            l2.setBounds(90,330,350,35);
            l2.setFont(new Font("System", Font.BOLD, 30));
            l2.setForeground(new Color(206,209,39));
            add(l2);

            textField1 = new TextField("");
            textField1.setBounds(450,330,510,40);
            textField1.setFont(new Font("Raleway", Font.BOLD,35));
            textField1.setForeground(Color.BLACK);
            add(textField1);

            l3 = new JLabel("Depositing Person:");
            l3.setBounds(90,420,350,35);
            l3.setFont(new Font("System", Font.BOLD, 30));
            l3.setForeground(new Color(206,209,39));
            add(l3);

            rb = new JRadioButton("Self");
            rb.setFont(new Font("Raleway",Font.BOLD,30));
            rb.setBounds(450,420,100,35);
            rb.setForeground(Color.WHITE);
            rb.setBackground(new Color(25,68,59));
            add(rb);

            rb2 = new JRadioButton("Others");
            rb2.setFont(new Font("Raleway",Font.BOLD,30));
            rb2.setBounds(705,420,150,35);
            rb2.setForeground(Color.WHITE);
            rb2.setBackground(new Color(25,68,59));
            add(rb2);

            ButtonGroup BG = new ButtonGroup();
            BG.add(rb);
            BG.add(rb2);

            l4 = new JLabel("Others NID No:");
            l4.setBounds(90,510,250,35);
            l4.setFont(new Font("System", Font.BOLD, 30));
            l4.setForeground(new Color(206,209,39));
            add(l4);

            textField2 = new TextField("");
            textField2.setBounds(450,510,510,40);
            textField2.setFont(new Font("Raleway", Font.BOLD,35));
            textField2.setForeground(Color.BLACK);
            add(textField2);

            nid = new JLabel("#If the Depositing Amount above Tk 499999 & Person is Others Fill the Box with Their NID No.");
            nid.setFont(new Font("Raleway",Font.BOLD,12));
            nid.setBounds(445,555,600,12);
            nid.setForeground(new Color(206,209,39));
            add(nid);


            b = new JButton("Go Back");
            b.setBounds(525,600,175,35);
            b.setFont(new Font("Raleway",Font.BOLD,30));
            b.setForeground(Color.WHITE);
            b.setBackground(new Color(206,209,39));
            b.addActionListener(this);
            add(b);

            b2 = new JButton("Deposit");
            b2.setBounds(780,600,175,35);
            b2.setFont(new Font("Raleway",Font.BOLD,30));
            b2.setForeground(Color.WHITE);
            b2.setBackground(new Color(206,209,39));
            b2.addActionListener(this);
            add(b2);

            ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/bg.png"));
            Image i2 = i1.getImage().getScaledInstance(1080,768,Image.SCALE_DEFAULT);
            ImageIcon i3 = new ImageIcon(i2);
            l5 = new JLabel(i3);
            l5.setBounds(0,0,1080,768);
            add(l5);

            setLayout(null);
            setSize(1080,768);
            setLocation(144,0);
            setUndecorated(true);
            setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            String amount = textField.getText();
            String Depositingm = textField1.getText();
            Date date = new Date();
            String Depositingp = null;
            if(rb.isSelected()){
                Depositingp ="Self";
            }else if(rb2.isSelected()){
                Depositingp ="Others";
            }
            String nidno= textField2.getText();
            if(e.getSource()==b2){
                if(textField.getText().isEmpty()){
                    JOptionPane.showMessageDialog(null,"Please Enter the Amount You Want to Deposit!");
                }else if(textField1.getText().isEmpty()){
                    JOptionPane.showMessageDialog(null, "Please Enter the Depositing Memo NO. !");
                }else if (!rb.isSelected() && !rb2.isSelected()) {
                    JOptionPane.showMessageDialog(null, "Please Select the Depositing Person!");
                }else{
                    Connect connect = new Connect();
                    connect.statement.executeUpdate("Insert into transaction_history values('"+pin+"','"+date+"','Deposit','"+amount+"','"+Depositingm+"','"+Depositingp+"','"+nidno+"')");
                    JOptionPane.showMessageDialog(null,"Tk. "+amount+" Deposited Successfully");
                    setVisible(false);
                    new Transaction(pin);
                }
            }else if(e.getSource()==b){
                setVisible(false);
                new Transaction(pin);
            }
        }catch(Exception E){
            E.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new Deposit("");
    }
}
