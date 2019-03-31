package types.person;

/**
 * Not meant in any political way, just trying to learn to code...
 *
 */
public enum Sex {

    MALE, 
    FEMALE,
    OTHER,
    ;
    
    public String toString() {
        return super.toString().toLowerCase();
    }
    
    public String getPronoun() {
        switch (this) {
            case MALE : return "he";
            case FEMALE: return "she";
            case OTHER : return "they";
            default : return "unknown pronoun";
        }
    }
}
