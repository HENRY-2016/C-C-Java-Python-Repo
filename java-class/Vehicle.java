
  class Car {
        protected String brand = "Ford";
        public void honk() {
            System.out.println("Tuut, tuut!");
        }
        }
        

class Vehicle  extends  Car
{
    private String modelName = "Mustang";
    public static void main(String[] args) {
        Vehicle myFastCar = new Vehicle();
        myFastCar.honk();
        System.out.println(myFastCar.brand + " " + myFastCar.modelName);
    }
}