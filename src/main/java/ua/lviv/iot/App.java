package ua.lviv.iot;


import ua.lviv.iot.enums.MovementType;
import ua.lviv.iot.enums.SortOrder;
import ua.lviv.iot.enums.SurfaceType;
import ua.lviv.iot.enums.WingsTypes;
import ua.lviv.iot.managers.ShipManager;
import ua.lviv.iot.models.Ferry;
import ua.lviv.iot.models.Hovercraft;
import ua.lviv.iot.models.HydrofoilShip;
import ua.lviv.iot.models.Ship;

import java.util.List;

public class App {
    public static void main(String[] args) {
        List<Ship> ships = List.of(
                new Ferry(100.0, 25, 23.5, SurfaceType.WATER, MovementType.PROPELLERS, 100),
                new HydrofoilShip(100.0, 400, 500.00, SurfaceType.WATER,
                        MovementType.PROPELLERS, 125.45, WingsTypes.FULLY_SUBMERGED_WINGS, 5.0),
                new Hovercraft(200.00, 500, 700.0, SurfaceType.WATER,
                        MovementType.PROPELLERS, 1234.55, SurfaceType.GROUND)
        );
        ShipManager shipManager = new ShipManager(ships);

        System.out.println("\n\nAll ships\n");
        shipManager.printAllShips();

        System.out.println("\n\nShips with chosen tonnage:\n");
        shipManager.printShips(shipManager.searchByTonnage(100.00));

        System.out.println("\n\nShips with chosen speed:\n");
        shipManager.printShips(shipManager.searchByMaxSpeed(400));

        System.out.println("\n\nSort by fuel consumption per 100 miles in descending order:\n");
        shipManager.printShips(shipManager.sortByFuelConsumption(SortOrder.DESC));

        System.out.println("\n\nSort by fuel consumption per 100 miles in ascending order:\n");
        shipManager.printShips(shipManager.sortByFuelConsumption(SortOrder.ASC));


    }
}
