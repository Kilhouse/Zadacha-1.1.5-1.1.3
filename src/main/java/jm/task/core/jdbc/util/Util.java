package jm.task.core.jdbc.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Util {
    private static final String USERNAME_KEY = "db.username";
    private static final String PASSWORD_KEY = "db.password";
    private static final String URL_KEY = "db.url";




    private Util() {
    }

    public static Connection getConnection() throws SQLException, RuntimeException {

        return DriverManager.getConnection(
                Property.get(URL_KEY),
                Property.get(USERNAME_KEY),
                Property.get(PASSWORD_KEY));
    }
}

