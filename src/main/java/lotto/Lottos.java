package lotto;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Lottos {

    private final List<Lotto> lottos = new ArrayList<>();

    public void addLotto(Lotto lotto){
        lottos.add(lotto);
    }

    public void addLotto(List<Lotto> lottos){
        for (Lotto lotto : lottos) {
            lottos.add(lotto);
        }
    }

    public void addLotto(int n){
        for (int i = 0; i < n; i++) {
            lottos.add(Lotto.generateRandomLotto());
        }
    }

    public List<Lotto> getLottos() {
        return lottos;
    }

    public List<LottoResult> getLottoResults(Lotto winningLotto, LottoNumber bonusNumber) {
        return lottos.stream()
                .map(lotto -> lotto.getResult(winningLotto, bonusNumber))
                .collect(Collectors.toList());
    }
}
