// print(111 % 8)
// i = 1;
// do {
//   print(29 % i);
//   i++;
// } while (i != 11);

// i = r6


	// printmod(111, 8)
	MOVI 111 r1
	PUSH r1
	MOVI 8 r1
	PUSH r1
	MOVI printmod r7
	JAL r7
	MOVI 2 r2
	SUB r2 sp


	// initialization
	MOVI 1 r6
topofloop:


	// body
	//printmod(29, i)
	PUSH r6
	MOVI 29 r1
	PUSH r1
	PUSH r6
	MOVI printmod r7
	JAL r7
	MOVI 2 r7
	SUB r7 sp
	POP r6


	// increment
	MOVI 1 r2
	ADD r2 r6

	// test
	MOV r6 r5
	MOVI 11 r2
	SUB r2 r5
	MOVI topofloop r3
	JNZ r5 r3

	HALT


mod: // (a, b) -> int
	PUSH fp
	MOV sp fp

	// at this point, &a == FP - 3
	//                &b == FP - 2
	LDLO -3 r6
	LDLO -2 r2

	// mod(a, b) returns a % b
	MOV r6 r1
	IDIV r2 r6
	MUL r2 r6
	SUB r6 r1

	POP fp
	RET

printmod: // (a, b)
	PUSH fp
	PUSH rp
	MOV sp fp

	// print(mod(a, b))
	LDLO -4 r1
	LDLO -3 r2
	PUSH r1
	PUSH r2
	MOVI mod r7
	JAL r7
	MOVI 2 r2
	SUB r2 sp

	OUT r1

	POP rp
	POP fp
	RET
