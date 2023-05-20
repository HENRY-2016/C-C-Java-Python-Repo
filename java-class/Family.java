


// inheritence
// class Root_Class_Name extends Child_Class_Name {definition}
public class Family extends Cars
{
    // class objects 
    // take dem as vars
    String father = "Bukanye"; 
    String mother = "Coral"; 
    String child = "Sam";
    
    // Access_Specifier Return_Type Method_Name (arguments) 
    // our classs method
    private void Print_Out_Members ()
    {
        System.out.println(father);
        System.out.println(mother);
        System.out.println(child);
    }

    public static void main(String []args) 
    {
        // like var 
        // int age ;
        // Polymorphism
        Family family1 = new Family();
        Family family2 = new Family();
        Family family3 = new Family();


        family1.Print_Out_Members();  
        family2.Print_Out_Members();  
        family3.Print_Brand_Name();
        System.out.println("======================");
    }
 // constructor
    // sytax == Access_Specifier Class_Name ()
    public Family ()
        {
            System.out.println("Welcome To This Family");
            System.out.println("Coral 2200 ");
        }
    
}

class Cars 
{
    // class objects
    String car1 = "BMW";
    String car2 = "Toyota";
    
    // our classs method
    public void Print_Brand_Name ()
    {
        System.out.println("-------------");
        System.out.println("This Family Drives "+ car1);
        // System.out.println(car1);
        System.out.println("-------------");

    }
} 