package tests;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ Facebook_test.class, Gmail_test.class, Yahootest.class })
public class AllTests {

}
