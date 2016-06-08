package com.laozhang.designpattern.composite;

public class Leaf extends Component {

	public Leaf(String name) {
		super(name);
	}

	@Override
	public void add(Component component) {
		System.out.println("Can not add");
	}

	@Override
	public void remove(Component component) {
		System.out.println("Can not remove");
	}

	@Override
	public void display(int depth) {
		for (int i=0; i<depth; i++) {
			System.out.print("-");
		}
		System.out.print(name);
		System.out.println("");
	}

}
