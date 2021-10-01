#include <stdio.h>

int main(void)
{
	int dd, mm, yyyy;
	
	printf("Enter a date(mm/dd/yyyy): ");
	scanf("%d/%d/%d", &dd, &mm, &yyyy);

	printf("You entered the date %s%d%s%d%s%d\n",
		(yyyy > 1000 ? ("") : (yyyy > 100 ? ("0") : (yyyy > 10 ? ("00") : ("000")))) , yyyy,
		(mm > 10 ? ("") : ("0")), mm,
		(dd > 10 ? ("") : ("0")), dd);

	return 0;
}