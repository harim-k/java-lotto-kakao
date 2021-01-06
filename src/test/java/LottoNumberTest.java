import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class LottoNumberTest {

    @Test
    public void createNumber() {
        assertThatThrownBy(() -> {
            LottoNumber lottoNumber = new LottoNumber(0);
        });
        assertThatThrownBy(() -> {
            LottoNumber lottoNumber = new LottoNumber(46);
        });
        LottoNumber lottoNumber = new LottoNumber(1);
        LottoNumber lottoNumber2 = new LottoNumber(45);
    }

    @Test
    public void equals() {
        LottoNumber lottoNumber = new LottoNumber(1);
        LottoNumber lottoNumber2 = new LottoNumber(1);
        assertTrue(lottoNumber.equals(lottoNumber2));
        assertFalse(new LottoNumber(1).equals(new LottoNumber(2)));
    }

}
