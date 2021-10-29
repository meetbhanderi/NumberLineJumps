import java.util.Scanner;

/**
 * Problem Description -> https://www.hackerrank.com/challenges/kangaroo/problem
 *
 * @since 12-10-2020
 */
class NumberLineJumps{

	/**
	 * @param x1 
	 * @param v1
	 * @param x2
	 * @param v2
	 *
	 * @return
	 */
	static String kangaroo(int x1, int v1, int x2, int v2)   {
		if((x2>x1 && v2>v1)||(x1>x2 && v1>v2))
		{
			return "NO";
		}else {
			if(x1>x2)
			{
				return meetOrNot(x2, v2, x1, v1);
			}
			else
			{
				return meetOrNot(x1, v1, x2, v2);
			}
		}
	}

	/**
	 * @param low 
	 * @param lows
	 * @param high
	 * @param highs
	 *
	 * @return
	 */
    static String meetOrNot(int low, int lows, int high, int highs) {
        String met = "NO";
        while(low != high)
        {
            low = low+lows;
            high = high+highs;
            if(low>high)
            {
                break;
            }
        }
        if(low==high)
        {
            met = "YES";
        }
        return met;
    }
}

class NumberLineJumpsMain{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Input In Single Line as x1 v1 x2 v2");
		String input = sc.nextLine();
		String[] inputArray = input.split(" ");
		try {
			int x1 = Integer.parseInt(inputArray[0]);
			int v1 = Integer.parseInt(inputArray[1]);
			int x2 = Integer.parseInt(inputArray[2]);
			int v2 = Integer.parseInt(inputArray[3]);
			System.out.println(NumberLineJumps.kangaroo(x1, v1, x2, v2));
		}catch(Exception e){
			System.out.println("Exception Occurred While Processing your input.\nException Message : "+e.getMessage());
		}
	}
}
