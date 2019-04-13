package types.computers;

import lombok.Value;

@Value
public class PC implements Computer {

    String name;
    String ramSize;
    String hardDriveSize;
}
