package pl.sdacademy.tdd;

import com.sun.xml.internal.fastinfoset.util.CharArray;

import java.util.HashSet;
import java.util.Set;

public class Anagramy {
	public static Set<String> converter(String str) {
		char strCharList[]=str.toCharArray();
		Set<String> anagram = new HashSet<>();
		String strLocalValue="";
		for (int i = 0; i < strCharList.length; i++) {
			strLocalValue+= strCharList[i];
			for (int j = 0; j < strCharList.length; j++) {
				if (i!=j){
				strLocalValue+=strCharList[j];
			}}

			anagram.add(strLocalValue);
			strLocalValue="";

			strLocalValue+= strCharList[i];
			for (int j = strCharList.length-1; j >= 0; j--) {
				if (i!=j){
					strLocalValue+=strCharList[j];
				}}
			anagram.add(strLocalValue);
			strLocalValue="";
		}


		return anagram;

	}
}
