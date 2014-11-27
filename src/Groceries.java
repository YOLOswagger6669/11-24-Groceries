// main program to run the GroceryList
import java.util.*;

public class GroceryList
{
  ArrayList<GroceryItem> list;
  public GroceryList()
  {
    list = new ArrayList<GroceryItem>();
  }
  public void add(GroceryItem item)
  {
    list.add(item);
  }
  public double getTotalCost()
  {
    double a=0.0;
    for(int i=0; i<list.size(); i++)
    {
      a+=list.get(i).p*list.get(i).q;
    }
    return a;
  }
  public String toString()
  {
    String s=" ";
    for(int i=0; i<list.size(); i++)
    {
      s+=list.get(i).toString()+"\n";
    }
    return s;
  }
}
