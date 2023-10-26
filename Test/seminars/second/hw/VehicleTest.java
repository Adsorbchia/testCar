package seminars.second.hw;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VehicleTest {
    Car car;
    Motorcycle motorcycle;

    @BeforeEach
    void setup(){
        car = new Car("Dodge", "Ram", 2010);
        motorcycle = new Motorcycle("Subaru","1800cc",2011);
    }

    @Test
    public void testCarIsInstanceOfVehicle() {
        assertTrue(car instanceof Vehicle);
    }
    @Test
    public void testCarGetNumWheels(){
        assertEquals(4,car.getNumWheels());
    }


    @Test
    public void testMotorcycleGetNumWheels(){
        assertEquals(2,motorcycle.getNumWheels());

    }

    @Test
    public void testCarTestDrive(){
        car.testDrive();
        assertEquals(car.getSpeed(),60);
    }

    @Test
    public void testMotorcycleTestDrive(){
        motorcycle.testDrive();
        assertEquals(motorcycle.getSpeed(),75);
    }

    @Test
    public void testCarDrivePark(){
        car.testDrive();
        car.park();
        assertEquals(car.getSpeed(),0);
    }

    @Test
    public void testMotorcycleDrivePark(){
        motorcycle.testDrive();
        motorcycle.park();
        assertEquals(motorcycle.getSpeed(),0);

    }

}