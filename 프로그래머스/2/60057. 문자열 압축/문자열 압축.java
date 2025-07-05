class Solution {
    public static void main(String[] args) {
        String s = "aabbaccc";
        System.out.println(solution(s));
    }

    public static int solution(String s) {
        int answer = s.length(); // 초기값은 문자열 길이

        for (int i = 1; i <= s.length() / 2; i++) { // 1부터 문자열 길이의 절반까지
            StringBuilder compressed = new StringBuilder();
            String prev = s.substring(0, i); // 이전 문자열
            int count = 1; // 압축된 문자열의 개수

            for (int j = i; j < s.length(); j += i) {
                int end = Math.min(j + i, s.length());
                String current = s.substring(j, end); // 현재 문자열

                if (prev.equals(current)) {
                    count++; // 같은 문자열이면 카운트 증가
                } else {
                    compressed.append(count > 1 ? count : "").append(prev); // 압축된 문자열 추가
                    prev = current; // 이전 문자열 갱신
                    count = 1; // 카운트 초기화
                }
            }
            compressed.append(count > 1 ? count : "").append(prev); // 마지막 문자열 추가

            answer = Math.min(answer, compressed.length()); // 최소 길이 업데이트
        }

        return answer;
    }
}