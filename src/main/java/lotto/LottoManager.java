package lotto;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static lotto.Lotto.LOTTO_PRICE;

public class LottoManager {

    private Lottos lottos = new Lottos();
    private List<LottoResult> lottoResults;

    /*
    public void buyLottos(int money, int numberOfManualLottos, List<List<Integer>> numbersSet) {
        buyRandomLottos(money - numberOfManualLottos * LOTTO_PRICE);
        buyManualLotto(numberOfManualLottos);
    }

    public void buyRandomLottos(int money) {
        validateMoney(money);
        int numberOfLottos = money / LOTTO_PRICE;
        lottos.addRandomLottos(numberOfLottos);
    }
     */

    public void buyRandomLotto() {
        lottos.addRandomLotto();
    }

    public void buyManualLotto(List<Integer> numbers) {
        lottos.addManualLotto(numbers);
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

    public Map<LottoResult, Long> makeStatistics() {
        return lottoResults.stream().collect(Collectors.groupingBy(lottoResult -> lottoResult, Collectors.counting()));
    }

    public long getEarningRate() {
        return getTotalReward() * 100 / (getNumberOfLottos() * LOTTO_PRICE);
    }

    private long getTotalReward() {
        return lottoResults.stream().mapToInt(result -> result.getReward()).sum();
    }

}
