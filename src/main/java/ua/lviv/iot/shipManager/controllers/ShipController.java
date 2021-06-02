package ua.lviv.iot.shipManager.controllers;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ua.lviv.iot.shipManager.models.Ship;
import ua.lviv.iot.shipManager.services.ShipService;

import java.util.List;


@RestController
@RequestMapping(path = "/ships")
public class ShipController {

    @Autowired
    private ShipService shipService;

    @GetMapping("/{id}")
    public ResponseEntity<Ship> getShip(@PathVariable("id") Integer id) {
        Ship existingShip = shipService.getShipById(id);
        if (existingShip != null) {
            ResponseEntity.ok(shipService.getShipById(id));
            return ResponseEntity.ok(existingShip);
        } else {
            return ResponseEntity.notFound().build();
        }
    }
//new Ship(100.0, 25, 23.5, SurfaceType.WATER, MovementType.PROPELLERS);
    @GetMapping
    public ResponseEntity<List<Ship>> getShips(){
        return ResponseEntity.ok(shipService.getShips());
    }

    @PostMapping
    public Ship createShip(@RequestBody Ship ship){
        return shipService.createShip(ship);
    }

//    @PutMapping
//    public Ship createShip(@RequestBody Ship ship) {
//        return shipService.createShip(ship);
//    }

    @PutMapping(path = "{id}")
    public ResponseEntity<Ship> updateShipById(@PathVariable Integer id, @RequestBody Ship ship) {
        Ship existingShip = shipService.getShipById(id);
        if (existingShip != null) {
            ResponseEntity.ok(shipService.updateShipById(id, ship));
            return ResponseEntity.ok(ship);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping(path = "{id}")
    public ResponseEntity<Object> deleteShipById(@PathVariable Integer id){
        Ship existingShip = shipService.getShipById(id);
        if (existingShip != null){
            return ResponseEntity.ok(shipService.deleteShipById(id));
        } else {
            return ResponseEntity.notFound().build();
        }
    }


}





