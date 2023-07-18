class Solution {
    public int solution(int[] numbers, int k) {
   
        int answer = 0;
        int index =0;
        index = (((k-1)*2)%numbers.length);
    
        answer = numbers[index];
            
        return answer;
    }
}

/*
반장님 정답 
class Solution {
    public int solution(int[] numbers, int k) {
        return numbers[((k - 1) * 2) % numbers.length]; 
    }
}
 k -1 -> index를 구하기 위해 -1해줌(인덱스는 0부터 시작)
*/
