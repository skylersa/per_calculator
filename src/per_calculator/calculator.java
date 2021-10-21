package per_calculator;

import java.util.Scanner;

public class calculator
{
	public static String selection;
	public static int[] valArray;
	public static String prevProg;

	public static int numnum()
	{
		Scanner kboard;
		kboard = new Scanner(System.in);

		int numOfNums;
		System.out.println("please enter the number of numbers you would like to " + selection);
		numOfNums = kboard.nextInt();
		valArray = new int[numOfNums];
		int result = numOfNums;
		int y = 1;
		while (numOfNums > 0)
		{
			System.out.println("please enter your number #" + y);
			valArray[y - 1] = kboard.nextInt();
			numOfNums--;
			y++;
		}

		kboard.close();
		return result;

	}

	public static void calc()
	{
		prevProg = "calculator";

		Scanner kboard;
		kboard = new Scanner(System.in);

		System.out.println(" would you like to ADD, SUBTRACT, MULTIPLY or, DIVIDE");

		selection = kboard.next();

		switch (selection.toUpperCase())
		{
		case "ADD":
			int addAns = 0;
			int numOfNums2 = numnum();
			int y2 = 0;
			while (numOfNums2 > 0)
			{
				addAns = addAns + valArray[y2];

				numOfNums2--;
				y2++;
			}
			System.out.println("the total sum of the values you entered is " + addAns);
			break;
		case "SUBTRACT":
			System.out.println("please enter the number you would like to subtract from");
			int subNum1 = kboard.nextInt();
			System.out.println("please enter the number you would like to subtract from that value");
			int subNum2 = kboard.nextInt();
			int subAns = subNum1 - subNum2;
			System.out.println("the first number minus the second is equal to " + subAns);
			break;
		case "MULTIPLY":
			int multiplyAns = 1;
			int numOfNumsMultiply = numnum();
			int yMultiply = 0;
			while (numOfNumsMultiply > 0)
			{
				multiplyAns = multiplyAns * valArray[yMultiply];

				numOfNumsMultiply--;
				yMultiply++;
			}
			System.out.println("the total sum of the values you entered is " + multiplyAns);
			break;
		case "DIVIDE":
			System.out.println("please enter the number you would like to divide");
			int divNum1 = kboard.nextInt();
			System.out.println("please enter the number you would like to divide that value by");
			int divNum2 = kboard.nextInt();
			int divAns = divNum1 / divNum2;
			int divAns2 = divNum1 % divNum2;
			System.out.println("the first number divided by the second is equal to " + divAns + " with a remainder of "
					+ divAns2);
			break;
		default:
			System.out.println(selection + " is either not supported or typed incorrectly");
			calc();
		}
		repeatQ();
	}

	public static void repeatQ()
	{
		Scanner kboard = new Scanner(System.in);
		System.out.println("would you like to use this program again?");
//		String yesOrNo = kboard.next();
		String yesOrNo = "yes";
		switch (yesOrNo)
		{
		case "yes":
			switch (prevProg)
			{
			case "calculator":
				calc();
			}
			break;
		case "no":
//			System.out.println("would you like to use another program?")
			break;
		default:
			System.out.print("please type yes or no");
			repeatQ();
		}
	}

	public static void main(String[] args)
	{
		calc();
	}
}