public class Car extends Vehicle {
    private boolean electric;
    private boolean discountApplied;

    public Car(String licensePlate, double tollFee, int passengers, boolean electric) {
        super(licensePlate, tollFee, passengers);
        this.electric = electric;
        discountApplied = false;   // default value
    }

    public boolean isElectric() {
        return electric;
    }

    public boolean isDiscountApplied() {
        return discountApplied;
    }

    public String printCar() {
        StringBuilder assemble = new StringBuilder();

        assemble.append(Tools.infoToString("Licence PLate: ", getLicensePlate()));
        assemble.append(Tools.infoToString("Toll fee: ", getTollFee()));
        assemble.append(Tools.infoToString("Passengers: ", getPassengers()));
        assemble.append(Tools.infoToString("Electric?: ", electric));
        assemble.append(Tools.infoToString("Discount Applied?: ", isDiscountApplied()));

        String asmStr = assemble.toString();
        System.out.println(asmStr);
        return assemble.toString();
    }
}