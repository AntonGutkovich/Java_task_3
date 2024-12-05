import vehicles.Car;
import vehicles.ElectricCar;

public class Main {
    public static void main(String[] args) {
        Car myCar = new Car("Антон", 123456, "Мощный");
        System.out.println("Владелец: " + myCar.get_OwnerName());
        System.out.println("Страховой номер: " + myCar.get_InsuranceNumber());
        System.out.println("Тип двигателя: " + myCar.get_EngineType());
        ElectricCar myElectricCar = new ElectricCar("Амогус", 654321, 100);
        System.out.println("Владелец: " + myElectricCar.get_OwnerName());
        System.out.println("Страховой номер: " + myElectricCar.get_InsuranceNumber());
        System.out.println("Тип двигателя: " + myElectricCar.get_EngineType());
        System.out.println("Емкость батареи: " + myElectricCar.get_BatteryCapacity());
        myElectricCar.set_BatteryCapacity(200);
        System.out.println("Новая емкость батареи: " + myElectricCar.get_BatteryCapacity());
    }
}
