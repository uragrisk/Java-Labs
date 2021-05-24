package ua.lviv.iot.models;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;
import ua.lviv.iot.enums.MovementType;
import ua.lviv.iot.enums.SurfaceType;

@Data
@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
@ToString(callSuper = true)
public class Ferry extends Ship {
    public int maxNumberOfCars;

    public Ferry(
            final Double tonnage, final int maxSpeed, final Double fuelPer100Miles, final SurfaceType surfaceType,
            final MovementType movementType, int maxNumberOfCars
    ) {
        super(tonnage, maxSpeed, fuelPer100Miles, SurfaceType.WATER, MovementType.PROPELLERS);
        this.maxNumberOfCars = maxNumberOfCars;
    }
}
