package pkg05_07_19.freeresponse2;

import java.util.ArrayList;

public class Train {
    private Engine engine;
    private ArrayList<TrainCar> trainCars;
    
    public Train(Engine e, ArrayList<TrainCar> tc) {
        engine = e;
        trainCars = tc;
    }
    
    public ArrayList<TrainCar> removeExcessTrainCars() {
        ArrayList<TrainCar> removedCars = new ArrayList<TrainCar>();
        double totalWeight = 0.0;
        for (int i = 0; i < trainCars.size(); i++) {
            totalWeight += trainCars.get(i).getTotalWeight();
            if (totalWeight > engine.getMaxWeight()) {
                for (int x = i; x < (trainCars.size()-1) - i; x++) {
                    removedCars.add(trainCars.remove(x));
                }
            }
        }
        return removedCars;
    }
}