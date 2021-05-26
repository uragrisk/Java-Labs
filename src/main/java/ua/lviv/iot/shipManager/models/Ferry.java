package ua.lviv.iot.shipManager.models;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;
import ua.lviv.iot.shipManager.enums.MovementType;
import ua.lviv.iot.shipManager.enums.SurfaceType;

@Data
@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
@ToString(callSuper = true)
public class Ferry extends Ship {
    private int maxNumberOfCars;

    public Ferry(
            final Double tonnage, final int maxSpeed, final Double fuelPer100Miles, final SurfaceType surfaceType,
            final MovementType movementType, int maxNumberOfCars
    ) {
        super(tonnage, maxSpeed, fuelPer100Miles, SurfaceType.WATER, MovementType.PROPELLERS);
        this.maxNumberOfCars = maxNumberOfCars;
    }
}
