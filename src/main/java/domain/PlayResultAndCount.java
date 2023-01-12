package domain;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

import java.util.Map;

@RequiredArgsConstructor
@Getter
public class PlayResultAndCount {
    private final PlayResult playResult;
    private final Integer count;

}
