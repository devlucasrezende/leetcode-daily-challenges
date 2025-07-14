package daily;

import java.util.Arrays;

public class MaximumMatchingOfPlayersWithTrainers {

    public static void main(String[] args) {
        int[] players = {4,7,9};
        int[] trainers = {8,2,5,8};
        System.out.println(matchPlayersAndTrainers(players, trainers));
    }

    public static int matchPlayersAndTrainers(int[] players, int[] trainers) {
        Arrays.sort(players);
        Arrays.sort(trainers);
        int playerPower = 0;
        int trainerPower = 0;
        int result = 0;
        while (playerPower < players.length && trainerPower < trainers.length) {
            if (players[playerPower] <= trainers[trainerPower]) {
                trainerPower++;
                playerPower++;
                result++;
            } else {
                trainerPower++;
            }
        }
        return result;
    }

}
