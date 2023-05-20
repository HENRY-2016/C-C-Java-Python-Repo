

#include <stdio.h>

int main ()
{
    int student_1 = 1;
    int student_2 = 3;
    int student_3 = 0;
    int limit = 50;
    
    // Loops
    // while
    printf("This is while loop\n");
    printf("==================\n"); 
    while ( student_2 > student_1 ) 
    {
        printf("Student_1,===> You Have Failed\n");
        //cout<< "Student_1,===> You Have Failed"

        // update
        student_1++;
    }

    // do while loop
    printf("This is do while loop\n");
    printf("======================\n");
    do 
    {
        printf("Student_1,===> You Have Failed\n");
        //cout<< "Student_1,===> You Have Failed"

        // update
        student_1++;
    }
    while(student_2 > student_1);

    // for loop
    printf("This is for loop\n");
    printf("=================\n");
    //  int student_3 = 0;
    for (student_3; student_3 < student_2; student_3++)
    {
        printf("Student_1,===> You Have Failed\n");
        //cout<< "Student_1,===> You Have Failed"
    }

    return 0;
}
