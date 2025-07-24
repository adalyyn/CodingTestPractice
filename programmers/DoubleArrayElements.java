package programmers;

// [프로그래머스_입문] 배열 두 배 만들기
// https://school.programmers.co.kr/learn/courses/30/lessons/120809

public class DoubleArrayElements {

    public int[] solution(int[] numbers) {
        
        //미리 공간확보 안해주면 answer[i] 에서 에러남
        //java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0      
        int[] answer = new int[numbers.length]; 
        
            for(int i = 0; i < numbers.length ; i++){
                answer[i] = numbers[i] * 2;
            }
        
        return answer;
    }
    
}
