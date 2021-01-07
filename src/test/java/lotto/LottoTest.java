package lotto;


import org.junit.jupiter.api.Test;
import java.util.Arrays;
import static org.junit.jupiter.api.Assertions.*;

class LottoTest {

    @Test
    void lottoResult() {
        LottoNumbers winningNumbers = new LottoNumbers(Arrays.asList(1, 2, 3, 4, 5, 6));
        LottoNumber bonusNumber = LottoNumber.getInstance(7);

        Lotto lotto1 = new Lotto(new LottoNumbers(Arrays.asList(1, 2, 3, 4, 5, 6)));
        Lotto lotto2 = new Lotto(new LottoNumbers(Arrays.asList(7, 8, 9, 10, 11, 12)));
        Lotto lotto3 = new Lotto(new LottoNumbers(Arrays.asList(6, 3, 7, 20, 45, 36)));

        assertEquals(6, lotto1.getResult(winningNumbers, bonusNumber).getCount());
        assertFalse(lotto1.getResult(winningNumbers, bonusNumber).isBonusMatch());

        assertEquals(0, lotto2.getResult(winningNumbers, bonusNumber).getCount());
        assertTrue(lotto2.getResult(winningNumbers, bonusNumber).isBonusMatch());

        assertEquals(2, lotto3.getResult(winningNumbers, bonusNumber).getCount());
        assertTrue(lotto3.getResult(winningNumbers, bonusNumber).isBonusMatch());
    }
}