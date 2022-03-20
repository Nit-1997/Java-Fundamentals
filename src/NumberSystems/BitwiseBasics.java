package NumberSystems;

public class BitwiseBasics {
    public static int magicNumber(int n){
        int ans = 0;
        int base = 5;
        while(n>0) {
            int last = n & 1;
            n = n >> 1;
            ans += last * base;
            base = base * 5;
        }
        return ans;
    }


    public static void main(String[] args) {
         /*
               operators                    special observations
               >>  right shift              a>>b   means a/(2^b) one right shift halves the number
               <<  left shift               a<<b   means a*(2^b) one left shift doubles the number
               &   and                      a&1    gives last digit of a
               |   or
               ^   xor                      a^a = 0  , a^1 complements it
               ~ complement

               n&1 == 1 odd , else even

               we need to create mask  1<<(n-1)

               - How to find ith bit in a binary number ( & with mask)
                 1&(1<<(n-1))
               - Set the ith bit ( | with mask)
                 1|(1<<(n-1))
               - reset ith bit ( & with (complement of mask) )
               - Find the position of the right most set bit

               range of numbers -2^n-1 to 2^(n-1)-1  for n bits

               int(log n / log b ) + 1 -> number of digits in n



         */


        //find nth magic number
        System.out.println(magicNumber(6));

    }
}
