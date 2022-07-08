package hotel.management.system;

import javax.swing.*;
import java.awt.*;
import java.sql.*;
import java.util.Date;
import java.awt.event.*;

public class Checkout extends JFrame implements ActionListener {
    Choice ccustomer;
    JLabel lblroomnumber, lblcheckintime, lblcheckouttime;
    JButton checkout, back;
    Checkout() {
        
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
        JLabel text = new JLabel("Checkout");
        text.setBounds(100, 20, 100, 30);
        text.setForeground(Color.BLUE);
        text.setFont(new Font("Tahoma", Font.BOLD, 20));
        add(text);
        
        JLabel lblid = new JLabel("Customer Id");
        lblid.setBounds(30, 80, 100, 30);
        add(lblid);
        
        ccustomer = new Choice();
        ccustomer.setBounds(150, 80,150, 25);
        add(ccustomer);
        
        
        ImageIcon i1  = new ImageIcon(ClassLoader.getSystemResource("icons/tick.png"));
                Image i2 = i1.getImage().getScaledInstance(20, 20,Image.SCALE_DEFAULT);
                ImageIcon i3 = new ImageIcon(i2);
                JLabel tick = new JLabel(i3);
                tick.setBounds(310, 80, 20, 20);
                add(tick);
        
        JLabel lblroom = new JLabel("Room No");
        lblroom.setBounds(30, 130, 100, 30);
        add(lblroom);
        
        lblroomnumber = new JLabel();
        lblroomnumber.setBounds(150, 130, 100, 30);
        add(lblroomnumber);
                
        JLabel lblcheckin = new JLabel("Checkin Time");
        lblcheckin.setBounds(30, 180, 100, 30);
        add(lblcheckin);
        
        lblcheckintime = new JLabel();
        lblcheckintime.setBounds(150, 180, 100, 30);
        add(lblcheckintime);
        
        JLabel lblcheckout = new JLabel("Checkout Time");
        lblcheckout.setBounds(30, 230, 100, 30);
        add(lblcheckout);
        
        Date date = new Date();
        lblcheckouttime = new JLabel("" + date);
        lblcheckouttime.setBounds(150, 230, 180, 30);
        add(lblcheckouttime);
        
        checkout = new JButton("Checkout");
        checkout.setBackground(Color.red);
        checkout.setForeground(Color.BLACK);
        checkout.addActionListener(this);
        checkout.setBounds(30, 280, 120, 30);
        add(checkout);
        
        back = new JButton("Back");
        back.setBackground(Color.WHITE);
        back.setForeground(Color.BLACK);
        back.addActionListener(this);
        back.setBounds(170, 280, 120, 30);
        add(back);
        
        try {
            Conn c = new Conn();
            ResultSet rs = c.s.executeQuery("select * from customer");
            while(rs.next()){
                ccustomer.add(rs.getString("number"));
                lblroomnumber.setText(rs.getString("room"));
                lblcheckintime.setText(rs.getString("checkintime"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        
                ImageIcon i4  = new ImageIcon(ClassLoader.getSystemResource("icons/sixth.jpg"));
                Image i5 = i4.getImage().getScaledInstance(400, 250,Image.SCALE_DEFAULT);
                ImageIcon i6 = new ImageIcon(i5);
                JLabel image = new JLabel(i6);
                image.setBounds(350, 50, 400, 250);
                add(image);
        
        setBounds(300, 200, 800, 400);
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource() == checkout) {
            String query1 = "delete from customer where number = '"+ccustomer.getSelectedItem()+"'";
            String query2 = "update room set availability = 'Available' where room = '"+lblroomnumber.getText()+"'";
            
            try {
                Conn c = new Conn();
                c.s.executeUpdate(query1);
                c.s.executeUpdate(query2);
                
                JOptionPane.showMessageDialog(null, "Checkout Done");
                
                setVisible(false);
                new Reception();
            
            }catch(Exception e){
               e.printStackTrace();
            }
            
        }else {
            setVisible(false);
            new Reception();
        }
    }
    
    
    public static void main(String a[]){
        new Checkout();
    }
}
