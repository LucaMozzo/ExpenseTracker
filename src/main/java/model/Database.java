package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;


/**
 * @author Luca Mozzo
 * Defines basic database operations
 */
public final class Database {

    /**
     * Executes a command
     * @param command the command
     */
    public static int executeNonQuery(String command){
        Connection connection = null;
        try {
            Class.forName("org.sqlite.JDBC");
            connection = DriverManager.getConnection("jdbc:sqlite:data.db");
            connection.setAutoCommit(true);

            Statement stmt = connection.createStatement();
            int result = stmt.executeUpdate(command);

            stmt.close();
            connection.close();
            return result;
        } catch(Exception ex){
            return 0;
        }
    }
}
