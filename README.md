
University Management System
The University Management System is an application designed to manage students, professors, courses, and course sections within a university. It allows for the registration of students and professors in courses, and the assignment of students and professors to specific course sections. The main entities involved in this system are students, courses, and course sections.

Entities
Student
A student is defined by the following attributes:

Name: The name of the student (String).
SSN: The social security number of the student (integer).
ID: A unique ID assigned to each student automatically (integer).
Phone number: The contact phone number of the student (String).
Address: The address of the student (String).
The ID is automatically generated and incremented for each new student. All other attributes are initialized through the constructor.

Course
A course is defined by the following attributes:

Name: The name of the course (String).
Course code: The code assigned to the course (String).
Maximum number of students: The maximum number of students allowed in the course (integer).
Course Section
A course section represents a specific section of a course. It has the following attributes:

Maximum number of students: The maximum number of students allowed in the course section (integer).
Section number: The identifier for the course section (integer).
List of students: The list of students registered in this course section.
List of grades: The list of grades corresponding to each student in the course section.
The student list and grades list are initially empty but are created in the constructor. The course section provides several methods to manage students and grades, including adding a student, removing a student, moving a student to another section, and calculating the average grade.

There are two types of course sections implemented in this system:

Normal Course Section
A normal course section calculates the average grade by computing the sum of all grades and dividing it by the number of students.

Online Course Section
An online course section has a specific number of weeks (between 5 and 10). The average grade calculation in an online course section is the sum of all grades divided by the number of students, multiplied by (1 + number_of_weeks/20).

Application Operations
The University Management System supports the following operations:

Adding a student to a course section.
Removing a student from a course section.
Moving a student from one course section to another.
Calculating the average grade of a course section.
Entering grades for all students in a course section.
Printing the names and final grades of all students in a course section.
Sorting the student list in ascending or descending order by ID number.
Saving and loading student and course data to/from files.
Usage
In the main method, you can create an ArrayList with a normal course and an online course. Additionally, create six students and add the first four students to the normal course and the last two students to the online course. Perform operations such as removing a student, moving a student, and calculating the average grade in both courses.

Upon running the application, you will receive a welcoming message. When closing the program, it automatically saves all data (courses and students) to the course.dat and student.dat files. On subsequent runs, the program loads the data from these files into the ArrayLists before starting.
You can find the username and password in username.txt and Password.txt





