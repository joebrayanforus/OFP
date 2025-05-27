/** The Birthday Paradox -- an illustration
 *  Author:  kvl
 *  Date:    first week
 */

class BDayParadox {
  /* p(x) --> probability of x happening
     p(x) = 1 - p(not x)
     p(2 persons have same birthday) =  1 - (365-1)/365 * (365-2)/365 * ... * (365 - (n-1))/365 */
  double prob(int n) {
    double p = 1.0;   // probability that out of n people, 2 have the same birthday
    for (int i = 0; i < n; i++) {  // i = 1, 2, ..., n-1
       p = p * (365-i)/365;
    }
    return 1 - p;
  }
  public static void main(String[] args) {
    int n = 23;
    BDayParadox b = new BDayParadox();
    System.out.println( "Out of " + n +
                        " people, the chance that 2 have the same birthday is: " + b.prob(n) );
  }
}
