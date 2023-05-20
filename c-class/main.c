
// gcc class.c  -o c 
// ./c 
#include <stdio.h>

int main() 
{
 
 int time = 22;
if (time < 10) {
  printf("Good morning.");
} else if (time < 20) {
  printf("Good day.");
} else {
  printf("Good evening.");
}

// switch
int day = 4;

switch (day) {
  case 1:
    printf("Monday");
    break;
  case 2:
    printf("Tuesday");
    break;
  case 3:
    printf("Wednesday");
    break;
  case 4:
    printf("Thursday");
    break;
  case 5:
    printf("Friday");
    break;
  case 6:
    printf("Saturday");
    break;
  case 7:
    printf("Sunday");
    break;
}


// while loop
int i = 0;

while (i < 5) {
  printf("%d\n", i);
  i++;
}
// do while
int i = 0;

do {
  printf("%d\n", i);
  i++;
}
while (i < 5);

// for loop
int i;

for (i = 0; i < 5; i++) {
  printf("%d\n", i);
}

    return 0;

	struct Books {
	char  title[50];
	char  author[50];
	char  subject[100];
	int   book_id;
	};


    // 2/3/2022
  struct Books Book1;        /* Declare Book1 of type Book */
   struct Books Book2;        /* Declare Book2 of type Book */
 
   /* book 1 specification */
   strcpy( Book1.title, "C Programming");
   strcpy( Book1.author, "Nuha Ali"); 
   strcpy( Book1.subject, "C Programming Tutorial");
   Book1.book_id = 6495407;

   /* book 2 specification */
   strcpy( Book2.title, "Telecom Billing");
   strcpy( Book2.author, "Zara Ali");
   strcpy( Book2.subject, "Telecom Billing Tutorial");
   Book2.book_id = 6495700;
 
   /* print Book1 info */
   printf( "Book 1 title : %s\n", Book1.title);
   printf( "Book 1 author : %s\n", Book1.author);
   printf( "Book 1 subject : %s\n", Book1.subject);
   printf( "Book 1 book_id : %d\n", Book1.book_id);

   /* print Book2 info */
   printf( "Book 2 title : %s\n", Book2.title);
   printf( "Book 2 author : %s\n", Book2.author);
   printf( "Book 2 subject : %s\n", Book2.subject);
   printf( "Book 2 book_id : %d\n", Book2.book_id);
}



#include <stdio.h>
/* Created a structure here. The name of the structure is
 * StudentData.
 */
struct StudentData{
    char *stu_name;
    int stu_id;
    int stu_age;
};
int main()
{
     /* student is the variable of structure StudentData*/
     struct StudentData student;

     /*Assigning the values of each struct member here*/
     student.stu_name = "Steve";
     student.stu_id = 1234;
     student.stu_age = 30;

     /* Displaying the values of struct members */
     printf("Student Name is: %s", student.stu_name);
     printf("\nStudent Id is: %d", student.stu_id);
     printf("\nStudent Age is: %d", student.stu_age);
     return 0;
}