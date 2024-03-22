import spark.servlet.SparkApplication;
import static spark.Spark.*;

public class HelloWorld implements SparkApplication {

    @Override
    public void init() {
        port(8081);
        get("/aaptatt", (req, res) -> "Welcome to Aaptatt!!");
    }
}
