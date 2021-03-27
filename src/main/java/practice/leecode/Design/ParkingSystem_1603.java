package practice.leecode.Design;

public class ParkingSystem_1603 {

    private int[] pos;

    public ParkingSystem_1603(int big, int medium, int small) {
        this.pos = new int[]{0, big, medium, small};
    }

    public boolean addCar(int carType) {
        if (pos[carType] > 0) {
            pos[carType]--;
            return true;
        }
        return false;
    }

}
