# Proposed Solutions

## Questions

### **Question 3:**

The code just verifies if the the number i is a multiple of 3, 5, or both. Just execute it

### **Questions 4 e 5:**

I've started with a simple class Main without concerning about good practice with OOP. So, subsequently I have done by this way, because it's a good practice for testing. I've just writed tests until having 100% of coverage of the class, but it's a good practice to test all fail cases. I think that the Java Language has better options to work with String, so that's why my option. The most interesting method in this question is the method to calculate the Number of Operations. It's necessary to use a while loop that is limited by the smaller word. The equal characters in sequence is subtracted from the totalRemove and totalConcat. Exceptions, Hashcode and other good practices were not considered for this application. Execute the aplication and type what the application requires in the screen. It was done in IDE Eclipse. The executable java files are in the folder src. 

### **Question 6**

At first I created the tables. I tried to keep a pattern of good practice with databases, by creating keys in order to link the tables. As the students can have the same grade, note-students is 1xn. The grade could be the reference(key) for the foreign key, but I think that it's a good practice creating a pattern for IDs and Keys. In this case, it was used IDTABLENAME for primary Key, and ID_TABLENAME for Foreign key (and here table name is the reference table). It's also a good practice creating constraints, so a developer who doesn't know the database can understand it by reading them. Writing the query just needs to use inner join and having attention to the condition of NULL cases, using the clause "CASE WHEN". To test the application, it's necessary to create the bank and fill it before execute the query.

### **Question 7**

We have a class which have two children classes and they are not parent and child between them. That is a case of multiple inheritance.

### **Question 8**

Again it was created a database for tests, but the query was simpler, just joining the tables by union. To test the application, it's necessary to create the bank and fill it before execute the query

### **Question 10**

It was used the traditional C language. Every string from C language ends with the character '\0'. That's why this is the condition from while in wordLength function. In the main function, it's needed the do while clause, because strings are just char vectors in c language. The '\n' is the enter we expect the user to type. The print was done through 2 forms: The first without a function, and we decrement i because of how the do while clause works. The second is by using the function which was already mentioned. 

### **Question 11**

We begin comparing the first to the last and we increment the first as we decrement the second. Here I have used the XOR operation.

XOR has the following Truth-Table: for A XOR B, if just one of them is 1, the output is 1. If both are 1 or 0, the output is zero.

Let's say: A = 5 (0101) , B=9(1001)

Inverting A and B

A = A xor B = 1100
B = B xor A = 0101
A = A xor B = 1001

As the char follow the ASCII pattern being binary numbers, they are inverted like that. 