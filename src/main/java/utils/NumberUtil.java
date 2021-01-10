package utils;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class NumberUtil {
    private static final int MAX_LOTTO_NUMBER = 45;
    private static final int MIN_LOTTO_NUMBER = 1;
    private static final int LOTTO_COUNT = 6;

    public static List<Integer> generateLottoNumbers() {
        List<Integer> lottoNumbers = new LinkedList<>();
        for (int i = MIN_LOTTO_NUMBER; i <= MAX_LOTTO_NUMBER; i++) {
            lottoNumbers.add(i);
        }

        Collections.shuffle(lottoNumbers);
        List<Integer> sixLottoNumbers = lottoNumbers.subList(0, LOTTO_COUNT);
        Collections.sort(sixLottoNumbers);

        return sixLottoNumbers;
    }
}
