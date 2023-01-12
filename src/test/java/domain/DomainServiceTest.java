package domain;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class DomainServiceTest {
    DomainService domainService = new DomainService();

    @Test
    void play_NOTHING_test() {
        String[] com = {"1", "2", "3"};
        String[] user = {"4", "5", "6"};
        String result = domainService.play(com, user);

        assertThat(result).isEqualTo("nothing");
    }

    @Test
    void play_1Strike_test() {
        String[] com = {"1", "2", "3"};
        String[] user = {"1", "5", "6"};
        String result = domainService.play(com, user);

        assertThat(result).isEqualTo("1스트라이크 ");
    }

    @Test
    void play_1Strike_1Ball_test() {
        String[] com = {"1", "2", "3"};
        String[] user = {"1", "5", "2"};
        String result = domainService.play(com, user);

        assertThat(result).isEqualTo("1스트라이크 1볼");
    }

    @Test
    void play_1Strike_2Ball_test() {
        String[] com = {"1", "2", "3"};
        String[] user = {"1", "3", "2"};
        String result = domainService.play(com, user);

        assertThat(result).isEqualTo("1스트라이크 2볼");
    }

    @Test
    void play_3Strike_test() {
        String[] com = {"1", "2", "3"};
        String[] user = {"1", "2", "3"};
        String result = domainService.play(com, user);

        assertThat(result).isEqualTo("3스트라이크 ");
    }
}
