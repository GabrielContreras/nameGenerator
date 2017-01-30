# Programming Concepts Project
Random name generator written in Java which I created in a team of 3.
### Program allows for three main options
  * Randomly generate a list of male, female, or unisex names with or without certain parameters
  * Show the entire list of names for each catagory
  * Show the list of names that were favorited from the first option

## File Descriptions:

### NameGen.java

  This is the file with the main function. The UI portion of the program resides here,
  which asks the user to input through the different functionalities the program allows.

### ArrayList.java
  This file contains preset lists of names with catagories such as "Top 5 Female Names" 
  and functions to call those names.
  
### Names.java
  This file is the core of the program. It contains the entire list of names set in three different arrays.
  It also contains the algorithms for the random name generator and for the parameter restrictions.
  
### List.java
  This file has an organized lists of names based on the first letter. The following functions are used 
  in order to determine the first letter and length of the name.

### Favorite.java
  This file allows for the functionality of favoriting names. The names which are favorited are placed in
  an array located in this file.
