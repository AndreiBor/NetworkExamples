package by.javaguru.http;

public class HttpServerRunner {
    public static void main(String[] args) {
        HttpServer httpServer = new HttpServer(8082, 20);
        httpServer.run();
    }
}
