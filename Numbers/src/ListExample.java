import java.util.*;
class ListExample{
 public static void main(String args[]){
 
  ArrayList<String> al=new ArrayList<String>();
  al.add("Ravi");
  al.add("Vijay");
  al.add("Ravi");
  al.add("Ajay");
al.add("anil");
al.add("barvi");

  for(String obj:al)
    System.out.println(obj);
 }
}
