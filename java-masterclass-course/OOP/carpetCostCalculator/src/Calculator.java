package carpetCostCalculator.src;

/**
 * Calculator
 */
public class Calculator {

    private Floor floor;
    private Carpet carpet;

    public Calculator(Floor floorVal, Carpet carpetVal) {
        this.floor = floorVal;
        this.carpet = carpetVal;
    }

    public double getTotalCost() {
        return floor.getArea() * carpet.getCost();
    }
}