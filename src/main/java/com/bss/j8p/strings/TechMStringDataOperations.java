package com.bss.j8p.strings;

public class TechMStringDataOperations {

	public static void main(String[] args) {
		String str1 = "aa"; // starting string
		String opsStr = "wabsbdwasbajsud"; // data with operations w/d/u
		// w - write
		// d = delete n chars from last
		// u - undo last operation, like w or d
		int n = 1; // n - number of chars to delete
		String output = "aaab";
		System.out.println("----------result-----" + operations(str1, opsStr, n));
		if (operations(str1, opsStr, n).equalsIgnoreCase(output)) {
			System.out.println("SUCCESS");
		} else {
			System.out.println("FAILURE");
		}

		String basicStr = "bbhfg";
		String opsStr1 = "wbsydwtreaxcbuwsasxasd";
		int n1 = 3;
		String output1 = "bbhfgsas";
		System.out.println("----------result1-----" + operations(basicStr, opsStr1, n1));
		if (operations(basicStr, opsStr1, n1).equalsIgnoreCase(output1)) {
			System.out.println("SUCCESS1");
		} else {
			System.out.println("FAILURE1");
		}
	}

	public static String operations(String firstStr, String opsStr, int n) {
		boolean wFlag = false;
		boolean uFlag = false;
		boolean dFlag = false;

		int w1Index = 0;
		int w2Index = 0;

		char[] opsArr = opsStr.toCharArray();

		StringBuilder sb = new StringBuilder();

		StringBuilder temp = new StringBuilder();

		for (int i = 0; i < opsArr.length; i++) {
			if (opsArr[i] == 'w') {
				wFlag = true;
				uFlag = false;
				dFlag = false;
				w1Index = sb.length();
				continue;
			}
			if (opsArr[i] == 'd') {
				wFlag = false;
				uFlag = false;
				dFlag = true;
				String str = sb.toString();
				str = str.substring(0, str.length() - n);
				sb = new StringBuilder(str);
				continue;
			}
			if (opsArr[i] == 'u') {
				temp = sb;
				uFlag = true;
				wFlag = false;
				dFlag = false;
				String str = sb.toString();
				str = str.substring(0, w1Index);
				sb = new StringBuilder(str);
				continue;
			}
			if (wFlag && !uFlag && !dFlag) {
				sb.append(opsArr[i]);
				w2Index = i;
			}
		}
		return (firstStr + sb.toString());
	}

}
