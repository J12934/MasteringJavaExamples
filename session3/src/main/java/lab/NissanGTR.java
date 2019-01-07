package lab;

/**
 * This class represents a car of make Nissan, model GT-R in a specific edition
 * available in Europe.
 *
 * @author Created by tom on 18.09.2018.
 */
public class NissanGTR {

    private Object edition;

    /**
     * Creates a new Nissan GT-R edition.
     *
     * @param edition the edition to use
     */
    public NissanGTR(Object edition) {
        this.edition = edition;
    }

    /**
     * @return this cars horse power
     */
    Integer getHorsepower() {
        if (edition instanceof GTR_Edition_Nismo) {
            return ((GTR_Edition_Nismo) edition).horsePower;
        } else {
            return new GTR_Edition_Default().horsePower;
        }
    }

    /**
     * @return the torque of this cars' engine
     */
    Integer getTorque() {
        if (edition instanceof GTR_Edition_Nismo) {
            return ((GTR_Edition_Nismo) edition).torque;
        }
        return new GTR_Edition_Default().torque;
    }

    /**
     * @return this cars color depending on the edition
     */
    String getColor() {
        if (edition instanceof GTR_Edition_Nismo) {
            return ((GTR_Edition_Nismo) edition).color;
        } else if (edition instanceof GTR_Edition_Track) {
            return ((GTR_Edition_Track) edition).color;
        } else if (edition instanceof GTR_Edition_Black) {
            return ((GTR_Edition_Black) edition).color;
        } else if (edition instanceof GTR_Edition_Prestige) {
            return ((GTR_Edition_Prestige) edition).color;
        } else {
            return ((GTR_Edition_Default) edition).color;
        }
    }
}
