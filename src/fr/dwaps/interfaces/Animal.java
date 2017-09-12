package fr.dwaps.interfaces;

public interface Animal {
	String scientificName();
	String currentName();
	
	public static String getScientificName(String latinName) {
		return latinName;
	}
	
	public static String getCurrentName(String currentName) {
		return currentName;
	}
}
