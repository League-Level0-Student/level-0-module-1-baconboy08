package _04_int._1_riddler;
//    Copyright (c) The League of Amazing Programmers 2013-2019
//    Level 0


import javax.swing.JOptionPane;
public class TheRiddler {

	public static void main(String[] args) {

		// 1. Make a variable to hold the score
int score = 0;
		// 3. Ask the user a riddle. Here are some ideas: bit.ly/some-riddles
//4. If they got the answer right, pop up "correct!" and increase the score by one
String riddle1 = JOptionPane.showInputDialog("What occurs once in every minute, twice in every moment, yet never in a thousand years?");
if (riddle1.equals("the letter m")) {
	JOptionPane.showMessageDialog(null, "you got it correct!");
	score += 1;
} else {
	JOptionPane.showMessageDialog(null, "wrong! it was actually the letter M!");
};

System.out.println(score);
String riddle2 = JOptionPane.showInputDialog("What tastes better than it smells?");
if (riddle2.equals("a tongue")) {
	JOptionPane.showMessageDialog(null, "you got it correct!");
	score += 1;
} else {
	JOptionPane.showMessageDialog(null, "wrong! it was actually a tongue!");
};
System.out.println(score);


String riddle3 = JOptionPane.showInputDialog("What has hands but can not clap?");
if (riddle3.equals("a clock")) {
	JOptionPane.showMessageDialog(null, "you got it correct!");
	score += 1;
} else {
	JOptionPane.showMessageDialog(null, "wrong! it was actually a clock!");
};
System.out.println(score);

String riddle4 = JOptionPane.showInputDialog("What has many keys but can't open a single lock?");
if (riddle4.equals("a piano")) {
	JOptionPane.showMessageDialog(null, "you got it correct!");
	score += 1;
} else {
	JOptionPane.showMessageDialog(null, "wrong! it was actually a piano!");
};
System.out.println(score);

String riddle5 = JOptionPane.showInputDialog("You can drop me from the tallest building and I'll be fine, but if you drop me in water I die. What am I?");
if (riddle5.equals("paper")) {
	JOptionPane.showMessageDialog(null, "you got it correct!");
	score += 1;
} else {
	JOptionPane.showMessageDialog(null, "wrong! it was actually paper!");
};
System.out.println(score);

String riddle6 = JOptionPane.showInputDialog("What has a head and a tail, but no body?");
if (riddle6.equals("a coin")) {
	JOptionPane.showMessageDialog(null, "you got it correct!");
	score += 1;
} else {
	JOptionPane.showMessageDialog(null, "wrong! it was actually a coin!");
};

JOptionPane.showMessageDialog(null, "you got (" + score +  "/6) questions right!");
		
		// 5. Otherwise, say "wrong" and tell them the answer

		// 6. Add some more riddles

		// 2. Make a pop up to show the score.
		
	}
}

