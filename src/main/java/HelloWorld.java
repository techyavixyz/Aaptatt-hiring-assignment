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
                    "<style>" +
                    "body, html {" +
                    "    margin: 0;" +
                    "    padding: 0;" +
                    "    height: 100%;" +
                    "    overflow: hidden;" +
                    "}" +
                    "img {" +
                    "    position: absolute;" +
                    "    top: 50%;" +
                    "    left: 50%;" +
                    "    transform: translate(-50%, -50%);" +
                    "    min-width: 100%;" +
                    "    min-height: 100%;" +
                    "    width: auto;" +
                    "    height: auto;" +
                    "}" +
                    "</style>" +
                    "</head>" +
                    "<body>" +
                    "<img src=\"https://github.com/techyavixyz/SparkApplication/raw/master/Happy%20hoil.gif\" alt=\"Autoplaying GIF\">" +
                    "</body>" +
                    "</html>";
            res.type("text/html");
            return html;
        });
    }
}
