package view;

import lotto.Lotto;
import lotto.Lottos;

public class OutputView {
    public static void printLottos(Lottos lottos){
        for(Lotto lotto : lottos.getLottos()){
            printLotto(lotto);
        }
    }

    public static void printLotto(Lotto lotto) {
        System.out.println(lotto.getNumbers());
    }

    public static void printLottoResults(Lotto lotto) {
        System.out.println("[" + lotto.getNumbers() + "]");
    }

    public static void printEarningRate(int earningRate) {
        System.out.println("총 수익률은 " + earningRate + "%입니다");
    }
}
