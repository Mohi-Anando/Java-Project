import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.border.*;
import java.io.FileWriter;
import java.io.File;
import java.util.Scanner;

public class Staff extends JFrame implements ActionListener{
	
	JPanel p1,p2;
	JTable jt, jt2;
	JButton b1, b2, b3;
	Object data[][];
	JCheckBox cb[];
	int orderNumber = 0;
	
	public Staff()
	{
		super("Staff Order Delivery");
		this.setSize(1000,550);
		setLocationRelativeTo(null);
		Border border = new LineBorder(Color.GRAY, 2, true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		p1= new JPanel();			 
		p1.setSize(new Dimension(1000,430));
		p1.setBackground(Color.white);
		p1.setBorder(border);
		p1.setLayout(null);
		p2= new JPanel();			 
		p2.setSize(new Dimension(1000,100));
		p2.setBackground(Color.white);
		p2.setBorder(border);
		p2.setLayout(null);

		try {
					  File myObj = new File("approvedOrder.txt");
					  Scanner myReader = new Scanner(myObj);
					  int numberOfOrder = 0;
					  while (myReader.hasNextLine()) {
						String temp = myReader.nextLine();
						numberOfOrder++;
					  }
					  data = new String[numberOfOrder][3];
					  cb = new JCheckBox[numberOfOrder];
					  orderNumber = numberOfOrder;
					  myReader.close();
			} 
		catch (Exception e) {
					  System.out.println("An error occurred.");
			}
		try {
					  File myObj = new File("approvedOrder.txt");
					  Scanner myReader = new Scanner(myObj);
					  int numberOfOrder = 0;
					  while (myReader.hasNextLine()) {
						String temp = myReader.nextLine();
						String[] parts = temp.split(";");
						String abc = "";
						for(int i=0;i<parts.length-1; i++){
							abc=abc+"( "+parts[i]+" )\t";
						}
						data[numberOfOrder][0] = "          "+(numberOfOrder+1);
						data[numberOfOrder][1] = abc;
						data[numberOfOrder][2] = parts[parts.length-1];
						numberOfOrder++;
					  }
					  myReader.close();
			} 
		catch (Exception e) {
					  System.out.println("An error occurred.");
			}
			
		String column[]={"Order Number","Order Details","Total Amount(TK)"};
		jt=new JTable(data,column);
		  jt.setRowHeight(25);
		  JScrollPane scrollPane= new  JScrollPane(jt);
		  scrollPane.setBounds(10,10,970,280);
		  scrollPane.setBorder(border);
		  p1.add(scrollPane);
		  int x=20, y=300;
		for(int i=0;i<cb.length; i++){
			if(x>=1000){
				x=20;
				y=y+55;
			}
			cb[i] = new JCheckBox("order "+(i+1));
			cb[i].setBounds(x, y, 100,50);
			x=x+105;
			p1.add(cb[i]);
		} 
		  this.add(p1);
		  b3 = new JButton("Back");

					b3.setFont(new Font("Comic Sans MS",Font.BOLD,15));

					b3.setForeground(Color.blue);

					b3.setBounds(150,460,200,35);

					b3.addActionListener(this);

					p2.add(b3);
				  
			  this.add(p2);
			  
		  b2 = new JButton("Complete Orders");

				b2.setFont(new Font("Comic Sans MS",Font.BOLD,15));

				b2.setForeground(Color.blue);

				b2.setBounds(650,460,200,35);

				b2.addActionListener(this);

				p2.add(b2);
		  this.add(p2);
		
	}
	
	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource()==b3){
					Login l = new Login();
					this.setVisible(false);
					l.show();
				}
		if(ae.getSource()==b2){
				String newOrder="",approvedOrders="", oldApprovedOrders="";
				try {
										  File myObj = new File("completedOrder.txt");
										  Scanner myReader = new Scanner(myObj);
										  while (myReader.hasNextLine()) {
											String temp = myReader.nextLine();
											oldApprovedOrders = oldApprovedOrders + temp + "\n";
										  }
										  myReader.close();
								} 
							catch (Exception e) {
										  System.out.println("An error occurred.");
								}
				
				try {
										  File myObj = new File("approvedOrder.txt");
										  Scanner myReader = new Scanner(myObj);
										  int numberOfOrder = 0;
										  while (myReader.hasNextLine()) {
											
											String temp = myReader.nextLine();
											
											if(cb[numberOfOrder].isSelected()){
												
												approvedOrders=approvedOrders+temp+"\n";
											}
											else{
												newOrder=newOrder+temp+"\n";
											}
											numberOfOrder++;
										  }
										  myReader.close();
								} 
							catch (Exception e) {
										  System.out.println("An error occurred.");
								}
				try{   
							
						   FileWriter fw=new FileWriter("approvedOrder.txt");
						   FileWriter fw2=new FileWriter("completedOrder.txt");
						   
						   fw.write(newOrder);
						   fw.close();
						   approvedOrders = oldApprovedOrders + approvedOrders;
						   fw2.write(approvedOrders);
						   fw2.close();    
						  }
					catch(Exception e){
							System.out.println(e);
						}
					
			
					Staff m = new Staff();
					this.setVisible(false);
					m.show();
				}
	}
}










