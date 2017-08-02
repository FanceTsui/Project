package com.project.Latin;


/**
 * 拉丁猪文字游戏——这是一个英语语言游戏。基本规则是将一个英语单词的第一个辅音音素的字母移动到词尾并且加上后缀-ay（譬如“banana”会变成“anana-bay”）:除了a、e、i、o、u,其余都是辅音
 * @author Fance
 *
 */
public class Latin {

	public static void main(String[] args) {
		String content = "banana";
		process(content);
	}

	private static void process(String content) {
		String str = "aeiou";
		String newStr = "";
		for (int i = 0; i < content.length(); i++) {
			char con = content.charAt(i);
			int index = str.indexOf(con);
			if (index == -1) {
				newStr = content.substring(0, i) + content.substring(i + 1, content.length()) + "-" + con + "ay";
				break;
			}
		}
		System.out.println(newStr);
	}
	
	
	/**
	 * 这个问题用正则解决应该是最简单的方法，但是很可惜下列两个方法经测试都有一点小问题
	 * 然而本人才疏学浅并无法解决问题    如有人解决希望能告知我一声
	 */
	//正则1
	//	public static void main(String[] args) {
	//        String s = "apri";
	//        System.out.println(s.replaceFirst("(.)(?!=[aeiou])(.*)", "拉丁猪文字:$2-$1ay"));
	//    }
	
	//正则2
	//	private static void process(String content) {
	//		String regex = "^(?=[\\w&&[^\\d]]+$)(?i)(?<head>[aeiou]*)(?<firstVowel>[^aeiou])(?<tail>.*$)";
	//		Pattern pattern = Pattern.compile(regex);
	//		Matcher matcher = pattern.matcher(content);
	//		if (matcher.matches()) {
	//			content = matcher.group("head") + matcher.group("tail") + "-" + matcher.group("firstVowel") + "ay";
	//		}
	//		System.out.println(content);
	//	}

}
