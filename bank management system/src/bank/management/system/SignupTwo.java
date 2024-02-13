package bank.management.system;

import javax.swing.*;
import java.awt.*;

import java.awt.event.*;

public class SignupTwo extends JFrame implements ActionListener {
    
    
    JTextField aadhar,pan;
    JButton next;
    JRadioButton syes,sno,eyes,eno;
    JComboBox religion,category,income,education,occupation;
    String formno;
    
    SignupTwo(String formno) {
        
        this.formno=formno;
        
        setLayout(null);
        
        setTitle("New Account Application Form -PAGE 2");
        
        JLabel additionalDetails = new JLabel("Page 1: Additional Details");
        additionalDetails.setFont(new Font("Raleway",Font.BOLD,22));
        additionalDetails.setBounds(290,80,400,30);
        add(additionalDetails);
        
        JLabel name=new JLabel("Religion:");
        name.setFont(new Font("Raleway",Font.BOLD,20));
        name.setBounds(100,140,100,30);
        add(name);
        
        String valReligion[]={"Hindu","Muslim","Sikh","Christian","Other"};
        religion =new JComboBox(valReligion);
        religion.setFont(new Font("Raleway",Font.BOLD,14));
        religion.setBounds(300,140,400,30);
        religion.setBackground(Color.white);
        add(religion);
         
        JLabel fname=new JLabel("Category:");
        fname.setFont(new Font("Raleway",Font.BOLD,20));
        fname.setBounds(100,190,200,30);
        add(fname);
         
        String valCategory[]={"General","OBC","SC","ST","Other"};
         category=new JComboBox(valCategory);
        category.setFont(new Font("Raleway",Font.BOLD,14));
        category.setBounds(300,190,400,30);
        category.setBackground(Color.white);
        add(category);
         
        JLabel dob=new JLabel("Income:");
        dob.setFont(new Font("Raleway",Font.BOLD,20));
        dob.setBounds(100,240,200,30);
        add(dob); 
        
        String incomeCategory[]={"Null","<1,50,000","<2,50,000","<5,00,000","Upto 10,00,000"};
         income=new JComboBox(incomeCategory);
        income.setFont(new Font("Raleway",Font.BOLD,14));
        income.setBounds(300,240,400,30);
        income.setBackground(Color.white);
        add(income);
         
         
        JLabel gender=new JLabel("Educaional");
        gender.setFont(new Font("Raleway",Font.BOLD,20));
        gender.setBounds(100,290,200,30);
        add(gender);
       
        JLabel email=new JLabel("Qualification:");
        email.setFont(new Font("Raleway",Font.BOLD,20));
        email.setBounds(100,315,200,30);
        add(email);
        
        String educationValues[]={"Non Graduate","Graduate","Post Graduate","Doctrate","Other"};
        education=new JComboBox(educationValues);
        education.setFont(new Font("Raleway",Font.BOLD,14));
        education.setBounds(300,315,400,30);
        education.setBackground(Color.white);
        add(education);
         
        JLabel marital=new JLabel("Occupation:");
        marital.setFont(new Font("Raleway",Font.BOLD,20));
        marital.setBounds(100,390,200,30);
        add(marital);
         
        String occupationValues[]={"Salaried","Self-Employed","Bussiness","Retired","Other"};
         occupation=new JComboBox(occupationValues);
        occupation.setBounds(300,390,400,30);
        occupation.setFont(new Font("Raleway",Font.BOLD,14));
        occupation.setBackground(Color.white);
        add(occupation);
         
        JLabel address=new JLabel("PAN Number:");
        address.setFont(new Font("Raleway",Font.BOLD,20));
        address.setBounds(100,440,200,30);
        add(address);
         
        pan=new JTextField();
        pan.setFont(new Font("Raleway",Font.BOLD,14));
        pan.setBounds(300,440,400,30);
        add(pan);
         
        JLabel city=new JLabel("AADHAR Number:");
        city.setFont(new Font("Raleway",Font.BOLD,20));
        city.setBounds(100,490,200,30);
        add(city);
         
        aadhar=new JTextField();
        aadhar.setFont(new Font("Raleway",Font.BOLD,14));
        aadhar.setBounds(300,490,400,30);
        add(aadhar);
         
       
        JLabel state=new JLabel("Senior Citizen:");
        state.setFont(new Font("Raleway",Font.BOLD,20));
        state.setBounds(100,540,200,30);
        add(state);
         
        syes=new JRadioButton("Yes");
        syes.setFont(new Font("Raleway",Font.BOLD,15));
        syes.setBounds(350,540,100,30);
        add(syes);
        
        sno=new JRadioButton("No");
        sno.setFont(new Font("Raleway",Font.BOLD,15));
        sno.setBounds(450,540,100,30);
        add(sno);
         
        ButtonGroup scitizen = new ButtonGroup();
        scitizen.add(syes);
        scitizen.add(sno);

        
        JLabel pincode=new JLabel("Existing Account:");
        pincode.setFont(new Font("Raleway",Font.BOLD,20));
        pincode.setBounds(100,590,200,30);
        add(pincode);
         
        eyes=new JRadioButton("Yes");
        eyes.setFont(new Font("Raleway",Font.BOLD,15));
        eyes.setBounds(350,590,100,30);
        add(eyes);
        
        eno=new JRadioButton("No");
        eno.setFont(new Font("Raleway",Font.BOLD,15));
        eno.setBounds(450,590,100,30);
        add(eno);
         
        ButtonGroup exists=new ButtonGroup();
        exists.add(eyes);
        exists.add(eno);
         
        next=new JButton("Next");
        next.setFont(new Font("Raleway",Font.BOLD,14));
        next.setBackground(Color.BLACK);
        next.setForeground(Color.WHITE);
        next.setBounds(620,660,80,30);
        next.addActionListener(this);
        add(next);
         

        getContentPane().setBackground(Color.WHITE);

        setSize(850, 800);
        setLocation(350, 10);
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae){
      
        String sreligion=(String)religion.getSelectedItem();
        String scategory=(String)category.getSelectedItem();
        String sincome=(String)income.getSelectedItem();
        String seducation=(String) education.getSelectedItem();
        String soccupation=(String) occupation.getSelectedItem();
        String seniorCitizen=null;
        if(syes.isSelected()){
            seniorCitizen="Yes";
        }else if(sno.isSelected()){
            seniorCitizen="No";
        }
        String existingAccount=null;
        if(eyes.isSelected()){
            existingAccount="Yes";
        }else if(eno.isSelected()){
            existingAccount="No";
        }
        String span=pan.getText();
        String saadhar=aadhar.getText();
       

        try{
     
            Conn c=new Conn();//thats why i have not created main class for dis
            String query="insert into signuptwo values('"+formno+"','"+sreligion+"','"+scategory+"','"+sincome+"','"+seducation+"','"+soccupation+"','"+span+"','"+saadhar+"','"+existingAccount +"','"+seniorCitizen+"')";
                c.s.executeUpdate(query);
                
                //signup three object
                setVisible(false);
                new SignupThree(formno).setVisible(true);
                
        }catch (Exception e){
            System.out.println(e);
        }
           
        
    }

    public static void main(String args[]) {
        new SignupTwo("");
    }
}
