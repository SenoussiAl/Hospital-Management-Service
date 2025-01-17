package seg3x02.pms.contracts

import io.cucumber.junit.platform.engine.Constants
import org.junit.platform.suite.api.ConfigurationParameter
import org.junit.platform.suite.api.SelectClasspathResource
import org.junit.platform.suite.api.Suite

@Suite
@SelectClasspathResource("seg3x02/pms/contracts")
@ConfigurationParameter(
    key = Constants.GLUE_PROPERTY_NAME,
    value = "seg3x02.pms.contracts"
)
class CucumberContracts {
}
