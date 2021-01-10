package lotto;


import org.junit.jupiter.api.Test;
import java.util.Arrays;
import static org.junit.jupiter.api.Assertions.*;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

class LottoTest {
    @Test
    void validate() {
        assertThatThrownBy(() -> {
            Lotto wrongLottoNumbers = new Lotto(Arrays.asList(1, 2, 3, 4, 5, 6, 7));
        });

        Lotto correctLottoNumbers = new Lotto(Arrays.asList(1, 2, 3, 4, 5, 6));
    }

    @Test
    void getResult() {
        Lotto winningNumbers = new Lotto(Arrays.asList(1, 2, 3, 4, 5, 6));
        LottoNumber bonusNumber = LottoNumber.getInstance(7);

        Lotto lotto1 = new Lotto(Arrays.asList(1, 2, 3, 4, 5, 6));
        Lotto lotto2 = new Lotto(Arrays.asList(7, 8, 9, 10, 11, 12));
        Lotto lotto3 = new Lotto(Arrays.asList(3, 6, 7, 20, 45, 36));

        assertEquals(LottoResult.FIRST, lotto1.getResult(winningNumbers, bonusNumber));
        assertEquals(LottoResult.NOTHING, lotto2.getResult(winningNumbers, bonusNumber));
        assertEquals(LottoResult.NOTHING, lotto3.getResult(winningNumbers, bonusNumber));
    }
}