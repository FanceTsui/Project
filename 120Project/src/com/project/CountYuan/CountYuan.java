package com.project.CountYuan;

/**
 * 统计元音字母——输入一个字符串，统计处其中元音字母的数量。更复杂点的话统计出每个元音字母的数量。
 * @author Fances
 */
public class CountYuan {

	public static void main(String[] args) {
		String content = "bAnana";
		count1(content);
	}

	//如果不需要具体区分每个元音字母出现的次数
	private static void count(String content) {
		String str = "aeiou";
		int count = 0;
		for (int i = 0; i < content.length(); i++) {
			//此处不受大小写影响
			char con = content.charAt(i);
			int index = str.indexOf(con);
			if (index == 0) {
				count++;
			}
		}
		System.out.println("字符串中共有元音字母：" + count + "个");
	}

	//区分每个元音字母出现的次数
	private static void count1(String content) {
		int a = 0;
		int e = 0;
		int i = 0;
		int o = 0;
		int u = 0;
		for (int m = 0; m < content.length(); m++) {
			//此处会受到大小写的影响
			char con = content.toLowerCase().charAt(m);
			switch (con) {
			case 'a':
				a++;
				break;
			case 'e':
				e++;
				break;
			case 'i':
				i++;
				break;
			case 'o':
				o++;
				break;
			case 'u':
				u++;
				break;
			default:
				break;

			}

		}
		System.out.println("a:" + a + "  o:" + o + "  i:" + i + "  e:" + e + "  u:" + u);
	}

}
