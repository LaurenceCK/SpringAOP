package Demo;

import org.springframework.stereotype.Component;

@Component
public class ShoppingCart {
    // Logging
    // Authentication && Authorisation
    // Sanitize the Data
    public void checkout(String status){
        System.out.println("Checkout method from shopping cart called");
    }
    public int quantity(){ return 2;}
}
