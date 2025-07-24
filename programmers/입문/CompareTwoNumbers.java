package programmers.입문;

// [프로그래머스_입문] 숫자 비교하기
// https://school.programmers.co.kr/learn/courses/30/lessons/120807

public class CompareTwoNumbers {
    
    public int solution(int num1, int num2) {
        int answer = 0;
        
        if(num1 == num2){ //===는 JavaScript에서만 쓰는 연산자
            answer = 1;
        }else{
            answer = -1;
        }
        return answer;
    }

}
