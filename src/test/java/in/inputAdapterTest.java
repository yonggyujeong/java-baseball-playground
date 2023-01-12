package in;


import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class inputAdapterTest {

    InputAdapter inputAdapter = new InputAdapter();

    @Test
    void 입력값검증1_3자리_이상_문자_Failure_Test() {
        String input = "1223";

        assertThatThrownBy(() -> {
            inputAdapter.validateThreeNumber(input);
        }).isInstanceOf(IllegalArgumentException.class)
                .hasMessage("세자리 숫자만 입력 가능합니다");

    }

    @Test
    void 입력값검증2_숫자가_아닐때_Failure() {
        String input = "3f3";

        assertThatThrownBy(() -> {
            inputAdapter.validateThreeNumber(input);
        }).isInstanceOf(IllegalArgumentException.class)
                .hasMessage("숫자만 입력해 주세요");
    }

    @Test
    void 문자타입인_숫자를_숫자타입으로_변경_Test() {
        String stringTypeNumber = "123";
        Integer intTypeNumber = inputAdapter.convertInputToNumber(stringTypeNumber);
        assertThat(intTypeNumber).isEqualTo(intTypeNumber).isEqualTo(123);
    }
}
