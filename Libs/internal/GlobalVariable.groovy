package internal

import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.main.TestCaseMain


/**
 * This class is generated automatically by Katalon Studio and should not be modified or deleted.
 */
public class GlobalVariable {
     
    /**
     * <p></p>
     */
    public static Object appDev
     
    /**
     * <p></p>
     */
    public static Object appDevCurrent
     

    static {
        try {
            def selectedVariables = TestCaseMain.getGlobalVariables("default")
			selectedVariables += TestCaseMain.getGlobalVariables(RunConfiguration.getExecutionProfile())
            selectedVariables += TestCaseMain.getParsedValues(RunConfiguration.getOverridingParameters())
    
            appDev = selectedVariables['appDev']
            appDevCurrent = selectedVariables['appDevCurrent']
            
        } catch (Exception e) {
            TestCaseMain.logGlobalVariableError(e)
        }
    }
}
