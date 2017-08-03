package com.project.CheckRoundStr;

/**
 * 检查字符串是否为回文
 * 所谓回文字符串，就是一个字符串，从左到右读和从右到左读是完全一样的。比如"level" 、 “aaabbaaa”
 * @author Fance
 * 此题类似于字符串逆转
 */
public class CheckRoundStr {
	
	public static void main(String[] args) {
		String Str ="level";
		check1(Str);
		String Str1="aasaa";
		check1(Str1);
	}
	
	private static void check(String content){
		boolean flag =true;
		String newCon = content.toLowerCase();
		int index = content.length()-1;
		for(int i=0;i<newCon.length();i++){
			if(newCon.charAt(i) == newCon.charAt(index-i)){
				continue;
			}else{
				flag =false;
				break;
			}
		}
		if(flag){
			System.out.println("字符串"+content+"是回文！");
		}else{
			System.out.println("字符串"+content+"不是回文！");
		}
	}
	
	
	private static void check1(String content){
		String newStr = new StringBuffer(content).reverse().toString();
		if(content.equals(newStr)){
			System.out.println("字符串"+content+"是回文！");
		}else{
			System.out.println("字符串"+content+"不是回文！");
		}
	}

}
