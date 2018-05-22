
package oop_project;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Resources implements ActionListener
{
    JFrame frame1;
    Equipment E = new Equipment();
    JButton cabin,cabin1,cabin2;
    JButton aud,lib,Exb,crG,ML,MD1,MD2,IL;
    JButton Hall107,Hall106,Hall105,class1,class2,class3,class4,lab1,lab2,bstudy,mstudy,btnBack;
    JButton Hall107_2,Hall106_2,Hall105_2,class1_2,class2_2,class3_2,class4_2,lab1_2,lab2_2,lab_com,phdroom;
    
  JButton[] B=new JButton[34];
    public void Resources_gui()
    {
                
                frame1 = new JFrame();
		frame1.setLayout(new GridLayout(2,2));
		frame1.setSize(1500,725);
		frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame1.setLocationRelativeTo(null);

		//Panel1
		JPanel panel1 = new JPanel();
		panel1.setLayout(new BorderLayout(5,5));
		panel1.setSize(300, 300);
		panel1.setBackground(Color.LIGHT_GRAY);
                
                
                JPanel mdpanel = new JPanel();
		mdpanel.setLayout(new GridLayout(4,1));
		mdpanel.setSize(500, 300);
		mdpanel.setBackground(Color.LIGHT_GRAY);

                JPanel panelaud = new JPanel();
                panelaud.setLayout(new GridLayout(1,2));
                panelaud.setBackground(Color.LIGHT_GRAY);
                
                //Panel2
		JPanel panel2 = new JPanel();
	        panel2.setLayout(new BorderLayout(5,5));
		panel2.setSize(500, 300);
		panel2.setBackground(Color.LIGHT_GRAY);
		
                JPanel panel2_1 = new JPanel();
		panel2_1.setLayout(new GridLayout(1,3));
		panel2_1.setSize(500, 300);
		panel2_1.setBackground(Color.WHITE);
                
                JPanel panel2_2 = new JPanel();
		panel2_2.setLayout(new GridLayout(4,1));
		panel2_2.setSize(500, 300);
		panel2_2.setBackground(Color.WHITE);
                
                JPanel panel2_3 = new JPanel();
		panel2_3.setLayout(new GridLayout(1,2));
		panel2_3.setSize(500, 300);
		panel2_3.setBackground(Color.WHITE);
                
               
                
                //Panel3 2nd floor
		JPanel panel3 = new JPanel();
		panel3.setLayout(new BorderLayout(7,2));
		panel3.setSize(500, 300);
		panel3.setBackground(Color.LIGHT_GRAY);
                
                JPanel panel3_1 = new JPanel();
		panel3_1.setLayout(new GridLayout(1,3));
		panel3_1.setSize(500, 300);
		panel3_1.setBackground(Color.WHITE);
                
                JPanel panel3_2 = new JPanel();
		panel3_2.setLayout(new GridLayout(4,1));
		panel3_2.setSize(500, 300);
		panel3_2.setBackground(Color.WHITE);
                
                JPanel panel3_3 = new JPanel();
		panel3_3.setLayout(new GridLayout(1,2));
		panel3_3.setSize(500, 300);
		panel3_3.setBackground(Color.WHITE);
    
                
		  //Panel4
		JPanel panel4 = new JPanel();
		panel4.setLayout(new BorderLayout(7,2));
		panel4.setSize(500, 300);
		panel4.setBackground(Color.LIGHT_GRAY);
		
                  //Panel4
		JPanel panelib = new JPanel();
		panelib.setLayout(new GridLayout(1,2));
		panelib.setSize(500, 300);
		panelib.setBackground(Color.LIGHT_GRAY);
		
                
                //labels
                JLabel FG = new JLabel("                                     Ground floor");
                JLabel F1=new JLabel  ("                                     1st floor");
                JLabel F2=new JLabel("                                       2nd floor ");
                JLabel F3=new JLabel("                                       3rd floor           TO BE DECIDED");
                JLabel l =new JLabel();
          
                //floor ground
                B[7] = new JButton("Admin");
                B[4] = new JButton("Auditorium");
                B[5]= new JButton("Library");
                B[6] = new JButton("Exhibition hall(120)");               
                B[0] = new JButton("Classroom 006(60)");
                B[1]  = new JButton("Mech lab(60)");
                B[2] = new JButton("MD lab 1(60)");
                B[3] = new JButton("MD lab 2(60)");
                B[8]  = new JButton("Incubation lab");      
                // 1st floor
                  B[20] = new JButton("Cabin");
                B[11] = new JButton("Lecture hall 107(120)");
                B[10] = new JButton("Lecture hall 106(120)");
                B[9]  = new JButton("Lecture hall 105(120)");
                B[12] = new JButton("Classroom  109(60)");
                B[13] = new JButton("Classroom 110(60)");
                B[14]  = new JButton("Classroom 111(60)");  
                B[15]  = new JButton("Classroom 112(60)");
                B[16] = new JButton("Electronics lab 116(60)");
                B[17]  = new JButton("Electronics lab 117(60)");  
                B[19] = new JButton("BTech Study Room");
                B[18] = new JButton("Mtech Study Room");
                // 2nd floor
                B[32] = new JButton("Cabin");
                B[23] = new JButton("Lecture hall 106(120)");
                B[22] = new JButton("Lecture hall 105(120)");
                B[21]  = new JButton("Lecture hall 104(120)");
                B[24] = new JButton("Classroom 208(60)");
                B[25] = new JButton("Classroom 209(60)");
                B[26]  = new JButton("Computer Lab 210(60)"); 
                B[27]  = new JButton("Computer Lab 211(60)");  
                B[28] = new JButton("Computer Lab 215(60)");
                B[29]  = new JButton("Computer Lab 216(60)");
                B[30] = new JButton("Communication Lab");
                B[31] = new JButton("Phd Room");
                btnBack = new JButton("Back to previous frame");
                //Ground FLOOR
               
                mdpanel.add(B[0]);
                mdpanel.add(B[1]);
                mdpanel.add(B[2]);
                mdpanel.add(B[3]);
                panelaud.add(mdpanel);
                panelaud.add(B[4]);
                panelib.add(B[5]);
                panelib.add(B[6]);
                panel1.add(FG,BorderLayout.CENTER);
                panel1.add(B[7],BorderLayout.WEST);            
                panel1.add(panelib,BorderLayout.NORTH);
                panel1.add(panelaud,BorderLayout.EAST);
                panel1.add(B[8],BorderLayout.SOUTH);
                //1st floor
               panel2_1.add(B[9]);
                panel2_1.add(B[10]);
                 panel2_1.add(B[11]);
                 panel2_2.add(B[12]);
                 panel2_2.add(B[13]);
                 panel2_2.add(B[14]);
                 panel2_2.add(B[15]);
              
                 panel2_3.add(B[16]);
                 panel2_3.add(B[17]);
                 panel2_3.add(B[18]);
                 panel2_3.add(B[19]);
                panel2.add(F1,BorderLayout.CENTER);
                panel2.add(panel2_1,BorderLayout.NORTH);
                panel2.add(panel2_2,BorderLayout.EAST);
                panel2.add(panel2_3,BorderLayout.SOUTH);
                panel2.add(B[20],BorderLayout.WEST);     
          //2nd floor
                 panel3_1.add(B[21]);
                 panel3_1.add(B[22]);
                 panel3_1.add(B[23]);
                 panel3_2.add(B[24]);
                 panel3_2.add(B[25]);
                 panel3_2.add(B[26]);
                 panel3_2.add(B[27]);
                 panel3_3.add(B[28]);
                 panel3_3.add(B[29]);
                 panel3_3.add(B[30]);
                 panel3_3.add(B[31]);
               
                 panel3.add(F2,BorderLayout.CENTER);
                 panel3.add(panel3_1,BorderLayout.NORTH);
                 panel3.add(panel3_2,BorderLayout.EAST);
                 panel3.add(panel3_3,BorderLayout.SOUTH);
                 panel3.add(B[32],BorderLayout.WEST);  
                 panel3.add(F2,BorderLayout.CENTER);
                //3rd floor
                     panel4.add(F3);
                 
                 panel4.add(btnBack,BorderLayout.SOUTH);
                //frame work
		 frame1.add(panel1);
                 frame1.add(panel2);
                 frame1.add(panel3);
                 frame1.add(panel4);
                
              
                    for(int i=0;i<33;i++)
                {
                   B[i].addActionListener(this);
                 }
                  btnBack.addActionListener(this);
                 frame1.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) 
    {  
        
        
        
              
               for(int i=0;i<33;i++)
                {
                 
             if(B[i].getText().equals(e.getActionCommand())){
                System.out.println(i);
                frame1.setVisible(false);
                E.Equipment_gui();
                E.frame1.setVisible(true);
             }  
                     else if(btnBack.getText().equals(e.getActionCommand()))
               {
                    frame1.setVisible(false);
                    main_window_gui M=new main_window_gui();
                    M.main_gui();
                    M.mainframe.setVisible(true);
                    
                   
               }
         }         
      }
}
