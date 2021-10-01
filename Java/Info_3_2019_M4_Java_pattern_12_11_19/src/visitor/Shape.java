package visitor;

interface Visitable{
	void accept(Visitor v);
}

abstract class Shape implements Visitable{}

class Rectangle extends Shape{
	@Override
	public void accept(Visitor v) {
		v.visit(this);
	}
	
}

class Square extends Rectangle{
	@Override
	public void accept(Visitor v) {
		v.visit(this);
	}

}

class Circle extends Shape{
	@Override
	public void accept(Visitor v) {
		v.visit(this);
	}
}
