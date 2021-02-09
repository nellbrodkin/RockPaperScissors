public class BeatByFrequencyPlayer implements Player {
    private int move, totalGames = 0;
    private int[] moveCount = new int[3];

    public BeatByFrequencyPlayer() {
        move = RPS.ROCK;
    }

    public int getMove() {
        double probability = Math.random();
        double rockFrequency = (double) moveCount[RPS.ROCK] / totalGames, paperFrequency = (double) moveCount[RPS.PAPER] / totalGames;

        if (probability < rockFrequency) move = RPS.ROCK;
        else if (probability < rockFrequency + paperFrequency) move = RPS.PAPER;
        else move = RPS.SCISSORS;
        return getMoveToBeat(move);
    }

    private int getMoveToBeat(int prev) {
        if (prev == RPS.ROCK) return RPS.PAPER;
        if (prev == RPS.SCISSORS) return RPS.ROCK;
        return RPS.SCISSORS;
    }

    public void updateLastRoundInfo(int yourMove, int opponentMove, int outcome) {
        totalGames++;
        moveCount[opponentMove]++;
    }
}
