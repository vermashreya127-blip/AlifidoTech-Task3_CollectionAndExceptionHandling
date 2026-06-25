Task 3: Collections & Exception Handling

📌 Project Title

Student Management System using Collections and Exception Handling in Java


📖 Description

This project demonstrates the use of Java Collections Framework and Exception Handling concepts. The program allows users to enter student details, store them using different collection classes, and handle invalid inputs through custom exceptions.

The project uses:

.ArrayList for storing student names
.HashSet for storing unique student names
.HashMap for storing student names and ages
.Try-Catch blocks for runtime error handling
.Custom Exception for validating student age


🎯 Objectives

.Understand Java Collections Framework.
.Learn how to use ArrayList, HashSet, and HashMap.
.Implement exception handling using try-catch blocks.
.Create and use custom exceptions.
.Improve data management and program reliability.


🛠 Technologies Used

.Java
.VS Code
.JDK (Java Development Kit)


📂 Features

.Add student details.
.Store student names using ArrayList.
.Store unique student names using HashSet.
.Store student records using HashMap.
.Validate student age.
.Handle invalid age using a custom exception.
.Handle runtime errors using try-catch blocks.


📋 Collections Used

1. ArrayList
Stores student names in a dynamic list.
Example:
Plain text
[Shreya]

2. HashSet
Stores unique student names and prevents duplicates.
Example:
Plain text
[Shreya]

3. HashMap
Stores student name and age as key-value pairs.
Example:
Plain text
{Shreya=20}


⚠️ Exception Handling

Try-Catch Block
Used to handle runtime errors gracefully.

Custom Exception
InvalidAgeException is created to validate student age.

Condition:
Plain text
Age must be 18 or above.


▶️ How to Run
Compile the Program
Bash
javac StudentManager.java

Run the Program
Bash
java StudentManager


📸 Sample Output 1
Plain text
Enter Student Name: Shreya
Enter Student Age: 20

--- Student Details ---
ArrayList: [Shreya]
HashSet: [Shreya]
HashMap: {Shreya=20}


📸 Sample Output 2 (Exception Handling)
Plain text
Enter Student Name: Shreya
Enter Student Age: 15

Custom Exception: Age must be 18 or above.


📁 Project Structure
Plain text
Task3_CollectionsAndExceptionHandling
│
├── StudentManager.java
├── README.md
├── Screenshot1.png
└── Screenshot2.png


✅ Conclusion

This project successfully demonstrates the use of Java Collections Framework and Exception Handling concepts. It shows how ArrayList, HashSet, and HashMap can be used for efficient data management and how custom exceptions improve program reliability by handling invalid inputs effectively.