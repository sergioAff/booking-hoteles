package com.booking_hoteles.Main;

import java.util.Scanner;

public class Main {

    // Datos iniciales de los hoteles con sus habitaciones
    static String[][][] instalaciones = {
            // Nombre, Ciudad, Tipo, Puntuación, Habitaciones [Tipo, precio, descripción, capacidad adultos, capacidad niños]
            {
                    {"Varadero Beach Resort", "Varadero", "Hotel", "5"},
                    {"Económica", "35", "1 cama simple, Terraza privada, Vista al mar", "2", "0"},
                    {"Doble", "60", "1 cama doble, 2 camas simples, Terraza, Balcón con vista panorámica", "2", "2"},
                    {"Familiar", "95", "2 camas dobles, 2 camas simples, Terraza, Balcón con jacuzzi", "4", "3"},
                    {"Suite", "170", "2 camas dobles, 2 camas simples, Terraza privada, Vista al océano", "4", "2"},
                    {"Deluxe", "310", "2 camas Kings, Terraza grande, Balcón, Vista impresionante", "4", "3"}
            },
            {
                    {"Casa Particular La Habana Vieja", "La Habana", "Apartamento", "4"},
                    {"22", "Local con terraza, Aire acondicionado, Vista al mar, Almuerzo incluido, Piscina", "2", "0"},
            },
            {
                    {"Finca Campesina Viñales", "Viñales", "Finca", "5"},
                    {"40", "Habitación con vistas al campo, Terraza, Aire acondicionado", "2", "0"}
            },
            {
                    {"Cayo Coco Day Retreat", "Cayo Coco", "Día de Sol", "5"},
                    {"Estándar", "28", "1 cama simple, Terraza soleada, Vista a la playa", "2", "0"},
                    {"Doble", "60", "1 cama doble, Terraza privada, Vista al mar", "3", "2"},
                    {"Familiar", "85", "2 camas dobles, 2 camas simples, Terraza amplia", "6", "3"},
                    {"Deluxe", "320", "2 camas dobles, Terraza privada con acceso exclusivo a la playa", "4", "3"}
            },
            {
                    {"Cueva de los Verdes", "Lanzarote", "Finca", "4"},
                    {"35", "Vista al mar, Terraza, Aire acondicionado, Almuerzo incluido, Piscina", "2", "0"}
            },
            {
                    {"Hotel Nacional de Cuba", "La Habana", "Hotel", "5"},
                    {"Económica", "45", "1 cama simple, Vista al mar Caribe", "1", "0"},
                    {"Doble", "85", "1 cama doble, Terraza con vista panorámica, Ventilador", "2", "1"},
                    {"Familiar", "130", "2 camas dobles, Terraza privada, Vista panorámica", "4", "3"},
                    {"Suite", "270", "2 camas dobles, Terraza privada, Vista al océano", "4", "3"},
                    {"Deluxe", "420", "2 camas dobles, Terraza privada con jacuzzi, Vista a la ciudad", "4", "3"}
            },
            {
                    {"Villa María La Gaviota", "Ciego de Ávila", "Hotel", "3.5"},
                    {"Económica", "32", "1 cama simple, Terraza con vistas al jardín", "2", "0"},
                    {"Doble", "65", "1 cama doble, Terraza privada, Vista al mar", "2", "1"},
                    {"Familiar", "100", "2 camas dobles, Terraza con vistas a la playa", "4", "2"},
                    {"Suite", "190", "2 camas dobles, Suite con jacuzzi privado", "4", "3"},
            },
            {
                    {"Hotel Playa Pesquero", "Holguín", "Hotel", "5"},
                    {"Económica", "50", "1 cama simple, Terraza con vista al mar", "2", "0"},
                    {"Doble", "95", "1 cama doble, Terraza con vistas al mar y jardín", "2", "1"},
                    {"Familiar", "130", "2 camas dobles, Terraza privada, Vista al mar", "4", "3"},
                    {"Suite", "240", "2 camas dobles, Terraza privada con vistas", "4", "3"},
                    {"Deluxe", "420", "2 camas dobles, Terraza con jacuzzi, Vista al mar", "4", "3"}
            },
            {
                    {"Hostal Casa Blanca", "Trinidad", "Apartamento", "4"},
                    {"Económica", "23", "1 cama simple, Vista a la plaza", "2", "0"},
                    {"Doble", "48", "1 cama doble, Terraza privada, Vista al mar", "2", "1"},
                    {"Familiar", "75", "2 camas dobles, Terraza con vistas", "4", "2"},
                    {"Suite", "135", "2 camas dobles, Terraza privada, Jacuzzi al aire libre", "4", "3"},
                    {"Deluxe", "260", "2 camas dobles, Terraza con jacuzzi y vista al jardín", "4", "3"}
            },
            {
                    {"Hotel de la Playa", "Santiago de Cuba", "Hotel", "4.5"},
                    {"Económica", "45", "1 cama simple, Terraza con vistas al mar", "2", "0"},
                    {"Familiar", "130", "2 camas dobles, Terraza privada, Vista al mar", "4", "3"},
                    {"Suite", "240", "2 camas dobles, Terraza privada con vistas", "4", "3"},
                    {"Deluxe", "420", "2 camas dobles, Terraza con jacuzzi, Vista al mar", "4", "3"}
            },
    };


   
}
