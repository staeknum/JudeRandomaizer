package com.gradleJude.staeknum;

public class ConsoleJade {
	/**
	 * OOP化クラス
	 */

	static int i = 0, v1 = 0, v2 = 0, v3 = 0;
	//値をメソッド間で保持していく必要があるためstatic
	StringBuilder sb = new StringBuilder();
	Garage g = new Garage();

	public static void main(String[] args) {
		ConsoleJade j = new ConsoleJade();
		System.out.println(j.First());
		System.out.println(j.Second());
		System.out.println(j.Third());
		System.out.println(j.Forth());

	}

	public StringBuilder First() {
		for (int j = 0; j < 2; j++) {
			sb.append(g.START);
			sb.append(g.verse1(v1));
			sb.append(g.verse2(v2));
			sb.append(g.verse3(v3));
			sb.append("\n");
			i++;
			v1++;
			v2++;
			v3++;
		}
		return sb;
	}

	public StringBuilder Second() {
		sb.append(g.AND + "\n");
		sb.append(g.JUDE + g.REF);
		sb.append(g.verse1(v1));
		sb.append(g.verse2(v2));
		sb.append(g.verse3(v3));
		sb.append("\n");
		for (int j = 0; j < 10; j++) {
			System.out.print(g.Nah + " ");
		}
		sb.append("\n");
		return sb;
	}

	public StringBuilder Third() {
		sb.append("\n");
		try {
			for (int j = 0; j < 2; j++) {
				i++;
				v1++;
				v2++;
				v3++;
				System.out.print(g.START);
				sb.append(g.verse1(v1));
				sb.append(g.verse2(v2));
				sb.append(g.verse3(v3));
				sb.append("\n");
				sb.append(g.SO);
				sb.append("\n");
				sb.append(g.JUDE + g.BEGIN);
			}
		} catch (ArrayIndexOutOfBoundsException e) {
			//何もしないで握りつぶす
		}
		return sb;
	}

	public StringBuilder Forth() {
		Garage g = new Garage();
		sb.append(g.YOU + " \n" + g.MOVEMENT);
		for (int j = 0; j < 10; j++) {
			System.out.print(g.Nah + " ");
		}
		sb.append("\n");
		System.out.print(g.START);
		sb.append(g.verse1(v1 - v1));
		sb.append(g.verse2(v2 - v2));
		sb.append(g.verse3(v3 - v3));
		sb.append("\n");
		sb.append(g.outro());
		return sb;
	}
}
