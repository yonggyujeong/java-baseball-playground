package in;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class InputAdapter {
    // 입력 어댑터의 역할
    // - 입력값 검증
    // - 유스케이스의 입력값으로 타입 변경
    // - 유스케이스의 결과를 받아서 반환

    public void validateThreeNumber(String str) {
        validateIsThreeChar(str);
        validateIsNumber(str);
    }

    private void validateIsThreeChar(String str) {
        if (str.length() == 3) {
            return;
        }
        throw new IllegalArgumentException("세자리 숫자만 입력 가능합니다");
    }

    private void validateIsNumber(String str) {
        if (str.chars().allMatch(Character::isDigit)) { // 문자가 숫자인지 판별하는 법
            return;
        }
        throw new IllegalArgumentException("숫자만 입력해 주세요");
    }
    // [참고]숫자 판별법
// https://blog.naver.com/PostView.naver?blogId=hoon4672&logNo=222204799623&parentCategoryNo=4&categoryNo=&viewDate=&isShowPopularPosts=true&from=search



}

