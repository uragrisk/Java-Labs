package ua.lviv.iot.managers;

import lombok.AllArgsConstructor;
import lombok.Data;
import ua.lviv.iot.enums.SortOrder;
import ua.lviv.iot.models.Ship;


import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

@Data
@AllArgsConstructor
public class ShipManager {
    private List<Ship> ships;

    public List<Ship> searchByTonnage(Double tonnage) {
        return ships.stream().filter(ship -> ship.getTonnage().equals(tonnage)).collect(Collectors.toList());
    }

    public List<Ship> searchByMaxSpeed(int maxSpeed) {
        return ships.stream().filter(ship -> ship.getMaxSpeed() == maxSpeed).collect(Collectors.toList());
    }

    private List<Ship> getShips(SortOrder sortOrder, Comparator<Ship> comparing) {
        if (sortOrder.equals(SortOrder.ASC)) {
            return ships.stream()
                    .sorted(comparing)
                    .collect(Collectors.toList());
        }
        return ships.stream()
                .sorted(comparing.reversed())
                .collect(Collectors.toList());
    }

    public List<Ship> sortByFuelConsumption(SortOrder sortOrder) {
        return getShips(sortOrder, Comparator.comparing(Ship::getFluePer100Miles));
    }

    public void printAllShips() {
        ships.forEach(System.out::println);
    }

    public void printShips(List<Ship> ships) {
        ships.forEach(System.out::println);
    }
}


