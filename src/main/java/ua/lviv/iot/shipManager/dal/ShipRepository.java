package ua.lviv.iot.shipManager.dal;

import org.springframework.data.jpa.repository.JpaRepository;
import ua.lviv.iot.shipManager.models.Ship;

public interface ShipRepository extends JpaRepository<Ship, Integer> {
}
