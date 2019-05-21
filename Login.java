import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class Login
{
  JFrame f1,f2;
JTextField t2,t1;
JLabel l1,l2;
JButton b, b1;
  
  Login()
  {
    f1 = new JFrame();
    l1 = new JLabel("USER ID:");
    l1.setBounds(100, 100, 70, 20);
    l2 = new JLabel("Password:");
    l2.setBounds(100, 140, 70, 20);
    
    b = new JButton("LOgIn");
    b.setBounds(100, 300, 100, 30);
    b1 = new JButton("Guest");
    b1.setBounds(300, 300, 100, 30);
    t1 = new JTextField();
    t1.setBounds(220, 100, 90, 20);
    t2 = new JPasswordField();
    t2.setBounds(220, 140, 90, 20);
    
    f1.add(b);
    f1.add(b1);
    f1.add(t1);
    f1.add(t2);
    f1.add(l1);
    f1.add(l2);
    f1.setLayout(null);
    f1.setVisible(true);
    f1.setSize(500, 500);
    f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    f1.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
    b.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
 String value1=t1.getText();
  String value2=t2.getText();
  if (value1.equals("Ashutosh") && value2.equals("ASH@007")) {
	//f1.dispose();
      new Mysecondframe();

  f2.setVisible(true);
 JOptionPane.showMessageDialog(f1,"Welcome to The Grading System");
  }
 else{
  System.out.println("enter the valid username and password");
  JOptionPane.showMessageDialog(f1,"Incorrect login or password",
  "Error",JOptionPane.ERROR_MESSAGE);
  }
			}
  });
  b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
			f1.dispose();
			new Mysecondframe();
			}
  });
  }
  public static void main(String args[]){
	
	Login log = new Login();

	}
}
