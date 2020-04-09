package carpetCostCalculator.src;

/**
 * Carpet
 */
public class Carpet {

    private double cost;

    public Carpet(double costVal) {
        this.cost = costVal;

        if (this.cost < 0) {
            this.cost = 0;
        }
    }

    public double getCost() {
        return this.cost;
    }
}