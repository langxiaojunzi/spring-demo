package com.example.pattern.chain;

/**
 * <p>create at 2019/5/14</p>
 *
 * @author guzhan
 * @since 1.0.0
 */
public class Context {
    private Boolean newUser;

    private String location;

    public boolean isNewUser() {
        return newUser;
    }

    public void setNewUser(boolean newUser) {
        this.newUser = newUser;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
