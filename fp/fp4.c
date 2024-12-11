#include <stdio.h>
#include <stdlib.h>

int plus(int a, int b) {
	return a + b;
}

int times(int a, int b) {
	return a * b;
}

int apply(int (*f)(int, int), int a, int b) {
	return f(a, b);
}

void sort(int *arr, int n, int (*le)(int, int)) {
	if (n < 2)
		return;
	int pivot = arr[n - 1];
	int j = 0;
	for (int i = 0; i < n; i++) {
		if (le(arr[i], pivot)) {
			int t = arr[i];
			arr[i] = arr[j];
			arr[j] = t;
			j++;
		}
	}
	sort(arr, j - 1, le);
	sort(arr + j, n - j, le);
}

int forward(int a, int b) {
	return a <= b;
}

int reverse(int a, int b) {
	return a >= b;
}

int wacky(int a, int b) {
	if (a % 10 < b % 10)
		return 1;
	if (a % 10 > b % 10)
		return 0;
	return a >= b;
}

int main(void)
{
	int arr[] = {
		9461, 30655, 10062, 4858, 5492, 6026, 15707, 17419, 3740, 1643,
		29539, 20444, 4369, 13608, 13295, 27254, 23142, 3355, 15537, 26015,
	};

	sort(arr, 20, wacky);

	for (int i = 0; i < 20; i++) {
		printf("%d ", arr[i]);
	}
	printf("\n");

	return 0;
}
