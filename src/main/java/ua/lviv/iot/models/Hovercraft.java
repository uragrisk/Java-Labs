package ua.lviv.iot.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import ua.lviv.iot.enums.MovementType;
import ua.lviv.iot.enums.SurfaceType;

@Data
@EqualsAndHashCode(callSuper = true)
@AllArgsConstructor
@ToString
public class Hovercraft extends Ship {
    public Double volumeOfAir;
    public SurfaceType additionalSurface;

    public Hovercraft(
            final Double tonnage, final int maxSpeed, final Double fuelPer100Miles, final SurfaceType surfaceType,
            final MovementType movementType, Double volumeOfAir, SurfaceType additionalSurface
    ) {
        super(tonnage, maxSpeed, fuelPer100Miles, SurfaceType.WATER, MovementType.PROPELLERS);
        this.volumeOfAir = volumeOfAir;
        this.additionalSurface = additionalSurface;
    }
}
