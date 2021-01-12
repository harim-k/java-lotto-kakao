package view;

import lotto.Lotto;
import lotto.LottoResult;
import lotto.Lottos;

import java.util.Map;

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

    public static void printStatistics(Map<LottoResult, Long> statistics) {
        LottoResult[] printSequence = new LottoResult[]{
                LottoResult.FIFTH,
                LottoResult.FOURTH,
                LottoResult.THIRD,
                LottoResult.SECOND,
                LottoResult.FIRST
        };

        for (LottoResult lottoResult : printSequence) {
            long count = statistics.get(lottoResult) != null ? statistics.get(lottoResult) : 0;
            System.out.println(lottoResult + " " + count + "개");
        }
    }

    public static void printNumberOfLottos(int numberOfLottos) {
        System.out.println(numberOfLottos + "개를 구매했습니다.");
    }

    public static void printAskingManualLottoNumbers() {
        System.out.println("수동으로 구매할 번호를 입력해 주세요.");
    }
}
