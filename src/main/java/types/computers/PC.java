package types.computers;

import lombok.Value;

@Value
public class PC implements Computer {

    String manufacturer;
    String name;
    long ramSize;
    long hardDriveSize;
}
