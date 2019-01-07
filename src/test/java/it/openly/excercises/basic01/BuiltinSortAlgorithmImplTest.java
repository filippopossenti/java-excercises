package it.openly.excercises.basic01;

import org.junit.BeforeClass;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static org.junit.Assert.fail;

public class BuiltinSortAlgorithmImplTest {

    @BeforeClass
    public static void initAlgorithms() {
    }

    @Test
    public void testAlgorithm() {
        // given
        SortAlgorithm algorithmToTest = new BuiltinSortAlgorithmImpl();
        List<String> unsortedTestData = new ArrayList<>();
        unsortedTestData.add("Beta");
        unsortedTestData.add("Gamma");
        unsortedTestData.add("Alpha");

        List<String> sortedTestData = new ArrayList<>(unsortedTestData);
        Collections.sort(sortedTestData);

        // when
        List<String> actualOutput = algorithmToTest.sort(unsortedTestData);

        // then

        /*
         Complete this section of the test. The "then" section of a unit test will take the expected inputs defined
         in the "given" section and compare them with the actual outputs produced by the "when" section of the test.
         When a test is failed, the org.junit.Assert.fail method must be called to state that the test has failed.

         */

        fail("This test has not been implemented yet.");

    }

}
