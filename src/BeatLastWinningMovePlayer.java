public class BeatLastWinningMovePlayer implements Player {
    int lastWinningMove;

    public BeatLastWinningMovePlayer() {
        lastWinningMove = RPS.ROCK;
    }

    public int getMove() {
        if (lastWinningMove == RPS.ROCK) return RPS.PAPER;
        if (lastWinningMove == RPS.SCISSORS) return RPS.ROCK;
        return RPS.SCISSORS;
    }

    public void updateLastRoundInfo(int yourMove, int opponentMove, int outcome) {
        if (outcome == RPS.P1) lastWinningMove = yourMove;
        else lastWinningMove = opponentMove;

    }

}
