package practice.leecode.Design;

import org.junit.Test;

import static org.junit.Assert.*;

public class ParkingSystem_1603Test {

    @Test
    public void addCar() {
        ParkingSystem_1603 parkingSystem = new ParkingSystem_1603(1, 1, 0);
        assertTrue(parkingSystem.addCar(1)); // 返回 true ，因为有 1 个空的大车位
        assertTrue(parkingSystem.addCar(2)); // 返回 true ，因为有 1 个空的中车位
        assertFalse(parkingSystem.addCar(3)); // 返回 false ，因为没有空的小车位
        assertFalse(parkingSystem.addCar(1)); // 返回 false
    }

}