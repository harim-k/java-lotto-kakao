import java.util.*;

public class LottoNumbers {
    private final List<LottoNumber> lottoNumbers;

    public LottoNumbers(List<Integer> list) {
        lottoNumbers = new ArrayList<>();
        Collections.sort(list);

        for (int i = 0; i < list.size(); i++) {
            lottoNumbers.add(new LottoNumber(list.get(i)));
        }
    }

    public int compare(LottoNumbers lottoNumbers) {
        Set<Integer> set = new HashSet<>();

        for (int i = 0; i < 6; i++) {
            set.add(this.lottoNumbers.get(i).getNumber());
            set.add(lottoNumbers.lottoNumbers.get(i).getNumber());
        }

        return 12 - set.size();
    }

}
