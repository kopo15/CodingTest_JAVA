class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        
        for(int i=0; i<babbling.length; i++){
            if(babbling[i].contains("aya")||babbling[i].contains("ye")||babbling[i].contains("woo")||
               babbling[i].contains("ma")){
                
                babbling[i]= babbling[i].replace("aya","1");
                babbling[i]= babbling[i].replace("ye","1");
                babbling[i]= babbling[i].replace("woo","1");
                babbling[i]= babbling[i].replace("ma","1");
            }
              int cnt= 0;
            
            for(int j=0; j <babbling[i].length(); j++){
                if(Character.isDigit(babbling[i].charAt(j)) == false) {
                    break;
                }else{
                    cnt++;
                }
            }
            if(cnt == babbling[i].length()){
                answer++;
            }
        }
        
        return answer;
    }
}