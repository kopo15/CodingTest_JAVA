class Solution {
    public int solution(String[] babbling) {
       	int answer = 0;

		String[] string = {"aya", "ye", "woo", "ma"};
		//"aya", "ye", "woo", "ma"
		//"ayaaya""yeye""woowoo" "mama"-> 배열 또 만들어주기 

		for(int i=0; i< babbling.length; i++) {
			for(int j=0; j<string.length; j++) {

				if(babbling[i].contains(string[j]) && !(babbling[i].contains(string[j]+string[j]))) {

					//babbling[i]=babbling[i].replace("aya","1");
					//babbling[i]=babbling[i].replace("ye","1");
					//babbling[i]=babbling[i].replace("woo","1");
					//babbling[i]=babbling[i].replace("ma","1");		 										
					//babbling[i]=babbling[i].replace("1","");
                    babbling[i]=babbling[i].replace(string[j],"1");
	                babbling[i]=babbling[i].replace("1"," ").trim();
				}	
			}
			if(babbling[i].isEmpty()) {
				answer ++;
			}
		}
		return answer;
	}
        
}   
        