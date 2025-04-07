

public class MaxCount {

	public static void main(String[] args) {
		String s="Banana";
		int maxcount=1;
		char[]ch=s.toCharArray();
		for(int i=0;i<s.length();i++) {
			int count =1;
			if(ch[i]=='\u0000') continue;
			for(int j=i+1;j<s.length();j++) {
				if(ch[i]==ch[j]) {
					count++;
					ch[j]='\u0000';
				}
				}
			if(maxcount<count) {
				maxcount=count;
			}
			}
			for (int i = 0; i < s.length(); i++) {
	            int count = 1;
	            if (ch[i] == '\u0000') continue;

	            for (int j = i + 1; j < s.length(); j++) {
	                if (s.charAt(i) == s.charAt(j)) {
	                    count++;
	                }
	            }

	            if (count == maxcount) {
	                System.out.println(s.charAt(i) + "=" + maxcount);
	            }
	        }


	}

}
