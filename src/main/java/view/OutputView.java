package view;

import lotto.Lotto;
import lotto.LottoResult;
import lotto.Lottos;

public class OutputView {
    public static void printLottos(Lottos lottos) {
        for (Lotto lotto : lottos.getLottos()) {
            printLotto(lotto);
        }
    }

    public static void printLotto(Lotto lotto) {
        System.out.println("[" + lotto.toString() + "]");
    }


    public static void printEarningRate(long earningRate) {
        System.out.println("총 수익률은 " + earningRate + "%입니다");
    }

    public static void printStatistics(int[] rankCounts) {
        for (int i = rankCounts.length - 1; i >= 0; i--) {
            printStatistic(LottoResult.values()[i], rankCounts[i]);
        }
    }

    public static void printStatistic(LottoResult lottoResult, int rankCount) {
        if(lottoResult == LottoResult.NOTHING) return;
        System.out.println(lottoResult + " " + rankCount + "개");
    }
}
