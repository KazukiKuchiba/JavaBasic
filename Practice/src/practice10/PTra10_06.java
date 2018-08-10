package practice10;
/*
 * PTra10_06.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */

public class PTra10_06 {

	/*
	 * PTra10_05で作成したCarクラスを使用します
	 */

	private static final String n = null;

	public static void main(String[] args) {

		/*
		 * carインスタンスを3件作成し、それぞれの色、ガソリンを入力して決定してください
		 * 各carインスタンスのrunメソッドを実行して、それぞれ「目的地にまでn時間かかりました。残りのガソリンは、xリットルです」を出力してください。
		 */
		 Car c1 = new Car();
		 c1.color = "Blue";
		 c1.gasoline = 60;

		 Car c2 = new Car();
		 c2.color = "Brown";
		 c2.gasoline = 40;

		 Car c3 = new Car();
		 c3.color = "Black";
		 c3.gasoline = 80;

		 int n = 0;
		 n++;

		 int run1 = c1.run();
		 	System.out.println("目的地にまで"+n+"時間かかりました。残りのガソリンは、"+c1.gasoline+"リットルです");

		 int run2 = c2.run();
		 	System.out.println("目的地にまで"+n+"時間かかりました。残りのガソリンは、"+c2.gasoline+"リットルです");

		 int run3 = c3.run();
		 	System.out.println("目的地にまで"+n+"時間かかりました。残りのガソリンは、"+c3.gasoline+"リットルです");






	}
}
