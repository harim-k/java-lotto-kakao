package lotto;

public class LottoNumber implements Comparable<LottoNumber> {
    private static final int MAX_LOTTO_NUMBER = 45;
    private static final int MIN_LOTTO_NUMBER = 1;
    private final int number;
    private static final LottoNumber[] LIST = new LottoNumber[46];

    public static LottoNumber getInstance(int number) {
        if (LIST[number] != null) return LIST[number];
        LIST[number] = new LottoNumber(number);
        return LIST[number];
    }

    private LottoNumber(int number) {
        if (number < MIN_LOTTO_NUMBER || number > MAX_LOTTO_NUMBER) {
            throw new IllegalArgumentException();
        }
        this.number = number;
    }


    public int getNumber() {
        return number;
    }

    @Override
    public int compareTo(LottoNumber o) {
        return Integer.compare(number, o.number);
    }

}
