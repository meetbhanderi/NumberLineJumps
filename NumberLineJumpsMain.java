class NumberLineJumps{
        //https://www.hackerrank.com/challenges/kangaroo/problem
         static String kangaroo(int x1, int v1, int x2, int v2)   {
            if((x2>x1 && v2>v1)||(x1>x2 && v1>v2))
            {
                return "NO";
            }else {
                if(x1>x2)
                {
                    return meetornot(x2, v2, x1, v1);
                }
                else
                {
                    return meetornot(x1, v1, x2, v2);
                }
            }
        }
         static String meetornot(int low, int lows, int high, int highs) {
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
                return "YES";
            }
            else
            {
                return "NO";
            }
        }
    }

class NumberLineJumpsMain{
    public static void main(String[] args){
		System.out.println(NumberLineJumps.kangaroo(0,2,5,3));
	}
}
