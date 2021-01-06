public class Lotto {

    private final LottoNumbers lottoNumbers;

    public Lotto() {
        this.lottoNumbers = generateLottoNumbers();
    }

    public LottoNumbers generateLottoNumbers(){
        return new LottoNumbers(NumberUtil.generateLottoNumbers());
    }

}
