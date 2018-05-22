/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
 
package oop_project;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Request implements ActionListener  {
JFrame frameR = new JFrame("REQUEST");
JButton btnSend,btnBack;
Days d =new Days();
    public  void Request_gui() {

		
		frameR.setLayout(new GridLayout(2,2));
		frameR.setSize(800, 500);
                frameR.setBackground(Color.LIGHT_GRAY);
		frameR.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frameR.setLocationRelativeTo(null);

		//Panel...
		JPanel panelrequest = new JPanel();
		panelrequest.setLayout(new GridLayout(8,2));
		//panel.setSize(500, 300);
		panelrequest.setBackground(Color.LIGHT_GRAY);
		
		
		//Controls...
		JLabel username = new JLabel("User Name->");
                JLabel Branch=new JLabel("Branch->");
                JLabel Sem=new JLabel("Semister->");
                JLabel Sub=new JLabel("Subject->");
                JLabel Room=new JLabel("Room no->");
                JLabel Day =new JLabel("Day->");
                JLabel Time=new JLabel("Time->");
                    
                  JLabel l1=new JLabel();
                  JLabel l2=new JLabel();
	          JLabel l3=new JLabel();
                  JLabel l4=new JLabel();
                  JLabel l5=new JLabel();
                  JLabel l6=new JLabel();
                  JLabel l7=new JLabel();
		btnSend = new JButton("SEND"); 
		btnSend.setSize(10, 20);
                btnBack = new JButton("Back to Previous");
           panelrequest.add(username);
           panelrequest.add(l1);
           panelrequest.add(Branch);
           panelrequest.add(l2);
           panelrequest.add(Sem);
           panelrequest.add(l3);
           panelrequest.add(Sub);
           panelrequest.add(l4);
           panelrequest.add(Room);
           panelrequest.add(l5);
           panelrequest.add(Day);
           panelrequest.add(l6);
           panelrequest.add(Time);
           panelrequest.add(l7);
           panelrequest.add(btnSend);
           panelrequest.add(btnBack);
               
		frameR.setVisible(true);
		frameR.add(panelrequest);
		btnSend.addActionListener(this);
                btnBack.addActionListener(this);
              
		
	}


    @Override
    public void actionPerformed(ActionEvent e) {
              if(btnSend.getText().equals(e.getActionCommand()))
               {    
                   frameR.setVisible(false);
                   JOptionPane.showMessageDialog(frameR,"The request is sent successfully.");
                    
                   
               }
              else if(btnBack.getText().equals(e.getActionCommand()))
              {
                  frameR.setVisible(false);
                  d.Days_gui();
                  d.frameday.setVisible(true);
              }
    }

}
