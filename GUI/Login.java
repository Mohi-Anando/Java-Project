import javax.swing.*;

import java.awt.*;

import java.awt.event.*;

 

public class Login extends JFrame implements ActionListener

{

           JLabel l1,l2,l3,l4,l5;

           JTextField t1,t2;

           JButton b1,b2;

           JPanel p1,p2;
		   
		   JComboBox cb;

 

public     Login()   

{

      super("Restaurent Login");

      this.setSize(600,400);

  this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	setLocationRelativeTo(null);
     

    p1 = new bg();

      p1.setSize(new Dimension(600,280));

      p1.setBackground(Color.yellow);

      p1.setLayout(null);

     

      l1 = new JLabel("Nusr-Et Restaurant");

      l1.setFont(new Font("Serif",Font.BOLD,15));

      l1.setForeground(Color.BLUE);

      l1.setBounds(180,15,150,30);

      p1.add(l1);

     

      l2 = new JLabel("Username");

      l2.setFont(new Font("Comic Sans MS",Font.PLAIN,15));

      l2.setForeground(Color.white);

      l2.setBounds(100,60,150,20);

      p1.add(l2);

     

    l3 = new JLabel("Password");

      l3.setFont(new Font("Comic Sans MS",Font.PLAIN,15));

      l3.setForeground(Color.white);

      l3.setBounds(100,100,150,20);

      p1.add(l3);
	  
	
	l5 = new JLabel("Role");

      l5.setFont(new Font("Comic Sans MS",Font.PLAIN,15));

      l5.setForeground(Color.white);

      l5.setBounds(100,140,150,20);

      p1.add(l5);

     

      t1 = new JTextField();

      t1.setBounds(220,60,100,25);

      p1.add(t1);

     

     

    t2 = new JTextField();

      t2.setBounds(220,100,100,25);

      p1.add(t2);
	  
	
	String roles[]={"Customer","Manager","Staff"};
	
	   cb = new JComboBox(roles);
	   cb.setBounds(220,140,100,25);
       p1.add(cb);


      b1 = new JButton("Login");

      b1.setFont(new Font("Comic Sans MS",Font.BOLD,15));

      b1.setForeground(Color.red);

      b1.setBounds(180,220,100,25);

      b1.addActionListener(this);

      p1.add(b1);

     

      p2 = new JPanel();

      p2.setSize(new Dimension(450,50));

      p2.setBackground(Color.gray);

      p2.setLayout(null);

         

      l4 = new JLabel();

      l4.setFont(new Font("Comic Sans MS",Font.BOLD,30));

      l4.setForeground(Color.white);

      l4.setBounds(50,300,500,30);

      p2.add(l4);


     

      this.add(p1);         

    this.add(p2);
     

}

			

           public void actionPerformed(ActionEvent ae)

           {

                 if(ae.getSource()==b1)

                 {

					 String user = t1.getText();

					 String password = t2.getText();
					 
					 String role = String.valueOf(cb.getItemAt(cb.getSelectedIndex()));

					
					if(role.equals("Customer")){
						LoginController lc = new LoginController();
						boolean cus = lc.loginAsCustomer(user, password);
						if(cus){
							Customer cc = new Customer();
							this.setVisible(false);
							cc.show();
						}
						else{
							l4.setText("Incorrect Username or Password for this role...!!");
						}
					}
					else if(role.equals("Manager")){
						LoginController lc = new LoginController();
						boolean man = lc.loginAsManager(user, password);
						if(man){
							Manager cc = new Manager();
							this.setVisible(false);
							cc.show();
						}
						else{
							l4.setText("Incorrect Username or Password for this role...!!");
						}
					}
					else if(role.equals("Staff")){
						LoginController lc = new LoginController();
						boolean man = lc.loginAsStaff(user, password);
						if(man){
							Staff cc = new Staff();
							this.setVisible(false);
							cc.show();
						}
						else{
							l4.setText("Incorrect Username or Password for this role...!!");
						}
					}
				
				
				}

           }
}





