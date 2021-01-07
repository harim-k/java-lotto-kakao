import lotto.*;
import view.OutputView;
import view.InputView;

public class LottoApplication {
    public static void main(String []arg){

        LottoManager lottoManager = new LottoManager();

        int money = InputView.readMoney();
        lottoManager.buyLottos(money);
        OutputView.printLottos(lottoManager.getLottos());

        LottoNumbers winningNumbers = InputView.readWinningNumbers();
        LottoNumber bonusNumber = InputView.readBonusNumber();
        lottoManager.getLottoResults(winningNumbers, bonusNumber);


        long earningRates = lottoManager.getEarningRate();

        System.out.println("수익률 : " + earningRates + "%");
    }


}
