package ua.lviv.iot.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import ua.lviv.iot.enums.MovementType;
import ua.lviv.iot.enums.SurfaceType;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Ship {
    private Double tonnage;
    private int maxSpeed;
    private Double fluePer100Miles;
    private SurfaceType movementSurface;
    private MovementType movementType;
}
