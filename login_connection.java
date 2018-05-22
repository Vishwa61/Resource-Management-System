package dbconnection;
import java.util.Calendar;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.sql.*;
import java.util.Locale;
import javax.swing.*;
import oop_project.main_window_gui;
/**
 *
 * @author Nishi
 */
public class login_connection 
{
    Connection connection = null;
    Statement statement = null;
    ResultSet rs = null;
    public String sql,name;    
    boolean flag=false;
    public login_connection()
    {

        try 
        {
            System.out.println("conneting to Database...");
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/oop_project","root","Nishi_1998");
            System.out.println("Connection Successful");
            System.out.println("Creating statement...");
            statement = connection.createStatement();
        } 
        catch (ClassNotFoundException ex)
        {
            System.out.println(ex);
            System.out.println("class not found");
        }
        catch (SQLException ex)
        {
            System.out.println("sql exception");
        }
        
    }
    public boolean log_check(String User_id,String Password) 
    {
        try
        {
            sql="SELECT User_name from oop_project.login_details WHERE User_id='"+User_id+"' AND Password='"+Password+"'";
            System.out.println(sql);
            rs=statement.executeQuery(sql);
            while(rs.next())
            {
                name = rs.getString("User_name");
                System.out.println(name);
            }
            rs.close();
            if(name!=null)
                flag = true;
        } 
        catch (SQLException ex) 
        {
            System.out.println("can't insert "+ex.getMessage());
        }
        return flag;
    }
    public String getday()
    {
        Calendar calendar = Calendar.getInstance();
        Date date = calendar.getTime();
        return new SimpleDateFormat("EEEE",Locale.ENGLISH).format(date.getTime());
    }
    public void fetch_data(JLabel[] t,JLabel[] I,JLabel[] M,JLabel[] C)
    { 
        main_window_gui m = new main_window_gui();
        try
        {
            for(int i=1;i<10;i++)
            {
                System.out.println("***"+i+"***");
                sql="SELECT  * from oop_project.schedule WHERE Semester='MECH02' AND Time = '"+t[i].getText()+"' AND Day='"+getday()+"'";
                System.out.println(sql);
                rs=statement.executeQuery(sql);
                System.out.println("a");
                while(rs.next())
                {
                    String subject = rs.getString("subject");
                    if(subject!=null)
                    {
                        M[i].setText(subject);
                        System.out.println(subject);
                    }
                }
                
                sql="SELECT  * from oop_project.schedule WHERE Semester='ICT02' AND Time='"+t[i].getText()+"' AND Day='"+getday()+"'";
                System.out.println(sql);
                rs=statement.executeQuery(sql);
               while(rs.next())
                {
                    String subject = rs.getString("subject");
                    if(subject!=null)
                    {
                        I[i].setText(subject);
                        System.out.println(subject);
                    }
                }
                
                sql="SELECT  * from oop_project.schedule WHERE Semester='CHEM02' AND Time = '"+t[i].getText()+"' AND Day='"+getday()+"'";
                System.out.println(sql);
                rs=statement.executeQuery(sql);
                while(rs.next())
                {
                    String subject = rs.getString("subject");
                    if(subject!=null)
                    {
                        C[i].setText(subject);
                        System.out.println(subject);
                    }
                }
                rs.close();
            }
        }
        catch(Exception e)
        {
            System.out.println("e"+e.getMessage());
        }
    }
    public void insert()
    {
        try
        {
            sql="SELECT * FROM ((SELECT Branch,subject FROM oop_project.project_brach) JOIN (SELECT room_no,subject FROM room_alloc) as t1 NATURAL JOIN oop_project.schedule ON t1.subject=oop_project.subject) as t2";
            System.out.println(sql);
            rs = statement.executeQuery(sql);
            while(rs.next())
            {
                String s = rs.getString("Branch");
                System.out.println(s);
                String s1 = rs.getString("subject");
                System.out.println(s1);
                String s2 = rs.getString("room_no");
                System.out.println(s2);
            }
        }
        catch(SQLException w)
        {
            System.out.println("Error"+w.getMessage());
        }
    }
}
