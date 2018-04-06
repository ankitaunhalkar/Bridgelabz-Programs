package com.bridgelabz.DesginPattern.BehavioralPattern.VisitorPattern;

public interface ShoppingCartVisitor {
	int visit(Book book);
	int visit(Fruit fruit);
}
