package adventofcode_2022;


import utils.AdventOfCodeUtil;

import java.util.List;

public class AdventOfCode_2022_25 {

    static String input = "1212-2==\n" +
            "1=-=0111\n" +
            "1=22-20=--\n" +
            "12==001-\n" +
            "1000=001222212\n" +
            "1-00=-0=\n" +
            "1==-=011==-200-1-1\n" +
            "1=-20-\n" +
            "1=110-\n" +
            "1-20221-=00-002-1100\n" +
            "20-12--=0\n" +
            "21=202-2\n" +
            "22\n" +
            "2=121020110\n" +
            "1101-12-1=0\n" +
            "2-1-\n" +
            "201==1-112\n" +
            "102=110\n" +
            "11-212=001-2=20=000\n" +
            "211-210022021-0\n" +
            "1-0\n" +
            "1-2=0\n" +
            "1==2211=000=-0=-\n" +
            "102-222-0==-=-2-2=\n" +
            "1=-=0=1-2=2=0-\n" +
            "1=--1212\n" +
            "21020==\n" +
            "1-20=1=2=10-02=2=--\n" +
            "11=001\n" +
            "1-0-1012-10\n" +
            "10221=0=2020\n" +
            "12-111211021-0-\n" +
            "1--=-1=11=212\n" +
            "100112=21012=10-\n" +
            "2=\n" +
            "2-0021=1=2=\n" +
            "2-1=-==-0=1\n" +
            "12-=-=2--0\n" +
            "1=02\n" +
            "10=11\n" +
            "1=-110=-==\n" +
            "10-00=0121=-2-=\n" +
            "1=1-=2-0011=2\n" +
            "10011-0\n" +
            "102102102\n" +
            "1-0-0-1-2221\n" +
            "1=00=011=2=0\n" +
            "1-20==1-0\n" +
            "12==01-1=--1-\n" +
            "201=----=-1==-121-\n" +
            "1--\n" +
            "102\n" +
            "21==0-2=020-=02-\n" +
            "2-1010-=22=20=\n" +
            "1=2\n" +
            "222\n" +
            "21-0-10-2=2-\n" +
            "2=-==10=11\n" +
            "1=22=01=-0-1=102\n" +
            "122==20=1-0012\n" +
            "10=100210\n" +
            "1-===22==11=0=-\n" +
            "20-=-2===2-10\n" +
            "10--2=\n" +
            "21=11-01\n" +
            "1==--1-200\n" +
            "1001\n" +
            "11--=210220\n" +
            "111212201\n" +
            "1-=-2-=--\n" +
            "1=1-22022101\n" +
            "122=10=1\n" +
            "2-2220--111=\n" +
            "2-1\n" +
            "1=1=1210-111=11112\n" +
            "1-22=-2120\n" +
            "22=02222-00=01-0=\n" +
            "20=12\n" +
            "1=100==11-=211-1=1\n" +
            "11--011==210-00\n" +
            "2121=011==-\n" +
            "2-=002\n" +
            "2=202-112=-\n" +
            "1=-2=-0-01011\n" +
            "102=2-==\n" +
            "1===2=1=12-01-=-20=\n" +
            "2-1021--=2\n" +
            "11221--2\n" +
            "100--=22101212-110\n" +
            "21-00==11-2-1\n" +
            "202--00021001\n" +
            "10=-1=2121=-1\n" +
            "1==11-\n" +
            "21=\n" +
            "1-0--\n" +
            "1=1\n" +
            "1--0-1\n" +
            "1-2=2\n" +
            "10-1220-00-11=1\n" +
            "2200102=2212-02-22\n" +
            "1-\n" +
            "10-=01\n" +
            "1=222=01==0=1\n" +
            "1101\n" +
            "2-==10\n" +
            "2-0=0=1=0110100-1\n" +
            "1=0=--==0200=0-=0\n" +
            "121-12==-==-2-\n" +
            "1==222\n" +
            "10-22-=21==-2-";

    public static void main(String... args) {
        long total = 0;

        for (int i = 0; i < input.split("\n").length; i++) {
            String ii = input.split("\n")[i];
            int u = 0;
            for (int j = ii.toCharArray().length - 1; j >= 0; j--) {
                char c = ii.toCharArray()[j];
                String s = Character.toString(c);
                if (s.equals("-")) {
                    total += -1 * (Math.pow(5, u));
                }
                if (s.equals("=")) {
                    total += -2 * (Math.pow(5, u));
                }
                if (s.equals("0")) {
                    total += 0 * (Math.pow(5, u));
                }
                if (s.equals("1")) {
                    total += 1 * (Math.pow(5, u));
                }
                if (s.equals("2")) {
                    total += 2 * (Math.pow(5, u));
                }
                u++;
            }
        }
        System.out.println(total);
        String total76 = "";
        boolean found = false;
        int pow = 0;
        long total2 = 0;
        while (found == false) {
            for (int i = 0; i < 999; i++) {
                if (total2 + 2 * Math.pow(5, pow) > total) {
                    found = true;
                    break;
                } else {
                    total2 += 2 * Math.pow(5, pow);
                    pow ++;
                }
            }
        }

		for (int y = pow; y >= 0; y--) {
			long totalsofar = totalSoFar(y);
            int foundnum = 3;
            for (int k = -2; k <=2; k++) {
                if (total - (k * Math.pow(5, y)) <= totalsofar &&
                        total - (k * Math.pow(5, y)) >= -totalsofar) {
                    foundnum = k;
                    break;
                }
            }
            if (foundnum == -2) {
                total76 += "=";
            } else
            if (foundnum == -1) {
                total76 += "-";
            } else {
                total76 += foundnum;
            }
            total = total - foundnum * (long)Math.pow(5, y);
        }
        System.out.println(total76);

    }

	static long totalSoFar(int y) {
        long total = 0;
		for (int i = 0; i < y; i++) {
            total += 2*Math.pow(5, i);
        }
        return total;
	}

}
