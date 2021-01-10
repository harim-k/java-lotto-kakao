package lotto;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LottoManagerTest {
    @Test
    void getNumberOfLotto() {
        LottoManager lottoManager = new LottoManager();
        lottoManager.buyLottos(LottoManager.LOTTO_PRICE * 2);
        assertEquals(2, lottoManager.getNumberOfLotto());
    }

    @Test
    void earningRate() {
        LottoManager lottoManager = new LottoManager();

        Lottos lottos = new Lottos();
        lottos.addLotto(new Lotto(Arrays.asList(1, 2, 3, 4, 5, 6)));
        lottos.addLotto(new Lotto(Arrays.asList(11, 12, 13, 14, 15, 16)));
        lottoManager.buyLottos(lottos);

        Lotto winningLotto = new Lotto(Arrays.asList(1, 2, 3, 4, 5, 6));
        LottoNumber lottoNumber = LottoNumber.getInstance(7);

        lottoManager.checkLottos(winningLotto, lottoNumber);

        assertEquals(100000000, lottoManager.getEarningRate());
    }
}
