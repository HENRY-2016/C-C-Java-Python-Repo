
#include <iostream>

using namespace std;

// class defination 
// class class_Name { class defination OR class body}

class Family 
{
	// Constructors
	// sytax of a constructor
	// Access_Specifiers:
		// Name_Of_Aclass ():

	public:
		Family () {cout << "________This Failmy Class___________" <<endl;}; // Constructors
		


  // class body
  // class objects
  string father  = "Ssekisonge Elijah";
  string mother  = "Masika Winfred";
  string child  = "Ssempiira Jesse";

  // class methods
    // Access_Specifiers:
    // data_type funtion_Name () {function body} 
    public:
      void Print_Default_Family_Names ()
        {
          cout << father +"<<===>>"+ mother+"<<===>>"+ child <<endl;
        }

    public:
      void Print_Family_Details (string father_Name,string mother_Name,string child_Name)
        {
			cout << "Family Members"<<endl;
			cout << "=============="<<endl;
          cout << father_Name +"<<===>>"+ mother_Name+"<<===>>"+ child_Name <<endl;
        }  
};

// Inheritance
// class Main_Class_Name : public New_Class_name{};
class Home : public Family 
{
}; 

int main ()
{

  // class instance means defining a variable for a given class
  // int age;
  // Polymorphism
  Family family1; 
  Family alexs_family; 
  Family juliet_family; 
  Family nilson_family; 

  // nilson family members
  string father ="Nilson";
  string mother ="Witiny";
  string child ="henry";



//   family1.Print_Default_Family_Names();
//   alexs_family.Print_Family_Details("Alex","Sarah","Ben");
//   juliet_family.Print_Family_Details("Guma","Juliet","Maria");
//   nilson_family.Print_Family_Details(father,mother,child);



	// inheritance
	Home marksfamily;
	marksfamily.Print_Family_Details("Mark","Mary","Micheal");

    return 0;
}


