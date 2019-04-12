package types.computers;

public class Mac implements Computer {

    private final String name;
    private final String ramSize;
    private final String driveSize;
    
    
    
    public Mac(String name,String ramSize,String driveSize) {
        this.name = name;
        this.ramSize = ramSize;
        this.driveSize = driveSize;
    }
    
    public String getName() {
        return name;
    }
    
    @Override
    public String getRamSize() {
        return ramSize;
    }

    @Override
    public String getHardDriveSize() {
        return driveSize;
    }
}
