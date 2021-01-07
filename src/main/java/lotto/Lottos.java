package lotto;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Lottos {

    private final List<Lotto> lottos;

    public Lottos(int n) {
        lottos = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            lottos.add(new Lotto());
        }
    }

    public List<Lotto> getLottos() {
        return lottos;
    }

    public List<LottoResult> getLottoResults(LottoNumbers winningNumbers, LottoNumber bonusNumber) {
        return lottos.stream()
                .map(lotto -> lotto.getResult(winningNumbers, bonusNumber))
                .collect(Collectors.toList());
    }
}
