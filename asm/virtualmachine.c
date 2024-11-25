#include <stdio.h>

/* Architecture definitions */
#define MEMSIZE 500
#define REGS 32
#define IP 0

int main(int argc, char **argv)
{
	int memory[MEMSIZE], registers[REGS];
	int instr_words;
	int i;

	FILE *source = fopen(argv[1], "r");
	fscanf(source, "%d\n", &instr_words);
	for (i = 0; i < instr_words; i++) 
		fscanf(source, "%d\n", memory + i);
	fclose(source);

	// Start executing at address 0
	registers[IP] = 0;

	for (;;) {
		int ip = registers[IP];
		int rd, rs, ra, imm;

		switch (memory[ip++]) 
		{
			case 1:  /* MOVI imm rd */
				imm = memory[ip++];
				rd = memory[ip++];
				registers[rd] = imm;
				break;

			case 2:  /* MOV  rs rd */
				rs = memory[ip++];
				rd = memory[ip++];
				registers[rd] = registers[rs];
				break;

			case 3:  /* ADD  rs rd */
				rs = memory[ip++];
				rd = memory[ip++];
				registers[rd] += registers[rs];
				break;

			case 4:  /* SUB  rs rd */
				rs = memory[ip++];
				rd = memory[ip++];
				registers[rd] -= registers[rs];
				break;

			case 5:  /* MUL  rs rd */
				rs = memory[ip++];
				rd = memory[ip++];
				registers[rd] *= registers[rs];
				break;

			case 6:  /* IDIV rs rd */
				rs = memory[ip++];
				rd = memory[ip++];
				registers[rd] /= registers[rs];
				break;

			case 7:  /* JMP  ra */
				ra = memory[ip++];
				ip = registers[ra];
				break;

			case 8:  /* JNZ  rs ra */
				rs = memory[ip++];
				ra = memory[ip++];
				if (registers[rs])
					ip = registers[ra];
				break;

			case 9:  /* OUT  rs */
				rs = memory[ip++];
				printf("%d\n", registers[rs]);
				break;

			case 10: /* HALT */
				return 0;

			case 11: /* LD   ra rd */
				ra = memory[ip++];
				rd = memory[ip++];
				registers[rd] = memory[registers[ra]];
				break;

			case 12: /* ST   ra rs */
				ra = memory[ip++];
				rs = memory[ip++];
				memory[registers[ra]] = registers[rs];
				break;

			default:
				fprintf(stderr, "invalid opcode: %d\n", memory[--ip]);
				return 1;
		}
		registers[IP] = ip;
	}
	return 0;
}
