package org.acme;

import org.acme.util.Login;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import java.util.Set;

@Path("/login")
public class LoginResource {
    @GET

    public Login list(String user) {
        Login login = (Login) SessionManager.getInstance().getLogins().get(user);
        return login;
    }
}
