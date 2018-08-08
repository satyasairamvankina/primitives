/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paritycheck;

/**
 *
 * @author S531508
 */
public class ParityCheck {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    ParityCheck1 ab = new ParityCheck1();
        System.out.println(ab.ParityCheckMethod1(25));
        System.out.println(ab.ParityCheckMethod2((long)Math.pow(2, 57))-1);
        System.out.println(ab.ParityForLong((long)Math.pow(2, 57))-1);
            System.out.println(1<<62);
            long h =(long)Math.pow(2,65);
            long i =1231242349;
           
           System.out.println(Long.toBinaryString(1231242349));
           ab.reverseBinaryNumber(1231242349);
           System.out.println(ab.ClosestNumberWithSameweight(Long.MAX_VALUE-1));
           System.out.println(ab.PowerOfDouble(3,-4));
        }
    
    
    
}
