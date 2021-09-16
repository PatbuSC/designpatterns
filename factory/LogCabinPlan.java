package designpatterns.factory;

/**
 * @author Patrick Burroughs Portia Plante 247 Section 002 Factory Design
 *         Pattern
 */

public class LogCabinPlan extends HousePlan {

    /**
     * Constructor for the log cabin house plan
     */
    public LogCabinPlan() {
        super(2, 10, 1800);
        this.setFeatures();
        this.setMaterials();
        this.toString();
    }

    /**
     * Sets the materials of the house plan to resemble those required to build a
     * log cabin
     */
    protected void setMaterials() {
        materials.set(0, " - Log Siding");
        materials.set(1, " - Board and Batten Siding");
        materials.set(2, " - White Pine");
    }

    /**
     * Sets the features of the house plan to resemble those of a log cabin
     */
    protected void setFeatures() {
        features.set(0, " - Timbered Roof");
        features.set(1, " - High Insulation");
        features.set(2, " - Rustic Effect");
    }

    /**
     * Returns a string listing the details of the log cabin plan
     */
    public String toString() {
        return "Log Cabin\nSquare Feet: " + this.getSquareFeet() + "\nRoom: " + this.getNumRooms() + "\nWindows: "
                + this.getNumWindows() + "\n\nMaterials:\n" + materials.get(0) + "\n" + materials.get(1) + "\n"
                + materials.get(2) + "\n\nFeatures:\n" + features.get(0) + "\n" + features.get(1) + "\n"
                + features.get(2) + "\n\n";
    }
}
