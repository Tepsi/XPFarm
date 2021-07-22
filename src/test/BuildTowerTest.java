package test;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

import main.BuildTower;

class BuildTowerTest {

	@Test
	void testBuildTower() {
		assertTrue(Arrays.equals(new String[] { "*" }, BuildTower.buildTower(1)), "Level 1 tower is just one *");
		assertTrue(Arrays.equals(new String[] { " * ", "***" }, BuildTower.buildTower(2)), "Level 2 tower is just two levels");
		assertTrue(Arrays.equals(new String[] { "  *  ", " *** ", "*****" }, BuildTower.buildTower(3)), "Level 3 tower has 3 levels");

	}

}
