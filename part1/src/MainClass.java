import java.util.Scanner; 
public class MainClass {
    
    public static void main (String[] args) {
        Scanner console = new Scanner (System.in);
       
        String user, pass;
        
        System.out.println("Enter user name:  "); 
        user = console.nextLine();
        System.out.println("Enter password:   ");
        pass = console .nextLine();
        
        if(user.equals("jade_1") && (pass.equals("Rainbow-1"))){
            System.out.println("Welcome Jade Glory, It is great to see you again");
        }else{
            System.out.println("Username or password incorrect, please try again");
        }
        
        while (true) {
            System.out.println("Enter phone number (or type 0 to exit): ");
            String phone = console.nextLine();
            
            if(phone.equals("0")) {
                System.out.println ("Goodbye");
                console.close();
                break;
            }
            
            String result = PhoneNumber.checkNumber(phone);
            System.out.println(result + "\n");
            
                    
                    
        }
    }
}

class PhoneNumber {
    
    public static final String VALID_PATTERN = "^(\\+27|0)\\d{9}$";
    private static final String VALID_MESSAGE = "Valid Phone Number"; 
    private static final String INVALID_MESSAGE  = "Invalid Phone Number";
    
    public static String checkNumber(String phone) {
        if (phone.matches ( VALID_PATTERN)) {
            return VALID_MESSAGE;
        } else {
            return INVALID_MESSAGE; 
        }
    }
    
}
