package lotto;

import java.util.List;

public enum LottoResult {
    FIRST(6, false, 2000000000),
    SECOND(5, true, 30000000),
    THIRD(5, false, 1500000),
    FOURTH(4, false, 50000),
    FIFTH(3, false, 5000);

    private final int matchCount;
    private final boolean bonusMatch;
    private final int reward;

    public static LottoResult init(int count, boolean bonusMatch) {
        if (count == 3) return FIFTH;
        if (count == 4) return FOURTH;
        if (count == 5 && !bonusMatch) return THIRD;
        if (count == 5 && bonusMatch) return SECOND;
        if (count == 6) return FIRST;
        return null;
    }

    LottoResult(int matchCount, boolean bonusMatch, int reward) {
        this.matchCount = matchCount;
        this.bonusMatch = bonusMatch;
        this.reward = reward;
    }

    public int getReward() {
        return reward;
    }

    public int getMyCount(List<LottoResult> results) {
        int cnt = 0;
        for (LottoResult result : results) {
            if (result == this) cnt++;
        }
        return cnt;
    }

    @Override
    public String toString() {
        if (matchCount == 5 && bonusMatch) return String.format("%d개 일치, 보너스 볼 일치(%d원)", matchCount, reward);
        return String.format("%d개 일치 (%d원)", matchCount, reward);
    }
}
