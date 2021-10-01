#include <stdio.h>

int main(void)
{
	int digit1, digit2;
	printf("Enter a two-digit number: ");
	scanf("%1d%1d", &digit1, &digit2);

	printf("The reversal is: %d%d\n", digit2, digit1);

	return 0;
}