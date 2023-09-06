package com.geekforgeek.medium;

public class FirstNonRepeating {

	public static void main(String[] args) {
		String str = "zz";
		char a[] = str.toCharArray();	
		StringBuilder sb = new StringBuilder();
		int cnt[] = new int[26];
		for(int i=0;i<a.length;i++) {
			cnt[a[i]-'a']++;
			int q=-1;
			for(int j=0;j<26;j++) {
				if(cnt[j]==1) {
					q=j;
				}
			}
			if(q==-1) {
				sb.append('#');
			}else {
				sb.append((char)('a'+q));
			}
		}
		System.out.println(sb);
	}

}
