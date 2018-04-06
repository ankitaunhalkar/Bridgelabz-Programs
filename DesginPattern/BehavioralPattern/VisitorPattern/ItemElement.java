package com.bridgelabz.DesginPattern.BehavioralPattern.VisitorPattern;

public interface ItemElement {
	public int accept(ShoppingCartVisitor visitor);
}
