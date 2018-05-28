/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package acm_convexpolygonarea;

import java.util.Scanner;

/**
 *
 * @author tongd
 */
public class ACM_ConvexPolygonArea {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int times = sc.nextInt();
        for(int j = 0; j < times; j++) {
            int num = sc.nextInt();
            int[] verX = new int[num];
            int[] verY = new int[num];
            double area = 0;
            for(int i = 0; i < num; i++) {
                verX[i] = sc.nextInt();
                verY[i] = sc.nextInt();
                if(i != 0) {
                  area += verX[i-1]*verY[i] - verY[i-1]*verX[i];
                }
            }
            area += verX[num-1]*verY[0] - verY[num-1]*verX[0];
            area /= 2;
            if(area == (int)area) {
                System.out.println((int)area);
            }
            else {
                System.out.println(area);
            }
        }        
    }   
}
