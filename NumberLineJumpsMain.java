class NumberLineJumps{
    static String kangaroo(int x1,int v1,int x2,int v2) {

        if(v1 <= v2) {
            return "NO";
        } else {
            int lcm = Math.max(v1, v2);
            int i = 1;
            // Always true
            while(true) {
                if(lcm % v1 == 0 && lcm % v2 == 0) {
                    System.out.printf("The LCM of %d and %d is %d.", v1, v2, lcm);
                    break;
                }
                ++lcm;
            }
            int x, y;
            do {
                lcm = lcm * i;
                x = (lcm - x1) / v1;
                y = (lcm - x2)/  v2;
                if(x == y){
                    return "YES";
                }
                i++;
                System.out.println("....");
            } while (x > y);

            return "NO";
        }
    }
}

class NumberLineJumpsMain{
    public static void main(String[] args){
		System.out.println(NumberLineJumps.kangaroo(0,2,5,3));
	}
}
