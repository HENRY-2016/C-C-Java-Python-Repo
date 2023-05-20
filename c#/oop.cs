
//  basic structure
    // namespace declaration
    // class declaration & definition
    // class members (var, methods)
    // main method
// https://www.tutorialspoint.com/csharp/csharp_classes.htm
namespace BoxApplication 
{
    // class definition
    class Box 
    {
        public  string company_name;
        // private string company;
        // constractor
        public Box ( string company) // with args
        {
            System.Console.WriteLine("... Constractor :: Finding volume of Box...");
            company_name = company ;

        }

        private double length;
        private double width;
        private double height;
        
        public void setLength (double len){length = len;}
        public void setWidth (double wid){width = wid;}
        public void setHeight (double hei){height = hei;}
        public double calculateVolume (){return length * width * height;}

        // destractor
        ~Box () {System.Console.WriteLine("Destractor is called..");}
    }

    class Boxtester
    {
        static void Main (string[] args)
        {
            Box Box1 = new Box("Sadolin and Plascon"); // Declare Box1 of tpe Box
            double volume;

            // Box1 specs
            Box1.setHeight(6.0);
            Box1.setLength (7.0);
            Box1.setWidth (5.0);



            // volume of Box1
            volume = Box1.calculateVolume();
            System.Console.WriteLine("Volume of Box1 :: {0} ", volume);
            System.Console.WriteLine("Company Name");
            System.Console.WriteLine(Box1.company_name); // constractor 



            // System.Console.ReadKey();
        }
    }
}