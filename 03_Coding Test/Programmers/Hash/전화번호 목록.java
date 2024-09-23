import java.util.Arrays;

/**
 * [Reference]
 * - https://school.programmers.co.kr/learn/courses/30/lessons/42577
 */

public class Solution {

    public static boolean solution(String[] phone_book) {
        // 정렬 (시간 복잡도 : NLogN)
        Arrays.sort(phone_book);

        for (int i = 0; i < phone_book.length - 1; i++) {

            // 다음 인덱스의 문자열과 비교 (문자열 정렬은 문자열 길이가 아니라 문자에 따라 정렬되므로)
            if (phone_book[i+1].startsWith(phone_book[i])) {
                return false;
            }
        }
        return true;
    }
}