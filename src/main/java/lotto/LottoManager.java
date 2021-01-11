package lotto;

import java.util.List;

import static lotto.Lotto.LOTTO_PRICE;

public class LottoManager {

    private Lottos lottos = new Lottos();
    private List<LottoResult> lottoResults;

    public void buyLottos(int money) {
        validateMoney(money);
        int numberOfLottos = money / LOTTO_PRICE;
        lottos.addRandomLottos(numberOfLottos);
    }

    public void validateMoney(int money) {
        if (money % LOTTO_PRICE != 0 || money == 0) {
            throw new IllegalArgumentException();
        }
    }

    public Lottos getLottos() {
        return lottos;
    }

    public int getNumberOfLottos() {
        return lottos.getLottos().size();
    }

    public void checkLottos(Lotto winningLotto, LottoNumber bonusNumber) {
        lottoResults = lottos.checkLottos(winningLotto, bonusNumber);
    }

    public int[] countRanks() {
        int[] rankCounts = new int[LottoResult.values().length];

        for (LottoResult lottoResult : lottoResults) {
            rankCounts[LottoResult.getIndexOf(lottoResult)]++;
        }

        return rankCounts;
    }

    public long getEarningRate() {
        return getTotalReward() * 100 / (getNumberOfLottos() * LOTTO_PRICE);
    }

    private long getTotalReward() {
        return lottoResults.stream().mapToInt(result -> result.getReward()).sum();
    }

}
