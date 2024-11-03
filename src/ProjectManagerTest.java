package ma.sonar.main;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ProjectManagerTest {

    @Test
    public void testPerformComplexCalculation() {
        assertEquals(3, ProjectManager.performComplexCalculation(5));
    }

    @Test
    public void testGetProjectDescription() {
        assertEquals("A sample project for demonstration purposes.", ProjectManager.getProjectDescription());
    }
}
