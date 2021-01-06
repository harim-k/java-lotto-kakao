import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

class LottoNumberUtilTest {
    @Test
    public void check6WithoutDuplicate() {
        List<LottoNumber> list = LottoNumberUtil.generateLottoNumbers();
        HashSet<LottoNumber> set = new HashSet<>(list);
        assertEquals(set.size(), 6);
    }

}