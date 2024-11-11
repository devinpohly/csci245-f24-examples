#include <stdio.h>
#include <stdlib.h>

struct node {
	int datum;
	struct node *next;
};

struct list_queue {
	struct node *head;  // = head of queue
	struct node *tail;  // = tail of queue
};

void lq_init(struct list_queue *lq) {
	lq->head = NULL;
	lq->tail = NULL;
}

// if you call this on an empty queue, then GIGO
int lq_peek(struct list_queue *lq) {
	return lq->head->datum;
}

void lq_enqueue(struct list_queue *lq, int item) {
	struct node *new_node = malloc(sizeof(struct node));
	new_node->datum = item;
	new_node->next = NULL;
	if (lq->tail == NULL) {
		lq->head = new_node;
		lq->tail = new_node;
	} else {
		lq->tail->next = new_node;
		lq->tail = new_node;
	}
}

int lq_dequeue(struct list_queue *lq) {
	int remember_me = lq->head->datum;
	struct node *remember_to_free_me = lq->head;
	lq->head = lq->head->next;
	if (lq->head == NULL) {
		lq->tail = NULL;
	}
	free(remember_to_free_me);
	return remember_me;
}

void lq_destroy(struct list_queue *lq) {
	while (lq->head != NULL) {
		lq_dequeue(lq);
	}
}

int main(void) {
	struct list_queue s;
	lq_init(&s);
	lq_enqueue(&s, 1);
	lq_enqueue(&s, 2);
	lq_enqueue(&s, 3);
	printf("%d\n", lq_dequeue(&s));
	lq_enqueue(&s, 4);
	lq_enqueue(&s, 5);
	printf("%d\n", lq_dequeue(&s));
	printf("%d\n", lq_dequeue(&s));
	printf("%d\n", lq_dequeue(&s));
	lq_destroy(&s);
	return 0;
}
