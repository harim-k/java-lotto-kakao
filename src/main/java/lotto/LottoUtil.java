package lotto;

public class LottoUtil {
    public static int changeResultToReward(LottoResult lottoResult) {
        int count = lottoResult.getCount();
        boolean bonusMatch = lottoResult.isBonusMatch();

        if (count == 3) return 5000;
        if (count == 4) return 50000;
        if (count == 5 && !bonusMatch) return 1500000;
        if (count == 5 && bonusMatch) return 30000000;
        if (count == 6) return 2000000000;

        return 0;
    }
}
