// class to represent a grocery item
public class GroceryItem
{
  String name;
  int q;
  double p;
  public GroceryItem(String inputName, int quantity, double pricePerUnit)
  {
    name=inputName;
    q=quantity;
    p=pricePerUnit;
  }
  public double getCost()
  {
    return q*p;
  }
  public void setQuantity(int quantity)
  {
    q=quantity;
  }
  public String toString()
  {
    return q+" "+name+" @ $"+p+" = "+getCost();
  }
}
