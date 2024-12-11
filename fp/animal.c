#include <stdio.h>

struct animal {
	void (*speak)(struct animal *);
};

struct cat {
	struct animal super;
};

struct dog {
	struct animal super;
	int eagerness_level;
};

void cat_speak(struct dog *self) {
	printf("meow\n");
}

void dog_speak(struct dog *self) {
	for (int i = 0; i < self->eagerness_level; i++) {
		printf("woof\n");
	}
	printf("(... woof)\n");
}

int main(void) {
	struct cat fluffy;
	fluffy.super.speak = cat_speak;

	struct dog fido;
	fido.super.speak = dog_speak;
	fido.eagerness_level = 5;

	struct dog spot;
	spot.super.speak = dog_speak;
	spot.eagerness_level = 2;

	// spot, fluffy and fido speak
	spot.super.speak(&spot);
	fluffy.super.speak(&fluffy);
	fido.super.speak(&fido);
}
