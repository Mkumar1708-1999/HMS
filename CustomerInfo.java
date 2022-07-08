package hotel.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import net.proteanit.sql.*;

public class CustomerInfo extends JFrame implements ActionListener {
    JTable table;
    JButton back;
    
    CustomerInfo(){
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
        JLabel l1 = new JLabel("Document");
        l1.setBounds(05, 10, 100, 20);
        add(l1);
        
        JLabel l2 = new JLabel("Aadhar");
        l2.setBounds(190, 10, 100, 20);
        add(l2);
        
        JLabel l3 = new JLabel("Name");
        l3.setBounds(360, 10, 100, 20);
        add(l3);
        
        JLabel l4 = new JLabel("Gender");
        l4.setBounds(520, 10, 100, 20);
        add(l4);
        
        JLabel l5 = new JLabel("Country");
        l5.setBounds(690, 10, 100, 20);
        add(l5);
        
        JLabel l6 = new JLabel("Room");
        l6.setBounds(870, 10, 100, 20);
        add(l6);
        
        JLabel l7 = new JLabel("Checkintime");
        l7.setBounds(1100, 10, 100, 20);
        add(l7);
        
        JLabel l8 = new JLabel("Deposit");
        l8.setBounds(1210, 10, 100, 20);
        add(l8);
        
        table = new JTable();
        table.setBounds(0, 40, 1400, 400);
        add(table);
        
        try {
            Conn c = new Conn();
            ResultSet rs = c.s.executeQuery("select * from customer");
            table.setModel(DbUtils.resultSetToTableModel(rs));
            
        }catch (Exception e) {
            e.printStackTrace();
        }
        
        back = new JButton("Back");
        back.setBackground(Color.WHITE);
        back.setForeground(Color.BLACK);
        back.setBounds(700, 500, 120, 30);
        back.addActionListener(this);
        add(back);
        
         setBounds(300, 300, 1400, 600);
        setVisible(true);
        
    }
    
     public void actionPerformed(ActionEvent ae){
        setVisible(false);
        new Reception();
    }
    
    public static void main(String[] args){
        new CustomerInfo();
            
        
    }
}
