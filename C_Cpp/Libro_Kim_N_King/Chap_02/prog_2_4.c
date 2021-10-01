#include <stdio.h>

int main(void)
{
	float input;
	printf("Enter an amount: ");
	scanf("%f", &input);
	printf("With tax added: $%.2f\n", (1.05*input));

	return 0;
}