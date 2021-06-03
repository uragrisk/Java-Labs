package ua.lviv.iot.shipManager.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ua.lviv.iot.shipManager.dal.ShipRepository;
import ua.lviv.iot.shipManager.exeptions.IdProvidedWhileCreationException;
import ua.lviv.iot.shipManager.exeptions.IdProvidedWhileUpdatingException;
import ua.lviv.iot.shipManager.models.Ship;


import java.util.List;
import java.util.NoSuchElementException;


@Service
public class ShipService {


    @Autowired
    private ShipRepository repository;

    public List<Ship> getShips() {
        return repository.findAll();
    }

    public Ship getShipById(Integer id) {
        return repository.findById(id).orElseThrow();
    }

    public Ship createShip(Ship ship) {
        if (ship.getId() != null) {
            throw new IdProvidedWhileCreationException();
        }
        return repository.save(ship);
    }

    public Ship updateShipById(Integer id, Ship ship) {
        if (ship.getId() != null) {
            throw new IdProvidedWhileUpdatingException();
        }

        if (repository.existsById(id)) {
            ship.setId(id);
            return repository.save(ship);
        }

        throw new NoSuchElementException();
    }



    public Ship deleteShipById(Integer id) {
        Ship shipToDelete = repository.findById(id).orElseThrow();
        repository.deleteById(id);
        return shipToDelete;
    }
}
