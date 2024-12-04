// i = 1;
// do {
//   print(i);
//   i++;
// } while (i != 11);

// i = r6
	MOVI 1 r6
topofloop:
	OUT r6
	MOVI 1 r2
	ADD r2 r6

	MOV r6 r5
	MOVI 11 r2
	SUB r2 r5
	MOVI topofloop r3
	JNZ r5 r3

	HALT
