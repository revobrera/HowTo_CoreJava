package com.revobrera.AbstractPattern;

public class AbstractFactoryPatternDemo {
	
/*	Abstract Factory patterns work around a super-factory 
	which creates other factories. This factory is also 
	called as factory of factories. This type of design 
	pattern comes under creational pattern as this pattern 
	provides one of the best ways to create an object.

	In Abstract Factory pattern an interface is responsible 
	for creating a factory of related objects without explicitly 
	specifying their classes. Each generated factory can give the 
	objects as per the Factory pattern.

	Implementation
	We are going to create a Shape and Color interfaces and 
	concrete classes implementing these interfaces. 
	We create an abstract factory class AbstractFactory as next step. 
	Factory classes ShapeFactory and ColorFactory are defined 
	where each factory extends AbstractFactory. A factory 
	creator/generator class FactoryProducer is created.

	AbstractFactoryPatternDemo, our demo class uses FactoryProducer 
	to get a AbstractFactory object. It will pass information 
	(CIRCLE / RECTANGLE / SQUARE for Shape) to AbstractFactory to 
	get the type of object it needs. It also passes information 
	(RED / GREEN / BLUE for Color) to AbstractFactory to get the 
	type of object it needs.
	*/
	public static void main(String[] args) {
		//Get shape factory
		AbstractFactory shapeFactory = FactoryProducer.getFactory("SHAPE");
		
		//Get an object of Shape Circle and call draw method of Shape Circle
		Shape shape1 = shapeFactory.getShape("CIRCLE");
		shape1.draw();
		
		//Get an object of Shape Rectangle and call draw method of Shape Rectangle
		Shape shape2 = shapeFactory.getShape("RECTANGLE");
		shape2.draw();
		
		//Get an object of Shape Square and call draw method of Shape Square
		Shape shape3 = shapeFactory.getShape("SQUARE");
		shape3.draw();
		
		//Get color factory
		AbstractFactory colorFactory = FactoryProducer.getFactory("COLOR");
		
		//Get an object of Color Red and call draw method of Color Red
		Color color1 = colorFactory.getColor("RED");
		color1.fill();
		
		//Get an object of Color Green and call draw method of Color Green
		Color color2 = colorFactory.getColor("GREEN");
		color2.fill();
		
		//Get an object of Color Blue and call draw method of Color Blue
		Color color3 = colorFactory.getColor("BLUE");
		color3.fill();
	}
}
