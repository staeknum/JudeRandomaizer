package com.jude.staeknum;

public class TestExe {

	static int i = 0, v1 = 0, v2 = 0, v3 = 0;

	public static void test(String[] args) {
		Garage g = new Garage();

		for (int j = 0; j < 2; j++) {
			System.out.print(g.START);
			System.out.println(g.verse1(v1));
			System.out.println(g.verse2(v2));
			System.out.println(g.verse3(v3));
			System.out.println();
			i++;
			v1++;
			v2++;
			v3++;
		}

		System.out.println(g.AND + "\n");
		System.out.println(g.JUDE + g.REF);
		System.out.println(g.verse1(v1));
		System.out.println(g.verse2(v2));
		System.out.println(g.verse3(v3));
		System.out.println();

		for (int j = 0; j < 10; j++) {
			System.out.print(g.Nah + " ");
		}
		System.out.println();
		try {
			for (int j = 0; j < 2; j++) {
				i++;
				v1++;
				v2++;
				v3++;
				System.out.print(g.START);
				System.out.println(g.verse1(v1));
				System.out.println(g.verse2(v2));
				System.out.println(g.verse3(v3));
				System.out.println();
				System.out.println(g.SO);
				System.out.println();
				System.out.println(g.JUDE + g.BEGIN);
			}
		} catch (ArrayIndexOutOfBoundsException e) {
			//何もしないで握りつぶす
		}

		System.out.println(g.YOU + " \n" + g.MOVEMENT);

		for (int j = 0; j < 10; j++) {
			System.out.print(g.Nah + " ");
		}
		System.out.println();
		System.out.print(g.START);
		System.out.println(g.verse1(v1 - v1));
		System.out.println(g.verse2(v2 - v2));
		System.out.println(g.verse3(v3 - v3));
		System.out.println();
		System.out.println(g.outro());
	}

}
