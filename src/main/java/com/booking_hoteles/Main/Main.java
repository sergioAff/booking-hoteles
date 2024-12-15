package com.booking_hoteles.Main;

import java.util.Scanner;

public class Main {

    // Datos iniciales de los hoteles con sus habitaciones
    static String[][][] instalaciones = {
            // Nombre, Ciudad, Tipo, Puntuación
            // Habitaciones [Tipo, precio, descripción, capacidad adultos, capacidad menores, cant habitaciones]
            {
                    {"Varadero Beach Resort", "Varadero", "Hotel", "5"},
                    {"Económica", "35", "1 cama simple, Terraza privada, Vista al mar", "2", "0", "10"},
                    {"Doble", "60", "1 cama doble, 2 camas simples, Terraza, Balcón con vista panorámica", "2", "2", "20"},
                    {"Familiar", "95", "2 camas dobles, 2 camas simples, Terraza, Balcón con jacuzzi", "4", "3", "20"},
                    {"Suite", "170", "2 camas dobles, 2 camas simples, Terraza privada, Vista al océano", "4", "2", "2"},
                    {"Deluxe", "210", "2 camas Kings, Terraza grande, Balcón, Vista impresionante", "4", "3", "4"}
            },
            {
                    {"Casa Particular La Habana Vieja", "La Habana", "Apartamento", "4"},
                    {"Apartamento","22", "Local con terraza, Aire acondicionado, Vista al mar, Almuerzo y Cena incluidos, Piscina", "2", "2", "10"},
            },
            {
                    {"Finca Campesina Viñales", "Viñales", "Finca", "5"},
                    {"Finca","40", "Habitación con vistas al campo, Terraza, Aire acondicionado", "2", "2", "6"}
            },
            {
                    {"Cayo Coco Day Retreat", "Cayo Coco", "Día de Sol", "5"},
                    {"Día de Sol","28", "Viaje a playa Varadero, Almuerzo y Cena incluidos, Refrigerio", "2", "2", "6"},

            },
            {
                    {"Rancho Luna", "La Habana", "Día de Sol", "4"},
                    {"Día de Sol","40", "Viaje a la playa Rancho Luna, Almuerzo y Cena incluidos, Refrigerio", "4", "3", "6"},
            },
            {
                    {"Playa Larga", "Santiago de Cuba", "Día de Sol", "4.5"},
                    {"Día de Sol","50", "Viaje a la playa Playa Larga, Almuerzo y Cena incluidos, Refrigerio", "4", "3", "6"},
            },
            {
                    {"Playa del Sol", "Santiago de Cuba", "Día de Sol", "4"},
                    {"Día de Sol","22", "Local con terraza, Aire acondicionado, Vista al mar, Almuerzo y Cena incluidos, Piscina", "2", "2", "10"},
            },
            {
                    {"Cueva de los Verdes", "Lanzarote", "Finca", "4"},
                    {"Finca","35", "Vista al mar, Terraza, Aire acondicionado, Almuerzo incluido, Piscina", "2", "2", "9"}
            },
            {
                    {"Hotel Nacional de Cuba", "La Habana", "Hotel", "5"},
                    {"Económica", "45", "1 cama simple, Vista al mar Caribe", "1", "0", "20"},
                    {"Doble", "85", "1 cama doble, Terraza con vista panorámica, Ventilador", "2", "1", "11"},
                    {"Familiar", "130", "2 camas dobles, Terraza privada, Vista panorámica", "4", "3", "23"},
                    {"Suite", "270", "2 camas dobles, Terraza privada, Vista al océano", "4", "3", "12"},
                    {"Deluxe", "320", "2 camas dobles, Terraza privada con jacuzzi, Vista a la ciudad", "4", "3", "50"}
            },
            {
                    {"Villa María La Gaviota", "Ciego de Ávila", "Hotel", "3.5"},
                    {"Económica", "32", "1 cama simple, Terraza con vistas al jardín", "2", "0", "7"},
                    {"Doble", "65", "1 cama doble, Terraza privada, Vista al mar", "2", "1", "9"},
                    {"Familiar", "100", "2 camas dobles, Terraza con vistas a la playa", "4", "2", "10"},
                    {"Suite", "190", "2 camas dobles, Suite con jacuzzi privado", "4", "3", "5"},
            },
            {
                    {"Hotel Playa Pesquero", "Holguín", "Hotel", "5"},
                    {"Económica", "50", "1 cama simple, Terraza con vista al mar", "2", "0", "10"},
                    {"Doble", "95", "1 cama doble, Terraza con vistas al mar y jardín", "2", "1", "20"},
                    {"Familiar", "130", "2 camas dobles, Terraza privada, Vista al mar", "4", "3", "5"},
                    {"Suite", "240", "2 camas dobles, Terraza privada con vistas", "4", "3", "5"},
                    {"Deluxe", "350", "2 camas dobles, Terraza con jacuzzi, Vista al mar", "4", "3", "3"}
            },
            {
                    {"Hostal Casa Blanca", "Trinidad", "Apartamento", "4"},
                    {"Apartamento", "23", "Local con terraza, Aire acondicionado, Vista al mar, Almuerzo y Cena incluidos", "2", "2", "20"},
            },
            {
                    {"Hotel de la Playa", "Santiago de Cuba", "Hotel", "4.5"},
                    {"Económica", "45", "1 cama simple, Terraza con vistas al mar", "2", "0", "20"},
                    {"Familiar", "130", "2 camas dobles, Terraza privada, Vista al mar", "4", "3", "20"},
                    {"Suite", "240", "2 camas dobles, Terraza privada con vistas", "4", "3", "10"},
                    {"Deluxe", "420", "2 camas dobles, Terraza con jacuzzi, Vista al mar", "4", "3", "10"}
            },
    };

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        // Disponibilidad de los hoteles
        boolean[][][][] disponibilidadHoteles = new boolean[instalaciones.length][][][];

