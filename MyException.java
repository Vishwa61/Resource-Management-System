package oop_project;

import javax.swing.JOptionPane;

/**
 *
 * @author Nishi
 */
public class MyException extends Exception
{
    public MyException(String str)
    {
        JOptionPane.showMessageDialog(null,str);
    }
}
