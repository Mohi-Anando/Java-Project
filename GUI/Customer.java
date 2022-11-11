import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.border.*;
import java.io.FileWriter;
import java.io.File;
import java.util.Scanner;


public class Customer extends JFrame implements ActionListener

{
	    JPanel p1;
		JTable jt, jt2;
		JButton b1, b2, b3;
		String orderData [][];
		String data[][]={
		                    {"Arabian Khabsa","4500","0"},
						    {"Parda Biriyani","4000","0"},
						    {"Kabuli Polao","1500","0"},
							{"Safrani Polao","5000","0"},
							{"Salt bae Burger","800","0"},
							{"Gold Burger","30000","0"},
							{"Juicy Burger","1000","0"},
							{"Easy Burger","500","0"},
							{"Saltbae Steak","12000","0"},
							{"Steak Drama","20000","0"},
							{"Golden Steak","50000","0"},
							{"Baklava","800","0"},
							{"Lokum","500","0"},
							{"Ghawa Arabia","1000","0"},
						    {"Mexican Soda","1000","0"}

						};
		String column[]={"Items","Prizes (TK)","Units"};
		 
		 
	public  Customer()
		{
			 
			super("Menu Tempalte");
			this.setSize(1000,700);
			setLocationRelativeTo(null);
			Border border = new LineBorder(Color.GRAY, 2, true); 
			this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			p1= new JPanel();			 
			p1.setSize(new Dimension(1000,350));
			p1.setBackground(Color.white);
			p1.setBorder(border);
			p1.setLayout(null);
			 
			
				  jt=new JTable(data,column);
				  jt.setRowHeight(25);
				  JScrollPane scrollPane= new  JScrollPane(jt);
				  scrollPane.setBounds(10,10,970,280);
				  scrollPane.setBorder(border);
				  p1.add(scrollPane);
				  
			  b1 = new JButton("Prepare Order");

			  b1.setFont(new Font("Comic Sans MS",Font.BOLD,15));

			  b1.setForeground(Color.blue);

			  b1.setBounds(400,300,200,35);

			  b1.addActionListener(this);

			  p1.add(b1);
			  
			  b3 = new JButton("Back");

					b3.setFont(new Font("Comic Sans MS",Font.BOLD,15));

					b3.setForeground(Color.blue);

					b3.setBounds(150,580,200,35);

					b3.addActionListener(this);

					p1.add(b3);
				  
			  this.add(p1);

		}
    public void actionPerformed(ActionEvent ae)
		{		  
				if(ae.getSource()==b1)

                 {
					int n = 0;
					for(int i=0; i<data.length; i++){
						if(data[i][2] != "0"){
							n++;
						}
					}
					orderData = new String[n+1][4];
					int j=0;
					double total = 0;
					for(int i=0; i<data.length; i++){
						if(data[i][2] != "0"){
							orderData[j][0] = data[i][0];
							orderData[j][1] = data[i][1];
							orderData[j][2] = data[i][2];
							int p = Integer.parseInt(data[i][1]);
							int u = Integer.parseInt(data[i][2]);
							double subTotal = (p*u);
							orderData[j][3] = " "+subTotal;
							total+=(p*u);
							j++;
						}
					}
					orderData[j][2] = "Total: ";
					orderData[j][3] = "" + total + "Taka";
					String column2[]={"Items","Prizes","Units", "Total Price"};
					jt2=new JTable(orderData,column2);
	 
					JScrollPane scrollPane2= new  JScrollPane(jt2);
					scrollPane2.setBounds(10,350,970,200);
					jt2.setRowHeight(25);
					Border border = new LineBorder(Color.GRAY, 2, true); 
					scrollPane2.setBorder(border);
					p1.add(scrollPane2);
					
					
					b2 = new JButton("Confirm Order");

					b2.setFont(new Font("Comic Sans MS",Font.BOLD,15));

					b2.setForeground(Color.blue);

					b2.setBounds(650,580,200,35);

					b2.addActionListener(this);

					p1.add(b2);
					
                }
				
				if(ae.getSource()==b2){
					String order = "";
					try {
								  File myObj = new File("order.txt");
								  Scanner myReader = new Scanner(myObj);
								  while (myReader.hasNextLine()) {
									String data = myReader.nextLine();
									order= order+data+"\n";
								  }
								  
								  myReader.close();
						} 
					catch (Exception e) {
								  System.out.println("An error occurred.");
						}
					try{   //arabian khafsa,1;parda brirany,1;Total=8500.0Taka;
						   FileWriter fw=new FileWriter("order.txt");
						   for(int i=0; i<orderData.length-1; i++){
							   String ord = "";
								   
								   ord=ord+orderData[i][0]+",";
								   ord=ord+orderData[i][2];
							   
							   order = order+ord+";";
						   }
						   
						   order = order+"Total="+orderData[orderData.length-1][3]+";\n";
						   fw.write(order);
						   fw.close();
						   Customer c2 = new Customer();
						   this.setVisible(false);
						   c2.show();
						       
						  }
					catch(Exception e){
							System.out.println(e);
						}     
					          
				}
				
				if(ae.getSource()==b3){
					Login l = new Login();
					this.setVisible(false);
					l.show();
				}
		} 		 

}