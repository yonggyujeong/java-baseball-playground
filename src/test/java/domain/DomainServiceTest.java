package domain;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class DomainServiceTest {
    DomainService domainService = new DomainService();

    @Test
    void play_NOTHING_test() {
        Integer com = 123;
        Integer user = 456;
        String playResult = domainService.play(123, 456);

        assertThat(playResult).isEqualTo("NOTHING");
    }
}
