package lotto;

import java.util.List;

public class LottoManager {
    public static final int LOTTO_PRICE = 1000;

    private Lottos lottos = new Lottos();
    private List<LottoResult> lottoResults;

    public void buyLottos(int money) {
        lottos.addLotto(money / LOTTO_PRICE);
    }

    public void buyLottos(Lottos lottos) {
        this.lottos = lottos;
    }

    public Lottos getLottos() {
        return lottos;
    }

    public int getNumberOfLotto() {
        return lottos.getLottos().size();
    }

    public void checkLottos(Lotto winningLotto, LottoNumber bonusNumber) {
        lottoResults = lottos.getLottoResults(winningLotto, bonusNumber);
    }

    public int[] countRanks() {
        int[] rankCounts = new int[LottoResult.values().length];

        for (LottoResult lottoResult : lottoResults) {
            rankCounts[LottoResult.getIndexOf(lottoResult)]++;
        }

        return rankCounts;
    }

    public long getEarningRate() {
        return getTotalReward() * 100 / (lottos.getLottos().size() * LOTTO_PRICE);
    }

    private long getTotalReward() {
        return lottoResults.stream().mapToInt(result -> result.getReward()).sum();
    }
}
