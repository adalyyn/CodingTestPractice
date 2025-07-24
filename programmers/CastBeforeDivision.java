package programmers;

// [프로그래머스_입문] 두 수의 나눗셈
// https://school.programmers.co.kr/learn/courses/30/lessons/120806

public class CastBeforeDivision {
    
    public int solution(int num1, int num2) {
        
        //형변환은 계산전에 해야함
        //double result = (double)(a / b); -> 이미 계산 끝남
        //자바가 연산을 '왼쪽에서 오른쪽'으로 해석하고, 데이터 타입에 따라 먼저 연산이 진행되기 때문
        double result = (double)num1 / num2;

        return (int)(result * 1000);
    }
}
