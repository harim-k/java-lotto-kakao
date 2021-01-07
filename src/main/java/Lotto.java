import java.util.List;

public class Lotto {

    private final LottoNumbers lottoNumbers;

    public Lotto() {
        this.lottoNumbers = generateLottoNumbers();
    }

    public Lotto(LottoNumbers lottoNumbers){
        this.lottoNumbers = lottoNumbers;
    }

    public LottoNumbers generateLottoNumbers(){
        return new LottoNumbers(NumberUtil.generateLottoNumbers());
    }

    public LottoResult getResult(List<Integer> winningNumbers, int bonusNumber){
        LottoNumbers winningLottoNumbers = new LottoNumbers(winningNumbers);

        return new LottoResult(
                lottoNumbers.countSameLottoNumber(winningLottoNumbers),
                lottoNumbers.contains(bonusNumber)
        );
    }
}
