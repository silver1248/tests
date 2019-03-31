package types.overwatch;

public enum Role {

    TANK, 
    DAMAGE,
    SUPPORT,
    ;

    public String toString() {
        return super.toString().toLowerCase();
    }
}