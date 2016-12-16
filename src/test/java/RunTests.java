import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

/**
 * @author Luca Mozzo
 * Run the test suite
 */
public class RunTests {

    public static void main(String[] args){
        Result result = JUnitCore.runClasses(TestProgramSuite.class);
        for(Failure f : result.getFailures())
            System.out.println(f.toString());
        System.out.println("Test suite result: " + result.wasSuccessful());
    }
}
