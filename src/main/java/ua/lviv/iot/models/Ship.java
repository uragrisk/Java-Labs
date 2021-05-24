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
    public Double tonnage;
    public int maxSpeed;
    public Double fluePer100Miles;
    public SurfaceType movementSurface;
    public MovementType movementType;
}
