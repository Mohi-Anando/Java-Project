import java.util.ArrayList;
import java.util.Scanner;

public class TestMain {

	public static void main(String[] args) {
		
		while(true){
		int choice;
		Scanner in=new Scanner(System.in);
		System.out.println("");
		System.out.println("\t**********************************************");
		System.out.println("");
		System.out.println("\t\tWelcome to our Restaurant");
		System.out.println("\t\t     --------------      ");
		System.out.println("\t\t       ----------      ");
		System.out.println("\t\t         ------      ");
		System.out.println("\t\t           --      ");
		System.out.println("");
		System.out.println("Press 1 for Customer login or 2 for Manager login");
		choice=in.nextInt();
		if(choice==1){
			lg c1=new lg();
			c1.login();
		}
		else if(choice==2){
			Man m1=new Man();
			m1.login_man();
		}
		else{
			System.out.println("\t\tInvalid option chosen");
		}
		
	
	
		ArrayList<Food> foodlist = new ArrayList<>(); 
		ManageFood managefood= new ManageFood();
		int select;
	
	    
		
		Scanner bp=new Scanner(System.in);
		do {
			Menumain();
			select = Integer.parseInt(bp.nextLine());
			switch (select) {
				case 1:
					do {
						MenuManageFood();
						select = Integer.parseInt(bp.nextLine());
						switch (select) {
							case 1:
								managefood.bp();
								break;
							case 2:
								managefood.print();
								managefood.EditFood();
								break;
							case 3:
								managefood.print();
								managefood.DeleteFood();
								break;
							case 4:
								managefood.PrintOrder();
								break;
							case 5:
								managefood.search();
								break;
							case 0:
								System.out.println("back");
								break;
							default:
								break;
						}
					} while (select != 0);
					break;
				case 2:

					do {
						MenuOrder();
						select = Integer.parseInt(bp.nextLine());
						switch (select) {
							case 1:
								// managefood.print();
								// managefood.Price();
								Customer c = new Customer();
								c.displayFoodsitems();
								c.displayFooditemsbill();
								break;
							case 0:
								System.out.println("back");
								break;
							default:
								break;
						}
					} while (select != 0);
					break;

				default:
					break;
			}
		} while (select != 3);

	}
}

static void MenuManageFood() {
	System.out.println("\t\t# # # # # # # # # # # # # # # # # # ");
	System.out.println("\t\t#                                  #");
	System.out.println("\t\t#          MENU MANAGEFOOD         #");
	System.out.println("\t\t#       0. BACK TO menu main       #");
	System.out.println("\t\t#          1. Add food             #");
	System.out.println("\t\t#          2. Edit food            #");
	System.out.println("\t\t#          3. Delete food          #");
	System.out.println("\t\t#    4. Print info table order     #");
	System.out.println("\t\t#          5. payment              #");
	System.out.println("\t\t#                                  #");
	System.out.println("\t\t # # # # # # # # # # # # # # # # # #");
	System.out.println("\t\tselect");
}

static void MenuOrder() {
	System.out.println("\t\t----------------------------");
	System.out.println("\t\t--------MENU ORDER----------");
	System.out.println("\t\t    0. BACK TO menu main    ");
	System.out.println("\t\t    1. Menu and Order       ");
	System.out.println("\t\t----------------------------");
	System.out.println("\t\tType the number please");
}

static void Menumain() {
		 int i;
		 Scanner input=new Scanner(System.in);
		 i=input.nextInt();
		 if(i==1){
		/*System.out.println("\t\t* * * * * * * * * * * * * ");
		System.out.println("\t\t*                        *");
		System.out.println("\t\t*********MENU MAIN********"); 
		System.out.println("\t\t*     1. Manage Food     *");
		System.out.println("\t\t*     2. Manage order    *");*/
		System.out.println("\t\t* * * * * * * * * * * * *");
		System.out.println("\t\t*                        *");
		System.out.println("\t\t*  For Exit Press 3      *");
		System.out.println("\t\t*                        *");
		System.out.println("\t\t * * * * * * * * * * * * *");
		 }
		 else
		 System.out.println("Error");
	}

}

	
	


