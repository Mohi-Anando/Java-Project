import java.util.Scanner;

public class lg  {
    void login(){
        Scanner input=new Scanner(System.in);
        System.out.println("tEnter customer user id:");
        String username=input.nextLine();
        System.out.println("Enter your password:");
         String password=input.nextLine();
         if(username.equals("Customer") && password.equals("1234")){
            System.out.println("\t\tCustomer logged in successful.... ");
            Customer cust=new Customer();
            cust.displayFoodsitems();
            cust.displayFooditemsbill();
         }
         else
        System.out.println("\t\tInvalid user id or Password");
    }
    

    
}
