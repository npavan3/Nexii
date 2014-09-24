package tests;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;
//comment added by Ajay in pavan's project
@RunWith(Suite.class)
@SuiteClasses({ Facebook_test.class, Gmail_test.class, Yahootest.class })
public class AllTests {

}
