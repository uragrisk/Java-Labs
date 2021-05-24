package ua.lviv.iot.models;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;
import ua.lviv.iot.enums.MovementType;
import ua.lviv.iot.enums.SurfaceType;
import ua.lviv.iot.enums.WingsTypes;

@Data
@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
@ToString(callSuper = true)
public class HydrofoilShip extends Ship{
    public Double wingsLength;
    public WingsTypes wingsType;
    public Double maxHighAboveWater;

    public HydrofoilShip(
            final Double tonnage, final int maxSpeed, final Double fuelPer100Miles, final SurfaceType surfaceType,
            final MovementType movementType, Double wingsLength, WingsTypes wingsType, Double maxHighAboveWater
    ){
        super(tonnage, maxSpeed, fuelPer100Miles, SurfaceType.WATER, MovementType.PROPELLERS);
        this.wingsLength = wingsLength;
        this.wingsType = wingsType;
        this.maxHighAboveWater = maxHighAboveWater;
    }


}
