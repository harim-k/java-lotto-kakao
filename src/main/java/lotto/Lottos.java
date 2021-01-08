package lotto;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Lottos {

    private final List<Lotto> lottos = new ArrayList<>();

    public Lottos(int n) {
        for (int i = 0; i < n; i++) {
            lottos.add(new Lotto());
        }
    }

    public List<Lotto> getLottos() {
        return lottos;
    }

    public List<LottoResult> getLottoResults(Lotto winningLotto, LottoNumber bonusNumber) {
        return lottos.stream()
                .map(lotto -> lotto.getResult(winningLotto, bonusNumber))
                .filter(lottoResult -> lottoResult != null)
                .collect(Collectors.toList());
    }
}
