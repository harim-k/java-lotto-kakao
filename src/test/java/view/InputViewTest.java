package view;

import static org.assertj.core.api.Assertions.assertThatThrownBy;

import org.junit.jupiter.api.Test;

public class InputViewTest {
    @Test
    void getMoney() {
        assertThatThrownBy(() -> {
            InputView.validationMoney(13);
        });
        assertThatThrownBy(() -> {
            InputView.validationMoney(999);
        });
        assertThatThrownBy(() -> {
            InputView.validationMoney(1030);
        });
        assertThatThrownBy(() -> {
            InputView.validationMoney(0);
        });

        InputView.validationMoney(1000);
        InputView.validationMoney(2000);
        InputView.validationMoney(100000);
    }

}
