package NameGenerator;
import java.util.Random;

public class Names
{
   Random generator = new Random();
   
   String nameChosen = null;

   String[] unisexNames = {
      "Addison", "Adrian", "Ainsley", "Alex", "Alexis", "Angel", "Arden",
      "Ashley", "Aubrey", "Avery", "Bailey", "Beverly", "Blair", "Brett",
      "Cameron", "Casey", "Cassidy", "Chance", "Chase", "Cherokee",
      "Cody", "Codi", "Cory", "Corey", "Cori", "Courtney", "Dakota",
      "Dale", "Dana", "Darby", "Darcy", "Devon", "Devin", "Dominique",
      "Drew", "Dylan", "Elliott", "Eliot", "Ellis", "Emerson", "Emmerson",
      "Emery", "Evelyn", "Finley", "Fran", "Gale", "Gail", "Grayson", "Greyson",
      "Hadley", "Harlow", "Harper", "Hayden", "Hayley", "Hillary", "Hollis",
      "Hunter", "Iman", "Jamie", "Jayden", "Jaden", "Jaiden", "Jocelyn",
      "Jordan", "Joyce", "Kai", "Keegan", "Kelly", "Kelsey", "Kendall",
      "Kennedy", "Kim", "Kimberly", "Kimberely", "Lee", "Leigh",
      "Leslie", "Lesley", "Lindsay", "Lindsey", "Logan", "London",
      "Luca", "Lynn", "Lin", "Mackenzie", "Madison", "Marlowe", "Meredith",
      "Micah", "Morgan", "Murphy", "Noel", "Noelle", "Noor", "Parker", "Paris",
      "Peyton", "Payton", "Phoenix", "Quinn", "Randy", "Reese", "Reilly", "Riley",
      "Remy", "River", "Robin", "Rory", "Rowan", "Ryan", "Sage", "Sawyer", "Shannon",
      "Shelby", "Shirley", "Sheridan", "Shiloh", "Sidney", "Sydney", "Sky", "Skyler", "Skylar",
      "Stacy", "Stacey", "Teagan", "Taegan", "Terry", "Taylor", "Tracy", "Tracey", "Vivian", "Whiteny"
      };   

   String[] maleNames = {
      "Aaron","Adam","Austin","Arnold","Alexander","Andrew","Aiden","Austin",
      "Anthony","Barry","Benjamin","Blake","Brian","Brandon","Christopher",
      "Caleb","Calvin","Cody","Craig","Dalton","Daniel","David","Desmond",
      "Dwayne","Earl","Ethan","Eddie","Eli","Evan","Fox","Finn","Felix","Fritz",
      "Francis","Gale","Gil","Grey","Gus","Grant","Harry","Hal","Hank","Hunter",
      "Hugo","Ian","Irving","Israel","Issac","Ike","Jason","Jacob","Jonah","James",
      "John","Jack","Joshua","Joseph","Justin","Kevin","Kyle","Kai","Kurt","Kendall",
      "Lamar","Liam","Luke","Logan","Louis","Muhammad","Michael","Matthew","Mason",
      "Max","Noah","Niall","Nathan","Oli","Ozzy","Oliver","Otis","Pierce","Princeton",
      "Phil","Parker","Quentin","Quentin","Quinlan","Quintrell","Roy","Raj","Ralph","Randal",      
      "Ryan","Shawn","Spencer","Sam","Seth","Stephan","Tanner","Tyler","Ted","Tomas","Tevin",
      "Uriah","Uriel","Ulrich","Umar","Valentino","Van","Vincent","Victor","Vladimir",
      "William","Wade","Wally","Wayne","Wes","Xavier","Xander","Xavi","Yahari","Yestin",
      "York","Zac","Zion","Zed","Zayne"
      };

