package NameGenerator;
public class List 
{
   String listNames = null;
   
   String[][] ListMaleNames = {
      { "A","Aaron","Adam","Austin","Arnold","Alexander","Andrew","Aiden","Austin", "Anthony"},
      { "B","Barry","Benjamin","Blake","Brian","Brandon"},
      { "C","Christopher","Caleb","Calvin","Cody","Craig" },
      { "D","Dalton","Daniel","David","Desmond","Dwayne" }, 
      { "E","Earl","Ethan","Eddie","Eli","Evan"},
      { "F","Fox","Finn","Felix","Fritz","Francis"},
      { "G","Gale","Gil","Grey","Gus","Grant"},
      { "H","Harry","Hal","Hank","Hunter","Hugo"}, 
      { "I","Ian","Irving","Israel","Issac","Ike"},
      { "J","Jason","Jacob","Jonah","James","John","Jack","Joshua","Joseph","Justin"},
      { "K","Kevin","Kyle","Kai","Kurt","Kendall"},
      { "L","Lamar","Liam","Luke","Logan","Louis"},
      { "M","Muhammad","Michael","Matthew","Mason","Max"},
      { "N","Noah","Niall","Nathan"},
      { "O","Oli","Ozzy","Oliver","Otis"},
      { "P","Pierce","Princeton","Phil","Parker"},
      { "Q","Quentin","Quentin","Quinlan","Quintrell"},
      { "R","Roy","Raj","Ralph","Randal","Ryan"},
      { "S","Shawn","Spencer","Sam","Seth","Stephan"},
      { "T","Tanner","Tyler","Ted","Tomas","Tevin"},
      { "U","Uriah","Uriel","Ulrich","Umar"},
      { "V","Valentino","Van","Vincent","Victor","Vladimir"},
      { "W","William","Wade","Wally","Wayne","Wes"},
      { "X","Xavier","Xander","Xavi"},
      { "Y","Yahari","Yestin","York"},
      { "Z", "Zac","Zion","Zed","Zayne"}};
    
   String[][] ListFemaleNames = {
      { "A","Abigail", "Adrianna", "Alana", "Alexandra", "Ally", "Amanda", "Anna", "Ariana"},
      { "B","Bailey", "Barbara", "Bella", "Beth", "Brianna", "Brooklyn"},
      { "C","Caitlin", "Caprice","Caroline", "Cassie", "Cecilia", "Clarice" },
      { "D","Daisy", "Daniella", "Deborah", "Destiny", "Diana", "Dorothy" }, 
      { "E","Eden", "Eleanor", "Elena", "Elizabeth", "Ellie", "Emily", "Evelyn"},
      { "F","Faith", "Felicia", "Fernanda", "Fiona", "Francesca"},
      { "G","Gabriela", "Georgia", "Gina", "Giselle","Gwen"},
      { "H","Hailey", "Hannah", "Heather", "Helena", "Hilary"}, 
      { "I","Ida", "Ilene", "Iliana","Irene", "Iris", "Isabel", "Ivy"},
      { "J","Jade", "Janet", "January", "Jaylynn","Jasmine", "Jeanine", "Jennifer", "Jessica", "Jody", "Judy", "Juliana"},
      { "K","Kacey", "Karen", "Karissa", "Katelynn", "Kelly", "Kennedy", "Kiera", "Kimberly", "Kirsten","Kylie"},
      { "L","Lacey", "Lana", "Layla", "Leah", "Lexi", "Lilah", "Lisa", "Livvy", "Logan", "Lois", "Lori", "Louisa", "Lucy", "Lynette"},
      { "M","Macey", "Mackenzie", "Madison", "Malia", "Marcella", "Margaret", "Marianna", "Marissa", "Mary", "Melinda", "Melissa", "Michelle", "Miley", "Molly", "Monica"},
      { "N","Naomi", "Natalie", "Nicole", "Nicki", "Norah"},
      { "O","Olive", "Olivia"},
      { "P","Paige", "Patricia", "Paulina", "Penny", "Priya"},
      { "Q","Quinn"},
      { "R","Racharl", "Rachelle", "Rebecca", "Renae", "Rhonda", "Riley", "Rosa", "Rosanna", "Ruth"},
      { "S","Sabrina", "Sally", "Samantha", "Selena", "Shirley", "Sophia", "Stephanie", "Susanna"},
      { "T","Tabitha", "Talia","Tatiana", "Taylor", "Tess", "Tiffany", "Tina"},
      { "U","Uma"},
      { "V","Valerie", "Vera", "Vicky", "Victoria", "Violet", "Vivian"},
      { "W","Wendy", "Whitney"},
      { "X","Xena"},
      { "Y","Yasmine"},
      { "Z","Zelda", "Zia"}};
      
