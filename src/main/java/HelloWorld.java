import spark.servlet.SparkApplication;

import static spark.Spark.get;

public class HelloWorld implements SparkApplication {
    @Override
    public void init() {
        get("/aaptatt", (req, res) -> "Welcome to Aaptatt!!");
    }
}
