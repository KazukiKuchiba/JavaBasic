package practice07;
/*
 * PTra07_01.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */

public class PTra07_01 {
	public static void main(String[] args) {

		// ★ int型の配列arrayを宣言してください
		int[] score;

		// ★ 変数arrayの配列を5個の領域で確保してください
		score = new int[5];

		// ★ 変数arrayにそれぞれ、[1,4,7,10,13] を代入してください
		score[0] = 1;
		score[1] = 4;
		score[2] = 7;
		score[3] = 10;
		score[4] = 13;

		// ★ 変数arrayに格納されている値を前から順番に全て表示してください
		System.out.println(score[0]);
		System.out.println(score[1]);
		System.out.println(score[2]);
		System.out.println(score[3]);
		System.out.println(score[4]);


	}
}
