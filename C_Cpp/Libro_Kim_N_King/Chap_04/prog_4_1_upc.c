#include <stdio.h>

int main(void)
{
	int digit11, digit21, digit22, digit23,
		digit24, digit25, digit31, digit32,
		digit33, digit34, digit35;
	int check_digit;
	
	printf("Enter the first (single) digit: ");
	scanf("%d", &digit11);

	printf("Enter the first group of five digits: ");
	scanf("%1d%1d%1d%1d%1d", &digit21, &digit22, &digit23,
							&digit24, &digit25);

	printf("Enter the second group of five digits: ");
	scanf("%1d%1d%1d%1d%1d", &digit31, &digit32, &digit33,
							&digit34, &digit35);

	check_digit = 9 - (((digit11 + digit22 + digit24 +
						digit31 + digit33 + digit35) * 3 +
						(digit21 + digit23 + digit25 +
						digit32 + digit34) - 1) % 10);
	printf("Check digit: %d\n", check_digit);

	return 0;
}