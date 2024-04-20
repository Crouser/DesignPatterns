package Adapter;

import Adaptee.WeightInPounds;

public class AdapterConcreteClass implements AdapterInterface{

    WeightInPounds weightInPounds;

    public AdapterConcreteClass(WeightInPounds weight) {
        this.weightInPounds = weight;
    }

    @Override
    public int getWeightInKg() {
        return (int) (weightInPounds.getWeightInPounds()*0.45);
    }
}
