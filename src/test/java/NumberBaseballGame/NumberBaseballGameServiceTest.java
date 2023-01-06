package NumberBaseballGame;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

class NumberBaseballGameServiceTest {

    @Test
    @DisplayName("randomNumber가 랜덤넘버를 생성하는지 테스트")
    void 랜덤넘버_생성_테스트() {
        // when
        RandomNumber randomNumber = new RandomNumber();

        //then
        Integer number = randomNumber.get();
        System.out.println("number = " + number);
        assertThat(number).isGreaterThan(99).isLessThan(10000);
    }

}
