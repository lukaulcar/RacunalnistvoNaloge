package com.lukaulcar.Naloga1.Main;

import java.util.Scanner;

public class ProgramRomarRomanReEdit {
    /**
     * Program: Romar Roman
     *
     * @author Luka Ulcar
     */

    public static void main(String[] args) {
        int D = new Scanner(System.in).nextInt(), P = new Scanner(System.in).nextInt(), z, cph = 0, kppd = P, dpp, d = 1;
        while ((D > P && D > 0 && P > 0) && D > (cph += (dpp = kppd - (z = d == 1 ? 0 : (z = new Scanner(System.in).nextInt()) < 0 ? -z : z))) && (kppd -= z) > 0)
            System.err.println(d++ + " dan: " + (D - (cph - dpp)) + " -> " + (D - cph) + " (prehodil " + dpp + ")");
    }

}
