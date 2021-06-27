package edu.service;

import java.util.Optional;
import edu.model.Driver;

public interface DriverService extends GenericService<Driver> {
    Optional<Driver> findByLogin(String login);
}
