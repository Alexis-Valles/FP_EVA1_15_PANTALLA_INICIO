/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva1_15_pantalla_inicio;

import java.util.Scanner;

/**
 *
 * @author alexi
 */
public class EVA1_15_PANTALLA_INICIO {

    public static void main(String[] args) {
       final String USUARIO = "Admin";
       final String CONTRASEÑA = "Admin";
      // final double PI = 3.1416;
        String usuario, contraseña;
        Scanner captu = new Scanner(System.in);
        System.out.println("Usuario");
        usuario = captu.nextLine();
        System.out.println("Contraseña");
        contraseña = captu.nextLine();
        //COMO VALIDAMOS EL ACCESO?
        if(usuario.equals (USUARIO) && contraseña.equals(CONTRASEÑA) ){
            System.out.println("ACCESO CONCEDIDO!!");
        }else{
            System.out.println("ACCESO DENEGADO");
        }
        
    }
}
