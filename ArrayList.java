package NameGenerator;

public class ArrayList 
{ 
   String listNames = null;
   
   String[][] Top5MaleNames = {
        { "Top 5 Names", "Jacob", "Muhammad", "Shawn", "Aaron", "Jonah"}};
   String[][] Top10MaleNames = {
        { "Top 10 Names", "Jacob", "Muhammad", "Shawn", "Aaron", "Jonah", "Daniel", "Alex", "Liam", "Ryan", "James"}};
   String[][] Top15MaleNames = {
        { "Top 15 Names","Jacob", "Muhammad", "Shawn", "Aaron", "Jonah", "Daniel", "Alex", "Liam", "Ryan", "James", "Michael", "Ethan", "David", "Matthew", "Luke" }};
   String[][] Top5FemaleNames = {
        { "Top 5 Names", "Chole", "Emily", "Aaliyah", "Emma", "Jennifer" }};
   String[][] Top10FemaleNames = {
        { "Top 10 Names", "Chole", "Emily", "Aaliyah", "Emma", "Jennifer", "Olivia", "Jessica", "Hannah", "Lily", "Sarah" }};
   String[][] Top15FemaleNames = {
        { "Top 15 Names", "Chole", "Emily", "Aaliyah", "Emma", "Jennifer", "Olivia", "Jessica", "Hannah", "Lily", "Sarah", "Savannah", "Isabella", "Ava", "Sophia", "Ella" }};
                  
   public String MTList1(int i, int u)
      { 
            listNames = Top5MaleNames[i][u]; 
            return listNames; 
      }
   public String MTList2(int i, int u)
   { 
         listNames = Top10MaleNames[i][u]; 
         return listNames; 
   }
   public String MTList3(int i, int u)
   { 
         listNames = Top15MaleNames[i][u]; 
         return listNames; 
   }
   public String FTList1(int i, int u)
   { 
         listNames = Top5FemaleNames[i][u]; 
         return listNames; 
   }
   public String FTList2(int i, int u)
   { 
         listNames = Top10FemaleNames[i][u]; 
         return listNames; 
   }   
   public String FTList3(int i, int u)
   { 
         listNames = Top15FemaleNames[i][u]; 
         return listNames; 
   }
   public int ListT5MaleNamesLength()
   {
      int i = 0;
      i = Top5MaleNames.length;
      return i;
   }        
   public int ListT5MaleNamesLength2(int i)
   {
      int u = 0;
      u = Top5MaleNames[i].length;
      return u;
   }

   public int ListT10MaleNamesLength()
   {
      int i = 0;
      i = Top10MaleNames.length;
      return i;
   }      
   public int ListT10MaleNamesLength2(int i)
   {
      int u = 0;
      u = Top10MaleNames[i].length;
      return u;
   }
  
   public int ListT15MaleNamesLength()
   {
      int i = 0;
      i = Top15MaleNames.length;
      return i;
   }        
   public int ListT15MaleNamesLength2(int i)
   {
      int u = 0;
      u = Top15MaleNames[i].length;
      return u;
   }
   public int ListT5FemaleNamesLength()
   {
      int i = 0;
      i = Top5FemaleNames.length;
      return i;
   }        
   public int ListT5FemaleNamesLength2(int i)
   {
      int u = 0;
      u = Top5FemaleNames[i].length;
      return u;
   }
   public int ListT10FemaleNamesLength()
   {
      int i = 0;
      i = Top10FemaleNames.length;
      return i;
   }        
   public int ListT10FemaleNamesLength2(int i)
   {
      int u = 0;
      u = Top10FemaleNames[i].length;
      return u;
   }
   public int ListT15FemaleNamesLength()
   {
      int i = 0;
      i = Top15FemaleNames.length;
      return i;
   }        
   public int ListT15FemaleNamesLength2(int i)
   {
      int u = 0;
      u = Top15FemaleNames[i].length;
      return u;
   }
}
   
        