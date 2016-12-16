package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 * @author Luca Mozzo
 * Defines basic database operations
 */
public final class Database {

    /**
     * Executes a command
     * @param command the command
     * @return the number of rows affected
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

    /**
     * Executes a query
     * @param query the query
     * @return the result
     */
    public static ResultSet executeQuery(String query){
        Connection connection = null;
        try {
            Class.forName("org.sqlite.JDBC");
            connection = DriverManager.getConnection("jdbc:sqlite:data.db");
            connection.setAutoCommit(true);

            Statement stmt = connection.createStatement();
            ResultSet rs = stmt.executeQuery(query);

            stmt.close();
            connection.close();
            return rs;
        } catch(Exception ex){
            return null;
        }
    }
}
