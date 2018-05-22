package oop_project;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Days implements ActionListener
{
    JFrame frameday = new JFrame("days");
       JButton btnBack,btnsubmit;
       
    public void Days_gui() 
        {
            
            frameday.setLayout(new GridLayout(3,1));
            frameday.setSize(900,500);
            frameday.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frameday.setLocationRelativeTo(null);

            //Panel1
            JPanel panelday = new JPanel();
            panelday.setLayout(new GridLayout(2,2));
            panelday.setSize(200, 100);
            panelday.setBackground(Color.GRAY);
      
            JPanel paneltime = new JPanel();
            paneltime.setLayout(new FlowLayout());
            paneltime.setSize(300, 300);
            paneltime.setBackground(Color.GRAY);
            
            JPanel panelt1 = new JPanel();
            panelt1.setLayout(new GridLayout(6,1));
            panelt1.setBackground(Color.GRAY);
            
            JPanel panelt2 = new JPanel();
            panelt2.setLayout(new GridLayout(2,1));
            panelt2.setBackground(Color.GRAY);
            
            JPanel paneldes = new JPanel();
            paneldes.setBackground(Color.GRAY);
            
            JPanel panelt3 = new JPanel();
            panelt3.setLayout(new FlowLayout());
            panelt3.setBackground(Color.GRAY);
            
           JComboBox day = new JComboBox();
           day.addItem("Monday");
           day.addItem("Tuesday");
           day.addItem("Wednesday");
           day.addItem("Thursday");
           day.addItem("Friday");
           
           
                //monday  
                JLabel D = new JLabel("DAY");
                JLabel T = new JLabel("Desired Time");
                JTextField F=new JTextField(10);
                JLabel T0 = new JLabel(" TO");
                JTextField F1=new JTextField(10);
                JButton T1 = new JButton("9:30-10:30");
                JButton T2 = new JButton("11:00-12:00");
                JButton T3  = new JButton("12:00-1:00");
                JButton T4 = new JButton("2:00-3:00");
                JButton T5= new JButton("3:00-4:00");
                JButton T6  = new JButton("4:00-5:00"); 
                JButton T7 = new JButton("10:00-1:00");
                JButton T8 = new JButton("2:00-5:00");
              btnsubmit = new JButton("Submit");
                btnBack = new JButton("Back to previous frame");
               
                panelday.add(D);
                panelday.add(day);
                panelday.add(T);
                paneldes.add(F);
                paneldes.add(T0);
                paneldes.add(F1);
                panelday.add(paneldes);
                panelt1.add(T1);
                panelt1.add(T2);               
                panelt1.add(T3);              
                panelt1.add(T4);               
                panelt1.add(T5);                 
                panelt1.add(T6);                
                panelt2.add(T7);              
                panelt2.add(T8);
                panelt3.add(btnsubmit);
                panelt3.add(btnBack);
                paneltime.add(panelt1);
                paneltime.add(panelt2);
               // paneltime.add(panelt3);
                frameday.add(panelday);
                frameday.add(paneltime);
                frameday.add(panelt3);
                frameday.setVisible(true); 
                btnBack.addActionListener(this);
                btnsubmit.addActionListener(this);
      }
      public static void main(String args[])
      {
          Days d = new Days();
          d.Days_gui();
      }
    public void actionPerformed(ActionEvent e) 
    {  
          if(btnBack.getText().equals(e.getActionCommand()))
         {
             frameday.setVisible(false);
             
              Resources R1 =new Resources();
              R1.Resources_gui();
              R1.frame1.setVisible(true);
             
            
         }
         if(btnsubmit.getText().equals(e.getActionCommand()))
         { 
         
           frameday.setVisible(false);
           Request R=new Request();
           R.Request_gui();
           R.frameR.setVisible(true);
         }
    }
}
