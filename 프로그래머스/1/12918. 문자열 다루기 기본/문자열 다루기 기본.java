class Solution {
    public boolean solution(String s) {
        // 문자열 길이가 4 또는 6인지 확인
        if (s.length() != 4 && s.length() != 6) {
            return false;
        }
        
        // 문자열이 숫자로만 이루어져 있는지 확인
        for (char c : s.toCharArray()) {
            if (!Character.isDigit(c)) {
                return false;
            }
        }
        
        // 모든 조건을 만족하면 true 반환
        return true;
    }
}