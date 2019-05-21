import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

class Mysecondframe{
	JFrame f3;
	JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11,l12,l13,l14,l15,l16;
	Font font,font1;
	JButton b1,b2;
	JTextField t2,t3,t4,t5,t6,t7,t8,t9,t10,t11,t12,t13,t14,
	t15,t16,t17,t18,t19,t20,t21,t22,t23,t24,t25;
	
	Mysecondframe()
	{
	f3 = new JFrame();
	l1= new JLabel("THE GRADING SYSTEM");
	l1.setBounds(160,0,600,50); 
	l1.setFont(new Font("Times New Roman",Font.BOLD, 24));
		
		/*--Head names Credit--*/
	l2= new JLabel("Point_th");
	l2.setBounds(120,40,160,50); 
	l2.setFont(new Font("Calibri",Font.BOLD, 14)); 
	
	l3= new JLabel("Credit_Th");
	l3.setBounds(200,40,160,50); 
	l3.setFont(new Font("Calibri",Font.BOLD, 14));
	
	l4= new JLabel("Point_pr");
	l4.setBounds(300,40,160,50); 
	l4.setFont(new Font("Calibri",Font.BOLD, 14));
	
	l11= new JLabel("Credit_pr");
	l11.setBounds(400,40,160,50); 
	l11.setFont(new Font("Calibri",Font.BOLD, 14));
	
	
	/*--Subject 1 Field--*/
	
	l5= new JLabel("Subject 1");
	l5.setBounds(60,65,160,50); 
	l5.setFont(new Font("Calibri",0, 14));
	
	JTextField t2 = new JTextField();
	t2.setBounds(120,80,40,25);
	JTextField t3 = new JTextField();
	t3.setBounds(300,80,40,25);
	JTextField t4 = new JTextField();
	t4.setBounds(200,80,40,25);
	JTextField t20 = new JTextField();
	t20.setBounds(400,80,40,25);
	
	/*--Subject 2 Field--*/
	
	l6= new JLabel("Subject 2");
	l6.setBounds(60,105,160,50); 
	l6.setFont(new Font("Calibri",0, 14));
	
	JTextField t5 = new JTextField();
	t5.setBounds(120,120,40,25);
	JTextField t6 = new JTextField();
	t6.setBounds(200,120,40,25);
	JTextField t7 = new JTextField();
	t7.setBounds(300,120,40,25);
	JTextField t21 = new JTextField();
	t21.setBounds(400,120,40,25);
	
	/*--Subject 3 Field--*/
	l7= new JLabel("Subject 3");
	l7.setBounds(60,145,160,50); 
	l7.setFont(new Font("Calibri",0, 14));
	
	JTextField t8 = new JTextField();
	t8.setBounds(120,160,40,25);
	JTextField t9 = new JTextField();
	t9.setBounds(200,160,40,25);
	JTextField t10 = new JTextField();
	t10.setBounds(300,160,40,25);
	JTextField t22 = new JTextField();
	t22.setBounds(400,160,40,25);
	
	/*--Subject 4 Field--*/
	
	l8= new JLabel("Subject 4");
	l8.setBounds(60,185,160,50); 
	l8.setFont(new Font("Calibri",0, 14));
	
	JTextField t11 = new JTextField();
	t11.setBounds(120,200,40,25);
	JTextField t12 = new JTextField();
	t12.setBounds(200,200,40,25);
	JTextField t13 = new JTextField();
	t13.setBounds(300,200,40,25);
	JTextField t23 = new JTextField();
	t23.setBounds(400,200,40,25);
	/*--Subject 5 Field--*/
	
	l9= new JLabel("Subject 5");
	l9.setBounds(60,225,160,50); 
	l9.setFont(new Font("Calibri",0, 14));
	
	JTextField t14 = new JTextField();
	t14.setBounds(120,240,40,25);
	JTextField t15 = new JTextField();
	t15.setBounds(200,240,40,25);
	JTextField t16 = new JTextField();
	t16.setBounds(300,240,40,25);
	JTextField t24 = new JTextField();
	t24.setBounds(400,240,40,25);

	/*--Subject 6 Field--*/
	
	l10= new JLabel("Subject 6");
	l10.setBounds(60,265,160,50); 
	l10.setFont(new Font("Calibri",0, 14));
	
	JTextField t17 = new JTextField();
	t17.setBounds(120,280,40,25);
	JTextField t18 = new JTextField();
	t18.setBounds(200,280,40,25);
	JTextField t19 = new JTextField();
	t19.setBounds(300,280,40,25);
	JTextField t25 = new JTextField();
	t25.setBounds(400,280,40,25);
	
	/*--Buttons Here--*/
	JButton b1= new JButton("Result");	
	b1.setBounds(60,350,80,20);
	JButton b2= new JButton("Refresh");	
	b2.setBounds(180,350,80,20);
	
	/*--Answer part--*/
	
	l12= new JLabel("Your pointer is :");
	l12.setBounds(30,380,300,50); 
	l12.setFont(new Font("Calibri",Font.BOLD, 14));
	l12.setVisible(false);
	
	l13= new JLabel();
	l13.setBounds(150,380,300,50); 
	l13.setFont(new Font("Calibri",Font.BOLD, 14));
	l13.setVisible(false);
	
	l14= new JLabel("Your Grade is  :");
	l14.setBounds(30,420,300,50); 
	l14.setFont(new Font("Calibri",Font.BOLD, 14));
	l14.setVisible(false);
	
	l15= new JLabel();
	l15.setBounds(150,420,300,50); 
	l15.setFont(new Font("Calibri",Font.BOLD, 14));
	l15.setVisible(false);
	
	/*--add labels--*/
	f3.add(l1);f3.add(l2);f3.add(l3);f3.add(l4);f3.add(l5);f3.add(l6);f3.add(l7);
	f3.add(l8);f3.add(l9);f3.add(l10);f3.add(l11);f3.add(l12);f3.add(l13);f3.add(l14);
	f3.add(l15);
	
	/*--add textfield--*/
	f3.add(t2);f3.add(t3);f3.add(t4);f3.add(t5);f3.add(t6);f3.add(t7);
	f3.add(t8);f3.add(t9);f3.add(t10);f3.add(t11);f3.add(t12);f3.add(t13);
	f3.add(t14);f3.add(t15);f3.add(t16);f3.add(t17);f3.add(t18);f3.add(t19);
	f3.add(t20);f3.add(t21);f3.add(t22);f3.add(t23);f3.add(t24);f3.add(t25);
	
	/*--add Buttons--*/
	f3.add(b1);
	f3.add(b2);
			b1.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e)
			{	
				int t_credit,ans;
				float avg_ans;
				/*--for credit data--*/
				int cre_1 = Integer.parseInt(t3.getText());
				int cre_2 = Integer.parseInt(t6.getText());
				int cre_3 = Integer.parseInt(t9.getText());
				int cre_4 = Integer.parseInt(t12.getText());
				int cre_5 = Integer.parseInt(t15.getText());
				int cre_6 = Integer.parseInt(t18.getText());
				int cre_7 = Integer.parseInt(t20.getText());
				int cre_8 = Integer.parseInt(t21.getText());
				int cre_9 = Integer.parseInt(t22.getText());
				int cre_10 = Integer.parseInt(t23.getText());
				int cre_11 = Integer.parseInt(t24.getText());
				int cre_12 	 = Integer.parseInt(t25.getText());
				/*--for Grade data into integer--*/
					
					int gra_1 = Integer.parseInt(t2.getText());
					int gra_2 = Integer.parseInt(t5.getText());
					int gra_3 = Integer.parseInt(t8.getText());
					int gra_4 = Integer.parseInt(t11.getText());
					int gra_5 = Integer.parseInt(t14.getText());
					int gra_6 = Integer.parseInt(t17.getText());
					int gra_7 = Integer.parseInt(t4.getText());
					int gra_8 = Integer.parseInt(t7.getText());
					int gra_9 = Integer.parseInt(t10.getText());
					int gra_10 = Integer.parseInt(t13.getText());
					int gra_11 = Integer.parseInt(t16.getText());
					int gra_12 = Integer.parseInt(t19.getText());
				/*--main logic--*/
					t_credit=cre_1+cre_2+cre_3+cre_4+cre_5+cre_6+cre_7+cre_8+cre_9+cre_10+cre_11+cre_12; 
						int add1=gra_1*cre_1;	//2*3
						int add2=gra_7*cre_7;	//4*7
						int add3=gra_2*cre_2;	
						int add4=gra_8*cre_8;	
						int add5=gra_3*cre_3;		//8*9
						int add6=gra_9*cre_9;		//8*9
						int add7=gra_4*cre_4;		//10*22
						int add8=gra_10*cre_10;		//13*23
						int add9=gra_5*cre_5;		//14*15
						int add10=gra_11*cre_11;	//16*24
						int add11=gra_6*cre_6;		//17*18
						int add12=gra_12*cre_12;	//19*25
								
						ans = add1+add2+add3+add4+add5+add6+add7+add8+add9+add10+add11+add12;
								avg_ans=ans/t_credit;
							l12.setVisible(true);
							l13.setVisible(true);
							l13.setText(String.valueOf(avg_ans));
							l14.setVisible(true);
							l15.setVisible(true);
							if(avg_ans>=9.0){
								
								l15.setText("A+ 'u r in destingtion congrts..keep it up!!!'");
							}
							else if(avg_ans>=8.1 && avg_ans<9.0){
								   l15.setText("A That's well bt if u hertly stdy u got ur goal");
							   }
							   else if(avg_ans>=7.1 && avg_ans<8.0){
								   l15.setText("B+ 'Thats good but not keep it gain 8.5!!!'");
							   }
							   else if(avg_ans>=6.1 && avg_ans<7.0){
								   l15.setText("B 'it's first clss not well do stdy!!!'");
							   }
							   else if(avg_ans>=5.1 && avg_ans<=6.0){
								   l15.setText("C+ 'Not good bt u will stdy hard u can mke it!!!'");
							   }
							   else if(avg_ans>=4.1 && avg_ans<=5.0){
								   l15.setText("C 'Not Bad bt so less try again and again!!!'");
							   }
							   else if(avg_ans>=3.1 && avg_ans<4.0){
								   l15.setText("D 'If u wil tke efforts u get good marks!!!'");
							   }
							else{
								
								l15.setText("F It's ok Failer is first stage");
							}
			}				
					});
					/*--Refresh Button Action--*/
					b2.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent ae)
				{	
					/*--Refresh TextFields--*/
					
					 t2.setText(""); t3.setText(""); t4.setText(""); t5.setText(""); t6.setText("");
					 t7.setText(""); t8.setText(""); t9.setText(""); t10.setText(""); t11.setText("");
					 t12.setText(""); t13.setText(""); t14.setText(""); t15.setText(""); t16.setText("");
					 t17.setText(""); t18.setText(""); t19.setText(""); t20.setText(""); t21.setText(""); 
					 t22.setText(""); t23.setText("");t24.setText(""); t25.setText("");
						 
						 /*--Refresh Labels--*/
						 l12.setText("");l13.setText("");l14.setText("");l15.setText("");
					
				}
					});

			f3.setLayout(null);
			f3.setSize(500,500);
			f3.setVisible(true);
			f3.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}
public static void main(String args[]){
	Mysecondframe my1 = new Mysecondframe();
	Login log = new Login();

	}
} 