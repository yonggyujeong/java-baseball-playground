package NumberBaseballGame;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class NumberBaseballGameServiceTest {

    @Test
    @DisplayName("randomNumber가 랜덤넘버를 생성하는지 테스트")
    void 랜덤넘버_생성_테스트() {
        // when
        Number randomNumber = new Number();

        //then
        Integer number = randomNumber.get();
        System.out.println("number = " + number);
        assertThat(number).isGreaterThan(99).isLessThan(10000);
    }

}
