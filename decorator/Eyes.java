package designpatterns.decorator;

/**
 * Patrick Burroughs
 * Portia Plante 247 Section 002
 * Decorator Design Pattern
*/

/**
 * Deals with the addition of eyes to a character's face
 */
public class Eyes extends CharacterDecorator {

    /**
     * Constructor for the eyes of the potato head
     * 
     * @param chr character object specifying which face is being drawn
     */
    public Eyes(Character chr) {
        super(chr);
        this.character = chr;
        this.customize();
    }

    /**
     * Method to modify the character's face based on the requested features
     */
    public void customize() {
        sections.set(3, " |  o  o  | ");
    }

}
