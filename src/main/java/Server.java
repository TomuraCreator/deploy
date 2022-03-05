import com.sun.net.httpserver.HttpServer;

import java.net.InetSocketAddress;

public class Server {

    public static final int PORT = 8080;

    private final HttpServer server;

    public Server(XOGame xoGame) throws Exception{
        xoGame.listen();
        server = HttpServer.create(new InetSocketAddress("localhost", PORT), 0);
    }

    public void start () {
        System.out.println("Запускаем сервер на порту " + PORT);
        server.start();
    }
}
