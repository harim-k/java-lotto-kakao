import java.util.*;

public class LottoNumbers {
    private final List<LottoNumber> lottoNumbers;

    public LottoNumbers(List<Integer> list) {
        lottoNumbers = new ArrayList<>();
        Collections.sort(list);

        for (int i = 0; i < list.size(); i++) {
            lottoNumbers.add(LottoNumber.getInstance(list.get(i)));
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

    public boolean contains(int bonusNumber) {
        return lottoNumbers.contains(LottoNumber.getInstance(bonusNumber));
    }
}
