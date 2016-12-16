import model.Database;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import static org.junit.Assert.assertEquals;

/**
 * @author Luca Mozzo
 * Test for database
 */
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class TestDatabase {

    @Test
    public void a_databaseInsertUsername(){
        assertEquals(1, Database.executeNonQuery("INSERT INTO users(USERNAME) VALUES('Test');"));
    }

    @Test
    public void b_databaseInsertUsernameAndPassword(){
        assertEquals(1, Database.executeNonQuery("INSERT INTO users(USERNAME, PASSWORD) VALUES('Test1', 'pass');"));
    }

    @Test
    public void c_databaseRepeatInsert(){
        assertEquals(0, Database.executeNonQuery("INSERT INTO users(USERNAME) VALUES('Test1');"));
    }

    @Test
    public void d_databaseDeleteFirstTest(){
        assertEquals(1, Database.executeNonQuery("DELETE FROM users WHERE USERNAME='Test';"));
    }
    @Test
    public void e_databaseDeleteSecondTest(){
        assertEquals(1, Database.executeNonQuery("DELETE FROM users WHERE USERNAME='Test1';"));
    }

    @Test
    public void f_databaseDeleteNonExisting(){
        assertEquals(0, Database.executeNonQuery("DELETE FROM users WHERE USERNAME='Test1';"));
    }
}
