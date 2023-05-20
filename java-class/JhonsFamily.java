
public class JhonsFamily 
{
       
       // obbjects
       String Father = "John";
       String Mather = "Juliet";
       String Children = "Sam";
  
       public void RoleForFather ()
       {
           System.out.println("Looking After Family");
           System.out.println("Pays Schoool Fees");
       }
       public void RoleForMather ()
       {
           System.out.println("Cooking food");
           System.out.println(".....");
       }
  
       public void RoleForChildren ()
       {
           System.out.println("Fatching Water");
           System.out.println("Watching Tv");
       }
       
     // defining a construct
     public JhonsFamily () { System.out.println("Welcome To Jhons Family");}
        
        
       public static void main(String []args) 
       {
       
           // instance to a java class
           // sytax className intanceName = new ClasName();
           // lie int Age = 45 ;
           JhonsFamily family = new JhonsFamily();
           System.out.println(family.Father);
           System.out.println(family.Mather);
           System.out.println(family.Children);
           family.RoleForFather();
       } 

          
}
