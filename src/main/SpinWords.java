package main;

public class SpinWords {
	public String spinWords(String sentence) {
		String retString = "";
		String[] words = sentence.split(" ");
		for (String word : words) {
			if (!retString.equals("")) {
				retString += " ";
			}
			if (word.length() >= 5) {
				retString += reverse(word);
			} else {
				retString += word;
			}
		}
		return retString;
	}

	private String reverse(String szo) {
		StringBuilder sb = new StringBuilder();
		sb.append(szo);
		sb.reverse();
		return sb.toString();
	}
}
