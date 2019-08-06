package com.jude.staeknum;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class JudeRandomaizer {
	static int i = 0, v1 = 0, v2 = 0, v3 = 0;

	@RequestMapping("/JudeRandomaizer")
	public void JudeRandom() {
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
	}

}
