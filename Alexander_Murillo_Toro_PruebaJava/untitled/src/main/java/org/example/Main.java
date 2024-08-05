package org.example;
import org.example.Controllers.*;
import org.example.entities.*;
import org.example.Models.*;


import javax.swing.*;


// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        estudiantesController estudiantesController= new estudiantesController();
        String email= JOptionPane.showInputDialog("ingresa tu email");
        String estado= JOptionPane.showInputDialog("ingresa el estado");
        String nombre= JOptionPane.showInputDialog("ingresa tu nombre");

        estudiantes Estudiantes= new estudiantes(email,estado,nombre);
        estudiantesController.create(Estudiantes);

        
    }
}