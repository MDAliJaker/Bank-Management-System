package Bank.Management.System;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

    public class MiniStatement extends JFrame implements ActionListener {
        String pin;
        JButton button;

        JLabel  l, l2, l3, label1,label2, label3, label4;
        MiniStatement(String pin){
            this.pin = pin;
            getContentPane().setBackground(new Color(2, 58, 46));
            setSize(400,700);
            setLocation(20,20);
            setUndecorated(true);
            setLayout(null);

            label1 = new JLabel();
            label1.setBounds(30,115,400,600);
            label1.setFont(new Font("Raleway",Font.BOLD,10));
            label1.setForeground(Color.WHITE);
            add(label1);

            l = new JLabel("Date");
            l.setForeground(new Color(206,209,39));
            l.setFont(new Font("AvantGrade", Font.BOLD,12));
            l.setBounds(100,100,200,15);
            add(l);

            l2= new JLabel("Type");
            l2.setForeground(new Color(206,209,39));
            l2.setFont(new Font("AvantGrade", Font.BOLD,12));
            l2.setBounds(200,100,100,15);
            add(l2);

            l3 = new JLabel("Amount in Tk.");
            l3.setForeground(new Color(206,209,39));
            l3.setFont(new Font("AvantGrade", Font.BOLD,12));
            l3.setBounds(260,100,150,15);
            add(l3);

            label2 = new JLabel("Bank UCTC Mini-Statement");
            label2.setFont(new Font("System", Font.BOLD,18));
            label2.setForeground(new Color(206,209,39));
            label2.setBounds(80,15,350,20);
            add(label2);

            label3 = new JLabel();
            label3.setBounds(25,60,300,25);
            label3.setForeground(new Color(206,209,39));
            add(label3);

            label4 = new JLabel();
            label4.setBounds(25,615,350,25);
            label4.setFont(new Font("Raleway",Font.BOLD,20));
            label4.setForeground(new Color(206,209,39));
            add(label4);

            try{
                Connect connect = new Connect();
                ResultSet resultSet = connect.statement.executeQuery("select * from login where Pin = '"+pin+"'");
                while (resultSet.next()){
                    label3.setText("Account / Card Number:  "+ resultSet.getString("Account_Card_NO"));
                }
            }catch (Exception e ){
                e.printStackTrace();
            }

            try{
                int balance =0;
                Connect connect = new Connect();
                ResultSet resultSet = connect.statement.executeQuery("select * from transaction_history where pin = '"+pin+"'");
                while (resultSet.next()){

                    label1.setText(label1.getText() + "<html>"+resultSet.getString("Transaction_Date")+"&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"+resultSet.getString("Type")+"&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"+resultSet.getString("Amount")+ "<br><br><html>");

                    if (resultSet.getString("type").equals("Deposit")){
                        balance += Integer.parseInt(resultSet.getString("Amount"));
                    }else {
                        balance -= Integer.parseInt(resultSet.getString("Amount"));
                    }
                }
                label4.setText("Your Total Balance is Tk. "+balance);
            }catch (Exception e){
                e.printStackTrace();
            }

            button = new JButton("Close");
            button.setFont(new Font("Raleway",Font.BOLD,20));
            button.setBounds(275,650,100,25);
            button.setBackground(new Color(206,209,39));
            button.setForeground(Color.WHITE);
            button.addActionListener(this);
            add(button);

            setVisible(true);
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            setVisible(false);
        }

        public static void main(String[] args) {
            new MiniStatement("");
        }
    }