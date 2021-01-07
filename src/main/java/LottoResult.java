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
}
