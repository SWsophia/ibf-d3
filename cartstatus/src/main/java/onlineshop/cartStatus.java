package onlineshop;

import java.util.ArrayList;
import java.util.List;

public class cartStatus 
{
    List<String> shopCart = new ArrayList<>();
        
    public int numberOfFruits()
    {
        return shopCart.size();
    }

    public String fruitList()
    {
        return shopCart.toString();
    }

    public void addFruit(String fruit)
    {
        shopCart.add(fruit);
    }


    public List<String> getcartStatus() {
        return shopCart;
    }
       
    
}
