package edu.service.auth;

import edu.exception.AuthenticationException;
import edu.model.Driver;

public interface AuthenticationService {
    Driver login(String login, String password) throws AuthenticationException;
}
