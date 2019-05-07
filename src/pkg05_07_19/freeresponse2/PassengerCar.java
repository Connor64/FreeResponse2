package pkg05_07_19.freeresponse2;

public class PassengerCar extends TrainCar{

    private double maxPeople, baseWeight;
    
    public PassengerCar(double baseWt, double maxPeople) {
        super(baseWt);
        this.maxPeople = maxPeople;
        baseWeight = baseWt;
    }

    @Override
    public double getTotalWeight() {
        return (baseWeight + (300 * maxPeople));
    }
    
    
}
