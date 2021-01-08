import lotto.LottoManager;
import view.InputView;
import view.OutputView;

public class LottoApplication {
    private static LottoManager lottoManager;

    public static void main(String[] arg) {
        initLottoManager();
        buyLottos();
        printLottos();
        matchWithWinningLotto();
        printResults();
    }

    private static void initLottoManager() {
        lottoManager = new LottoManager();
    }

    private static void buyLottos() {
        lottoManager.buyLottos(InputView.readMoney());
    }

    private static void printLottos() {
        OutputView.printLottos(lottoManager.getLottos());
    }

    private static void matchWithWinningLotto() {
        lottoManager.matchWithWinningLotto(
                InputView.readWinningLotto(),
                InputView.readBonusNumber()
        );
    }

    private static void printResults() {
        OutputView.printStatistics(lottoManager.countRanks());
        OutputView.printEarningRate(lottoManager.getEarningRate());
    }
}
