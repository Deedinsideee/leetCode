package ru.alexandr.leetcode.medium;

import java.util.HashSet;
import java.util.Set;

/*Дана строка s. Найдите длину самой длинной подстроки без повторяющихся символов.

Примеры:
Пример 1:

Вход: s = "abcabcbb"
Выход: 3
Объяснение: Ответ — подстрока "abc", длина которой равна 3.

Пример 2:

Вход: s = "bbbbb"
Выход: 1
Объяснение: Ответ — подстрока "b", длина которой равна 1.

Пример 3:

Вход: s = "pwwkew"
Выход: 3
Объяснение: Ответ — подстрока "wke", длина которой равна 3.
Обратите внимание, что ответ должен быть подстрокой, а не подпоследовательностью — например, "pwke" — это подпоследовательность, а не подстрока.

Ограничения:
0 <= s.length <= 5 * 10^4

s состоит из английских букв, цифр, символов и пробелов.*/
public class LongestSubstringWithoutRepeatingCharacters {
    public static int lengthOfLongestSubstring(String s) {
        Set<Character> window = new HashSet<>();
        int left = 0;
        int maxLength = 0;

        for (int right = 0; right < s.length(); right++) {
            char c = s.charAt(right);

            while (window.contains(c)) {
                window.remove(s.charAt(left));
                left++;
            }

            window.add(c);
            maxLength = Math.max(maxLength, right - left + 1);
        }

        return maxLength;
    }
}
