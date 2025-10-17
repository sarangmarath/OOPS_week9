class vehicle{
    private String registrationNO;
    private String type;
    private double ratePerDay;
    
    //constructor feild

    vehicle(String registrationNO,String type,double ratePerDay){
        this.registrationNO=registrationNO;
        this.type=type;
        this.ratePerDay=ratePerDay;
    }
    //getter feild

    public String getRegistrationNO(){return registrationNO;}
    public String getType(){return type;}
    public double getRatePerDay(){return ratePerDay;}

    //overrideing 

    @Override
    public String toString() {
        return "Vehicle: " + registrationNO + ", Type: " + type + ", Rate: $" + ratePerDay + "/day";
    }
}
public class VehicleRental{
    public static void main(String[] args) {
        vehicle v1 = new vehicle("MH12AB1234", "Sedan", 1500);
        vehicle v2 = new vehicle("MH12AB1234", "Sedan", 1500);
        System.out.println(v1);
        System.out.println(v2);
        System.out.println(v1==v2);
        System.out.println(v1.equals(v2));
        
    }
}


