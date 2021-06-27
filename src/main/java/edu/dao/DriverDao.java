package edu.dao;

import java.util.Optional;
import edu.model.Driver;

public interface DriverDao extends GenericDao<Driver> {
    Optional<Driver> findByLogin(String login);
}
