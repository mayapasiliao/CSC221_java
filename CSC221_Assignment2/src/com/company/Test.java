//  4 Classes
//      1. BinomialTreeFactory -> creates nodes, use recursion to create rest of the tree.
//          T to indicate number of time periods.
//          P is an integer between 1 to 100 to indicate the probability of up
//              price movement.  The probability of down price movement is 100-P.
//      2. Node -> use to create a tree
//      3. Navigator -> SecureRandom -> give a range of values you want
//      4. Test

//  Pass tree to navigator and say navigate this thing. Probability is user input.
//  Build a tree, navigator traverses tree, factory generates random number?
//  Feed 0 to 99 in SecureRandom

package com.company;

public class Test {

    public static void main(String[] args) {
	// write your code here
        Node test = BinomialTreeFactory.create(9, 90);

        Navigator plsWork = new Navigator();
        plsWork.navigate(7, test);
    }
}
