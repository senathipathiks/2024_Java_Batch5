package MediatorPattern;

public class MediatorAirplaneExample {
    public static void main(String[] args) {

    	AirportControlTower controlTower = new AirportControlTower();
 
    	CommercialAirplane airplane1 = new CommercialAirplane(controlTower);
    	CommercialAirplane airplane2 = new CommercialAirplane(controlTower);
 
        airplane1.requestTakeoff();
        airplane2.requestLanding();
 
        System.out.println("----------------------------------------");
        
        airplane1.requestLanding();
        airplane2.requestTakeoff();
    }
}