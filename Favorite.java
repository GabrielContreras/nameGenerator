package NameGenerator;
public class Favorite 
{
   String[] favorite = {
   " ", " ", " ", " ", " ", " ", " ", " ", " ", " "
   };
   
   int i = 0;
   public void favoriteArray(String name)
   {
      if(i < 10)
      {
         favorite[i] = name;
         i++;
      }   
      else
         System.out.println("Sorry, favorite list is full.");   
      
   }
   
   public String favoriteList(int u)
   {
      return favorite[u];
   }    
}