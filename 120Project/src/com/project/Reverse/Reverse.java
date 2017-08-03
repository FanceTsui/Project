package com.project.Reverse;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * 字符串逆转
 * @author Fance
 *
 */
public class Reverse {
	//abc  --->  cba
	//1  常规方法
	public void reverse1(String content) {
		String newStr = "";
		char ofStr;
		for (int i = content.length() - 1; i >= 0; i--) {
			ofStr = content.charAt(i);
			newStr += ofStr;
		}
		System.out.println(newStr);

	}

	//2  jdk自带
	private static void reverse2(String content) {
		String newStr = new StringBuffer(content).reverse().toString();
		System.out.println(newStr);

	}

	//3  C语言常用方法  char数组和String相互转化
	private static void reverse5(String content) {
		char[] s = content.toCharArray();
		int n = s.length - 1;
		int halfLength = n / 2;
		for (int i = 0; i <= halfLength; i++) {
			char temp = s[i];
			s[i] = s[n - i];
			s[n - i] = temp;
		}
		System.out.println(new String(s)); //知道  char数组和String相互转化
	}

	//I Love Java ---> Java Love I
	//4   字符串倒序（字符不倒）
	private static void reverse4(String content) {
		String[] sArr = content.split(" ");//I love java  

		List<String> list = new ArrayList<String>();

		/**
		 * 数组转List
		 * -当使用asList()方法时，数组就和列表链接在一起了. 
		 * 	当更新其中之一时，另一个将自动获得更新。 
		 * 	注意:仅仅针对对象数组类型,基本数据类型数组不具备该特性 
		 * -asList得到的数组是的没有add和remove方法的 
		 */
		list = Arrays.asList(sArr);

		//		      for(int i=0;i<sArr.length;i++){  
		//		          list.add(sArr[i]);  
		//		      }  
		//List集合倒序排列     sort正序       
		Collections.reverse(list);
		for (String word : list) {
			System.out.print(word + " ");
		}
	}

	public static void main(String[] args) {
		String str = "I Love Java";
		reverse4(str);
	}
}