        // Disponibilidad para cada instalación
        for(int i = 0; i < instalaciones.length; i++) {
            // Calculamos la cantidad de tipos de habitaciones para esta instalación
            int numTiposHabitaciones = instalaciones[i].length - 1; // Restamos 1 para excluir el primer registro (nombre, ciudad, tipo, puntuación)

            // Arreglo de la instalación si con la cantidad de tipos de habitaciones
            disponibilidadHoteles[i] = new boolean[numTiposHabitaciones][][];

            // Para cada tipo de habitación de la instalación
            for (int j = 0; j < numTiposHabitaciones; j++) {
                // Tomamos la cantidad de habitaciones del tipo j (el último valor en el registro)
                int cantHabitaciones = Integer.parseInt(instalaciones[i][j + 1][5]);

                // Inicializamos la tercera dimensión para el tipo de habitación j
                disponibilidadHoteles[i][j] = new boolean[cantHabitaciones][31]; // 31 días en el mes
            }
        }

        // Bucle principal
        while (true) {
            System.out.println("\n--- Aplicación Booking Hoteles ---");
            System.out.println("1. Buscar instalaciones");
            System.out.println("2. Buscar habitaciones");
            System.out.println("3. Reservar");
            System.out.println("4. Modificar reserva");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opción: ");
            int opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    System.out.println("\n--- Buscar Hoteles ---");
                    System.out.print("Ingrese la ciudad: ");
                    String ciudad = scanner.nextLine();

                    String tipoAlojamiento = "";
                    while (!tipoAlojamiento.equalsIgnoreCase("Hotel") && !tipoAlojamiento.equalsIgnoreCase("Apartamento") && !tipoAlojamiento.equalsIgnoreCase("Finca") && !tipoAlojamiento.equalsIgnoreCase("Día de Sol")) {
                        System.out.print("Ingrese el tipo de alojamiento (Hotel, Apartamento, Finca, Día de Sol): ");
                        tipoAlojamiento = scanner.nextLine();
                    }

                    if (!tipoAlojamiento.equalsIgnoreCase("Día de Sol")) {
                        int diaInicio =0 ;
                        while (diaInicio > 31 || diaInicio < 1) {
                            System.out.print("Ingrese el día de inicio del hospedaje (1-31): ");
                            diaInicio = scanner.nextInt();
                        }

                        int diaFin = 0;
                        while (diaFin > 31 || diaFin < 1 || diaFin <= diaInicio) {
                            System.out.print("Ingrese el día de finalización del hospedaje (1-31): ");
                            diaFin = scanner.nextInt();
                        }

                        int adultos = 0;
                        while (adultos < 1 || adultos > 20) {
                            System.out.print("Ingrese la cantidad de adultos (1-20): ");
                            adultos = scanner.nextInt();
                        }

                        int menores=-1;
                        while (menores < 0 || menores > 10) {
                            System.out.print("Ingrese la cantidad de niños (0-10): ");
                            menores = scanner.nextInt();
                        }
                        int cantidadHabitaciones = 0;
                        while (cantidadHabitaciones < 1 || cantidadHabitaciones > 5) {
                            System.out.print("Ingrese la cantidad de habitaciones (1-5): ");
                            cantidadHabitaciones = scanner.nextInt();
                        }

                        buscarHoteles(ciudad,disponibilidadHoteles, tipoAlojamiento, diaInicio, diaFin, adultos, menores, cantidadHabitaciones);
                    }
                    else if (tipoAlojamiento.equalsIgnoreCase("Día de Sol")) {
                        int diaInicio =0 ;
                        while (diaInicio > 31 || diaInicio < 1) {
                            System.out.print("Ingrese el día (1-31): ");
                            diaInicio = scanner.nextInt();
                        }

                        int diaFin = diaInicio;

                        int adultos = 0;
                        while (adultos < 1 || adultos > 20) {
                            System.out.print("Ingrese la cantidad de adultos: ");
                            adultos = scanner.nextInt();
                        }

                        int menores = -1;
                        while (menores < 0 || menores > 10) {
                            System.out.print("Ingrese la cantidad de niños: ");
                            menores = scanner.nextInt();
                        }

                        int cantidadHabitaciones = 1;
                        buscarHoteles(ciudad, disponibilidadHoteles, tipoAlojamiento, diaInicio, diaFin, adultos, menores, cantidadHabitaciones);
                    }
                    else {
                        System.out.println("Opción no válida.");
                        break;
                    }
                    scanner.nextLine(); // Limpiar el buffer

                    break;
                case 2:
                    System.out.println("\n--- Buscar Habitaciones ---");
                    System.out.print("Ingrese el Hotel: ");
                    String hotel = scanner.nextLine();

                    int diaInicio = 0;
                    while (diaInicio > 31 || diaInicio < 1) {
                        System.out.print("Ingrese el día de inicio del hospedaje (1-31): ");
                        diaInicio = scanner.nextInt();
                    }

                    int diaFin = 0;
                    while (diaFin > 31 || diaFin < 1) {
                        System.out.print("Ingrese el día de finalización del hospedaje (1-31): ");
                        diaFin = scanner.nextInt();
                    }

                    int adultos = 0;
                    while (adultos < 1 || adultos > 20) {
                        System.out.print("Ingrese la cantidad de adultos (1-20): ");
                        adultos = scanner.nextInt();
                    }

                    int menores = -1;
                    while (menores < 0 || menores > 10) {
                        System.out.print("Ingrese la cantidad de niños (0-10): ");
                        menores = scanner.nextInt();
                    }

                    int cantidadHabitaciones = 0;
                    while (cantidadHabitaciones < 1 || cantidadHabitaciones > 5) {
                        System.out.print("Ingrese la cantidad de habitaciones (1-5): ");
                        cantidadHabitaciones = scanner.nextInt();
                    }

                    confirmarHabitaciones(hotel, diaInicio, diaFin, adultos, menores, cantidadHabitaciones, disponibilidadHoteles);
                    break;
                case 3:
                    System.out.println("\n--- Reservar Habitaciones ---");
                    System.out.print("Ingrese el Hotel: ");
                    String nombreHotel = scanner.nextLine();

                    System.out.print("Ingrese el Tipo de Habitación: ");
                    String tipoHabitacion = scanner.nextLine();

                    System.out.print("Ingrese el día de inicio del hospedaje: ");
                    int diaInici = scanner.nextInt();

                    System.out.print("Ingrese el día de finalización del hospedaje: ");
                    int diaFi = scanner.nextInt();

                    System.out.print("Ingrese la cantidad de habitaciones: ");
                    int cantidadHabitacion = scanner.nextInt();
                    scanner.nextLine(); // Consumir el salto de línea pendiente

                    System.out.print("Ingrese su Nombre: ");
                    String nombre = scanner.nextLine();

                    System.out.print("Ingrese su Apellido: ");
                    String apellido = scanner.nextLine();

                    System.out.print("Ingrese su Email: ");
                    String email = scanner.nextLine();

                    System.out.print("Ingrese su Nacionalidad: ");
                    String nacionalidad = scanner.nextLine();

                    System.out.print("Ingrese su Número de Teléfono: ");
                    String telefono = scanner.nextLine();

                    System.out.print("Ingrese la Hora Aproximada de Llegada (HH:MM): ");
                    String horaLlegada = scanner.nextLine();

                    // Llamar al método realizarReserva con los datos ingresados
                    realizarReserva(
                            nombreHotel,
                            tipoHabitacion,
                            diaInici,
                            diaFi,
                            cantidadHabitacion,
                            nombre,
                            apellido,
                            email,
                            nacionalidad,
                            telefono,
                            horaLlegada,
                            disponibilidadHoteles

                    );

                    break;

//                case 4:
//                    cambiarReserva(scanner, disponibilidadHoteles, instalaciones);
//                    break;
                case 5:
                    System.out.println("¡Gracias por usar la aplicación!");
                    return;
                default:
                    System.out.println("Opción no válida.");
            }
        }
    }

    public static void buscarHoteles(
            String ciudad,
            boolean[][][][] disponibilidadHoteles,
            String tipoAlojamiento,
            int diaInicio,
            int diaFin,
            int adultos,
            int menores,
            int cantidadHabitaciones
    ) {
        System.out.println("\nHoteles disponibles:");
        boolean encontrado = false;

        for (int i = 0; i < instalaciones.length; i++) {
            // Verifica si la ciudad y el tipo de alojamiento coinciden
            if (instalaciones[i][0][1].equalsIgnoreCase(ciudad) &&
                    instalaciones[i][0][2].equalsIgnoreCase(tipoAlojamiento)) {

                for (int j = 0; j < disponibilidadHoteles[i].length; j++) {
                    // Verifica si la capacidad y las fechas coinciden
                    int capacidadAdultos = Integer.parseInt(instalaciones[i][j + 1][3]);
                    int capacidadMenores = Integer.parseInt(instalaciones[i][j + 1][4]);

                    if (capacidadAdultos >= adultos && capacidadMenores >= menores) {
                        int habitacionesDisponibles = 0;

                        // Verificar disponibilidad para todas las habitaciones de este tipo
                        for (int k = 0; k < disponibilidadHoteles[i][j].length; k++) {
                            boolean disponible = true;

                            // Revisa la disponibilidad para el rango de fechas
                            for (int d = diaInicio - 1; d < diaFin; d++) {
                                if (disponibilidadHoteles[i][j][k][d]) {
                                    disponible = false;
                                    break;
                                }
                            }

                            if (disponible) {
                                habitacionesDisponibles++;
                                if (habitacionesDisponibles >= cantidadHabitaciones) {
                                    break;
                                }
                            }
                        }

                        // Si hay suficientes habitaciones disponibles, muestra el hotel
                        if (habitacionesDisponibles >= cantidadHabitaciones) {
                            encontrado = true;

                            // Cálculo del precio base
                            double precioPorHabitacion = Double.parseDouble(instalaciones[i][j + 1][1]);
                            double precioTotalBase = precioPorHabitacion * cantidadHabitaciones * (diaFin - diaInicio );

                            // Aplicar reglas de precio
                            double precioTotalAjustado = precioTotalBase;

                            // Regla 1: Últimos 5 días del mes (aumento del 15%)
                            if (diaFin >= 26 && diaFin <= 31) {
                                precioTotalAjustado *= 1.15;
                            }

                            // Regla 2: Del 10 al 15 del mes (aumento del 10%)
                            if ((diaInicio >= 10 && diaInicio <= 15) || (diaFin >= 10 && diaFin <= 15)) {
                                precioTotalAjustado *= 1.10;
                            }

                            // Regla 3: Del 5 al 10 del mes (descuento del 8%)
                            if ((diaInicio >= 5 && diaInicio <= 10) || (diaFin >= 5 && diaFin <= 10)) {
                                precioTotalAjustado *= 0.92;
                            }

                            System.out.println("- " + instalaciones[i][0][0] + " (" + instalaciones[i][0][3] + " estrellas)");
                            System.out.println("  Tipo (más económico): " + instalaciones[i][j + 1][0] + " - Precio base: $" + precioPorHabitacion);
                            System.out.println("  Descripción: " + instalaciones[i][j + 1][2]);
                            System.out.println("  Capacidad: " + capacidadAdultos + " adultos, " + capacidadMenores + " niños");
                            if (!tipoAlojamiento.equals("Día de Sol")) {
                                System.out.println("  Habitaciones disponibles: " + habitacionesDisponibles);
                                System.out.println("  Total noches: " + (diaFin - diaInicio ));
                            }
                            System.out.println("  Precio total base: $" + precioTotalBase);
                            System.out.println("  Precio total ajustado: $" + precioTotalAjustado);
                            break;
                        }
                    }
                }
            }
        }

        if (!encontrado) {
            System.out.println("No se encontraron hoteles que cumplan con los criterios.");
        }
    }

    public static void confirmarHabitaciones(
            String nombreHotel,
            int diaInicio,
            int diaFin,
            int adultos,
            int menores,
            int cantidadHabitaciones,
            boolean[][][][] disponibilidadHoteles
    ) {
        System.out.println("\nConfirmación de habitaciones en el hotel: " + nombreHotel);
        boolean encontrado = false;

        for (int i = 0; i < instalaciones.length; i++) {
            // Verifica si el nombre del hotel coincide
            if (instalaciones[i][0][0].equalsIgnoreCase(nombreHotel)) {
                encontrado = true;

                System.out.println("Fechas: del día " + diaInicio + " al día " + diaFin);
                System.out.println("Adultos: " + adultos + ", Niños: " + menores + ", Cantidad de habitaciones: " + cantidadHabitaciones);
                System.out.println("\nTipos de habitaciones disponibles:");

                for (int j = 0; j < disponibilidadHoteles[i].length; j++) {
                    int capacidadAdultos = Integer.parseInt(instalaciones[i][j + 1][3]);
                    int capacidadMenores = Integer.parseInt(instalaciones[i][j + 1][4]);

                    // Verifica si la capacidad de la habitación es adecuada
                    if (capacidadAdultos >= adultos && capacidadMenores >= menores) {
                        int habitacionesDisponibles = 0;

                        // Verificar disponibilidad para todas las habitaciones de este tipo
                        for (int k = 0; k < disponibilidadHoteles[i][j].length; k++) {
                            boolean disponible = true;

                            // Revisa la disponibilidad para el rango de fechas
                            for (int d = diaInicio - 1; d < diaFin; d++) {
                                if (disponibilidadHoteles[i][j][k][d]) {
                                    disponible = false;
                                    break;
                                }
                            }

                            if (disponible) {
                                habitacionesDisponibles++;
                                if (habitacionesDisponibles >= cantidadHabitaciones) {
                                    break;
                                }
                            }
                        }

                        // Si hay suficientes habitaciones disponibles, muestra las características y el precio
                        if (habitacionesDisponibles >= cantidadHabitaciones) {
                            System.out.println("- Tipo: " + instalaciones[i][j + 1][0]);
                            System.out.println("  Características: " + instalaciones[i][j + 1][2]);
                            System.out.println("  Precio por noche: $" + instalaciones[i][j + 1][1]);
                            System.out.println("  Habitaciones disponibles: " + habitacionesDisponibles);
                            System.out.println();
                        }
                    }
                }

                break;
            }
        }

        if (!encontrado) {
            System.out.println("No se encontró el hotel con el nombre especificado.");
        }
    }

    public static void realizarReserva(
            String nombreHotel,
            String tipoHabitacion,
            int diaInicio,
            int diaFin,
            int cantidadHabitaciones,
            String nombre,
            String apellido,
            String email,
            String nacionalidad,
            String telefono,
            String horaLlegada,
            boolean[][][][] disponibilidadHoteles
    ) {
        boolean hotelEncontrado = false;
        boolean habitacionReservada = false;

        // Buscar el hotel
        for (int i = 0; i < instalaciones.length; i++) {
            if (instalaciones[i][0][0].equalsIgnoreCase(nombreHotel)) {
                hotelEncontrado = true;

                // Buscar el tipo de habitación
                for (int j = 0; j < disponibilidadHoteles[i].length; j++) {
                    if (instalaciones[i][j + 1][0].equalsIgnoreCase(tipoHabitacion)) {
                        int habitacionesDisponibles = 0;

                        // Contar habitaciones disponibles
                        for (int k = 0; k < disponibilidadHoteles[i][j].length; k++) {
                            boolean disponible = true;

                            // Verificar disponibilidad para el rango de fechas
                            for (int d = diaInicio - 1; d < diaFin; d++) {
                                if (disponibilidadHoteles[i][j][k][d]) {
                                    disponible = false;
                                    break;
                                }
                            }

                            if (disponible) {
                                habitacionesDisponibles++;
                            }
                        }

                        // Si hay suficientes habitaciones disponibles, proceder a reservar
                        if (habitacionesDisponibles >= cantidadHabitaciones) {
                            int habitacionesReservadas = 0;

                            for (int k = 0; k < disponibilidadHoteles[i][j].length; k++) {
                                boolean disponible = true;

                                // Verificar disponibilidad para el rango de fechas
                                for (int d = diaInicio - 1; d < diaFin; d++) {
                                    if (disponibilidadHoteles[i][j][k][d]) {
                                        disponible = false;
                                        break;
                                    }
                                }

                                // Realizar la reserva para esta habitación
                                if (disponible) {
                                    for (int d = diaInicio - 1; d < diaFin; d++) {
                                        disponibilidadHoteles[i][j][k][d] = true;
                                    }
                                    habitacionesReservadas++;
                                    if (habitacionesReservadas >= cantidadHabitaciones) {
                                        break;
                                    }
                                }
                            }

                            habitacionReservada = true;

                            // Generar el registro de la reserva
                            System.out.println("\nReserva realizada:");
                            System.out.println("Nombre: " + nombre + " " + apellido);
                            System.out.println("Email: " + email);
                            System.out.println("Nacionalidad: " + nacionalidad);
                            System.out.println("Teléfono: " + telefono);
                            System.out.println("Hora aproximada de llegada: " + horaLlegada);
                            System.out.println("Hotel: " + nombreHotel);
                            System.out.println("Tipo de habitación: " + tipoHabitacion);
                            System.out.println("Fechas: del día " + diaInicio + " al día " + diaFin);
                            System.out.println("Cantidad de habitaciones reservadas: " + cantidadHabitaciones);
                            System.out.println("\nSe ha realizado la reserva con éxito!.");
                            break;
                        }
                    }
                }

                if (!habitacionReservada) {
                    System.out.println("No hay suficientes habitaciones disponibles del tipo " + tipoHabitacion + " para las fechas solicitadas.");
                }
                break;
            }
        }

        if (!hotelEncontrado) {
            System.out.println("No se encontró el hotel con el nombre especificado.");
        }
    }


    public static void cambiarReserva(Scanner scanner, boolean[][][][] disponibilidadHoteles,String[][] habitaciones) {
        System.out.println("\nCambiar reserva...");
        System.out.print("Ingrese el hotel (1-10): ");
        int hotel = scanner.nextInt() - 1;
        scanner.nextLine(); // Limpiar buffer
        System.out.print("Ingrese el tipo de habitación (Simple, Doble, Familiar, Suite, Deluxe): ");
        String tipoHabitacion = scanner.nextLine();
        System.out.print("Ingrese el día de inicio (1-31): ");
        int diaInicio = scanner.nextInt();
        System.out.print("Ingrese el día de fin (1-31): ");
        int diaFin = scanner.nextInt();
        System.out.print("Ingrese el mes (1-12): ");
        int mes = scanner.nextInt();

        // Validar tipo de habitación
        int tipoIndex = -1;
        for (int i = 0; i < habitaciones.length; i++) {
            if (habitaciones[i][0].equalsIgnoreCase(tipoHabitacion)) {
                tipoIndex = i;
                break;
            }
        }

        if (tipoIndex == -1) {
            System.out.println("Tipo de habitación no encontrado.");
            return;
        }

        // Verificar disponibilidad antes de cambiar la reserva
        boolean disponible = true;
        for (int dia = diaInicio; dia <= diaFin; dia++) {
            if (disponibilidadHoteles[hotel][tipoIndex][dia - 1][mes - 1]) {
                disponible = false;
                break;
            }
        }

        if (!disponible) {
            System.out.println("Lo sentimos, no hay disponibilidad para las fechas seleccionadas.");
            return;
        }

        // Actualizar disponibilidad
        for (int dia = diaInicio; dia <= diaFin; dia++) {
            disponibilidadHoteles[hotel][tipoIndex][dia - 1][mes - 1] = true; // Marcar como ocupado
        }
        }
}
