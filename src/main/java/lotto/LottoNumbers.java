package lotto;

import java.util.*;
import java.util.stream.Collectors;

public class LottoNumbers {
    private static final int LOTTO_NUMBER_COUNT = 6;

    private final List<LottoNumber> lottoNumbers;

    public LottoNumbers(List<Integer> numbers) {
        validation(numbers);

        lottoNumbers = new ArrayList<>();
        Collections.sort(numbers);

        for (int i = 0; i < numbers.size(); i++) {
            lottoNumbers.add(LottoNumber.getInstance(numbers.get(i)));
        }
    }

    public int countSameLottoNumber(LottoNumbers lottoNumbers) {
        Set<LottoNumber> set = new HashSet<>();

        for (int i = 0; i < 6; i++) {
            set.add(this.lottoNumbers.get(i));
            set.add(lottoNumbers.lottoNumbers.get(i));
        }

        return 12 - set.size();
    }

    public boolean contains(LottoNumber bonusNumber) {
        return lottoNumbers.contains(bonusNumber);
    }

    private void validation(List<Integer> numbers) {
        if (numbers.size() != LOTTO_NUMBER_COUNT) throw new IllegalArgumentException();
    }

    public String getNumbers() {
        return lottoNumbers.stream()
                .map(lotto -> String.valueOf(lotto.getNumber()))
                .collect(Collectors.joining(", "));
    }
}
