package lotto;

public class LottoResult {
    private final int count;
    private final boolean bonusMatch;

    public LottoResult(int count, boolean bonusMatch) {
        this.count = count;
        this.bonusMatch = bonusMatch;
    }

    public int getCount() {
        return count;
    }

    public boolean isBonusMatch() {
        return bonusMatch;
    }

    /*
    public LottoWinnings getMoney() {
        if(count == 3) return LottoWinnings.FIFTH;
        if(count == 4) return LottoWinnings.FOURTH;
        if(count == 5 && !bonusMatch) return LottoWinnings.THIRD;
        if(count == 5 && bonusMatch) return LottoWinnings.SECOND;
        else return LottoWinnings.FIRST;
    }


    enum LottoWinnings {
        FIRST(6, false), SECOND(5, true), THIRD(5, false), FOURTH(4, false), FIFTH(3, false);

        private int matchCount;
        private int winnings;

        private LottoWinnings(int count, boolean bonusMatch){
            this.winnings = winnings;
            this.matchCount = matchCount;
        }
    }

    3개 일치 (5000원)- 1개
    4개 일치 (50000원)- 0개
    5개 일치 (1500000원)- 0개
    5개 일치, 보너스 볼 일치(30000000원) - 0개
    6개 일치 (2000000000원)- 0개
    총 수익률은 30%입니다.

     */
}
