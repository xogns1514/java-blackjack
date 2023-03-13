package blackjack.dto;

import blackjack.domain.player.Challenger;
import blackjack.domain.player.Money;
import blackjack.domain.player.Players;
import blackjack.domain.result.Result;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class ProfitDto {

    private final Map<String, Integer> challengersProfit;
    private final String dealerName;
    private final int dealerProfit;

    public ProfitDto(final Map<String, Integer> challengersProfit, final String dealerName, final int dealerProfit) {
        this.challengersProfit = challengersProfit;
        this.dealerName = dealerName;
        this.dealerProfit = dealerProfit;
    }

    public static ProfitDto of(final Result result, final Players players) {
        Map<String, Integer> challengersProfit = toChallengersProfit(result, players.getChallengers());
        String dealerName = players.getDealer().getName();
        int dealerProfit = result.getDealerProfit().getAmount();
        return new ProfitDto(challengersProfit, dealerName, dealerProfit);
    }

    private static Map<String, Integer> toChallengersProfit(final Result result, final List<Challenger> challengers) {
        Map<String, Integer> challengersProfit = new LinkedHashMap<>();
        for (Challenger challenger : challengers) {
            Money challengerProfit = result.getChallengerProfit(challenger);
            challengersProfit.put(challenger.getName(), challengerProfit.getAmount());
        }
        return challengersProfit;
    }

    public Map<String, Integer> getChallengersProfit() {
        return challengersProfit;
    }

    public String getDealerName() {
        return dealerName;
    }

    public int getDealerProfit() {
        return dealerProfit;
    }
}