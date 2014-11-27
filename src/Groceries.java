// main program to run the GroceryList
import java.lang.*;
public class Groceries
{
  public static void main(String[] args)
  {
    GroceryList I=new GroceryList();
    GroceryItem I1=new GroceryItem("Lucky Charms", 69, 3.5);
    GroceryItem I2=new GroceryItem("Wheeties", 3, 4.20);
    GroceryItem I3=new GroceryItem("kyle loooooops", 2, Math.PI);
    GroceryItem I4=new GroceryItem("Wiild Loooops", 4, 2*Math.PI);
    GroceryItem I5=new GroceryItem("SUPER CEREAL", 666, 0.2);
    I.list.add(I1);
    I.list.add(I2);
    I.list.add(I3);
    I.list.add(I4);
    I.list.add(I5);
    System.out.println(I.toString());
    System.out.println(I.getTotalCost());
  }
}
