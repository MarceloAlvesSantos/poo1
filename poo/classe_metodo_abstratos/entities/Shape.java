package entities;

import entities.enums.Color;

public abstract class Shape {
	private Color color;
	
	public Shape() {
	}
	
	public Shape(Color color) {
		this.color = color;
	}

	public Color getColo() {
		return color;
	}

	public void setColo(Color color) {
		this.color = color;
	}

	public abstract double area();
}
