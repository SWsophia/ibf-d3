package onlineshop;

public class readUserCmd {

    private cartStatus shopCart;

    public readUserCmd() {
        shopCart = new cartStatus();
    }

    public cartStatus getCartStatus(){
        return shopCart;
    }

    // user input = "list", check shopCart size, and list items;

    public void cmdList(String userCmd)

    {
        while ("list".equals(userCmd));
        {
            if (shopCart.numberOfFruits() == 0)
            System.out.println("Your shop cart is empty");

            for (int i = 0; i < shopCart.getcartStatus().size(); i++)
            System.out.println("l" + (i+1) + "" + shopCart.getcartStatus().get(i));
            

        }
            
        
    }
    
}
           
            
        
