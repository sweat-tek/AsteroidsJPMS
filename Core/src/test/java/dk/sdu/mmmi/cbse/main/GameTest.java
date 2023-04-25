package dk.sdu.mmmi.cbse.main;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author jcs
 */
public class GameTest {
    
    public GameTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {       
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * 
     */
    @Test
    public void testUninstall() throws IOException {
        System.out.println("Uninstall");
        
        //Files.delete(Paths.get("C:\\Users\\jcs\\Documents\\GitHub\\AsteroidsJPMS\\mods-mvn\\Asteroid-1.0.1-SNAPSHOT.jar"));
        String[] args = new String[0];      
        Main.main(args);
        
        while (true) {            
            
        }
                
    }

    
    /**
     * 
     */
    @Test
    public void testInstall() throws IOException {
        System.out.println("Install");
        // TODO review the generated test code and remove the default call to fail.
        
        
        Files.move(Paths.get("..\\Asteroid\\target\\Asteroid-1.0.1-SNAPSHOT.jar"),
        Paths.get("..\\mods-mvn\\Asteroid-1.0.1-SNAPSHOT.jar"));
                
        fail("The test case is a prototype.");
    }

}
