package HackerRank;

public class Binarybits {

    public static void main(String[] args) {
        flippingBits(5);
    }


    public static long flippingBits(long n) {
        String num = "";
        String binaries = Long.toBinaryString(n & 0xffffffffL | 0x100000000L).substring(1);
        System.out.println(binaries);
        for (int i = 0; i < binaries.length(); i++) {
            if (binaries.charAt(i) == '1') {
                num = num + 0;
            } else if (binaries.charAt(i) == '0') {
                num = num + 1;
            } else {
                num = num + binaries.charAt(i);
            }

        }
        System.out.println(num);
        long newNum = Long.parseLong(num, 2);
        System.out.println(newNum);
        return newNum;
    }

}
