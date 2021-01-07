import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class LottoTest {

    @Test
    void lottoResult() {
        int bonusNumber = 7;
        List<Integer> winningNumbers = Arrays.asList(1, 2, 3, 4, 5, 6);

        List<Integer> lottoNumbers1 = Arrays.asList(1, 2, 3, 4, 5, 6);
        Lotto lotto1 = new Lotto(new LottoNumbers(lottoNumbers1));
        assertEquals(6, lotto1.getResult(winningNumbers, bonusNumber).getCount());
        assertFalse(lotto1.getResult(winningNumbers, bonusNumber).isBonusMatch());

        List<Integer> lottoNumbers2 = Arrays.asList(7, 8, 9, 10, 11, 12);
        Lotto lotto2 = new Lotto(new LottoNumbers(lottoNumbers2));
        assertEquals(0, lotto2.getResult(winningNumbers, bonusNumber).getCount());
        assertTrue(lotto2.getResult(winningNumbers, bonusNumber).isBonusMatch());

        List<Integer> lottoNumbers3 = Arrays.asList(6, 3, 7, 20, 45, 36);
        Lotto lotto3 = new Lotto(new LottoNumbers(lottoNumbers3));
        assertEquals(2, lotto3.getResult(winningNumbers, bonusNumber).getCount());
        assertTrue(lotto3.getResult(winningNumbers, bonusNumber).isBonusMatch());
    }
}