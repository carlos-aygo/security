package co.edu.escuelaing;

import static spark.Spark.*;

public class HelloService {
    public static void main(String[] args) {

        //API: secure(keystoreFilePath, keystorePassword, truststoreFilePath,truststorePassword);
        secure("ecikeystore.p12", "1234567", null, null);

        port(5000);

        get("/hello", (req, res) -> "Hello World");
    }
}