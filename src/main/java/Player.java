public class Player {
    private final String name;
    private final char side;
    private String gameID;
    private final long playerIdForRemove;

    public Player(String name, long playerIdForRemove, char side) {
        this.name = name;
        this.side = side;
        this.playerIdForRemove = playerIdForRemove;
    }

    public String getName() {
        return name;
    }

    public char getSide() {
        return side;
    }

    public String getGameID() {
        return gameID;
    }

    public void setGameID(String gameID) {
        this.gameID = gameID;
    }

    public long getPlayerIdForRemove() {
        return playerIdForRemove;
    }
}
