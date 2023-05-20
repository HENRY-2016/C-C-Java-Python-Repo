
public class javaclass
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


    public static void main(String []args) 
    {
      
        // instance to a java class
        // sytax className intanceName = new ClasName();
        javaclass family = new javaclass();

        // System.out.println(family.Father);
        family.RoleForFather();


        // class

        
    } 
}

