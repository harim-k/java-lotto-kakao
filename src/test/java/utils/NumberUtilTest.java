package utils;

import org.junit.jupiter.api.Test;
import utils.NumberUtil;

import java.util.HashSet;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

class NumberUtilTest {
    @Test
    public void check6WithoutDuplicate() {
        List<Integer> list = NumberUtil.generateLottoNumbers();
        HashSet<Integer> set = new HashSet<>(list);
        assertEquals(set.size(), 6);
    }

}