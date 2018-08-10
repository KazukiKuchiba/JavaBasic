/*
 * PTra18_04.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */
package practice18;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class PTra18_04 {

	/*
	 * PTra19_02で作成したPlayerクラスを使用します
	 */

	public static void main(String[] args) {

		/*
		 * ①
		 * ★ file/BestElevenCandidate.csvの内容を取得し、１行毎にPlayerインスタンスに情報を格納してください
		 * ★ ArrayListを作成して、Playerインスタンスを格納してください
		 */
		 ArrayList<Player> array = new ArrayList<Player>();
	        try(Scanner scanner = new Scanner(new File("file/BestElevenCandidate.csv"))) {

	            while (scanner.hasNext()) {
	                String line = scanner.nextLine();
	                // ★ 1行ごとにArrayListに格納してください
	                String[] list = line.split(",", 0);
	                Player p = new Player();
	                p.setPosition(list[0]);
	                p.setName(list[1]);
	                p.setCountry(list[2]);
	                p.setTeam(list[3]);

	                array.add(p);

	            }

	        } catch (FileNotFoundException e) {
	            System.out.println("ファイルが見つかりません");
	        }


		// ★ ①のArrayListの中からGK1名、DF4名、MF4名, FW2名をランダムで出力してください
	        ArrayList<Player> gkList = new ArrayList<>();
	        for(int i = 0;i < array.size();i++) {
	        	if(array.get(i).getPosition().equals("GK")) {
	        		Player line = array.get(i);
	        		gkList.add(line);
	        	}
	        }
	        Collections.shuffle(gkList);
	        System.out.println(gkList.get(0));



			ArrayList<Player> dfList  = new ArrayList<>();
		    for(int i = 0;i < array.size();i++) {
		     	if(array.get(i).getPosition().equals("DF")) {
		     		Player line = array.get(i);
		     		dfList.add(line);
		     	}
		    }
		    Collections.shuffle(dfList);
		    for(int i = 0;i < 4; i++) {
		    System.out.println(dfList.get(i));
		    }


		    ArrayList<Player> mfList  = new ArrayList<>();
		    for(int i = 0;i < array.size();i++) {
		     	if(array.get(i).getPosition().equals("MF")) {
		     		Player line = array.get(i);
		     		mfList.add(line);
		     	}
		    }
		    Collections.shuffle(mfList);
		    for(int i = 0;i < 4; i++) {
		    System.out.println(mfList.get(i));
		    }


		    ArrayList<Player> fwList  = new ArrayList<>();
		    for(int i = 0;i < array.size();i++) {
		     	if(array.get(i).getPosition().equals("FW")) {
		     		Player line = array.get(i);
		     		fwList.add(line);
		     	}
		    }
		    Collections.shuffle(fwList);
		    for(int i = 0;i < 2; i++) {
		    System.out.println(fwList.get(i));
		    }



		    }

 }

