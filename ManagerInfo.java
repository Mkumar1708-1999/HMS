package hotel.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import net.proteanit.sql.*;

public class ManagerInfo extends JFrame implements ActionListener {
    JTable table;
    JButton back;
    
    ManagerInfo(){
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
        JLabel l1 = new JLabel("Name");
        l1.setBounds(05, 10, 100, 20);
        add(l1);
        
        JLabel l2 = new JLabel("Age");
        l2.setBounds(170, 10, 100, 20);
        add(l2);
        
        JLabel l3 = new JLabel("Gender");
        l3.setBounds(340, 10, 100, 20);
        add(l3);
        
        JLabel l4 = new JLabel("Job");
        l4.setBounds(530, 10, 100, 20);
        add(l4);
        
        JLabel l5 = new JLabel("Salary");
        l5.setBounds(700, 10, 100, 20);
        add(l5);
        
        JLabel l6 = new JLabel("Phone");
        l6.setBounds(900, 10, 100, 20);
        add(l6);
        
        JLabel l7 = new JLabel("E-Mail");
        l7.setBounds(1100, 10, 100, 20);
        add(l7);
        
        JLabel l8 = new JLabel("AAdhar");
        l8.setBounds(1250, 10, 100, 20);
        add(l8);
        
        table = new JTable();
        table.setBounds(0, 40, 1400, 400);
        add(table);
        
        try {
            Conn c = new Conn();
            ResultSet rs = c.s.executeQuery("select * from employee where job = 'Manager'");
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
        new ManagerInfo();
            
        
    }
}
