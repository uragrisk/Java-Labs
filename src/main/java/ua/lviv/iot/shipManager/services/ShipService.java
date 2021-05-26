package ua.lviv.iot.shipManager.services;

import org.springframework.stereotype.Service;
import ua.lviv.iot.shipManager.models.Ship;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;

@Service
public class ShipService {

    private AtomicInteger id = new AtomicInteger(0);

    private Map<Integer, Ship> shipMap = new HashMap<Integer, Ship>();

    public List<Ship> getShips() {
        return shipMap.values().stream().collect(Collectors.toList());
    }

    public Ship getShipById(Integer id) {
        return shipMap.get(id);
    }

    public Ship createShip(Ship ship) {
        ship.setId(id.incrementAndGet());
        shipMap.put(ship.getId(), ship);
        return ship;
    }

    public Ship updateShipById(Integer id, Ship ship) {
        ship.setId(id);
        return shipMap.put(id, ship);
    }

    public Ship deleteShipById(Integer id) {
        return shipMap.remove(id);
    }
}