   String[] femaleNames = {
      "Abigail", "Adrianna", "Alana", "Alexandra", "Ally", "Amanda", "Anna", "Ariana",
      "Bailey", "Barbara", "Bella", "Beth", "Brianna", "Brooklyn", "Caitlin", "Caprice",
      "Caroline", "Cassie", "Cecilia", "Clarice", "Daisy", "Daniella", "Deborah", "Destiny",
      "Diana", "Dorothy", "Eden", "Eleanor", "Elena", "Elizabeth", "Ellie", "Emily", "Evelyn",
      "Faith", "Felicia", "Fernanda", "Fiona", "Francesca", "Gabriela", "Georgia", "Gina", "Giselle",
      "Gwen", "Hailey", "Hannah", "Heather", "Helena", "Hilary", "Ida", "Ilene", "Iliana", 
      "Irene", "Iris", "Isabel", "Ivy", "Jade", "Janet", "January", "Jaylynn",
      "Jasmine", "Jeanine", "Jennifer", "Jessica", "Jody", "Judy", "Juliana", "Kacey",
      "Karen", "Karissa", "Katelynn", "Kelly", "Kennedy", "Kiera", "Kimberly", "Kirsten",
      "Kylie", "Lacey", "Lana", "Layla", "Leah", "Lexi", "Lilah", "Lisa", "Livvy", "Logan",
      "Lois", "Lori", "Louisa", "Lucy", "Lynette", "Macey", "Mackenzie", "Madison", "Malia", 
      "Marcella", "Margaret", "Marianna", "Marissa", "Mary", "Melinda", "Melissa", "Michelle", 
      "Miley", "Molly", "Monica", "Naomi", "Natalie", "Nicole", "Nicki", "Norah", "Olive",
      "Olivia", "Paige", "Patricia", "Paulina", "Penny", "Priya", "Quinn", "Racharl", "Rachelle", 
      "Rebecca", "Renae", "Rhonda", "Riley", "Rosa", "Rosanna", "Ruth", "Sabrina", "Sally", 
      "Samantha", "Selena", "Shirley", "Sophia", "Stephanie", "Susanna", "Tabitha", "Talia",
      "Tatiana", "Taylor", "Tess", "Tiffany", "Tina", "Uma", "Valerie", "Vera", "Vicky", "Victoria", 
      "Violet", "Vivian", "Wendy", "Whitney", "Xena", "Yasmine", "Zelda", "Zia"
      };

   public void Name1()
   { 
         nameChosen = maleNames[generator.nextInt(126)];  
   }
   
   
   public void Name2()
   {
         nameChosen = femaleNames[generator.nextInt(152)];
   }
   
   public void Name3()
   {
         nameChosen = unisexNames[generator.nextInt(133)];
   }
   public String getNameChosen()
   {
      return nameChosen;
   }   
   public int NameLength()
   {
      int length = 0;
      
      length = nameChosen.length();
      return length;
   }
   public String getMaleNameChosenLength(int charLength)
   {
      int length = 0;
      
      do
      {
      nameChosen = maleNames[generator.nextInt(126)];
      length = nameChosen.length();
      }
      while(charLength != length);
      
      return nameChosen;
   }
   public String getFemaleNameChosenLength(int charLength)
   {
      int length = 0;
      
      do
      {
      nameChosen = femaleNames[generator.nextInt(152)];
      length = nameChosen.length();
      }
      while(charLength != length);
      
      return nameChosen;
   }
   public String getUnisexNameChosenLength(int charLength)
   {
      int length = 0;
      
      do
      {
      nameChosen = unisexNames[generator.nextInt(133)];
      length = nameChosen.length();
      }
      while(charLength != length);
      
      return nameChosen;
   }        
   public String getMaleNameChosenFirstCharacter(char firstLetter)
   {
      do
      {
      nameChosen = maleNames[generator.nextInt(126)];
      }
      while(firstLetter != nameChosen.charAt(0));
      
      return nameChosen;
   } 
   public String getFemaleNameChosenFirstCharacter(char firstLetter)
   {
      do
      {
      nameChosen = femaleNames[generator.nextInt(152)];
      }
      while(firstLetter != nameChosen.charAt(0));
      
      return nameChosen;
   }
   public String getUnisexNameChosenFirstCharacter(char firstLetter)
   {
      do
      {
      nameChosen = unisexNames[generator.nextInt(133)];
      }
      while(firstLetter != nameChosen.charAt(0));
      
      return nameChosen;
   }  
}      
