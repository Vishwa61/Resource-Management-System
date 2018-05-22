package oop_project;

import dbconnection.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Oop_project extends Exception implements ActionListener
{
    JFrame mainframe = new JFrame();  //frame1 for customer details
    JTextField txtname,txtpassword;
    JButton btnlogin;  
    main_window_gui main = new main_window_gui();
    login_connection conn= new login_connection();

    public void Oop_project_gui()
    {
         
        mainframe.setLayout(new GridLayout(0,1));
	mainframe.setSize(400,300);
        mainframe.setTitle("RESOURCE");
        mainframe.setBackground(Color.LIGHT_GRAY);
        mainframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	
	mainframe.setLocationRelativeTo(null);
        
        //title
        JPanel panel1 = new JPanel();
	panel1.setLayout(new FlowLayout(FlowLayout.CENTER));
	panel1.setBackground(Color.LIGHT_GRAY);
        
        //Controls
        JLabel lbltitle = new JLabel("IET RESOURCES");
        lbltitle.setFont(new Font("Courier New",Font.BOLD,30));
        lbltitle.setForeground(Color.BLACK);
        
        panel1.add(lbltitle,BorderLayout.CENTER);
        
        //panel2 username and password
        
        JPanel panel2 = new JPanel();
        panel2.setLayout(new GridLayout(3,2));
        panel2.setBackground(Color.LIGHT_GRAY);
        panel2.setSize(150,150);
        
        JLabel lblname = new JLabel("Username");
        lblname.setFont(new Font("Courier New",Font.BOLD,20));
        JLabel lblpassword = new JLabel("Password");
        lblpassword.setFont(new Font("Courier New",Font.BOLD,20));
        txtname = new JTextField(10);
        txtpassword = new JTextField(10);
        lblname.setForeground(Color.BLACK);
        lblpassword.setForeground(Color.BLACK);
        
        panel2.add(lblname);
        panel2.add(txtname);
        panel2.add(lblpassword);
        panel2.add(txtpassword);

        //panel3 button
          
        JPanel panel3 = new JPanel();
        panel3.setBackground(Color.LIGHT_GRAY);
        // panel3.setSize(50,50); 
        btnlogin = new JButton("Login");
        btnlogin.setBackground(Color.WHITE);
        panel3.add(btnlogin);
         
        mainframe.add(panel1,BorderLayout.CENTER);
        mainframe.add(panel2,BorderLayout.CENTER);
        mainframe.add(panel3,BorderLayout.CENTER);
        mainframe.setVisible(true);
        btnlogin.addActionListener(this);
        
               
    }
    public static void main(String[] args)
    {
        Oop_project obj = new Oop_project();
        obj.Oop_project_gui();
    }

    @Override
    public void actionPerformed(ActionEvent e) 
    {
        if(btnlogin.getText().equals(e.getActionCommand()))
        {
           // if(conn.log_check(txtname.getText(),txtpassword.getText()))
          //  {
                main.namemenu = new JMenu(conn.name);
                mainframe.setVisible(false);
                main.main_gui();
               // conn.fetch_data(main.t,main.I,main.M,main.C);
                main.mainframe.setVisible(true);
           // }
           // else
            //{
                try
                {
                    throw new MyException("Invalid User id or Password");
                }
                catch(MyException w)
                {
                    
                }
           // }
        }
        else if(main.logoutitem.getText().equals(e.getActionCommand()))
            {
                    Oop_project obj = new Oop_project();

                   main.mainframe.setVisible(false);
                   obj.Oop_project_gui();
                   mainframe.setVisible(true);
         
            }
 
    }
}
