public class OpponentLastMovePlayer implements Player {

    private int opponentLastMove;

    public OpponentLastMovePlayer() {
        opponentLastMove = RPS.ROCK;
    }

    public int getMove() {
        return opponentLastMove;
    }

    public void updateLastRoundInfo(int yourMove, int opponentMove, int outcome) {
        opponentLastMove = opponentMove;
    }
}
