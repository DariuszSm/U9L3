public class Truck extends Vehicle {
    private int axles;
    private boolean hasTrailer;

    public Truck(String licensePlate, double tollFee, int passengers, int axles, boolean hasTrailer) {
        super(licensePlate, tollFee, passengers);
        this.axles = axles;
        this.hasTrailer = hasTrailer;
    }

    public int getAxles() {
        return axles;
    }

    public boolean hasTrailer() {
        return hasTrailer;
    }

    public String printTruck() {
        StringBuilder assemble = new StringBuilder();

        assemble.append(Tools.infoToString("Licence PLate: ", getLicensePlate()));
        assemble.append(Tools.infoToString("Toll fee: ", getTollFee()));
        assemble.append(Tools.infoToString("Passengers: ", getPassengers()));
        assemble.append(Tools.infoToString("Axles: ", axles));
        assemble.append(Tools.infoToString("Has trailer?: ", hasTrailer()));

        String asmStr = assemble.toString();
        System.out.println(asmStr);
        return assemble.toString();
    }
}