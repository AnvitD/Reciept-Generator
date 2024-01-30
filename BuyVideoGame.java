
/**
 * this program asks questions about the prouduct and the buyer and gives them a reciept. 
 *
 * @author Anvit Dhamnekar
 * @version 11/24/2021
 */
import java.util.Scanner;
import java.util.Map; 
import java.util.HashMap;            
public class BuyVideoGame
{
    public static void main(String[ ] args)
    {
        String userInputName; 
        String userInputDate;
        String userInputProduct;
        String userInputQuantity;
        String userInputPrice;
        String userInputDebitCard;
        String userInputPin;
        double doubleValueDate;
        double doubleValuePrice;
        int intValueQuantity; 
        int intValueDebitCard;
        int intValuePin;

        Scanner in = new Scanner(System.in);

        // First and last name
        System.out.println("Enter your first and last name please.");                                          
        userInputName = in.nextLine();
        //date
        System.out.println("Please enter today's date (mm/dd/yyyy)"); 
        userInputDate = in.nextLine(); 
        // Product name 
        System.out.println("Please enter the name of the object you are buying"); 
        userInputProduct = in.nextLine(); 
        // Quantity
        System.out.println("Please enter the quantity that you will be buying"); 
        userInputQuantity = in.nextLine(); 
        intValueQuantity = Integer.parseInt(userInputQuantity); 
        //Price
        System.out.println("Please enter the price given on the product"); 
        userInputPrice = in.nextLine(); 
        doubleValuePrice = Double.parseDouble(userInputPrice); 
        // Card number
        System.out.println("Enter your debit card account number (####-####-####");
        userInputDebitCard = in.nextLine(); 
       
        // Pin
        System.out.println("Enter the pin for your card (#######)"); 
        userInputPin = in.nextLine(); 
        intValuePin = Integer.parseInt(userInputPin); 
        
        Map<String,String> inputs = new HashMap<String,String>(); 
        inputs.put("userInputDate",userInputDate); 
        inputs.put("userInputName",userInputName); 
        
        String dateChange = inputs.get("userInputDate").replace("/","-"); 
        String concileCard = userInputDebitCard.substring(10,14); 
        
        String showName[] = inputs.get("userInputName").split(" "); 
        
        String order = userInputName.substring(2,7); 
        String orderC = userInputPin.substring(0,2); 
        
        
        
        
        
        
        System.out.println(); 
        System.out.println(); 
        System.out.println("*********************************************************************************************************************************************************************");
        System.out.println();
        System.out.println("Your reciept");
        System.out.println();
        System.out.println("Date " + dateChange);
        System.out.println(); 
        System.out.println();
        System.out.println("User information");
        System.out.println();
        System.out.println("name: " + showName[0].substring(0,1) + ". " + showName[1]);
        System.out.println("Debit card number : XXXX-XXX-" + concileCard);
        System.out.println("Pin :" + userInputPin);
        System.out.println();
        System.out.println("Checkout");
        System.out.println(); 
        System.out.println("Order number: " + order + orderC); 
        System.out.println("Product - " + userInputProduct);
        System.out.println("Quantity - " + userInputQuantity);
        System.out.println("Price for one item - $" + userInputPrice);
        System.out.println();
        System.out.println("Total price " + intValueQuantity * doubleValuePrice);
        System.out.println();
        System.out.println();
        System.out.println("Enjoy your purchase!");
        System.out.println("*********************************************************************************************************************************************************************");
      
    }
}