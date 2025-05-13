package inheritanceExamples;

public class MainInheritance {
    public static void main(String[] args) {
        vehicle vehicle1 = new vehicle();
        vehicle1.fuel();
        AirVehicle airvehicle1 =new AirVehicle();
        airvehicle1.stop();
        roadVehicle roadvehicle1 =new roadVehicle();
        roadvehicle1.travelsOnroad();
    }
}