   String[][] ListUnisexNames = {
      { "A","Adrian", "Ainsley", "Alex", "Alexis", "Angel", "Arden", "Ashley", "Aubrey", "Avery"},
      { "B","Bailey", "Beverly", "Blair", "Brett"},
      { "C", "Cameron", "Casey", "Cassidy", "Chance", "Chase", "Cherokee", "Cody", "Codi", "Cory", "Corey", "Cori", "Courtney"},
      { "D","Dakota", "Dale", "Dana", "Darby", "Darcy", "Devon", "Devin", "Dominique", "Drew", "Dylan"}, 
      { "E","Elliott", "Eliot", "Ellis", "Emerson", "Emmerson", "Emery", "Evelyn"},
      { "F","Finley", "Fran"},
      { "G","Gale", "Gail", "Grayson", "Greyson"},
      { "H","Hadley", "Harlow", "Harper", "Hayden", "Hayley", "Hillary", "Hollis", "Hunter"}, 
      { "I","Iman"},
      { "J","Jamie", "Jayden", "Jaden", "Jaiden", "Jocelyn", "Jordan", "Joyce"},
      { "K","Kai", "Keegan", "Kelly", "Kelsey", "Kendall", "Kennedy", "Kim", "Kimberly", "Kimberely"},
      { "L","Lee", "Leigh","Leslie", "Lesley", "Lindsay", "Lindsey", "Logan", "London", "Luca", "Lynn", "Lin"},
      { "M","Mackenzie", "Madison", "Marlowe", "Meredith", "Micah", "Morgan", "Murphy"},
      { "N", "Noel", "Noelle", "Noor"},
      { "P","Parker", "Paris","Peyton", "Payton", "Phoenix"},
      { "Q","Quinn"},
      { "R","Racharl", "Rachelle", "Rebecca", "Renae", "Rhonda", "Riley", "Rosa", "Rosanna", "Ruth"},
      { "S","Sage", "Sawyer", "Shannon", "Shelby", "Shirley", "Sheridan", "Shiloh", "Sidney", "Sydney", "Sky", "Skyler", "Skylar", "Stacy", "Stacey"},
      { "T","Teagan", "Taegan", "Terry", "Taylor", "Tracy", "Tracey"},
      { "U","Uma"},
      { "V","Vivian"},
      { "W","Whitney"}};
   
   public String List1(int i, int u)
   { 
         listNames = ListMaleNames[i][u]; 
         return listNames; 
   }
   
   public String List2(int i, int u)
   {
         listNames = ListFemaleNames[i][u];
         return listNames;
   }
   
   public String List3(int i, int u)
   {
         listNames = ListUnisexNames[i][u];
         return listNames;
   }
   public String getListNames()
   {
      return listNames;
   }     
   public int ListMaleNamesLength()
   {
      int i = 0;
      i = ListMaleNames.length;
      return i;
   }        
   public int ListMaleNamesLength2(int i)
   {
      int u = 0;
      u = ListMaleNames[i].length;
      return u;
   }
   public int ListFemaleNamesLength()
   {
      int i = 0;
      i = ListFemaleNames.length;
      return i;
   }        
   public int ListFemaleNamesLength2(int i)
   {
      int u = 0;
      u = ListFemaleNames[i].length;
      return u;
   }
   public int ListUnisexNamesLength()
   {
      int i = 0;
      i = ListUnisexNames.length;
      return i;
   }        
   public int ListUnisexNamesLength2(int i)
   {
      int u = 0;
      u = ListUnisexNames[i].length;
      return u;
   }
}      
