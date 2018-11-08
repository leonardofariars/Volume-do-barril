/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package barril;

import java.util.Scanner;

/**
 *
 * @author Xavier
 */
public class Barril {

    double dt, dc, altura, volume;

    //   public void Barril(){
    //       dt = dc = altura = volume =0;
//    }
    Barril(double dc1, double dt1, double altura1) {
        dc = dc1;
        dt = dt1;
        altura = altura1;
        volume = 0;
    }

    public void Leitura() {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o diâmetro da tampa: ");
        dt = entrada.nextDouble();

        System.out.println("Digite o diâmetro do centro: ");
        dc = entrada.nextDouble();

        System.out.println("Digite a altura do barril: ");
        altura = entrada.nextDouble();
    }

    public void CalculaVolume() {
        volume = (double) ((1.0 / 12.0) * altura * Math.PI * ((2.0 * (dc * dc)) + (dt * dt)));
    }

    public double getVolume() {
        return volume;
    }

}
