package types.computers;

import lombok.Value;

@Value
public class Mac implements Computer {

    String manufacturer = "Apple";
    String name;
    long ramSize;
    long hardDriveSize;
}
