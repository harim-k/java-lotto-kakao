import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class LottoNumbersTest {

    @Test
    void name() {

    }

    @Test
    public void compare(){
        List<Integer> numbers1 = Arrays.asList(1,2,3,4,5,6);
        List<Integer> numbers2 = Arrays.asList(1,45,30,2,5,6);

        LottoNumbers lottoNumbers1 = new LottoNumbers(numbers1);
        LottoNumbers lottoNumbers2 = new LottoNumbers(numbers1);
        assertEquals(6, lottoNumbers1.compare(lottoNumbers2));

        LottoNumbers lottoNumbers3 = new LottoNumbers(numbers1);
        LottoNumbers lottoNumbers4 = new LottoNumbers(numbers2);
        assertEquals(4, lottoNumbers3.compare(lottoNumbers4));
    }
}
