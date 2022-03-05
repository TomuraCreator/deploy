public class Main {

    public static void main(String[] args) throws Exception {

        XOGame bot = new XOGame();

        Server server = new Server(bot);
        server.start();
    }
}
