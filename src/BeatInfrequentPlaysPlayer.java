import java.util.ArrayList;

public class BeatInfrequentPlaysPlayer implements Player {
    private int move, n;
    private ArrayList<Integer> lastNMoves = new ArrayList<>();

    public BeatInfrequentPlaysPlayer(int n) {
        this.n = n;
        move = RPS.ROCK;
    }

    public int getMove() {
        int rockCounter = 0, paperCounter = 0, scissorCounter = 0;
        for (int m : lastNMoves) {
            if (m == RPS.ROCK) rockCounter++;
            if (m == RPS.PAPER) paperCounter++;
            if (m == RPS.SCISSORS) scissorCounter++;
        }
        move = Math.min(rockCounter, Math.min(paperCounter, scissorCounter));
        return getMoveToBeat(move);
    }

    private int getMoveToBeat(int lastWinningMove) {
        if (lastWinningMove == RPS.ROCK) return RPS.PAPER;
        if (lastWinningMove == RPS.SCISSORS) return RPS.ROCK;
        return RPS.SCISSORS;
    }

    public void updateLastRoundInfo(int yourMove, int opponentMove, int outcome) {
        if (lastNMoves.size() == n) lastNMoves.remove(0);
        lastNMoves.add(outcome);
    }
}
