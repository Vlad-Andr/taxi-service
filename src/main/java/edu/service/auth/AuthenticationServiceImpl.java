package edu.service.auth;

import java.util.Optional;
import edu.exception.AuthenticationException;
import edu.lib.Injector;
import edu.lib.Service;
import edu.model.Driver;
import edu.service.DriverService;

@Service
public class AuthenticationServiceImpl implements AuthenticationService {
    private static final Injector injector = Injector.getInstance("edu");
    private final DriverService driverService = (DriverService) injector
            .getInstance(DriverService.class);

    @Override
    public Driver login(String login, String password) throws AuthenticationException {
        Optional<Driver> driver = driverService.findByLogin(login);
        if (driver.isPresent() && driver.get().getPassword().equals(password)) {
            return driver.get();
        }
        throw new AuthenticationException("Incorrect login or password");
    }
}
