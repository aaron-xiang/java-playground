package playground.codeWars2015;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Created by aaron on 4/18/17.
 */
public class prob10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        String encode = "a=81 b=82 c=83 d=84 e=85 f=86 g=87 h=88 i=89 j=91 k=92 l=93 m=94 " +
        "n=95 o=96 p=97 q=98 r=99 s=A2 t=A3 u=A4 v=A5 w=A6 x=A7 y=A8 z=A " +
        "A=C1 B=C2 C=C3 D=C4 E=C5 F=C6 G=C7 H=C8 I=C9 J=D1 K=D2 L=D3 M=D4 " +
        "N=D5 O=D6 P=D7 Q=D8 R=D9 S=E2 T=E3 U=E4 V=E5 W=E6 X=E7 Y=E8 Z=E9 " +
        "space=40 .=4B ,=6B !=5A";
        Map<String, String> encodeMap = new HashMap<>();
        String[] code = encode.split("[\\s\\-]");
        for (int i = 0; i < code.length; i++) {
//        for (String s : code) {
            String[] x = code[i].split("=");
            encodeMap.put(x[1], x[0]);
            if (x[1].equals("40")) {
                encodeMap.put(x[1], " ");
            }
        }
        for (int i = 0; i < a; i++) {
            int b = scanner.nextInt();
            for (int j = 0; j < b; j++) {
                String s = scanner.next();
                System.out.print(encodeMap.get(s));
            }
            System.out.println("");
        }
    }
}
