package pp5.services;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 * Created by Rafał on 2016-02-19.
 */
public class PersonForm {
    @NotNull
    @Size(min=2, max=30)
    private String username;

    @NotNull
    @Size(min=2, max=30)
    private String password;

    @NotNull
    @Size(min=2, max=30)
    private String email;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
