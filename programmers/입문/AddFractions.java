package programmers.입문;

// [프로그래머스_입문] 분수의 덧셈
// https://school.programmers.co.kr/learn/courses/30/lessons/120808


public class AddFractions {
    
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {

        int 분모 = denom1 * denom2;
        int 분자 = (numer1*denom2) + (numer2*denom1);
                
        int 최대공약수 = gcd(분자,분모);

        분모 /= 최대공약수 ;
        분자 /= 최대공약수 ;
        
        int[] answer = {분자,분모};
        
        return answer;
    }
    

    //최대공약수 구하기 (자바에서는 메서드 안에 메서드 못만든다.)
    public int gcd(int a, int b) {
        if (b == 0) return a;
        return gcd(b, a % b);
    }
    
}
