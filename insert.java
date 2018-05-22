package oop_project;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
//import com.toedter.calendar.JDateChooser;
public class insert implements ActionListener
{
    JFrame mainframe = new JFrame();  //frame1 for customer details
    JTextField txttime1,txttime2,txtdate,txtcourse;   
    JComboBox branch,sem,subject;
    JButton btnsubmit,btnBack;
    JLabel date;
    //JDateChooser datechooser;
    Resources r = new Resources();
    
    public void edit_gui()
    {
        mainframe.setLayout(new GridLayout());
        mainframe.setSize(900,500);
        mainframe.setTitle("EDIT");
        mainframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	
	mainframe.setLocationRelativeTo(null);
        mainframe.setBackground(Color.BLACK);        

        //panel1 
        JPanel panel1 = new JPanel();
        panel1.setLayout(new GridLayout(6,2));
        panel1.setBackground(Color.LIGHT_GRAY);
        
        JLabel lblbranch = new JLabel("Branch");
        JLabel lblsem = new JLabel("Semester");
        JLabel lblsubject = new JLabel("Subject");
        JLabel lblName = new JLabel("User Name");
        JLabel blank = new JLabel("");
        //datechooser = new JDateChooser();
        date = new JLabel("Date");
        branch = new JComboBox();
        branch.addItem("ICT");
        branch.addItem("Mechanical");
        branch.addItem("Chemical");
        
        sem = new JComboBox();
        sem.addItem("2");
        sem.addItem("3");
        sem.addItem("4");
        sem.addItem("5");
       
        subject = new JComboBox();
        subject.addItem("EMT");
        subject.addItem("DM");
        subject.addItem("DD");
        subject.addItem("OOP");
        subject.addItem("ES");
        
        
        
        JLabel a1 = new JLabel("");
        lblbranch.setForeground(Color.BLACK);
        lblsem.setForeground(Color.BLACK);
        lblsubject.setForeground(Color.BLACK);
       
        panel1.add(lblName,BorderLayout.EAST);
        panel1.add(blank);
        panel1.add(lblbranch);
        panel1.add(branch);
        panel1.add(lblsem);
        panel1.add(sem);
        panel1.add(lblsubject);
        panel1.add(subject);
        panel1.add(date);
        //panel1.add(datechooser);
       date.setVisible(false);
       //datechooser.setVisible(false);
       
        //panel button
        JPanel panel2 = new JPanel();
        panel2.setBackground(Color.LIGHT_GRAY);
        
        btnsubmit = new JButton("SUBMIT");
        btnBack = new JButton("Back to previous frame");
        
        panel2.add(btnsubmit);
        panel2.add(btnBack);
        
        mainframe.add(panel1);
        panel1.add(panel2,BorderLayout.CENTER);
        btnsubmit.addActionListener(this);
        btnBack.addActionListener(this);
        mainframe.setVisible(true);        
    }
   //public static void main(String args[])
   // {
   //     edit e = new edit();
   //     e.edit_gui();
  //  }
    @Override
    public void actionPerformed(ActionEvent e) 
    {
         if(btnsubmit.getText().equals(e.getActionCommand()))
            {
             mainframe.setVisible(false);
                r.Resources_gui();
                r.frame1.setVisible(true);
            }
         else if(btnBack.getText().equals(e.getActionCommand()))
         {
            
              mainframe.setVisible(false);
             main_window_gui m = new main_window_gui();
              m.main_gui();
              m.mainframe.setVisible(true);
             
            
         }
    }
}