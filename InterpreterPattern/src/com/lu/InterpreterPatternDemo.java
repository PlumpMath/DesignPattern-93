package com.lu;

public class InterpreterPatternDemo {
	public static void main(String[] args) {
		Expression male = getMaleExpression();
		Expression marriedWoman = getMarriedWomenExpression();
		System.out.println("Jhon is male " + male.interpret("Jhon"));
		System.out.println("Juine is marriedwoman " + marriedWoman.interpret(" Married Juine"));
	}

	private static Expression getMaleExpression() {
		Expression Jhon = new TerminalExpression("Jhon");
		Expression Reboot = new TerminalExpression("ReBoot");

		Expression male = new OrExpression(Jhon, Reboot);
		return male;
	}

	private static Expression getMarriedWomenExpression() {
		Expression Juine = new TerminalExpression("Juine");
		Expression Married = new TerminalExpression("Married");

		Expression marriedWoman = new AndExpression(Juine, Married);
		return marriedWoman;
	}

}
