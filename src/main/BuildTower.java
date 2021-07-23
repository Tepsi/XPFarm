package main;

import java.util.ArrayList;
import java.util.List;

public class BuildTower {

	public static String[] buildTower(int level) {
		List<String> lista = new ArrayList<>();

		String szint = buildFirstLevel(level);
		lista.add(szint);

		for (int i = 1; i < level; i++) {
			szint = nextLevel(szint);
			lista.add(szint);
		}

		return (String[]) lista.toArray(new String[level]);
	}

	private static String buildFirstLevel(int level) {
		String oldal = "";
		for (int i = 0; i < level - 1; i++) {
			oldal += " ";
		}
		return oldal + "*" + oldal;
	}

	private static String nextLevel(String szint) {
		szint = szint.replace(" *", "**");
		szint = szint.replace("* ", "**");
		return szint;
	}

}
