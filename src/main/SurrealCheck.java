package main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SurrealCheck {
	public boolean isSurreal(String l, String r) {

		if (l.equals("") || r.equals("")) {
			return true;
		}

		List<Double> lList = stringToList(l);
		List<Double> rList = stringToList(r);

		return Collections.min(rList) > Collections.max(lList);
	}

	List<Double> stringToList(String text) {
		List<Double> retList = new ArrayList<Double>();
		String[] words = text.split(" ");
		for (String word : words) {
			retList.add(parseToDouble(word));
		}
		return retList;
	}

	private Double parseToDouble(String text) {

		if (text.indexOf("/") >= 0) {
			String[] words = text.split("/");
			double retNum = Double.valueOf(words[0]) / Double.valueOf(words[1]);
			return retNum;
		}
		
		return Double.valueOf(text);
	}
}
