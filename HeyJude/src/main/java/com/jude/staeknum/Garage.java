package com.jude.staeknum;

public class Garage {

	final String START = "Hey Jude,Don't ";
	final String THEN = "Then you";
	final String AND = "And anytime you feel the pain,";
	final String JUDE = "Hey,Jude,";
	final String REF = "refrain";
	final String BEGIN = "begin";
	final String SO = "So let it out snd let it in.";
	final String Nah = "Na";
	final String YOU = "you'll do";
	final String MOVEMENT = "The movement you need is on your shoulder";

	public String verse1(int v1) {
		String[] verse1 = {
				"Make it bad,take a sad song and make it better",
				"Be afraid, you were made to go out and get her",
				"Don't carry the world upon your shoulders",
				"Let me down, you have found her, now go and get her",
				"You're waiting for someone to perform with"
		};
		return verse1[v1];
	}

	public String verse2(int v2) {
		String[] verse2 = {
				"Remember to let her into your heart",
				"The minute you let her under your skin",
				"for well you know that it's a fool who plays it cool",
				//"You have to found her, now go and get her",
				"Remember to let her into your heart",
				"And don't you know that it's just you",
				"Remember to let her under your skin"
		};
		return verse2[v2];
	}

	public String verse3(int v3) {
		String[] verse3 = {
				"Then you can start to make it better",
				"Then you begin to make it better",
				"By making his world a little colder",
				"Then you can start to make it better",
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
