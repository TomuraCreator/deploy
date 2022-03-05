public class Game {
    private final char[][] charsMatrix = new char[3][3];
    private Player sender;
    private Player opponent;
    private Player currentPlayer;
    private boolean turnPlayer;
    private int steps;

    Calculate calculate = new Calculate();

    public boolean setPoint(int x, int y) {
        charsMatrix[x][y] = currentPlayer.getSide();
        turnPlayer = !turnPlayer;
        currentPlayer = turnPlayer ? opponent : sender;
        steps++;
        return calculate.isWin(charsMatrix, x, y);
    }

    public char[][] getCharsMatrix() {
        return charsMatrix;
    }

    public Player getSender() {
        return sender;
    }

    public void setSender(Player sender) {
        this.sender = sender;
    }

    public Player getOpponent() {
        return opponent;
    }

    public void setOpponent(Player opponent) {
        this.opponent = opponent;
    }

    public Player getCurrentPlayer() {
        return currentPlayer;
    }

    public void setCurrentPlayer(Player currentPlayer) {
        this.currentPlayer = currentPlayer;
    }

    public int getSteps() {
        return steps;
    }
}

