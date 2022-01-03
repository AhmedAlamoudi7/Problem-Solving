/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication35;

import java.util.Scanner;

/**
 *
 * @author Ahmed_DEv
 */
public class JavaApplication35 {



    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter no of process");
        int n = in.nextInt();

        int pid[] = new int[n];
        int at[] = new int[n];
        int bt[] = new int[n];
        int ct[] = new int[n];
        int ta[] = new int[n];
        int f[] = new int[n];
        int wt[] = new int[n];
        int pr[] = new int[n];
        int st = 0;
        int tot = 0;
        float avgta = 0;
        float avgwt = 0;

        for (int i = 0; i < n; i++) {
            System.out.println("Enter process " + (i + 1) + " brust time: ");
            bt[i] = in.nextInt();
            System.out.println("Enter process " + (i + 1) + " priority: ");
            pr[i] = in.nextInt();
            System.out.println("Enter process " + (i + 1) + " arrival time: ");
            at[i] = in.nextInt();
            pid[i] = i + 1;
            f[i] = 0;
        }
        while (true) {
            int c = n;
            int min = 999;

            if (tot == n) {
                break;
            }
            for (int i = 0; i < n; i++) {
                if ((at[i] <= st) && (f[i] == 0) && (pr[i] < min)) {
                    min = pr[i];
                    c = i;
                }
            }
            if (c == n) {
                st++;
            } else {
                ct[c] = st + bt[c];
                st += bt[c];
                ta[c] = ct[c] - at[c];
                wt[c] = ta[c] - bt[c];
                f[c] = 1;
                tot++;
            }
        }
        System.out.println("\npid  arrival  brust  complete turn waiting  priority");
        for (int i = 0; i < n; i++) {
            avgwt += wt[i];
            avgta += ta[i];
            System.out.println(pid[i]  + "  \t " + at[i] + "\t" + bt[i] + "\t" + ct[i] + "\t" + ta[i] + "\t" + wt[i]+ "  \t " +pr[i]);
        }

        System.out.println("\naverage tat is: " + (avgta / n));
        System.out.println("average wt is:" + (avgwt / n));
        in.close();
    }
}

