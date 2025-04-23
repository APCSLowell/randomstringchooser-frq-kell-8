import java.util.*;
public class RandomStringChooser
{
  private ArrayList <String> strings;
  public RandomStringChooser(String [] array){
    for (int i = 0; i<array.length; i++){
      strings.add(array[i]);
    }
  }
  public String getNext(){
    if (strings.size() == 0){
      return "NONE";
    }
    int random = (int)(Math.random()*strings.size());
    String temp = strings.get(random);
    strings.remove(random);
    return temp;
  }
  //You will get a very confusing error message until you have working code in part b as well
}
