package com.laozhang.designpattern.interpreter;

public class Client {
	public static void main(String[] args) {
		Context context = new Context();
		Variable x = new Variable("x");
		Variable y = new Variable("y");
		Constant c = new Constant(true);
		context.assign(x, false);
		context.assign(y, true);
		
		Expression exp = new Or(new And(c,x), new And(y, new Not(x)));
		System.out.println("x=" + x.interpret(context));
		System.out.println("y=" + y.interpret(context));
		System.out.println(exp.toString() + "=" + exp.interpret(context));
	}
}
