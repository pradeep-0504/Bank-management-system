
package bank.management.system;

import javax.swing.*;

import java.awt.*;

import java.awt.event.*;

import java.sql.*;

public class Login extends JFrame implements ActionListener{
    
    JButton SIGNUP,login,clear;
    
    JTextField cardTextField;
    JPasswordField pinTextField;
    
    Login(){
        setTitle("AUTOMATED TELLER MACHINE");
        
        setLayout(null);//even we keep setBounds there,the default layout will be there,so keep it null manually
        
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/logo.jpg"));
        Image i2=i1.getImage().getScaledInstance(100,100,Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel label=new JLabel(i3);
        label.setBounds(50,10, 100,100);//defaultly after adding img to frame through label,it will be in center so ,we use bounds
        add(label);
        
        JLabel text=new JLabel("Welcome to ATM");//the major use of the jlabel is to write content on frame
        text.setFont(new Font("Osward", Font.BOLD,38));
        text.setBounds(200,40,400,40);
        add(text);
        
        JLabel cardno=new JLabel("Card No:");
        cardno.setFont(new Font("Raleway", Font.BOLD,28));
        cardno.setBounds(120,150,150,30);
        add(cardno);
        
        cardTextField=new JTextField();
        cardTextField.setBounds(300,150,250,30);
        cardTextField.setFont(new Font("Arial",Font.BOLD,15));
        add(cardTextField);
        
        JLabel pin=new JLabel("PIN:");
        pin.setFont(new Font("Raleway", Font.BOLD,28));
        pin.setBounds(120,220,150,30);
        add(pin);
        
        pinTextField=new JPasswordField();
        pinTextField.setBounds(300,220,250,30);
        pinTextField.setFont(new Font("Arial",Font.BOLD,15));
        add(pinTextField);
        
        login=new JButton("SIGN IN");
        login.setBounds(300,300,100,30);
        login.setBackground(Color.BLACK);
        login.setForeground(Color.WHITE);
        login.addActionListener(this);
        add(login);
        
        clear=new JButton("CLEAR");
        clear.setBounds(430,300,100,30);
        clear.setBackground(Color.BLACK);
        clear.setForeground(Color.WHITE);
        clear.addActionListener(this);
        add(clear);
        
        SIGNUP=new JButton("SIGN UP");
        SIGNUP.setBounds(300,350,230,30);
        SIGNUP.setBackground(Color.BLACK);
        SIGNUP.setForeground(Color.WHITE);
        SIGNUP.addActionListener(this);
        add(SIGNUP);
        
        getContentPane().setBackground(Color.WHITE);//to set bgcolor of frame
        
        setSize(800,480);
        setVisible(true);//to see it..defaultli it is false
        setLocation(350,200);
    }
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==clear){
            cardTextField.setText("");
            pinTextField.setText("");
        }else if(ae.getSource()==login){
            
            Conn conn=new Conn();
            String cardnumber=cardTextField.getText();
            String pinnumber=pinTextField.getText();
            String query="select * from login where cardnumber= '"+cardnumber+"' and pin='"+pinnumber+"'";
            try{
                ResultSet rs=conn.s.executeQuery(query);
                if(rs.next()){
                    setVisible(false);
                    new Transactions(pinnumber).setVisible(true);
                }else{
                    JOptionPane.showMessageDialog(null,"Incorrect Card Number or Pin");
                }
            }catch(Exception e){
                System.out.println(e);
            }
        }
        
        else if(ae.getSource()==SIGNUP){
            setVisible(false);
            new SignupOne().setVisible(true);
        }
    }
        
      
    public static void main(String args[]) {
        new Login();
    }
}
