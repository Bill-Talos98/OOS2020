import java.io.*;
import java.util.*;
public class ShoppingCart 
{
    public static void main(String[] args) 
    {
        ArrayList orderList = new ArrayList(1);
        {
            orderList.add("Pen");
            orderList.add("Pencil");
            orderList.add("Notebook");
            orderList.add("Paper");
        }
        System.out.print("+");
        System.out.print("*-*-*-*-*-*-*-*-*-*-*");
        System.out.println("+");
        System.out.print("|");
        System.out.print("!!The list of Item Ordered!!");
        System.out.println("|");
        System.out.print("+");
        System.out.print("*-*-*-*-*-*-*-*-*-*-*");
        System.out.println("+");
        for (int i = 0; i < orderList.size(); i++)
        {
            System.out.print("-> ");
            System.out.println(orderList.get(i));
        }
    }
}

