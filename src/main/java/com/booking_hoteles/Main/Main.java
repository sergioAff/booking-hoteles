package com.booking_hoteles.Main;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Datos iniciales de los hoteles
        String[][] hoteles = {
                {"Hotel 1", "Ciudad A", "Hotel"},
                {"Hotel 2", "Ciudad B", "Apartamento"},
                {"Hotel 3", "Ciudad A", "Finca"},
                {"Hotel 4", "Ciudad C", "Día de Sol"},
                {"Hotel 5", "Ciudad B", "Hotel"},
                {"Hotel 6", "Ciudad C", "Apartamento"},
                {"Hotel 7", "Ciudad A", "Finca"},
                {"Hotel 8", "Ciudad B", "Día de Sol"},
                {"Hotel 9", "Ciudad C", "Hotel"},
                {"Hotel 10", "Ciudad A", "Apartamento"},
                {"Hotel 11", "Ciudad A", "Hotel"},
                {"Hotel 12", "Ciudad B", "Apartamento"},
                {"Hotel 13", "Ciudad C", "Finca"},
                {"Hotel 14", "Ciudad A", "Día de Sol"},
                {"Hotel 15", "Ciudad B", "Hotel"},
                {"Hotel 16", "Ciudad C", "Apartamento"},
                {"Hotel 17", "Ciudad A", "Finca"},
                {"Hotel 18", "Ciudad B", "Día de Sol"},
                {"Hotel 19", "Ciudad C", "Hotel"},
                {"Hotel 20", "Ciudad A", "Apartamento"}
        };

        // Datos iniciales de habitaciones
        String[][] habitaciones = {
                {"Simple", "1 cama individual, balcón", "50"},
                {"Doble", "2 camas individuales, balcón", "80"},
                {"Familiar", "3 camas dobles, sala de estar, balcón", "120"},
                {"Suite", "1 cama king, jacuzzi, balcón, vista al mar, terraza", "200"},
                {"Deluxe", "2 camas queen, vista al mar, terraza, jacuzzi, balcón, piscina, gimnasio", "250"}
        };

        // Disponibilidad: 10 hoteles, 5 tipos de habitaciones, 31 días y 12 meses
        boolean[][][][] disponibilidadHoteles = new boolean[20][5][31][12];

        
    }
}