package lotto;

import utils.NumberUtil;

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

    public LottoResult getResult(LottoNumbers winningLottoNumbers, LottoNumber bonusNumber){
        return new LottoResult(
                lottoNumbers.countSameLottoNumber(winningLottoNumbers),
                lottoNumbers.contains(bonusNumber)
        );
    }

    public String getNumbers() {
        return lottoNumbers.getNumbers();
    }
}
