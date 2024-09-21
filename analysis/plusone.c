// Given an integer, return one more than
// that integer
int plusone(int x) {
	return x + 1;
}

int plusoneB(int x) {
	return -(-x - 1);
}

int plusoneC(int x) {
	int y = x * 7;
	int z = y + 7;
	return z / 7;
}

int plusoneD(int x) {
	if (x % 2 == 0) {
		return (x / 2) * 2 + 1;
	} else {
		return (x / 2) * 2 + 2;
	}
}

// Precondition: y >= 0
int plus(int x0, int y0) {
	int z = x0 + y0;
	while (y > 0) {
		x++;
		y--;
	}
	return x;
}
