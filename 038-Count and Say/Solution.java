//从第一个序列起逐个求到第n个，求第n（n>2）个时扫描第n-1个,count计数，没扫描一个就把数字和他对应的个数append上去
//Time:O(mn) Space:O(m) (m-第n个序列长度)
public class Solution {
    public String countAndSay(int n) {
        String oldString="1";
        while(--n>0){
        	StringBuilder sb=new StringBuilder();
        	for(int i=0;i<oldString.length();++i){
               int count=1;
               while((i+1)<oldString.length()&&(oldString.charAt(i)==oldString.charAt(i+1))){
               	 ++count;
                 ++i;
               }
               sb.append(String.valueOf(count)+oldString.charAt(i));
        	}
        	oldString=sb.toString();
        }
        return oldString;
    }
    public static void main(String[] args) {
    	Solution s=new Solution();
    	for(int i=1;i<6;++i){
    		System.out.println(s.countAndSay(i));
    	}
    }
}