package view;

import lotto.Lotto;
import lotto.LottoManager;
import lotto.LottoNumber;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class InputView {
    private static final Scanner scanner = new Scanner(System.in);

    public static int readMoney() {
        System.out.println("구입금액을 입력해 주세요.");
        int money = Integer.parseInt(scanner.nextLine());
        validationMoney(money);
        System.out.println((money / LottoManager.LOTTO_PRICE) + "개를 구매했습니다.");
        return money;
    }

    public static Lotto readWinningLotto() {
        System.out.println("지난 주 당첨 번호를 입력해 주세요.");
        String input = scanner.nextLine();
        List<Integer> winningNumbers = Arrays.stream(input.split(", "))
                .map(Integer::valueOf)
                .collect(Collectors.toList());

        return Lotto.generateLotto(winningNumbers);
    }

    public static LottoNumber readBonusNumber() {
        System.out.println("보너스 볼을 입력해 주세요.");
        int bonusNumber = Integer.parseInt(scanner.nextLine());

        return LottoNumber.getInstance(bonusNumber);
    }

    public static void validationMoney(int money) {
        if (money % 1000 != 0 || money == 0) {
            throw new IllegalArgumentException();
        }
    }
}
