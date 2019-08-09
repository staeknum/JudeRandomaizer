package com.gradleJude.staeknum;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;



@Controller
public class Jude {
	static int i = 0, v1 = 0, v2 = 0, v3 = 0;

	@RequestMapping("/Randomaizer")
	public String Randomaizer() {

		Garage g = new Garage();
		StringBuilder sb = new StringBuilder();
		try {
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
		}catch(ArrayIndexOutOfBoundsException e) {
		}

		return sb.toString();
	}
}
