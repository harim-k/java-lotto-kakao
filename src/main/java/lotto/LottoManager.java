package lotto;

import java.util.List;

public class LottoManager {
    public static final int LOTTO_PRICE = 1000;

    private Lottos lottos;
    private List<LottoResult> lottoResults;

    public LottoManager() {

    }

    public void buyLottos(int money) {
        lottos = new Lottos(money / LOTTO_PRICE);
    }

    public Lottos getLottos() {
        return lottos;
    }

    public List<LottoResult> getLottoResults(LottoNumbers lottoNumbers, LottoNumber bonusNumber) {
        lottoResults = lottos.getLottoResults(lottoNumbers, bonusNumber);
        return lottoResults;
    }

    private long getReward() {
        long reward = 0;
        for (LottoResult lottoResult : lottoResults) {
            System.out.println("result cnt: " + lottoResult.getCount());
            reward += LottoUtil.changeResultToReward(lottoResult);
        }
        System.out.println("reward: " + reward);
        return reward;
    }

    public long getEarningRate() {
        return getReward() * 100 / (lottoResults.size() * LOTTO_PRICE);
    }

}
