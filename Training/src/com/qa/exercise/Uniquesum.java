package com.qa.exercise;

public class Uniquesum {
public static int input(int x, int y, int z) {
	if (x != y && x != z && y != z) {
		int result = x + y + z;
		return result;
	} else if (x == y && x != z ) {
		return z;
	} else if (x == z && x != y) {
		return y;
	} else if (y == z && x != y) {
		return x;
	} else {
		return 0;
	}
}
}
//all 3 are unique
//x and y are the same
//x and z are the same
//y and z are the same
//all 3 are the same

/*
int total = 0;
if (x == y) {
	if(y == z) {
		return total;
	} else {
		total += z; // += means increase the variable to the left by the number on the right
		return total;
	}
} else if(x == z) { // we only count the value of y as we've already checked if they all have the same value
	total += y;
	return total;
	}
} else if (y == z) {
	total += x;
	return total;
} else {
	total = x + y + z
	return total;
}
*/