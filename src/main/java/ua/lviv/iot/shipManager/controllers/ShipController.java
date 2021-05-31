package ua.lviv.iot.shipManager.controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ua.lviv.iot.shipManager.exeptions.IdProvidedWhileCreationException;
import ua.lviv.iot.shipManager.exeptions.IdProvidedWhileUpdatingException;
import ua.lviv.iot.shipManager.models.Ship;
import ua.lviv.iot.shipManager.services.ShipService;

import java.util.List;
import java.util.NoSuchElementException;


@RestController
@RequestMapping(path = "/ships")
public class ShipController {

    @Autowired
    private ShipService shipService;

    @GetMapping("/{id}")
    public ResponseEntity getShipById(@PathVariable Integer id) {
        try {
            Ship existingSaw = shipService.getShipById(id);
            return ResponseEntity.ok(existingSaw);
        } catch (NoSuchElementException e) {
            return ResponseEntity.status(404).body(
                    "Can't get saw with id " + id + ". Such saw doesn't exist"
            );
        }
    }

    @GetMapping
    public ResponseEntity<List<Ship>> getShips() {
        return ResponseEntity.ok(shipService.getShips());
    }

    @PostMapping
    public ResponseEntity createShip(@RequestBody Ship ship) {
        try {
            return ResponseEntity.ok(shipService.createShip(ship));
        } catch (IdProvidedWhileCreationException e) {
            return ResponseEntity.status(400).body(e.getMessage());
        }
    }


    @PutMapping(path = "{id}")
    public ResponseEntity updateShipById(@PathVariable Integer id, @RequestBody Ship ship) {
        try {
            return ResponseEntity.ok(shipService.updateShipById(id, ship));
        } catch (NoSuchElementException e) {
            return ResponseEntity.status(404).body(
                    "Can't update saw with id " + id + ". Such ship doesn't exist"
            );
        } catch (IdProvidedWhileUpdatingException e) {
            return ResponseEntity.status(400).body(e.getMessage());
        }

    }

    @DeleteMapping(path = "{id}")
    public ResponseEntity<Object> deleteShipById(@PathVariable Integer id) {
        try {
            Ship existingSaw = shipService.getShipById(id);
            return ResponseEntity.ok(shipService.deleteShipById(id));
        } catch (NoSuchElementException e) {
            return ResponseEntity.status(404).body(
                    "Can't delete saw with id " + id + ". Such saw doesn't exist"
            );
        }


    }
}





