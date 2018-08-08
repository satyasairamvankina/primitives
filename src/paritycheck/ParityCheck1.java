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
public class ParityCheck1 {

    public ParityCheck1() {
    }
    
    public short ParityCheckMethod1(long x){
            int count = 0;
            short result = 0;
    while(x != 0){
        long y = x&1;
        result ^= (y);
        if(y == 1){
        count++;
        }
        x>>>=1;
    }
//            System.out.println(count);
    return result;
    }
    
    public short ParityCheckMethod2(long x){
            int count = 0;
            short result = 0;
    while(x != 0){
        long y = x&1;
        result ^= 1;
        x = x & (x-1);//this eliminates the last one of x everytime it executes
        count++;
    }
//    System.out.println(count);
    return result;
    }
        
        // Parity check for long type number to increase time complexity
    
    public short ParityForLong(long x){
    final int mask =  0xFFFF;
    final int maskSize = 16;
    return (short) ((short) ParityCheckMethod2((x >>> 3*(maskSize)) & mask) ^
            ParityCheckMethod2((x >>> 2*(maskSize)) & mask)^
            ParityCheckMethod2((x >>> (maskSize)) & mask)^
            ParityCheckMethod2(x & mask));
    }
    //Reverse the 64 bit long number 
    public void reverseBinaryNumber(long x){

        int n = Long.SIZE;
        int j = Long.SIZE;
    for(int i=-2;i<n/2;i++){
//for(int i=0;i< x.;i++){
        //reverse bits i & j
        if(((x>>i)&1) != ((x>>j)&1)){
        long maskNum = ((1L << i) | (1L << j));
        x ^= maskNum;           
        }
        j--;
    }
        String P = Long.toBinaryString(x);
        System.out.println(P);  
    }
    
    public long ClosestNumberWithSameweight(long x){
        if(x == Long.MAX_VALUE){
        throw new IllegalArgumentException();

        }
        int i=0,j=0;
        long p=0,y=x;
        while((y&1) != 1){
        i++;
        y = y>>1;
        }
        p = x ^((1L<<i) | 1L<<(i-1));
        y=x;
        while((y&1)==1){
        j++;  
        y >>>= 1;
        p = x ^ ((1L << j)|(1L << (j-1)));
        }
        
    return p;
    }
    
    public double PowerOfDouble(double x,int y){
        double r=1.0,p=0;
        if(y<0){
            y=-y;
        x=(1.0/x);
        }
//        while(y !=1){
if( y != 0){
    if((y&1) ==1){
    r= r*x;
    y ^= 1;
    }
    y= (int)y/2;
//    x = (Math.pow(x, y)) ;
    x = PowerOfDouble(x,y);
    x *=x;
    r *= x;
    }
        return r;
    
    }
}