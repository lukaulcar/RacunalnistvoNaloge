package com.lukaulcar.Main.Naloga1.ReEdit;

import java.util.Scanner;

public class ProgramRomarRomanReEdit {
    /**
     * Program: Romar Roman
     *
     * @author Luka Ulcar
     */

    public static void main(String[] args) {
        int D = new Scanner(System.in).nextInt(), P = new Scanner(System.in).nextInt(), z, cph = 0, kppd = P, dpp, d = 1, k = 1;
        while (D > P && D > (cph += (dpp = kppd - (z = k-- > 0 ? 0 : (z = new Scanner(System.in).nextInt()) < 0 ? -z : z))) && (kppd -= z) > 0)
            System.err.println(d++ + " dan: " + (D - (cph - dpp)) + " -> " + (D - cph) + " (prehodil " + dpp + ")");
    }

}
