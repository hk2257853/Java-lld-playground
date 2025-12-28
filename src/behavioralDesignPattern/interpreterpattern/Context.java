package behavioralDesignPattern.interpreterpattern;

import java.util.HashMap;
import java.util.Map;

public class Context {
	Map<String, Integer> variableMap = new HashMap<>();

	public Map<String, Integer> getVariableMap() {
		return variableMap;
	}

	public void setVariableMap(Map<String, Integer> variableMap) {
		this.variableMap = variableMap;
	}

}
