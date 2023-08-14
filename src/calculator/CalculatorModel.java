package calculator;

import java.awt.Component;
import java.awt.Container;
import java.util.HashSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * This class represents the model in the MVC architecture for a calculator application.
 * It handles all the functional operations and calculations.
 * 
 * @author Shamith Nakka
 * @version 1.0.0
 * @since 13 Aug 2023
 *
 */
public class CalculatorModel {
	
	/**
	 * Constructs a new CalculatorModel instance.
	 * This constructor initializes any required data or resources.
	 */
	public CalculatorModel() {}
	
	/**
	 * This function returns all the children of given container.
	 * 
	 * @param container[java.awt.Container] : Container object.
	 * 
	 * @return children[HashSet] : list of component children
	 */
	public static HashSet<Component> getAllChildren(Container container) {
		
		// Initialization
		HashSet<Component> children = new HashSet<>();
		
		// Retrieving Components
		for(Component child : container.getComponents()) {
			children.add(child);
		}
		
		return children;
	}
	
	/**
	 * This method will check whether the given target string matches the
	 * given regular expression.
	 * 
	 * @param regex : Regular Expression
	 * @param targetString : String need to checked
	 * 
	 * @return [boolean]:
	 */
	public static boolean matchesRegex(String regex, String targetString) {
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(targetString);
		return matcher.find();
	}
	
	/**
	 * This method takes an StringBuilder object and replace it's String value
	 * with given string value.
	 * 
	 * @param stringBuilder : Given StringBuidler object
	 * @param stringValue : String value needed to be replaced
	 * 
	 * @return void
	 */
	public static void replaceStringBuilderValue(StringBuilder stringBuilder, String stringValue) {
		stringBuilder.replace(0, stringBuilder.length(), stringValue);
	}
	
	/**
	 * This method will handle all the special operation of the calculator.
	 * 
	 * @param operationName : Defines the type of operation
	 * @param argumentString : User Input data.
	 * 
	 * @return void
	 */
	public void handleOperation(String operationName, StringBuilder argumentString) {
		// Need to create a logic here
	}
}