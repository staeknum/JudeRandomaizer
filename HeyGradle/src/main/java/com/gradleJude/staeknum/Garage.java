package com.gradleJude.staeknum;

public class Garage {

	final String START = "Hey Jude,Don't ";
	final String THEN = "Then you\n";
	final String AND = "And anytime you feel the pain,\n";
	final String JUDE = "Hey,Jude,\n";
	final String REF = "refrain\n";
	final String BEGIN = "begin\n";
	final String SO = "So let it out snd let it in.\n";
	final String Nah = "Na ";
	final String YOU = "you'll do\n";
	final String MOVEMENT = "The movement you need is on your shoulder\n";

	public String verse1(int v1) {
		String[] verse1 = {
				"Make it bad,take a sad song and make it better\n",
				"Be afraid, you were made to go out and get her\n",
				"Don't carry the world upon your shoulders\n",
				"Let me down, you have found her, now go and get her\n",
				"You're waiting for someone to perform with"
		};
		return verse1[v1];
	}

	public String verse2(int v2) {
		String[] verse2 = {
				"Remember to let her into your heart\n",
				"The minute you let her under your skin\n",
				"for well you know that it's a fool who plays it cool\n",
				//"You have to found her, now go and get her\n",
				"Remember to let her into your heart\n",
				"And don't you know that it's just you\n",
				"Remember to let her under your skin"
		};
		return verse2[v2];
	}

	public String verse3(int v3) {
		String[] verse3 = {
				"Then you can start to make it better\n",
				"Then you begin to make it better\n",
				"By making his world a little colder\n",
				"Then you can start to make it better\n",
		};
		return verse3[v3];
	}

	public String outro() {
		String outro = "Nah, nah nah, nah nah, nah, nah, nah nah,\r\n" +
				"Hey, Jude\r\n" +
				"Nah, nah nah, nah nah, nah, nah, nah nah,\r\n" +
				"Hey, Jude\r\n" +
				"Nah, nah nah, nah nah, nah, nah, nah nah,\r\n" +
				"Hey, Jude (Jude)\r\n" +
				"Nah, nah nah, nah nah, nah, nah, nah nah,\r\n" +
				"Hey, Jude (yeah, yeah, yeah)\r\n" +
				"Nah, nah nah, nah nah, nah, nah, nah nah,\r\n" +
				"Hey, Jude\r\n" +
				"Nah, nah nah, nah nah, nah, nah, nah nah,\r\n" +
				"Hey, Jude (don't make it bad, Jude)\r\n" +
				"Nah, nah nah, nah nah, nah, nah, nah nah,\r\n" +
				"Hey, Jude (take a sad song and make it better)\r\n" +
				"Nah, nah nah, nah nah, nah, nah, nah nah,\r\n" +
				"Hey, Jude (oh, Jude)\r\n" +
				"Nah, nah nah, nah nah, nah, nah, nah nah,\r\n" +
				"Hey, Jude (Jude, hey, Jude, whoa)\r\n" +
				"Nah, nah nah, nah nah, nah, nah, nah nah,\r\n" +
				"Hey, Jude\r\n" +
				"Nah, nah nah, nah nah, nah, nah, nah nah,\r\n" +
				"Hey, Jude (ooh)\r\n" +
				"Nah, nah nah, nah nah, nah, nah, nah nah,\r\n" +
				"Hey, Jude\r\n" +
				"Nah, nah nah, nah nah, nah, nah, nah nah,\r\n" +
				"Hey, Jude\r\n" +
				"Nah, nah nah, nah nah, nah, nah, nah nah,\r\n" +
				"Hey, Jude\r\n" +
				"Nah, nah nah, nah nah, nah, nah, nah nah,\r\n" +
				"Hey, Jude\r\n" +
				"Nah, nah nah, nah nah, nah, nah, nah nah,\r\n" +
				"Hey, Jude \r\n";
		return outro;

	}
}
