import java.util.Scanner;

public class Man {
    void login_man(){
        Scanner input=new Scanner(System.in);
        System.out.println("Enter your manager id:");
        String username=input.nextLine();
        System.out.println("Enter your password:");
         String password=input.nextLine();
         if("admin".equals(username)&&"1234".equals(password)){
            System.out.println("\t\tManager log in Sucessfully.....");
            ManageFood fd=new ManageFood();
            fd.bp();
            fd.print();
            fd.Price();
            fd.PrintOrder();
            fd.search();
            fd.EditName();
            fd.EditPrice();
            fd.EditFood();
            fd.DeleteFood();
        }
        else
        System.out.println("\t\tInvalid user id or Password");

    }
    
}
