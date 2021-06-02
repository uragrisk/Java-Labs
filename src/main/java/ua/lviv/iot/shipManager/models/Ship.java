package ua.lviv.iot.shipManager.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import ua.lviv.iot.shipManager.enums.MovementType;
import ua.lviv.iot.shipManager.enums.SurfaceType;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Ship {

    @JsonProperty(access = JsonProperty.Access.READ_ONLY)
    private Integer id;

    private Double tonnage;
    private int maxSpeed;
    private Double fluePer100Miles;
    private SurfaceType movementSurface;
    private MovementType movementType;

    public Ship(Double tonnage, int maxSpeed, Double fluePer100Miles, SurfaceType movementSurface,
                MovementType movementType){
        this(null, tonnage, maxSpeed, fluePer100Miles, movementSurface, movementType);
    }


//
//    @JsonProperty(access = JsonProperty.Access.READ_ONLY)
//    protected  Integer id;
}
