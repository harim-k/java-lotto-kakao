package lotto;

import lotto.LottoNumbers;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class LottoNumbersTest {

    @Test
    public void countSameLottoNumber() {
        List<Integer> numbers1 = Arrays.asList(1, 2, 3, 4, 5, 6);
        List<Integer> numbers2 = Arrays.asList(1, 45, 30, 2, 5, 6);

        LottoNumbers lottoNumbers1 = new LottoNumbers(numbers1);
        LottoNumbers lottoNumbers2 = new LottoNumbers(numbers1);
        assertEquals(6, lottoNumbers1.countSameLottoNumber(lottoNumbers2));

        LottoNumbers lottoNumbers3 = new LottoNumbers(numbers1);
        LottoNumbers lottoNumbers4 = new LottoNumbers(numbers2);
        assertEquals(4, lottoNumbers3.countSameLottoNumber(lottoNumbers4));
    }

    @Test
    void contains() {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);
        LottoNumbers lottoNumbers = new LottoNumbers(numbers);

        LottoNumber lottoNumber1 = LottoNumber.getInstance(1);
        LottoNumber lottoNumber2 = LottoNumber.getInstance(6);
        LottoNumber lottoNumber3 = LottoNumber.getInstance(7);

        assertTrue(lottoNumbers.contains(lottoNumber1));
        assertTrue(lottoNumbers.contains(lottoNumber2));
        assertFalse(lottoNumbers.contains(lottoNumber3));

    }
}
