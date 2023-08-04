package cucumber;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/feature"
        ,glue={"org/aluve/steps"},
        tags="@finance"
)

public class RunCucumberIT {
}
