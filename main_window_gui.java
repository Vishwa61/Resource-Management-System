/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop_project;

import dbconnection.login_connection;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class main_window_gui implements ActionListener
{
    JFrame mainframe = new JFrame("main");
    JMenuBar menu = new JMenuBar();
    JMenu namemenu;
    JMenuItem roomitem,equipitem,insertitem,updateitem,deleteitem,logoutitem;
    insert edit = new insert();
    Resources R1 =new Resources();
    public JLabel[] t,I,M,C;
    public void main_gui()
    {
        mainframe.setSize(1500,725);
        mainframe.setLayout(new BorderLayout());
        mainframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	
	mainframe.setLocationRelativeTo(null);

        JLabel statuslabel = new JLabel();        
        statuslabel.setAlignmentX(JLabel.CENTER);
        statuslabel.setBackground(Color.GRAY);
        
        JPanel controlpanel = new JPanel();
        controlpanel.setLayout(new GridLayout());

        JPanel ttpanel = new JPanel();
        ttpanel.setLayout(new GridLayout(10,10));
        ttpanel.setBackground(Color.LIGHT_GRAY);
        
        JPanel time = new JPanel();
        time.setLayout(new GridLayout(11,4));
        time.setBackground(Color.GRAY);
          javax.swing.border.Border red = BorderFactory.createLineBorder(Color.BLACK);
        time.setBorder(BorderFactory.createTitledBorder(red, "TIME TABLE"));
        t=new JLabel[10];
        t[0]=new JLabel("TIME");
        t[1]=new JLabel("8:30-9:30");
        t[2]=new JLabel("9:30-10:30");
        t[3]=new JLabel("10:30-11:00");
        t[4]=new JLabel("11:00-12:00");
        t[5]=new JLabel("12:00-01:00");
        t[6]=new JLabel("01:00-02:00");
        t[7]=new JLabel("02:00-03:00");
        t[8]=new JLabel("03:00-04:00");
        t[9]=new JLabel("04:00-05:00");
           
        I=new JLabel[10];
        I[0]=new JLabel("ICT SEM 2");
        for(int i=1;i<10;i++)
        {
            I[i] = new JLabel("--");
        }    
        M=new JLabel[10];
        M[0]=new JLabel("MECH SEM 2");
        for(int i=1;i<10;i++)
        {
            M[i] = new JLabel("--");
        }
        C=new JLabel[10];
        C[0]=new JLabel("CHEM SEM 2");
        for(int i=1;i<10;i++)
        {
            C[i] = new JLabel("--");
        }
        JMenu editmenu = new JMenu("Edit");
        JMenu sourcemenu = new JMenu("Resources");
        JMenu schedulemenu = new JMenu("Schedule");
        namemenu = new JMenu("LOGOUT");
        roomitem = new JMenuItem("Classroom");
        equipitem = new JMenuItem("Equipments");
        logoutitem = new JMenuItem("Log Out");
        insertitem = new JMenuItem("Insert");
        updateitem = new JMenuItem("Update");
        deleteitem = new JMenuItem("Delete");
   
        for(int i=0;i<=9;i++)
        {
            time.add(t[i]);
            time.add(I[i]);
            time.add(M[i]);
            time.add(C[i]);
        }
      
        sourcemenu.add(roomitem);
        sourcemenu.add(equipitem);
        editmenu.add(insertitem);
        editmenu.add(updateitem);
        editmenu.add(deleteitem);
        namemenu.add(logoutitem);
        menu.add(editmenu);
        menu.add(sourcemenu);
        menu.add(schedulemenu);
        menu.add(namemenu);
        
        controlpanel.add(menu);
        mainframe.add(new JLabel("abc"));
        mainframe.add(controlpanel,BorderLayout.NORTH);
        mainframe.add(ttpanel,BorderLayout.CENTER);
        mainframe.add(statuslabel,BorderLayout.SOUTH);
        mainframe.add(time);
        mainframe.setVisible(true); 

        insertitem.addActionListener(this);
        updateitem.addActionListener(this);
        deleteitem.addActionListener(this);
        roomitem.addActionListener(this); 
        logoutitem.addActionListener(this);
        
    }
    /*public static void main(String []args)
    {
        main_window_gui obj =new main_window_gui();
        obj.main_gui();
    }*/

    @Override
    public void actionPerformed(ActionEvent e)
    {
        if(insertitem.getText().equals(e.getActionCommand()))
        {
           // mainframe.setVisible(false);
            edit.edit_gui();
            edit.mainframe.setVisible(true);
        }
        else if(updateitem.getText().equals(e.getActionCommand()))
        {
            //mainframe.setVisible(false);
            edit.edit_gui();
            edit.mainframe.setTitle("UPDATE");
            edit.date.setVisible(true);
            //edit.datechooser.setVisible(true);
            edit.mainframe.setVisible(true);
        }
        else if(roomitem.getText().equals(e.getActionCommand()))
        {
           // mainframe.setVisible(false);
            R1.Resources_gui();
            R1.frame1.setVisible(true);
        }
            else if(logoutitem.getText().equals(e.getActionCommand()))
        {  
            mainframe.setVisible(false);
            Oop_project L=new Oop_project();
           L.Oop_project_gui();
           L.mainframe.setVisible(true);
        }
   }
  
}
