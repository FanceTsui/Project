package com.project.CountEnglishNum;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * 统计字符串中的单词数目
 * 查询指定字符串出现次数可以直接使用：StringUtils.countMatches(str, sub)
 * @author Fance
 *
 */
public class CountEnglishNum {
	
	public static void main(String[] args) {
	String str ="String 谢谢  Thank you,thanks!really?";		
	findEnglishNum(str);	
	}
	
	 private static void findEnglishNum(String content){  
         //找出所有的单词  
         String[] array = {".", " ", "?", "!"};  
         for (int i = 0; i < array.length; i++) {  
        	 content = content.replace(array[i],",");  
         }  
         String[] textArray = content.split(",");  
           
         //遍历 记录  
         Map<String, Integer> map = new HashMap<String, Integer>();  
         for (int i = 0; i < textArray.length; i++) {  
             String key = textArray[i];  
             //转为小写  
             String key_l = key.toLowerCase();  
             //不知道是个人技术问题还是真的不行   key_l.startsWith("^[a-z]*")是不能使用的
             //百度结果是startWith无法匹配正则表达式
             //如果有此处说法有误请指正，谢谢
            // if( key_l.startsWith("^[a-z]*")){
             if(key_l.substring(0).matches("^[a-z]*")){
             if(!"".equals(key_l)){  
                 Integer num = map.get(key_l);  
                 if(num == null || num == 0){  
                     map.put(key_l, 1);  
                 }else if(num > 0){  
                     map.put(key_l, num+1);  
                 }  
             }  
             }else{
            	 continue;
             }
            
         }  
         //输出到控制台  
         System.out.println("各个单词出现的频率为：");  
         Iterator<String> iter = map.keySet().iterator();  
         while(iter.hasNext()){  
             String key = iter.next();  
             Integer num = map.get(key);  
             System.out.println(key + "\n\t\t" + num + "次\n-------------------");  
         }  
     }

}
