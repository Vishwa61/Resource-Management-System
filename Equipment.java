 
package oop_project;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Equipment implements ActionListener  {
JFrame frame1 = new JFrame();
JButton btnSubmit,btnDefault;
    public  void Equipment_gui() {

		
		frame1.setLayout(new GridLayout(2,2));
		frame1.setSize(900, 500);
                frame1.setTitle("EQUIPMENTS");
                frame1.setBackground(Color.LIGHT_GRAY);
		frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame1.setLocationRelativeTo(null);

		//Panel...
		JPanel panel = new JPanel();
		panel.setLayout(new GridLayout(8,2));
		//panel.setSize(500, 300);
		panel.setBackground(Color.LIGHT_GRAY);
		
		
		//Controls...
		JLabel lblName = new JLabel("Air conditon");
                 JLabel L1=new JLabel();
                  JLabel L2=new JLabel();
              
                    JLabel L3=new JLabel();
                     JLabel L5=new JLabel();
                    
		JRadioButton  C60 = new JRadioButton("A/c");
                JRadioButton  C120 = new JRadioButton("Non A/c");
                
                JLabel lblpro = new JLabel("Projector");
                JRadioButton  PC = new JRadioButton("Pc connected");
                JRadioButton   PD= new JRadioButton("Document reader");
		JLabel lblMike = new JLabel("Mike");
                JRadioButton  Mw = new JRadioButton("Wired");
                JRadioButton   MWL= new JRadioButton("wireless");
                JTextField   T =new JTextField();
                JLabel L4=new JLabel("Specific Equipment");
                
                
		btnSubmit = new JButton("Submit"); 
		btnDefault = new JButton("Default Equipment"); 
		btnSubmit.setSize(10, 20);
                btnDefault.setSize(10, 20);
                PC.setBackground(Color.LIGHT_GRAY);
		PD.setBackground(Color.LIGHT_GRAY);
		Mw.setBackground(Color.LIGHT_GRAY);
                MWL.setBackground(Color.LIGHT_GRAY);
                C60.setBackground(Color.LIGHT_GRAY);
                C120.setBackground(Color.LIGHT_GRAY);
                
                panel.add(lblName);
                panel.add(C120);
                panel.add(L1);
                panel.add(C60);
                panel.add(lblMike);
                panel.add(Mw);
                panel.add(L2);
                panel.add(MWL);
                panel.add(lblpro);
                panel.add(PC);
                panel.add(L3);
                panel.add(PD);
        	panel.add(L4);
		panel.add(T);
                panel.add(btnSubmit);
                panel.add(btnDefault);
               
		frame1.setVisible(true);
		frame1.add(panel);
		btnSubmit.addActionListener(this);
                btnDefault.addActionListener(this);
		
	}

    @Override
    public void actionPerformed(ActionEvent e) {
              if(btnSubmit.getText().equals(e.getActionCommand()))
               {    Days day=new Days();
                    frame1.setVisible(false);
                   
                    day.Days_gui();
                    day.frameday.setVisible(true);
                    
                   
               }
    }

}
