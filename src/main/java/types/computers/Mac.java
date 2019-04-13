package types.computers;

import lombok.Value;

@Value
public class Mac implements Computer {

    private final String name;
    private final String ramSize;
    private final String hardDriveSize;
}
