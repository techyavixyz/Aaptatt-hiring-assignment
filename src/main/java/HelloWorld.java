import spark.servlet.SparkApplication;

import static spark.Spark.get;

public class HelloWorld implements SparkApplication {
    public static void main(String[] args) {
        new HelloWorld().init();
    }

    @Override
    public void init() {
        get("/techyavi", (req, res) -> {
            String html = "<!DOCTYPE html>" +
                    "<html lang=\"en\">" +
                    "<head>" +
                    "<meta charset=\"UTF-8\">" +
                    "<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">" +
                    "<title>Welcome to TechyAvi!!</title>" +
                    "<link rel=\"stylesheet\" href=\"/path/to/style.css\">" +  // Change the path accordingly
                    "</head>" +
                    "<body>" +
                    "<div class=\"container\">" +
                    "<h1>Welcome to Aaptatt!!</h1>" +
                    "</div>" +
                    "</body>" +
                    "</html>";
            res.type("text/html");
            return html;
        });
    }
}
