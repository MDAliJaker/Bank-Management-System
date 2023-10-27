package Bank.Management.System;

import com.toedter.calendar.JDateChooser;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class Signup extends JFrame implements ActionListener {
    Random ran = new Random();
    long first4 = (ran.nextLong()% 90L) + 100L;
    String first = " "+ Math.abs(first4);
    JLabel label, label2, label3, label4, label_name, label_name2, label_name3, label_dob, label_gender, label_occupation,
            label_phone, label_email, label_MS, label_address, label_city, label_zip;
    JTextField text_name, text_name2, text_name3, text_phone, text_email, text_occupation,
            text_address, text_city, text_zip;
    JDateChooser DateChooser;
    JRadioButton GB, GB2, GB3, MSB, MSB2, MSB3;
    JButton next, back;
    Signup(){
        super("APPLICATION FORM");

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/bank.png"));
        Image i2 = i1.getImage().getScaledInstance(250,75,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(1,1,250,50);
        add(image);

        label = new JLabel("Form No."+first);
        label.setBounds(675, 25, 600, 40);
        label.setForeground(new Color(206,209,39));
        label.setFont(new Font("Raleway",Font.BOLD,18));
        add(label);

        label2 = new JLabel("APPLICATION FORM");
        label2.setFont(new Font("Raleway",Font.BOLD,30));
        label2.setForeground(Color.WHITE);
        label2.setBounds(280,25,600,30);
        add(label2);

        label3 = new JLabel("Personal Details");
        label3.setFont(new Font("Raleway",Font.BOLD,25));
        label3.setBounds(320,90,600,25);
        label3.setForeground(Color.WHITE);
        add(label3);

        label4 = new JLabel("Page 1");
        label4.setFont(new Font("Raleway",Font.BOLD,18));
        label4.setBounds(390,60,600,25);
        label4.setForeground(new Color(206,209,39));
        add(label4);

        label_name = new JLabel("Name:");
        label_name.setFont(new Font("Raleway",Font.BOLD,20));
        label_name.setBounds(100,135,200,30);
        label_name.setForeground(Color.WHITE);
        add(label_name);

        text_name = new JTextField();
        text_name.setFont(new Font("Raleway",Font.BOLD,16));
        text_name.setBounds(350,135,350,22);
        text_name.setForeground(Color.BLACK);
        add(text_name);

        label_name2 = new JLabel("Father's Name:");
        label_name2.setFont(new Font("Raleway",Font.BOLD,20));
        label_name2.setBounds(100,180,200,20);
        label_name2.setForeground(Color.WHITE);
        add(label_name2);

        text_name2 = new JTextField();
        text_name2.setFont(new Font("Raleway",Font.BOLD,16));
        text_name2.setBounds(350,180,350,22);
        text_name2.setForeground(Color.BLACK);
        add(text_name2);

        label_name3= new JLabel("Mother's Name:");
        label_name3.setFont(new Font("Raleway",Font.BOLD,20));
        label_name3.setBounds(100,225,200,20);
        label_name3.setForeground(Color.WHITE);
        add(label_name3);

        text_name3 = new JTextField();
        text_name3.setFont(new Font("Raleway",Font.BOLD,16));
        text_name3.setBounds(350,225,350,22);
        text_name3.setForeground(Color.BLACK);
        add(text_name3);

        label_dob= new JLabel("Date of Birth:");
        label_dob.setFont(new Font("Raleway",Font.BOLD,20));
        label_dob.setBounds(100,270,200,20);
        label_dob.setForeground(Color.WHITE);
        add(label_dob);

        DateChooser = new JDateChooser();
        DateChooser.setForeground(Color.BLACK);
        DateChooser.setBounds(350,270,350,20);
        add(DateChooser);

        label_gender= new JLabel("Gender:");
        label_gender.setFont(new Font("Raleway",Font.BOLD,20));
        label_gender.setBounds(100,305,200,20);
        label_gender.setForeground(Color.WHITE);
        add(label_gender);

        GB = new JRadioButton("Male");
        GB.setFont(new Font("Raleway",Font.BOLD,16));
        GB.setBackground(new Color(25,68,59));
        GB.setForeground(Color.white);
        GB.setBounds(345,305,110,20);
        add(GB);

        GB2 = new JRadioButton("Female");
        GB2.setFont(new Font("Raleway",Font.BOLD,16));
        GB2.setBackground(new Color(25,68,59));
        GB2.setForeground(Color.white);
        GB2.setBounds(460,305,110,20);
        add(GB2);

        GB3 = new JRadioButton("Others");
        GB3.setFont(new Font("Raleway",Font.BOLD,16));
        GB3.setBackground(new Color(25,68,59));
        GB3.setForeground(Color.WHITE);
        GB3.setBounds(595,305,110,20);
        add(GB3);

        ButtonGroup BG = new ButtonGroup();
        BG.add(GB);
        BG.add(GB2);
        BG.add(GB3);

        label_occupation = new JLabel("Occupation: ");
        label_occupation.setFont(new Font("Raleway",Font.BOLD,20));
        label_occupation.setBounds(100,340,200,20);
        label_occupation.setForeground(Color.WHITE);
        add(label_occupation);

        text_occupation = new JTextField();
        text_occupation.setFont(new Font("Raleway",Font.BOLD,16));
        text_occupation.setBounds(350,340,350,22);
        text_occupation.setForeground(Color.BLACK);
        add(text_occupation);


        label_phone = new JLabel("Phone:");
        label_phone.setFont(new Font("Raleway",Font.BOLD,20));
        label_phone.setBounds(100,385,200,20);
        label_phone.setForeground(Color.WHITE);
        add(label_phone);

        text_phone = new JTextField();
        text_phone.setFont(new Font("Raleway",Font.BOLD,16));
        text_phone.setBounds(350,385,350,22);
        text_phone.setForeground(Color.BLACK);
        add(text_phone);

        label_email = new JLabel("E-mail:");
        label_email.setFont(new Font("Raleway",Font.BOLD,20));
        label_email.setBounds(100,430,200,20);
        label_email.setForeground(Color.WHITE);
        add(label_email);

        text_email = new JTextField();
        text_email.setFont(new Font("Raleway",Font.BOLD,16));
        text_email.setBounds(350,430,350,22);
        text_email.setForeground(Color.BLACK);
        add(text_email);

        label_MS = new JLabel("Marital Status:");
        label_MS.setFont(new Font("Raleway",Font.BOLD,20));
        label_MS.setBounds(100,470,200,20);
        label_MS.setForeground(Color.WHITE);
        add(label_MS);

        MSB = new JRadioButton("Single");
        MSB.setFont(new Font("Raleway",Font.BOLD,16));
        MSB.setBackground(new Color(25,68,59));
        MSB.setForeground(Color.WHITE);
        MSB.setBounds(345,470,100,20);
        add(MSB);

        MSB2 = new JRadioButton("Married");
        MSB2.setFont(new Font("Raleway",Font.BOLD,16));
        MSB2.setBackground(new Color(25,68,59));
        MSB2.setForeground(Color.WHITE);
        MSB2.setBounds(460,470,120,20);
        add(MSB2);

        MSB3 = new JRadioButton("Separated");
        MSB3.setFont(new Font("Raleway",Font.BOLD,16));
        MSB3.setBackground(new Color(25,68,59));
        MSB3.setForeground(Color.WHITE);
        MSB3.setBounds(583,470,150,20);
        add(MSB3);

        ButtonGroup BG2 = new ButtonGroup();
        BG2.add(MSB);
        BG2.add(MSB2);
        BG2.add(MSB3);

        label_address = new JLabel("Address: ");
        label_address.setBounds(100, 505,200,20);
        label_address.setFont(new Font("Raleway", Font.BOLD,20));
        label_address.setForeground(Color.WHITE);
        add(label_address);

        text_address = new JTextField();
        text_address.setBounds(350,505,350,22);
        text_address.setFont(new Font("Raleway",Font.BOLD,16));
        text_address.setForeground(Color.BLACK);
        add(text_address);

        label_zip = new JLabel("Zip/Post Code: ");
        label_zip.setBounds(100, 550,200,20);
        label_zip.setFont(new Font("Raleway", Font.BOLD,20));
        label_zip.setForeground(Color.WHITE);
        add(label_zip);

        text_zip = new JTextField();
        text_zip.setBounds(350,550,350,22);
        text_zip.setFont(new Font("Raleway",Font.BOLD,16));
        text_zip.setForeground(Color.BLACK);
        add(text_zip);

        label_city = new JLabel("City: ");
        label_city.setBounds(100, 595,200,20);
        label_city.setFont(new Font("Raleway", Font.BOLD,20));
        label_city.setForeground(Color.WHITE);
        add(label_city);

        text_city = new JTextField();
        text_city.setBounds(350,595,350,22);
        text_city.setFont(new Font("Raleway",Font.BOLD,16));
        text_city.setForeground(Color.BLACK);
        add(text_city);

        next = new JButton("Next");
        next.setBackground(new Color(206,209,39));
        next.setForeground(Color.WHITE);
        next.setFont(new Font("Raleway", Font.BOLD,20));
        next.setBounds(610,645,90,25);
        next.addActionListener(this);
        add(next);
        back = new JButton("Go Back");
        back.setBackground(new Color(206,209,39));
        back.setForeground(Color.WHITE);
        back.setFont(new Font("Raleway", Font.BOLD,20));
        back.setBounds(460,645,120,25);
        back.addActionListener(this);
        add(back);

        getContentPane().setBackground(new Color(25,68,59));
        setSize(850,740);
        setLayout(null);
        setLocation(360,0);
        setUndecorated(true);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String formno = first;
        String name = text_name.getText();
        String fname = text_name2.getText();
        String mname = text_name3.getText();
        String dob = ((JTextField)DateChooser.getDateEditor().getUiComponent()).getText();
        String gender = null;
        if(GB.isSelected()){
            gender = "Male";
        }else if(GB2.isSelected()){
            gender = "Female";
        }else if(GB3.isSelected()){
            gender = "Others";
        }
        String occupation = text_occupation.getText();
        String phone = text_phone.getText();
        String email = text_email.getText();
        String marital = null;
        if(MSB.isSelected()){
            marital = "Single";
        }else if(MSB2.isSelected()){
            marital = "Married";
        }else if(MSB3.isSelected()){
            marital = "Separated";
        }
        String address = text_address.getText();
        String zip = text_zip.getText();
        String city = text_city.getText();

        try{
            if(e.getSource()==back){
                new Login();
                setVisible(false);
            }else if (text_name.getText().equals("")){
                JOptionPane.showMessageDialog(null,"Please Fill All the Fields");
            } else {
                Bank.Management.System.Connect connect = new Bank.Management.System.Connect();
                String q = "Insert into signup values('"+formno+"','"+name+"','"+fname+"','"+mname+"','"+dob+"','"+gender+"','"+occupation+"','"+phone+"','"+email+"','"+marital+"','"+address+"','"+zip+"','"+city+"')";
                connect.statement.executeUpdate(q);
                new Signup2(first);
                setVisible(false);
            }
        }catch(Exception E){
            E.printStackTrace();
        }
    }

    public static void main(String[] args) {
       new Signup();
    }
}
