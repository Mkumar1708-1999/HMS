package hotel.management.system;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Reception extends JFrame implements ActionListener {
    JButton newCustomer, rooms, Departmant, allEmployee, managerInfo, customers, searchRoom, update, roomStatus, pickup, checkOut, logout;
    
    Reception() {
        
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
        newCustomer = new JButton("New Customer Form");
        newCustomer.setBounds(10, 30, 200, 30);
        newCustomer.setBackground(Color.WHITE);
        newCustomer.setForeground(Color.BLACK);
        newCustomer.addActionListener(this);
        add(newCustomer);
        
        rooms = new JButton("Rooms");
        rooms.setBounds(10, 70, 200, 30);
        rooms.setBackground(Color.WHITE);
        rooms.setForeground(Color.BLACK);
        rooms.addActionListener(this);
        add(rooms);
        
        Departmant = new JButton("Department");
        Departmant.setBounds(10, 110, 200, 30);
        Departmant.setBackground(Color.WHITE);
        Departmant.setForeground(Color.BLACK);
        Departmant.addActionListener(this);
        add(Departmant);
        
        allEmployee = new JButton("All Employees");
        allEmployee.setBounds(10, 150, 200, 30);
        allEmployee.setBackground(Color.WHITE);
        allEmployee.setForeground(Color.BLACK);
        allEmployee.addActionListener(this);
        add(allEmployee);
        
        customers = new JButton("Customer Info");
        customers.setBounds(10, 190, 200, 30);
        customers.setBackground(Color.WHITE);
        customers.setForeground(Color.BLACK);
        customers.addActionListener(this);
        add(customers);
        
        managerInfo = new JButton("Manager Info");
        managerInfo.setBounds(10, 230, 200, 30);
        managerInfo.setBackground(Color.WHITE);
        managerInfo.setForeground(Color.BLACK);
        managerInfo.addActionListener(this);
        add(managerInfo);
        
        checkOut = new JButton("Checkout");
        checkOut.setBounds(10, 270, 200, 30);
        checkOut.setBackground(Color.WHITE);
        checkOut.setForeground(Color.BLACK);
        checkOut.addActionListener(this);
        add(checkOut);
        
        update = new JButton("Update Status");
        update.setBounds(10, 310, 200, 30);
        update.setBackground(Color.WHITE);
        update.setForeground(Color.BLACK);
        update.addActionListener(this);
        add(update);
        
        roomStatus = new JButton("Update Room Status");
        roomStatus.setBounds(10, 350, 200, 30);
        roomStatus.setBackground(Color.WHITE);
        roomStatus.setForeground(Color.BLACK);
        roomStatus.addActionListener(this);
        add(roomStatus);
        
        pickup = new JButton("Pickup Service");
        pickup.setBounds(10, 390, 200, 30);
        pickup.setBackground(Color.WHITE);
        pickup.setForeground(Color.BLACK);
        pickup.addActionListener(this);
        add(pickup);
        
        searchRoom = new JButton("Search Rooms");
        searchRoom.setBounds(10, 430, 200, 30);
        searchRoom.setBackground(Color.WHITE);
        searchRoom.setForeground(Color.BLACK);
        searchRoom.addActionListener(this);
        add(searchRoom);
        
        logout = new JButton("Logout");
        logout.setBounds(10, 470, 200, 30);
        logout.setBackground(Color.WHITE);
        logout.setForeground(Color.BLACK);
        logout.addActionListener(this);
        add(logout);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/fourth.jpg"));
        JLabel image = new JLabel(i1);
        image.setBounds(250, 30, 500, 470);
        add(image);
        
        setBounds(350, 200, 800, 570);
        setVisible(true);
        
        
    }
    
    public void actionPerformed(ActionEvent ae) {
        if(ae.getSource() == newCustomer) {
            setVisible(false);
            new AddCustomer();
        }else if(ae.getSource() == rooms){
            setVisible(false);
            new Room();
        }else if(ae.getSource() == Departmant){
            setVisible(false);
            new Department();
        }else if(ae.getSource() == allEmployee){
            setVisible(false);
            new EmployeeInfo();
        }else if(ae.getSource() == managerInfo){
            setVisible(false);
            new ManagerInfo();
        }else if(ae.getSource() == customers){
            setVisible(false);
            new CustomerInfo();
        }else if(ae.getSource() == searchRoom){
            setVisible(false);
            new SearchRoom();
        }else if(ae.getSource() == update){
            setVisible(false);
            new UpdateCheck();
        }else if(ae.getSource() == roomStatus){
            setVisible(false);
            new UpdateRoom();
        }else if(ae.getSource() == pickup){
            setVisible(false);
            new Pickup();
        }else if(ae.getSource() == checkOut){
            setVisible(false);
            new Checkout();
        }else if(ae.getSource() == logout){
            setVisible(false);
            System.exit(0);
        }
        
    }
    
    public static void main(String[] args){
        new Reception();
    }
}
