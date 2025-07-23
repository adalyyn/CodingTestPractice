package programmers.입문;

// [프로그래머스_입문] 두 수의 곱
// https://school.programmers.co.kr/learn/courses/30/lessons/120804

public class day01_두수의곱 {
    public static void main(String[] args) {
        System.out.println(solution(3,4));
    }   

    public static int solution(int num1, int num2) {
            int answer = 0;
            answer = num1 * num2;
            return answer;

    }
}
