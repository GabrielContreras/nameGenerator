package NameGenerator;
import java.util.*;

public class NameGen
{
   public static void main (String[] args)
   {
   
      //****************************************************
      // Initialization and decleration of variables
      //****************************************************
      
      Names femaleName, maleName, unisexName, nameLength;
      List femaleName2, maleName2, unisexName2, nameLength2;
      ArrayList femaleName3, maleName3, unisexName3, nameLength3;
      Favorite name = new Favorite();
      
      femaleName = new Names();
      maleName = new Names();
      unisexName = new Names();
      
      femaleName2 = new List();
      maleName2 = new List();
      unisexName2 = new List();
      
      femaleName3 = new ArrayList();
      maleName3 = new ArrayList();
      unisexName3 = new ArrayList();
      
      int charLength = 99;
      String choice = null;
      String choice2 = null;
      String choice3 = " ";
      char firstLetter;
      String gender = " ";
      String letterChange = null;
      String nameChosen = null;
      String favoriteAnswer = " ";
      
      Scanner scan = new Scanner(System.in);
      
      //****************************************************
      // Main Menu
      //****************************************************
      do
      {
      System.out.println("\nThis program will provide randomly generated names.\n");
      System.out.print("Please choose from the following: \n1. Random Name Generator\n2. List of names\n3. Favorites List\n0. Quit Program\n");
      choice = scan.nextLine();

      switch(choice)
      {
         //*****************
         // Exit
         //*****************
         
         case "0":
            System.out.println("Thank you for using this program.");
            break;
            
         //*****************************************
         //
         //       Random Name Generator
         //
         //*****************************************
         
         case "1":
             System.out.println("Please enter a gender (male, female, or unisex): ");
             gender = scan.nextLine();
            while(!gender.equals("quit"))
            {
               switch(gender)
               {
                  //************************************
                  // Male Name Generator
                  //************************************
                  
                  case "male":
                  case "MALE":
                  case "Male":
                  {
                     System.out.println("Please choose the way which the name will be generated: \n1. Completely random. \n2. By amount of characters. \n3. By first letter \n0. Return");
                     choice2 = scan.nextLine();
                     
                     while(!choice2.equals("0"))
                     {
                        switch(choice2)
                        {
                           // Quit
                           case "0":   
                              break;
                           
                           //Randomly Chosen Name   
                           case "1":
                              maleName.Name1();
                              nameChosen = maleName.getNameChosen();
                              System.out.println(nameChosen);
                              
                              do
                              {
                                 System.out.println("Would you like to save this name into your favorites?");
                                 favoriteAnswer = scan.nextLine();
                              
                                 switch(favoriteAnswer)
                                 {
                                    case "Yes":
                                    case "YES":
                                    case "yes":
                                       name.favoriteArray(nameChosen);
                                       favoriteAnswer = "complete";
                                       break;
                                    case "no":
                                    case "NO":
                                    case "No":
                                       System.out.println("Okay, continuing on.");
                                       favoriteAnswer = "complete";
                                       break;
                                    default:
                                       System.out.println("Incorrect input. Please try again.");
                                       break;      
                                 }
                              }
                              while(!favoriteAnswer.equals("complete"));
                              favoriteAnswer = null;   
                              break;
                           
                           // Name by amount of characters.   
                           case "2":
                           {  
                              System.out.println("How many characters should the name hold? (0 to quit)");
                              while(!scan.hasNextInt())
                              {
                                 scan.next();
                                 System.out.println("How many characters should the name hold? (0 to quit)");
                              }   
                              charLength = scan.nextInt();
                             
                              nameChosen = maleName.getMaleNameChosenLength(charLength);
                              System.out.println(nameChosen);
                              
                              do
                              {
                                 scan.nextLine();
                                 System.out.println("Would you like to save this name into your favorites?");
                                 favoriteAnswer = scan.nextLine();
                              
                                 switch(favoriteAnswer)
                                 {
                                    case "Yes":
                                    case "YES":
                                    case "yes":
                                       name.favoriteArray(nameChosen);
                                       favoriteAnswer = "complete";
                                       break;
                                    case "no":
                                    case "NO":
                                    case "No":
                                       System.out.println("Okay, continuing on.");
                                       favoriteAnswer = "complete";
                                       break;
                                    default:
                                       System.out.println("Incorrect input. Please try again.");
                                       break;      
                                 }
                              }
                              while(!favoriteAnswer.equals("complete"));
                              favoriteAnswer = " ";
                           }   
                              break;
                           
                           //Name by first letter.   
                           case "3":
                           {
                              System.out.println("Which first letter would you prefer?");
                              letterChange = scan.next();
                              letterChange = letterChange.toUpperCase();
                              
                              firstLetter = letterChange.charAt(0);
                              nameChosen = maleName.getMaleNameChosenFirstCharacter(firstLetter);
                              System.out.println(nameChosen);
                              
                              do
                              {
                                 System.out.println("Would you like to save this name into your favorites?");
                                 scan.nextLine();
                                 favoriteAnswer = scan.nextLine();
                              
                                 switch(favoriteAnswer)
                                 {
                                    case "Yes":
                                    case "YES":
                                    case "yes":
                                       name.favoriteArray(nameChosen);
                                       favoriteAnswer = "complete";
                                       break;
                                    case "no":
                                    case "NO":
                                    case "No":
                                       System.out.println("Okay, continuing on.");
                                       favoriteAnswer = "complete";
                                       break;
                                    default:
                                       System.out.println("Incorrect input. Please try again.");
                                       break;      
                                 }
                              }
                              while(!favoriteAnswer.equals("complete"));
                              favoriteAnswer = " ";
                           }
                              break;
                           default:
                              System.out.println("Incorrect input. Please try again.");
                              break;   
                        }
                        System.out.println("Please choose the way which the name will be generated: \n1. Completely random. \n2. By amount of characters. \n3. By first letter \n0. Return");
                        choice2 = scan.nextLine();
                     }                    
                  }
                     break;
                  
                  //******************************
                  // Female Name Generator
                  //******************************
                     
                  case "female":
                  case "Female":
                  case "FEMALE":
                  {   
                     System.out.println("Please choose the way which the name will be generated: \n1. Completely random. \n2. By amount of characters. \n3. By first letter \n0. Return");
                     choice2 = scan.nextLine();
                     
                     switch(choice2)
                     {
                        //Exit
                        case "0":   
                           break;
                        
                        //Randomly Chosen Name.   
                        case "1":
                           femaleName.Name2();
                           nameChosen = femaleName.getNameChosen();
                           System.out.println(nameChosen);
                           
                           do
                           {
                              System.out.println("Would you like to save this name into your favorites?");
                              favoriteAnswer = scan.nextLine();
                           
                              switch(favoriteAnswer)
                              {
                                 case "Yes":
                                 case "YES":
                                 case "yes":
                                    name.favoriteArray(nameChosen);
                                    favoriteAnswer = "complete";
                                    break;
                                 case "no":
                                 case "NO":
                                 case "No":
                                    System.out.println("Okay, continuing on.");
                                    favoriteAnswer = "complete";
                                    break;
                                 default:
                                    System.out.println("Incorrect input. Please try again.");
                                    break;      
                              }
                           }
                           while(!favoriteAnswer.equals("complete"));
                           favoriteAnswer = " ";
                           break;
                        
                        //Name by amount of characters.   
                        case "2":
                        {   
                           System.out.println("How many characters should the name hold? (0 to quit)");
                           while(!scan.hasNextInt())
                              {
                                 scan.next();
                                 System.out.println("How many characters should the name hold? (0 to quit)");
                              }
                           charLength = scan.nextInt();
                           nameChosen = femaleName.getFemaleNameChosenLength(charLength);
                           System.out.println(nameChosen);
                           
                           do
                           {
                              System.out.println("Would you like to save this name into your favorites?");
                              scan.nextLine();
                              favoriteAnswer = scan.nextLine();
                           
                              switch(favoriteAnswer)
                              {
                                 case "Yes":
                                 case "YES":
                                 case "yes":
                                    name.favoriteArray(nameChosen);
                                    favoriteAnswer = "complete";
                                    break;
                                 case "no":
                                 case "NO":
                                 case "No":
                                    System.out.println("Okay, continuing on.");
                                    favoriteAnswer = "complete";
                                    break;
                                 default:
                                    System.out.println("Incorrect input. Please try again.");
                                    break;      
                              }
                           }
                           while(!favoriteAnswer.equals("complete"));
                           favoriteAnswer = " ";
                        }
                           break;
                           
                        //Name by first letter.   
                        case "3":
                        {
                           System.out.println("Which first letter would you prefer?");
                           letterChange = scan.next();
                           letterChange = letterChange.toUpperCase();
                           
                           firstLetter = letterChange.charAt(0);
                           nameChosen = femaleName.getFemaleNameChosenFirstCharacter(firstLetter);
                           System.out.println(nameChosen);
                           
                           do
                           {
                              System.out.println("Would you like to save this name into your favorites?");
                              scan.nextLine();
                              favoriteAnswer = scan.nextLine();
                           
                              switch(favoriteAnswer)
                              {
                                 case "Yes":
                                 case "YES":
                                 case "yes":
                                    name.favoriteArray(nameChosen);
                                    favoriteAnswer = "complete";
                                    break;
                                 case "no":
                                 case "NO":
                                 case "No":
                                    System.out.println("Okay, continuing on.");
                                    favoriteAnswer = "complete";
                                    break;
                                 default:
                                    System.out.println("Incorrect input. Please try again.");
                                    break;      
                              }
                           }
                           while(!favoriteAnswer.equals("complete"));
                           favoriteAnswer = " ";
                        }
                           break;
                        default:
                           System.out.println("Incorrect input. Please try again.");
                           break;   
                     }
                  }
                     break;
                     
                  //***************************************
                  // Unisex Name Generator
                  //***************************************
                     
                  case "unisex":
                  case "Unisex":
                  case "UNISEX":
                  {   
                     System.out.println("Please choose the way which the name will be generated: \n1. Completely random. \n2. By amount of characters. \n3. By first letter \n0. Return");
                     choice2 = scan.nextLine();
                     
                     switch(choice2)
                     {
                        //Exit
                        case "0":   
                           break;
                        
                        //Randomly Chosen Name.   
                        case "1":
                           unisexName.Name3();
                           nameChosen = unisexName.getNameChosen();
                           System.out.println(nameChosen);
                           
                           do
                           {
                              System.out.println("Would you like to save this name into your favorites?");
                              favoriteAnswer = scan.nextLine();
                           
                              switch(favoriteAnswer)
                              {
                                 case "Yes":
                                 case "YES":
                                 case "yes":
                                    name.favoriteArray(nameChosen);
                                    favoriteAnswer = "complete";
                                    break;
                                 case "no":
                                 case "NO":
                                 case "No":
                                    System.out.println("Okay, continuing on.");
                                    favoriteAnswer = "complete";
                                    break;
                                 default:
                                    System.out.println("Incorrect input. Please try again.");
                                    break;      
                              }
                           }
                           while(!favoriteAnswer.equals("complete"));
                           favoriteAnswer = " ";   

                           break;
                           
                        //Name by amount of characters   
                        case "2":
                        {   
                           System.out.println("How many characters should the name hold? (0 to quit)");
                           while(!scan.hasNextInt())
                           {
                              scan.next();
                              System.out.println("How many characters should the name hold? (0 to quit)");
                           }
                           nameChosen = unisexName.getUnisexNameChosenLength(charLength);
                           System.out.println(nameChosen);
                           
                           do
                           {
                              System.out.println("Would you like to save this name into your favorites?");
                              scan.nextLine();
                              favoriteAnswer = scan.nextLine();
                           
                              switch(favoriteAnswer)
                              {
                                 case "Yes":
                                 case "YES":
                                 case "yes":
                                    name.favoriteArray(nameChosen);
                                    favoriteAnswer = "complete";
                                    break;
                                 case "no":
                                 case "NO":
                                 case "No":
                                    System.out.println("Okay, continuing on.");
                                    favoriteAnswer = "complete";
                                    break;
                                 default:
                                    System.out.println("Incorrect input. Please try again.");
                                    break;      
                              }
                           }
                           while(!favoriteAnswer.equals("complete"));
                           favoriteAnswer = " ";
                        }
                           break;
                           
                        //Name by first letter.   
                        case "3":
                           System.out.println("Which first letter would you prefer?");
                           letterChange = scan.next();
                           letterChange = letterChange.toUpperCase();
                           
                           firstLetter = letterChange.charAt(0);
                           nameChosen = unisexName.getUnisexNameChosenFirstCharacter(firstLetter);
                           System.out.println(nameChosen);
                           
                           do
                           {
                              System.out.println("Would you like to save this name into your favorites?");
                              scan.nextLine();
                              favoriteAnswer = scan.nextLine();
                           
                              switch(favoriteAnswer)
                              {
                                 case "Yes":
                                 case "YES":
                                 case "yes":
                                    name.favoriteArray(nameChosen);
                                    favoriteAnswer = "complete";
                                    break;
                                 case "no":
                                 case "NO":
                                 case "No":
                                    System.out.println("Okay, continuing on.");
                                    favoriteAnswer = "complete";
                                    break;
                                 default:
                                    System.out.println("Incorrect input. Please try again.");
                                    break;      
                              }
                           }
                           while(!favoriteAnswer.equals("complete"));
                           favoriteAnswer = " ";
                              
                           break;
                        default:
                           System.out.println("Incorrect input. Please try again.");
                           break;   
                     }
                  }
                     break;    
                  default:
                     System.out.println("Sorry, incorrect input. Please try again.");     
               }
               System.out.println("Enter a gender (quit to end)");
               gender = scan.nextLine();   
            }         
            break;            
              
         //***************************************************
         //
         //       List of Names
         //
         //***************************************************               
         case "2":
            
            System.out.println("Enter a gender (male, female, unisex, or quit to return)");
            gender = scan.nextLine();
            while(!gender.equals("quit"))
            {
               switch(gender)
               {
                  //********************************
                  // Male List
                  //********************************
                  
                  case "male":
                  case "MALE":
                  case "Male":
                     while(!choice3.equals("0"))
                     {
                        System.out.println("Please choose an option:\n1. Entire list of names. \n2. Top 5 Male Names\n3. Top 10 Male names\n4. Top 15 Males Names\n0. Return");
                        choice3 = scan.nextLine();
                        
                        switch(choice3)
                        {
                           //Exit
                           case "0":
                              System.out.println("Okay. Continuing on.");
                              break;
                           
                           //Entire List   
                           case "1":
                              for (int i = 0; i < maleName2.ListMaleNamesLength(); i++)
                              {   
                                 System.out.print(maleName2.List1(i,0) + ": ");
                                 for (int j = 1; j < maleName2.ListMaleNamesLength2(i); j++)
                                 {
                                    System.out.print(maleName2.List1(i,j) + " ");
                             
                                 }
                                 System.out.print("\n");
                              }
                              break;
                              
                           //Top 5 Names   
                           case "2":
                              for (int i = 0; i < maleName3.ListT5MaleNamesLength(); i++) 
                              {
                                 System.out.print(maleName3.MTList1(i,0) + ": ");
                                 for (int j = 1; j < maleName3.ListT5MaleNamesLength2(i); j++) 
                                 {
                                    System.out.print(maleName3.MTList1(i,j) + " ");
                                    if (j % 5 == 0)
                                       System.out.println("\n \t");
                                 }
                              }
                              break;
                              
                           //Top 10 Names   
                           case "3":
                              for (int i = 0; i < maleName3.ListT10MaleNamesLength(); i++) 
                              {
                                 System.out.print(maleName3.MTList2(i,0) + ": ");
                                 for (int j = 1; j < maleName3.ListT10MaleNamesLength2(i); j++) 
                                 {
                                    System.out.print(maleName3.MTList2(i,j) + " ");
                                    if (j % 5 == 0)
                                       System.out.println("\n \t");
                                 }
                              }   
                              break;
                              
                           //Top 15 Names   
                           case "4":
                              for (int i = 0; i < maleName3.ListT15MaleNamesLength(); i++) 
                              {
                                 System.out.print(maleName3.MTList3(i,0) + ": ");
                                 for (int j = 1; j < maleName3.ListT15MaleNamesLength2(i); j++) 
                                 {
                                    System.out.print(maleName3.MTList3(i,j) + " ");
                                    if (j % 5 == 0)
                                       System.out.println("\n \t");
                                 }
                              }   
                              break;         
                           default:
                              System.out.println("Incorrect input. Please try again.");
                              break;            
                        }
                     }   
                     break;
                     
                  //********************
                  // Female List
                  //********************
                     
                  case "female":
                  case "FEMALE":
                  case "Female":
                     while(!choice3.equals("0"))
                     {
                        System.out.println("Please choose an option:\n1. Entire list of names. \n2. Top 5 Female Names\n3. Top 10 Female names\n4. Top 15 Females Names\n0. Return");
                        choice3 = scan.nextLine();
                        
                        switch(choice3)
                        {
                           //Exit      
                           case "0":
                              System.out.println("Okay. Continuing on.");
                              break;
                           
                           //Entire List.   
                           case "1":
                              for (int i = 0; i < femaleName2.ListFemaleNamesLength(); i++)
                              {   
                                 System.out.print(femaleName2.List1(i,0) + ": ");
                                 for (int j = 1; j < femaleName2.ListFemaleNamesLength2(i); j++)
                                 {
                                    System.out.print(femaleName2.List1(i,j) + " ");
                             
                                 }
                                 System.out.print("\n");
                              }
                              break;
                              
                           //Top 5 Names.   
                           case "2":   
                              for (int i = 0; i < femaleName3.ListT5FemaleNamesLength(); i++) 
                              {
                                 System.out.print(femaleName3.FTList1(i,0) + ": ");
                                 for (int j = 1; j < femaleName3.ListT5FemaleNamesLength2(i); j++) 
                                 {
                                    System.out.print(femaleName3.FTList1(i,j) + " ");
                                    if (j % 5 == 0)
                                       System.out.println("\n \t");
                                 }
                              }   
                              break;
                              
                           //Top 10 Names.   
                           case "3":
                              for (int i = 0; i < femaleName3.ListT10FemaleNamesLength(); i++) 
                              {
                                 System.out.print(femaleName3.FTList2(i,0) + ": ");
                                 for (int j = 1; j < femaleName3.ListT10FemaleNamesLength2(i); j++) 
                                 {
                                    System.out.print(femaleName3.FTList2(i,j) + " ");
                                    if (j % 5 == 0)
                                       System.out.println("\n \t");
                                 }
                              }   
                              break;
                              
                           //Top 15 Names.   
                           case "4":   
                              for (int i = 0; i < femaleName3.ListT15FemaleNamesLength(); i++) 
                              {
                                 System.out.print(femaleName3.FTList3(i,0) + ": ");
                                 for (int j = 1; j < femaleName3.ListT15FemaleNamesLength2(i); j++) 
                                 {
                                    System.out.print(femaleName3.FTList3(i,j) + " ");
                                    if (j % 5 == 0)
                                       System.out.print("\n\t\t");
                                 }
                              }   
                              break;         
                           default:
                              System.out.println("Incorrect input. Please try again.");
                              break;
                        }
                     }   
                     break;
                     
                  //********************
                  // Unisex List
                  //********************
                     
                  case "unisex":
                  case "UNISEX":
                  case "Unisex":
                  
                     //Entre List   
                     for (int i = 0; i < unisexName2.ListUnisexNamesLength(); i++)
                     {   
                        System.out.print(unisexName2.List3(i,0) + ": ");
                        for (int j = 1; j < unisexName2.ListUnisexNamesLength2(i); j++)
                        {
                           System.out.print(unisexName2.List3(i,j) + " ");
                          
                        }
                        System.out.print("\n");
                     }
                     break;    
                  default:
                     System.out.println("Sorry, incorrect input. Please try again.");
                     break;       
               }         
               
               System.out.println("Enter a gender (male, female, or unisex)");
               gender = scan.nextLine();
            }   
            break;
            
         //***************************************
         //
         //       Favorites List
         //
         //***************************************
            
         case "3":
            for(int i = 0; i<10;i++)
            {
               int u = i + 1;
               System.out.println("Name " + u +": " + name.favoriteList(i));
            }
            break;
         default:
            System.out.println("Invalid input. Please try again.");
            break;
         }      
      }
      while(!choice.equals("0"));       
   }
}      