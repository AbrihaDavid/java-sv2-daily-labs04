package day04;

import java.util.ArrayList;
import java.util.List;

public class Plane {

    private int maxCapacity;
    private List<Passenger> passengerList = new ArrayList<>();

    public Plane(int maxCapacity) {
        this.maxCapacity = maxCapacity;
    }

    public boolean addPassenger(Passenger passenger) {
        if (passengerList.size() < maxCapacity ){
            passengerList.add(passenger);
        } else {
            return false;
        }
        return true;
    }

    public int numberOfPackages(){
        int count = 0;
        for (Passenger p : passengerList) {
            count = count + p.getNumOfPackage();
        }
        return count;
    }

    public static void main(String[] args) {
        Plane plane = new Plane(3);

        Passenger passenger = new Passenger("Tom","LK-424",10);
        Passenger passenger2 = new Passenger("Bob","LK-425",2);
        Passenger passenger3 = new Passenger("Jack","LK-426",8);
        Passenger passenger4 = new Passenger("Jill","LK-427",4);

        System.out.println(plane.addPassenger(passenger));
        System.out.println(plane.addPassenger(passenger2));
        System.out.println(plane.addPassenger(passenger3));
        System.out.println(plane.addPassenger(passenger4));

        System.out.println(plane.numberOfPackages());
    }
}
