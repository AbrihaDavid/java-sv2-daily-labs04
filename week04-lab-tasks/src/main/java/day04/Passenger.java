package day04;

public class Passenger {

    private String name;
    private String ticketID;
    private int numOfPackage;

    public Passenger(String name, String ticketID, int numOfPackage) {
        this.name = name;
        this.ticketID = ticketID;
        this.numOfPackage = numOfPackage;
    }

    public int getNumOfPackage() {
        return numOfPackage;
    }
}
