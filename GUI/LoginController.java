public class LoginController{

String managerList = "Admin";
String managerPassword = "1234";

String[] customerList = {"cus1", "cus2", "cus3", "cus4", "cus5"};
String[] customerPassword = {"1234", "2345", "3456", "4567", "5678"};

String[] staffList = {"st1", "st2", "st3", "st4", "st5"};
String[] staffPassword = {"1234", "2345", "3456", "4567", "5678"};


public boolean loginAsManager(String username, String password){
if(username.equals(managerList) && password.equals(managerPassword)){
return true;
}
else{
return false;
}
}

public boolean loginAsCustomer(String username, String password){
int b =0;
for(int i=0; i<customerList.length; i++){
if(customerList[i].equals(username)   && customerPassword[i].equals(password)){
b = 1;
}
}

if(b == 1){
return true;
}
else{
return false;
}
}

public boolean loginAsStaff(String username, String password){
int b =0;
for(int i=0; i<staffList.length; i++){
if(staffList[i].equals(username) && staffPassword[i].equals(password)){
b = 1;
}
}

if(b == 1){
return true;
}
else{
return false;
}
}

}