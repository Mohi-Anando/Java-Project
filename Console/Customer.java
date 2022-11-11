import java.util.Scanner;

public class Customer {
    public void displayFoodsitems() {
		System.out.println("");
		System.out.println("\t\t*********************************************");
		System.out.println("\t\t*                                           *");
        System.out.println("\t\t*  =======Welcome to Our Menu Page=======   *");
        System.out.println("\t\t*                                           *");
        System.out.println("\t\t*  1. Parda Biriyani............tk. 4000/-  *");
        System.out.println("\t\t*  2. Kabuli Polao..............tk. 1500/-  *");
        System.out.println("\t\t*  3. Safrani Polao.............tk. 5000/-  *");
        System.out.println("\t\t*  4. Salt bae Burger...........tk. 800/-   *");
        System.out.println("\t\t*  5. Gold Burger...............tk. 30000/- *");
        System.out.println("\t\t*  6. Juicy Burger..............tk. 1000/-  *");
        System.out.println("\t\t*  7. Easy Burger...............tk. 500/-   *");
        System.out.println("\t\t*  8. Saltbae Steak.............tk. 12000/- *");
        System.out.println("\t\t*  9. Steak Drama...............tk. 20000/- *");
        System.out.println("\t\t*  10.Golden Steak..............tk. 50000/- *");
        System.out.println("\t\t*  11.Baklava...................tk. 800/-   *");
        System.out.println("\t\t*  12.Lokum.....................tk. 500/-   *");
        System.out.println("\t\t*  13.Ghawa Arabia..............tk. 1000/-  *");
        System.out.println("\t\t*  14.Mexican Soda..............tk. 1000/-  *");
        System.out.println("\t\t*                                           *");
        System.out.println("\t\t*            ===================            *");
		System.out.println("\t\t*********************************************");

    }

    public int displayFooditemsbill() {
        Scanner sc = new Scanner(System.in);
        System.out.println("\t\tEnter your choice = ");
        System.out.println("\t\tTo confirm your order press '0'");
        int c=0;

        int totalBill = 0;
        while (true) {

            c = sc.nextInt();
            sc.nextLine();

            if (c == 0) {
                break;
            }

            else if (c == 1) {
                System.out.println("\t\tEnter Quantity : ");
                int quantity=sc.nextInt();
                sc.nextLine();
                totalBill += 4000 * quantity;
                System.out.println("\t\tAmount = " + totalBill + " Tk");

            }

            else if (c == 2) {
                System.out.println("\t\tEnter Quantity : ");
                int quantity = sc.nextInt();
                sc.nextLine();
                totalBill += 1500 * quantity;
                System.out.println("\t\tAmount = " + totalBill + " Tk");

            }

            else if (c == 3) {
                System.out.println("\t\tEnter Quantity : ");
                int quantity = sc.nextInt();
                sc.nextLine();
                totalBill += 5000 * quantity;
                System.out.println("\t\tAmount = " + totalBill + " Tk");

            }

            else if (c == 4) {
                System.out.println("\t\tEnter Quantity : ");
                int quantity = sc.nextInt();
                sc.nextLine();
                totalBill += 800 * quantity;
                System.out.println("\t\tAmount = " + totalBill + " Tk");

            }

            else if (c == 5) {
                System.out.println("\t\tEnter Quantity : ");
                int quantity = sc.nextInt();
                sc.nextLine();
                totalBill += 30000 * quantity;
                System.out.println("\t\tAmount = " + totalBill + " Tk");

            }

            else if (c == 6) {
                System.out.println("\t\tEnter Quantity : ");
                int quantity = sc.nextInt();
                sc.nextLine();
                totalBill += 1000 * quantity;
                System.out.println("\t\tAmount = " + totalBill + " Tk");

            }

            else if (c == 7) {
                System.out.println("\t\tEnter Quantity : ");
                int quantity = sc.nextInt();
                sc.nextLine();
                totalBill += 500 * quantity;
                System.out.println("\t\tAmount = " + totalBill + " Tk");

            }

            else if (c == 8) {
                System.out.println("\t\tEnter Quantity : ");
                int quantity = sc.nextInt();
                sc.nextLine();
                totalBill += 12000 * quantity;
                System.out.println("\t\tAmount = " + totalBill + " Tk");

            }

            else if (c == 9) {
                System.out.println("\t\tEnter Quantity : ");
                int quantity = sc.nextInt();
                sc.nextLine();
                totalBill += 20000 * quantity;
                System.out.println("\t\tAmount = " + totalBill + " Tk");

            }

            else if (c == 10) {
                System.out.println("\t\tEnter Quantity : ");
                int quantity = sc.nextInt();
                sc.nextLine();
                totalBill += 50000 * quantity;
                System.out.println("\t\tAmount = " + totalBill + " Tk");

            }

            else if (c == 11) {
                System.out.println("\t\tEnter Quantity : ");
                int quantity = sc.nextInt();
                sc.nextLine();
                totalBill += 800 * quantity;
                System.out.println("\t\tAmount = " + totalBill + " Tk");

            }

            else if (c == 12) {
                System.out.println("\t\tEnter Quantity : ");
                int quantity = sc.nextInt();
                sc.nextLine();
                totalBill += 500 * quantity;
                System.out.println("\t\tAmount = " + totalBill + " Tk");

            }

            else if (c == 13) {
                System.out.println("\t\tEnter Quantity : ");
                int quantity = sc.nextInt();
                sc.nextLine();
                totalBill += 1000 * quantity;
                System.out.println("\t\tAmount = " + totalBill + " Tk");

            }

            else if (c == 14) {
                System.out.println("\t\tEnter Quantity : ");
                int quantity = sc.nextInt();
                sc.nextLine();
                totalBill += 1000 * quantity;
                System.out.println("\t\tAmount = " + totalBill + " Tk");

            }
			else{
				System.out.println("\t\tNo Food Found!!!!!");
			}

            //System.out.println("Bill from this section = " + totalBill + " Tk");
        }
        System.out.println("\t\tBill from this section = " + totalBill + " Tk");
        return totalBill;
       
    }
	
}
