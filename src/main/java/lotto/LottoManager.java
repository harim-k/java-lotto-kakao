package lotto;

import java.util.List;

public class LottoManager {
    public static final int LOTTO_PRICE = 1000;

    private Lottos lottos = new Lottos();
    private List<LottoResult> lottoResults;

    public void buyLottos(int money) {
        lottos.addRandomLottos(money / LOTTO_PRICE);
    }

    public Lottos getLottos() {
        return lottos;
    }

    public int getNumberOfLotto() {
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
        return getTotalReward() * 100 / (getNumberOfLotto() * LOTTO_PRICE);
    }

    private long getTotalReward() {
        return lottoResults.stream().mapToInt(result -> result.getReward()).sum();
    }

}
