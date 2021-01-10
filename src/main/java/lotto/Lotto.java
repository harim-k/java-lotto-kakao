package lotto;

import utils.NumberUtil;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Lotto {
    private static final int LOTTO_NUMBER_COUNT = 6;
    private final List<LottoNumber> lottoNumbers = new ArrayList<>();

    public Lotto() {
        this(NumberUtil.generateLottoNumbers());
    }

    public Lotto(List<Integer> numbers) {
        validate(numbers);
        numbers.forEach(num ->
                lottoNumbers.add(LottoNumber.getInstance(num))
        );
    }

    private void validate(List<Integer> numbers) {
        if (numbers.size() != LOTTO_NUMBER_COUNT) {
            throw new IllegalArgumentException();
        }
    }

    public LottoResult getResult(Lotto winningLotto, LottoNumber bonusNumber) {
        return LottoResult.init(
                countSameLottoNumber(winningLotto),
                contains(bonusNumber)
        );
    }

    public int countSameLottoNumber(Lotto lotto) {
        Set<LottoNumber> set = new HashSet<>();

        for (int i = 0; i < 6; i++) {
            set.add(this.lottoNumbers.get(i));
            set.add(lotto.lottoNumbers.get(i));
        }

        return 12 - set.size();
    }

    public boolean contains(LottoNumber lottoNumber) {
        return lottoNumbers.contains(lottoNumber);
    }

    @Override
    public String toString() {
        return lottoNumbers.stream()
                .map(lotto -> String.valueOf(lotto.getNumber()))
                .collect(Collectors.joining(", "));
    }

}

