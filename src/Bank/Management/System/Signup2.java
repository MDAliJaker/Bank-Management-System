package Bank.Management.System;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Signup2 extends JFrame implements ActionListener{

    String formno;
    JLabel label, label2, label3, label_religion, education,label_occupation, MonthlyIncome, nidnumber, birthcno, tinnumber, tinn,
            scitizen, eaccount, formno1, formno2;

    JTextField income, text_occupation, nid, birth, tin;
    JComboBox rcombo, scombo, icombo, ocombo;

    JRadioButton scb, scb2, eab, eab2;

    JButton back, next;
     Signup2(String formno){
        super("APPLICATION FORM");

        this.formno = formno;

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/bank.png"));
        Image i2 = i1.getImage().getScaledInstance(250,75,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(1,1,250,50);
        add(image);

        label = new JLabel("APPLICATION FORM");
        label.setFont(new Font("Raleway",Font.BOLD,30));
        label.setForeground(Color.WHITE);
        label.setBounds(280,25,600,25);
        add(label);

        label2 = new JLabel("Additional Details");
        label2.setFont(new Font("Raleway",Font.BOLD,25));
        label2.setBounds(320,90,600,25);
        label2.setForeground(Color.WHITE);
        add(label2);

        label3 = new JLabel("Page 2");
        label3.setFont(new Font("Raleway",Font.BOLD,18));
        label3.setBounds(390,60,600,25);
        label3.setForeground(new Color(206,209,39));
        add(label3);
        label_religion = new JLabel("Religion: ");
        label_religion.setFont(new Font("Raleway",Font.BOLD,20));
        label_religion.setBounds(100,170,200,25);
        label_religion.setForeground(Color.WHITE);
        add(label_religion);

        String[] religion = {"Islam", "Hinduism","Buddhism","Christianity","Others"};
        rcombo = new JComboBox<>(religion);
        rcombo.setBackground(new Color(25,68,59));
        rcombo.setForeground(Color.BLACK);
        rcombo.setFont(new Font("Raleway",Font.BOLD,16));
        rcombo.setBounds(400,170,350,25);
        add(rcombo);

        education = new JLabel("Education: ");
        education.setFont(new Font("Raleway",Font.BOLD,20));
        education.setBounds(100,220,200,25);
        education.setForeground(Color.WHITE);
        add(education);

        String[] study = {"Naive","Primary School", "Junior School","Senior School/'O' Level","High Secondary/'A' Level","Degree", "Honours","B.Sc","MBBS","Masters","PHD","Others"};
        scombo = new JComboBox<>(study);
        scombo.setBackground(new Color(25,68,59));
        scombo.setForeground(Color.BLACK);
        scombo.setFont(new Font("Raleway",Font.BOLD,16));
        scombo.setBounds(400,220,350,25);
        add(scombo);


        label_occupation = new JLabel("Occupation Brief: ");
        label_occupation.setFont(new Font("Raleway",Font.BOLD,20));
        label_occupation.setBounds(100,270,250,25);
        label_occupation.setForeground(Color.WHITE);
        add(label_occupation);

      /*  text_occupation = new JTextField();
        text_occupation.setFont(new Font("Raleway",Font.BOLD,20));
        text_occupation.setBounds(300,330,350,30);
        text_occupation.setForeground(Color.BLACK);
        add(text_occupation); */
        String[] occupation = {"Homemaker/Homemakers","Student","Freelancer","Govt. Salaried", "Corp. Salaried","Self Employed","Business","Industrialist","Retired", "Others"};
        ocombo = new JComboBox<>(occupation);
        ocombo.setBackground(new Color(25,68,59));
        ocombo.setForeground(Color.BLACK);
        ocombo.setFont(new Font("Raleway",Font.BOLD,16));
        ocombo.setBounds(400,270,350,25);
        add(ocombo);


        MonthlyIncome = new JLabel("Monthly Income: ");
        MonthlyIncome.setFont(new Font("Raleway",Font.BOLD,20));
        MonthlyIncome.setBounds(100,320,250,25);
        MonthlyIncome.setForeground(Color.WHITE);
        add(MonthlyIncome);

      /*  income = new JTextField();
        income.setFont(new Font("Raleway",Font.BOLD,20));
        income.setBounds(300,210,350,30);
        income.setForeground(Color.BLACK);
        add(income);*/
        String[] income = {"None", "Up to 1000","Up to 2500","Up to 5000","Up to 7500","Up to 10000","Up to 15000","Up to 20000","Up to 25000","Up to 30000","Up to 35000","Up to 40000","Up to 50000","Up to 75000","Up to 100000","Up to 200000","Up to 300000","Up to 400000","Up to 500000","More than 500000"};
        icombo = new JComboBox<>(income);
        icombo.setBackground(new Color(25,68,59));
        icombo.setForeground(Color.BLACK);
        icombo.setFont(new Font("Raleway",Font.BOLD,16));
        icombo.setBounds(400,320,350,25);
        add(icombo);

        birthcno = new JLabel("Birth Cert. No: ");
        birthcno.setFont(new Font("Raleway",Font.BOLD,20));
        birthcno.setBounds(100,370,250,25);
        birthcno.setForeground(Color.WHITE);
        add(birthcno);

        birth = new JTextField();
        birth.setFont(new Font("Raleway",Font.BOLD,16));
        birth.setBounds(400,370,350,25);
        birth.setForeground(Color.BLACK);
        add(birth);

        nidnumber = new JLabel("NID Card No: ");
        nidnumber.setFont(new Font("Raleway",Font.BOLD,20));
        nidnumber.setBounds(100,420,250,25);
        nidnumber.setForeground(Color.WHITE);
        add(nidnumber);

        nid = new JTextField();
        nid.setFont(new Font("Raleway",Font.BOLD,16));
        nid.setBounds(400,420,350,25);
        nid.setForeground(Color.BLACK);
        add(nid);

        tinnumber = new JLabel("TIN Cert. No: ");
        tinnumber.setFont(new Font("Raleway",Font.BOLD,20));
        tinnumber.setBounds(100,470,250,25);
        tinnumber.setForeground(Color.WHITE);
        add(tinnumber);

        tin = new JTextField();
        tin.setFont(new Font("Raleway",Font.BOLD,16));
        tin.setBounds(400,470,350,25);
        tin.setForeground(Color.BLACK);
        add(tin);

        tinn = new JLabel("#Note: If you don't have TIN certificate than put N/A in the field");
        tinn.setFont(new Font("Raleway",Font.BOLD,10));
        tinn.setBounds(400,500,350,10);
        tinn.setForeground(new Color(206,209,39));
        add(tinn);

        scitizen = new JLabel("Senior Citizen: ");
        scitizen.setFont(new Font("Raleway",Font.BOLD,20));
        scitizen.setBounds(100,520,250,25);
        scitizen.setForeground(Color.WHITE);
        add(scitizen);

        scb = new JRadioButton("Yes");
        scb.setFont(new Font("Raleway",Font.BOLD,16));
        scb.setBounds(400,522,100,25);
        scb.setForeground(Color.BLACK);
        scb.setBackground(new Color(25,68,59));
        add(scb);
        scb2 = new JRadioButton("No");
        scb2.setFont(new Font("Raleway",Font.BOLD,16));
        scb2.setBounds(550,522,100,25);
        scb2.setForeground(Color.BLACK);
        scb2.setBackground(new Color(25,68,59));
        add(scb2);

        ButtonGroup BG = new ButtonGroup();
        BG.add(scb);
        BG.add(scb2);

        eaccount = new JLabel("Existing Account:");
        eaccount.setFont(new Font("Raleway",Font.BOLD,20));
        eaccount.setBounds(100,570,250,25);
        eaccount.setForeground(Color.WHITE);
        add(eaccount);

        eab = new JRadioButton("Yes");
        eab.setFont(new Font("Raleway",Font.BOLD,16));
        eab.setBounds(400,570,100,25);
        eab.setForeground(Color.BLACK);
        eab.setBackground(new Color(25,68,59));
        add(eab);

        eab2 = new JRadioButton("No");
        eab2.setFont(new Font("Raleway",Font.BOLD,16));
        eab2.setBounds(550,570,100,25);
        eab2.setForeground(Color.BLACK);
        eab2.setBackground(new Color(25,68,59));
        add(eab2);

        ButtonGroup BG2 = new ButtonGroup();
        BG2.add(eab);
        BG2.add(eab2);

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

        back = new JButton("Go Back");
        back.setBackground(new Color(206,209,39));
        back.setForeground(Color.WHITE);
        back.setFont(new Font("Raleway", Font.BOLD,20));
        back.setBounds(460,645,120,25);
        back.addActionListener(this);
        add(back);

        next = new JButton("Next");
        next.setBackground(new Color(206,209,39));
        next.setForeground(Color.WHITE);
        next.setFont(new Font("Raleway", Font.BOLD,20));
        next.setBounds(660,645,90,25);
        next.addActionListener(this);
        add(next);

        setLayout(null);
        setSize(850,740);
        setLocation(275,0);
        getContentPane().setBackground(new Color(25,68,59));
        setUndecorated(true);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try{
        String religion = (String) rcombo.getSelectedItem();
        String edu = (String) scombo.getSelectedItem();
        String occupation = (String) ocombo.getSelectedItem();
        String income = (String) icombo.getSelectedItem();

        String birthno = birth.getText();
        String nidno = nid.getText();
        String tinno = tin.getText();

        String scitizen = null;
        if(scb.isSelected()){
           scitizen ="yes";
        }else if(scb2.isSelected()){
           scitizen ="No";
        }
        String exaccount = null;
        if(eab.isSelected()){
           exaccount ="yes";
        }else if(eab2.isSelected()){
           exaccount ="No";
        }
           if(e.getSource()==back){
              new Signup();
              setVisible(false);
           }else if(birth.getText().isEmpty() || nid.getText().isEmpty()){
              JOptionPane.showMessageDialog(null,"Please Fill All the Fields.");
           }else {
              Connect connect = new Connect();
              String q1 = "Insert into signup2 values('"+formno+"','"+religion+"','"+edu+"','"+occupation+"','"+income+"','"+birthno+"','"+nidno+"','"+tinno+"','"+scitizen+"','"+exaccount+"')";
              connect.statement.executeUpdate(q1);
              new Signup3(formno);
              setVisible(false);
           }

        }catch (Exception E){
           E.printStackTrace();
        }

    }

    public static void main(String[] args) {
        new Signup2("");
    }

}
