package Bank.Management.System;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class Login extends JFrame implements ActionListener {
    JLabel image, label1, label2, label3;
    JTextField textField2;
    JPasswordField passwordField3;
    JButton button, button2, button3, button4;
    Login(){
        super("Bank Management System");

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/bank.png"));
        Image i2 = i1.getImage().getScaledInstance(512,125,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        image = new JLabel(i3);
        image.setBounds(164,0,512,125);
        add(image);

        ImageIcon i21 = new ImageIcon(ClassLoader.getSystemResource("icon/card.png"));
        Image i22 = i21.getImage().getScaledInstance(100,100,Image.SCALE_DEFAULT);
        ImageIcon i23 = new ImageIcon(i22);
        JLabel image2 = new JLabel(i23);
        image2.setBounds(650,350,100,100);
        add(image2);

        label1 = new JLabel("WELCOME TO BANK UCTC");
        label1.setForeground(new Color(206,209,39));
        label1.setFont(new Font("AvantGrade", Font.BOLD,30));
        label1.setBounds(210,100,450,40);
        add(label1);

        
        label2 = new JLabel("Account / Card NO :");
        label2.setForeground(new Color(206,209,39));
        label2.setFont(new Font("Raleway", Font.BOLD,24));
        label2.setBounds(150,160,375,30);
        add(label2);

        textField2 = new JTextField(15);
        textField2.setBounds(420,160,230,30);
        textField2.setFont(new Font("Arial",Font.ITALIC,20));
        add(textField2);

        label3 = new JLabel("PIN :");
        label3.setForeground(new Color(206,209,39));
        label3.setFont(new Font("Raleway", Font.BOLD,24));
        label3.setBounds(150,200,375,30);
        add(label3);

        passwordField3= new JPasswordField(15);
        passwordField3.setBounds(420,200,230,30);
        passwordField3.setFont(new Font("Arial",Font.BOLD,20));
        add(passwordField3);

        button = new JButton("Clear");
        button.setFont(new Font("Arial", Font.BOLD,20));
        button.setForeground(Color.WHITE);
        button.setBackground(new Color(206,209,39));
        button.setBounds(290,270,125,30);
        button.addActionListener(this);
        add(button);

        button2 = new JButton("Sing Up");
        button2.setFont(new Font("Arial", Font.BOLD,20));
        button2.setForeground(Color.WHITE);
        button2.setBackground(new Color(206,209,39));
        button2.setBounds(425,270,125,30);
        button2.addActionListener(this);
        add(button2);

        button3 = new JButton("Sing In");
        button3.setFont(new Font("Arial", Font.BOLD,20));
        button3.setForeground(Color.WHITE);
        button3.setBackground(new Color(206,209,39));
        button3.setBounds(290,320,260,30);
        button3.addActionListener(this);
        add(button3);

        button4 = new JButton("Exit");
        button4.setBounds(290,370,260,30);
        button4.setForeground(Color.WHITE);
        button4.setBackground(new Color(206,209,39));
        button4.setFont(new Font("Arial",Font.BOLD,20));
        button4.addActionListener(this);
        add(button4);

        ImageIcon i31 = new ImageIcon(ClassLoader.getSystemResource("icon/login.png"));
        Image i32 = i31.getImage().getScaledInstance(850,480,Image.SCALE_DEFAULT);
        ImageIcon i33 = new ImageIcon(i32);
        JLabel image3 = new JLabel(i33);
        image3.setBounds(0,0,850,480);
        add(image3);

        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        int screenWidth = screenSize.width;
        int screenHeight = screenSize.height;

        int windowWidth = Math.min(screenWidth - 100, 850);  // Set maximum width of 850
        int windowHeight = Math.min(screenHeight - 100, 480); // Set maximum height of 480
        int windowX = (screenWidth - windowWidth) / 2;
        int windowY = (screenHeight - windowHeight) / 2;

        setSize(windowWidth, windowHeight);
        setLocation(windowX, windowY);
//        setLayout(null);
//        setSize(850,480);
//        setLocation(285,165);
        setUndecorated(true);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try{
            if(e.getSource()==button){
                textField2.setText("");
                passwordField3.setText("");
            }
            else if(e.getSource()==button2){
                new Signup();
                setVisible(false);
            }else if(e.getSource()==button3){
                Connect connect = new Connect();
                String acno = textField2.getText();
                String pno = passwordField3.getText();
                String q = "select * from login where Account_Card_NO ='"+acno+"'and Pin='"+pno+"'";
                ResultSet resultSet = connect.statement.executeQuery(q);
                if(resultSet.next()){
                    setVisible(false);
                    new Transaction(pno);
                }else if(textField2.getText().isEmpty() || passwordField3.getText().isEmpty()){
                    JOptionPane.showMessageDialog(null,"Fill All the Fields First");
                }else{
                    JOptionPane.showMessageDialog(null,"Incorrect Account / Card No or PIN");
                }
            } else if (e.getSource()==button4) {
                System.exit(0);
            }
        }catch(Exception E){
            E.printStackTrace();
        }

    }
    public static void main(String[] args) {
        SwingUtilities.invokeLater(Login::new);
    }
}
