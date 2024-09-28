package practicoPBA2024;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MiNetflix {

    // DEFINIMOS ARRAYS CON UN MAXIMO DE 100 ELEMENTOS
    public static Pelicula[] listaPeliculas = new Pelicula[100];
    private static Serie[] listaSeries = new Serie[100];

    private static int indicePeliculas = 0;
    private static int indiceSeries = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean salir = false;

        // PANTALLA DE BIENVENIDA A LA APLICACION
        bienvenido(scanner);
        // ACCESO AL MENU PRINCIPAL
        while (!salir) {

            mostrarMenuPrincipal();
            System.out.print("Ingrese la opcion: ");

            int opcion = pedirInt(scanner, "Ingrese un entero válido, acorde a su elección del menú principal.");
            System.out.println("");
            switch (opcion) {
                case 1:
                    registrarPelicula(scanner);
                    mensaje(scanner);
                    break;
                case 2:
                    registrarSerie(scanner);
                    mensaje(scanner);
                    break;
                case 3:
                    registrarCapitulo(scanner);
                    mensaje(scanner);
                    break;
                case 4:
                    actualizarPelicula(scanner);
                    mensaje(scanner);
                    break;
                case 5:
                    actualizarSerie(scanner);
                    mensaje(scanner);
                    break;
                case 6:
                    actualizarCapitulo(scanner);
                    mensaje(scanner);
                    break;
                case 7:
                    listados(scanner);
                    break;
                case 9:
                    salir = true;
                    salida();
                    break;
                default:
                    System.out.println("ERROR: usted no ha seleccionado una opcion disponible.");
                    scanner.nextLine(); // Esperar a que el usuario presione enter
                    mensaje(scanner);
                    System.out.println("");
            }
        }
        scanner.close();
    }

    private static void mostrarMenuPrincipal() {
        System.out.println("    ");
        System.out.println("    ********************************************************************************************");
        System.out.println("    ********************************************************************************************");
        System.out.println("");
        System.out.println("         {____                      {__          {__       {__                                   ");
        System.out.println("       {__    {__          {_       {__          {_ {__   {___                      {_           ");
        System.out.println("     {__       {__{__  {__      {___{__  {__     {__ {__ { {__   {__    {__     {__      {__     ");
        System.out.println("     {__       {__{__  {__{__ {__   {__ {__      {__  {__  {__ {__  {__  {__   {__ {__ {_   {__  ");
        System.out.println("     {__       {__{__  {__{__{__    {_{__        {__   {_  {__{__    {__  {__ {__  {__{_____ {__ ");
        System.out.println("       {__ {_ {__ {__  {__{__ {__   {__ {__      {__       {__ {__  {__    {_{__   {__{_         ");
        System.out.println("         {__ __     {__{__{__   {___{__  {__     {__       {__   {__        {__    {__  {____    ");
        System.out.println("              {_                                                                                 ");
        System.out.println("");
        System.out.println("    ********************************************************************************************");
        System.out.println("    ********************************************************************************************");
        System.out.println("    *                                                                                          *");
        System.out.println("    *       1.- Registrar Pelicula                                                             *");
        System.out.println("    *       2.- Registrar Serie                                                                *");
        System.out.println("    *       3.- Registrar Capitulo                                                             *");
        System.out.println("    *       4.- Actualizar Pelicula                                                            *");
        System.out.println("    *       5.- Actualizar Serie                                                               *");
        System.out.println("    *       6.- Actualizar Capitulo                                                            *");
        System.out.println("    *       7.- Listados                                                                       *");
        System.out.println("    *       9.- Salir                                                                          *");
        System.out.println("    *                                                                                          *");
        System.out.println("    ********************************************************************************************");
        System.out.println("");
    }

    // SUB-MENU LISTADOS
    private static void listados(Scanner scanner) {
        System.out.println("                                        ------     -----");
        System.out.println("                                    -----------------------");
        System.out.println("                                --------     ------       -------");
        System.out.println("                            ----------- L I S T A D O S ------------");
        System.out.println("                          --------------------------------------------");
        System.out.println("                          -                                          -");
        System.out.println("                          -    1. Listar peliculas y series vistas   -");
        System.out.println("                          -    2. Videos pendientes                  -");
        System.out.println("                          -    3. Mis favoritos                      -");
        System.out.println("                          -    4. Serie con mas capitulos            -");
        System.out.println("                          -    5. Pelicula mas corta                 -");
        System.out.println("                          -    6. Volver al menu principal           -");
        System.out.println("                          -                                          -");
        System.out.println("                           ------------------------------------------");
        System.out.println("                            -------------      -----      ---------");
        System.out.println("                                 ------------------------------");
        System.out.println("                                       -------     ------");
        System.out.println("");
        System.out.print("Seleccione una opcion: ");
        int opcion = pedirInt(scanner, "Ingrese un número entero del 1 al 6");

        switch (opcion) {
            case 1:
                System.out.println("");
                listarPeliculasVistas();
                System.out.println("");
                System.out.println("");
                listarSeriesVistas();
                mensaje(scanner);
                scanner.nextLine(); // Esperar a que el usuario presione enter
                listados(scanner);
                break;
            case 2:
                System.out.println("");
                videosPendientes(scanner);
                System.out.println("");
                mensaje(scanner);
                scanner.nextLine(); // Esperar a que el usuario presione enter
                listados(scanner);
                break;
            case 3:
                System.out.println("");
                misFavoritos(scanner);
                System.out.println("");
                mensaje(scanner);
                scanner.nextLine(); // Esperar a que el usuario presione enter
                listados(scanner);
                break;
            case 4:
                System.out.println("");
                serieConMasCapitulos();
                System.out.println("");
                mensaje(scanner);
                scanner.nextLine(); // Esperar a que el usuario presione enter
                listados(scanner);
                break;
            case 5:
                System.out.println("");
                peliculaMasCorta();
                System.out.println("");
                mensaje(scanner);
                scanner.nextLine(); // Esperar a que el usuario presione enter
                listados(scanner);
                break;
            case 6:
                mostrarMenuPrincipal();
                break;
            default:
                System.out.println("");
                System.out.println("Opcion no valida.");
                mensaje(scanner);
                scanner.nextLine(); // Esperar a que el usuario presione enter
                System.out.println("");
                listados(scanner);
        }
    }

    // Métodos de registro y actualización
    /*   P E L I C U L A   */
    private static void registrarPelicula(Scanner scanner) {
        tituloRegistrar();
        if (indicePeliculas < listaPeliculas.length) {
            Pelicula pelicula = new Pelicula();

            System.out.print("Ingresa el titulo de la pelicula: ");
            scanner.nextLine(); // Consumir el salto de linea
            pelicula.setTitulo(scanner.nextLine());

            System.out.print("Ingrese el genero de la pelicula: ");
            pelicula.setGenero(scanner.nextLine());

            System.out.print("Ingrese el anio de la pelicula: ");
            pelicula.setAnio(pedirInt(scanner, "El anio es un numero, ej: 1992"));

            System.out.print("Ingrese la duracion en minutos de la pelicula: ");
            pelicula.setDuracion(pedirInt(scanner, "La duracion debe ser en minutos ejm: 120"));

            pelicula.setVisto(false);
            pelicula.setTiempoVisto(0);
            pelicula.setCalificacion(0);

            listaPeliculas[indicePeliculas++] = pelicula;
            System.out.println("");
            System.out.println("Se ha registrado correctamente el titulo de la pelicula: " + pelicula.getTitulo());
            scanner.nextLine(); // Consumir el salto de linea
        } else {
            System.out.println("No se pueden agregar mas peliculas.");
            mensaje(scanner);
        }

    }

    public static void actualizarPelicula(Scanner scanner) {

        tituloActualizar();

        System.out.println("                               ---------------------------------------");
        System.out.println("                               L I S T A     D E     P E L I C U L A S");
        System.out.println("                               ---------------------------------------");
        System.out.println("");

        boolean hayPeliculas = listarPeliculas();
        scanner.nextLine(); // Consumir el salto de linea

//       lista peliculas retorna true si hay alguna pelicula.
//        Por lo cual se aplica un condicional que verifique y retorne con el mensaje del metodo
//        listarPeliculas() en caso de retornar un valor falso.
        if (!hayPeliculas) {
            return;
        }

        System.out.print("Ingrese el numero de la pelicula que desea actualizar: ");

//       Se resta una unidad a la opcion ingresada, para que tenga coherencia con el arreglo que inicia en posicion 0.
        int posicionPeliculaEnLista = pedirInt(scanner, "Ingrese un número valido") - 1;

//        Validamos que la pelicula seleccionada exista en el array
        if (posicionPeliculaEnLista < 0 || posicionPeliculaEnLista >= listaPeliculas.length) {
            System.out.println("Numero invalido.");
            return;
        } else if (listaPeliculas[posicionPeliculaEnLista] == null) {
            System.out.println("El valor que ingreso no corresponde a una pelicula");
            return;
        }

        Pelicula peliculaSeleccionada = listaPeliculas[posicionPeliculaEnLista];
        boolean volverAtras = false;

        while (!volverAtras) {
            System.out.println("1. Marcar como vista");
            System.out.println("2. Puntuar película");
            System.out.println("3. Volver al menú principal");
            int opcion = pedirInt(scanner, "Ingrese un número entero del 1 al 3");
            System.out.println("");

            switch (opcion) {
                case 1:
                    mirarPelicula(peliculaSeleccionada, scanner);
                    break;
                case 2:
                    puntuarPelicula(peliculaSeleccionada, scanner);
                    break;
                case 3:
                    volverAtras = true;
                    break;
                default:
                    System.out.println("Seleccione una opción disponible.");
            }
        }
    }

    private static void puntuarPelicula(Pelicula pelicula, Scanner scanner) {
        int puntaje;
        do {
            System.out.println("Ingrese un puntaje del 1 al 10: ");
            puntaje = pedirInt(scanner, "ERROR: Ingrese un puntaje válido.");
        } while (puntaje < 1 || puntaje > 10);

        pelicula.setCalificacion(puntaje);
    }

    private static void mirarPelicula(Pelicula pelicula, Scanner scanner) {
        System.out.println("Duración de la película: " + pelicula.getDuracion());
        int minutosVistos = 0;
        while (minutosVistos <= 0 || minutosVistos > pelicula.getDuracion()) {
            System.out.println("Ingrese la cantidad de minutos vistos (de 1 a " + pelicula.getDuracion() + "): ");
            minutosVistos = pedirInt(scanner, "Ingrese un valor válido.");
        }
        pelicula.setTiempoVisto(minutosVistos);

        if (minutosVistos > 0 || minutosVistos <= pelicula.getDuracion()) {
            pelicula.setVisto(true);
        } else {
            pelicula.setVisto(false);
        }
    }

    private static boolean listarPeliculas() {

//        declaramos un boolean
        boolean hayPelicula = false;

        for (int i = 0; i < listaPeliculas.length; i++) {
            Pelicula pelicula = listaPeliculas[i];

            if (pelicula != null) {
                hayPelicula = true;
//                i+1 se define de esa manera para que el usuario pueda seleccionar la pelicula de manera intuitiva.
                System.out.println(i + 1 + ". " + pelicula.getTitulo());
            }
        }

        if (!hayPelicula) {
            System.out.println("La lista de peliculas esta vacia.");
            return false;
        }
        return true;
    }

    /*   S E R I E   */
    private static void registrarSerie(Scanner scanner) {

        tituloRegistrar();

        if (indiceSeries < listaSeries.length) {
            Serie nuevaSerie = new Serie();

            System.out.print("Ingrese el titulo de la serie: ");
            scanner.nextLine(); // Consumir el salto de linea
            nuevaSerie.setTitulo(scanner.nextLine());

            System.out.print("Ingrese el anio de lanzamiento de la serie: ");
            nuevaSerie.setAnio(pedirInt(scanner, "El anio es un numero, ej: 1992"));

            System.out.print("Ingrese el genero de la serie: ");
            scanner.nextLine(); // Consumir el salto de linea
            nuevaSerie.setGenero(scanner.nextLine());

            System.out.print("Ingrese la duracion promedio de los episodios (en minutos): ");
            nuevaSerie.setDuracion(pedirInt(scanner, "La duracion debe ser en minutos ejm: 120"));

            System.out.print("Ingrese la cantidad de temporadas que posee la serie: ");
            nuevaSerie.setTemporadas(pedirInt(scanner, "La cantidad de temporadas debe ser un numero entero: ejm: 2"));
            System.out.println("");

            nuevaSerie.setVisto(false);
            nuevaSerie.setTiempoVisto(0);
            nuevaSerie.setCalificacion(null);

            listaSeries[indiceSeries++] = nuevaSerie;
            System.out.println("Se ha registrado correctamente la serie: " + nuevaSerie.getTitulo());
            scanner.nextLine(); // Consumir el salto de linea
        } else {
            System.out.println("No se puede agregar mas series, la lista esta llena.");
        }

    }

    public static void actualizarSerie(Scanner scanner) {

        tituloActualizar();

        System.out.println("                                  ---------------------------------");
        System.out.println("                                  L I S T A     D E     S E R I E S");
        System.out.println("                                  ---------------------------------");
        System.out.println("");

        boolean haySeries = listarSeries();
        scanner.nextLine(); // Consumir el salto de linea

        if (haySeries) {
            System.out.println("Ingrese el numero de la serie que desea actualizar: ");


//        Al valor ingresado por el usuario se le resta uno, para que tenga coherencia con el primer valor del arreglo.
            int posicionSerieEnLista = pedirInt(scanner, "Ingrese un numero valido") - 1;
            if (posicionSerieEnLista < 0 || posicionSerieEnLista >= listaSeries.length) {
                System.out.println("Numero invalido.");
                return;
            } else if ( listaSeries[posicionSerieEnLista]==null) {
                System.out.println("La posision ingresada no coincide con un numero de serie");
                scanner.nextLine();
                return;
            }

            Serie serieSeleccionada = listaSeries[posicionSerieEnLista];

            boolean volverAtras = false;

            while (!volverAtras) {
                System.out.println("1. Agregar capítulo a la serie");
                System.out.println("2. Volver al menu principal");
                int opcion = pedirInt(scanner, "Ingrese un numero entero del 1 al 2");
                System.out.println("");

                switch (opcion) {
                    case 1:
                        registrarCapitulo(scanner);
                        break;
                    case 2:
                        volverAtras = true;
                        break;
                    default:
                        System.out.println("Seleccione una opcion disponible.");
                }
            }
        }

    }

    private static boolean listarSeries() {
        boolean haySeries = false;

        for (int i = 0; i < listaSeries.length; i++) {
            Serie serie = listaSeries[i];
            if (serie != null) {
                haySeries = true;
//                i+1 es para que la interfaz comience listando las series con el valor en 1.
//                luego se restara una unidad al valor ingresado por el usuario.
                System.out.println(i + 1 + ". " + serie.getTitulo());
            }
        }

        if (!haySeries) {
            System.out.println("La lista esta vacia...");
            return false;
        }
        return true;
    }

    /*   C A P I T U L O   */

    private static void registrarCapitulo(Scanner scanner) {
        boolean haySeries = false;

        tituloRegistrar();


        // verificamos que existan las series
        for (int i = 0; i < listaSeries.length; i++) {
            if (listaSeries[i] != null) {
                haySeries = true;
                break;
            }
        }

        if (!haySeries) {
            System.out.println("No hay series registradas.");
            scanner.nextLine(); // Consumir el salto de linea
            return;
        }
        System.out.println("                                  ---------------------------------");
        System.out.println("                                  L I S T A     D E     S E R I E S");
        System.out.println("                                  ---------------------------------");
        System.out.println("");
        listarSeries();
        System.out.println("");

        System.out.println("Ingrese el numero de la serie a la cual desea agregar un capitulo: ");

        int posicionSerieEnLista = pedirInt(scanner, "Ingrese un numero valido") - 1;

        if (posicionSerieEnLista < 0 || posicionSerieEnLista >= listaSeries.length || listaSeries[posicionSerieEnLista] == null) {
            System.out.println("Numero invalido.");
            scanner.nextLine(); // Consumir el salto de linea
            return;
        }

        Serie serieSeleccionada = listaSeries[posicionSerieEnLista];

        Capitulo nuevoCapitulo = new Capitulo();
        System.out.print("Ingrese el titulo del capitulo: ");
        scanner.nextLine(); // Consumir el salto de linea
        nuevoCapitulo.setTitulo(scanner.nextLine());

        System.out.print("Ingrese el anio de lanzamiento del capitulo: ");
        nuevoCapitulo.setAnio(pedirInt(scanner, "El anio es un numero entero, ej: 1992"));

        System.out.print("Ingrese el genero del capitulo: ");
        scanner.nextLine(); // Consumir el salto de línea
        nuevoCapitulo.setGenero(scanner.nextLine());

        System.out.print("Ingrese la duracion del capitulo (en minutos): ");
        nuevoCapitulo.setDuracion(pedirInt(scanner, "La duracion debe ser en minutos ejm: 120"));

        nuevoCapitulo.setVisto(false);
        nuevoCapitulo.setTiempoVisto(0);
        nuevoCapitulo.setCalificacion(null);

        serieSeleccionada.agregarCapitulo(nuevoCapitulo);

        System.out.println("");
        System.out.println("Se ha registrado correctamente el capitulo: " + nuevoCapitulo.getTitulo() + " en la serie: " + serieSeleccionada.getTitulo());
        scanner.nextLine(); // Consumir el salto de línea
    }

    public static void actualizarCapitulo(Scanner scanner) {
//Como un capitulo pertenece a una serie, dentro de este metodo se podra acceder al atributo boolean
//Visto de la serie a la que pertenece. En caso de al menos ser visto un capitulo, el valor es visto de la serie pasara a ser true.

        tituloActualizar();

        System.out.println("                            ---------------------------------------");
        System.out.println("                            L I S T A     D E     C A P I T U L O S");
        System.out.println("                            ---------------------------------------");
        System.out.println("");

        boolean haySerie = listarSeries();
        scanner.nextLine(); // Esperar a que el usuario presione enter

        if (!haySerie) {
            return;
        }

        System.out.println("Ingrese el numero de la serie que desea actualizar ");
        int posicionSerieEnLista = pedirInt(scanner, "Ingrese un número válido") - 1;

        if (posicionSerieEnLista < 0 || posicionSerieEnLista >= listaSeries.length) {
            System.out.println("Numero invalido.");
            return;
        }

//Esta serie va a ser pasada luego por marametro en el metodo mirarCapitulo, para poder actualizar el valor
//        visto a true.
        Serie serieSeleccionada = listaSeries[posicionSerieEnLista];

//Definimos una variable local para poder acceder a los capitulos especificos de la serie seleccionada.
        Capitulo[] capitulosDeSerie = serieSeleccionada.listaCapitulos;

        boolean hayCapitulo = false;
        System.out.println("");
        System.out.println("Estos son los capitulos de tu serie seleccionada: ");
        for (int i = 0; i < capitulosDeSerie.length; i++) {
            Capitulo capitulo = capitulosDeSerie[i];
            if (capitulo != null) {
                hayCapitulo = true;
                System.out.println(i + 1 + ". " + capitulo.getTitulo());
            }
        }

        if (!hayCapitulo) {
            System.out.println("No hay capitulos agregados");
            scanner.nextLine();
            return;
        }

        System.out.println("Ingrese el numero del capitulo que desea actualizar: ");

        int posicionCapituloEnLista = pedirInt(scanner, "Ingrese un número válido") - 1;

        if (posicionCapituloEnLista < 0 || posicionCapituloEnLista >= capitulosDeSerie.length) {
            System.out.println("Número inválido.");
            return;
        }

        Capitulo capituloSeleccionado = serieSeleccionada.listaCapitulos[posicionCapituloEnLista];

        boolean volverAtras = false;

        while (!volverAtras) {
            System.out.println("1. Marcar como visto");
            System.out.println("2. Puntuar capitulo");
            System.out.println("3. Volver al menu principal");
            int opcion = pedirInt(scanner, "Ingrese un numero entero del 1 al 3");
            System.out.println("");

            switch (opcion) {
                case 1:
                    mirarCapitulo(serieSeleccionada, capituloSeleccionado, scanner);
                    break;
                case 2:
                    puntuarCapitulo(capituloSeleccionado, scanner);
                    break;
                case 3:
                    volverAtras = true;
                    break;
                default:
                    System.out.println("Seleccione una opcion disponible.");
            }
        }
    }

    private static void puntuarCapitulo(Capitulo capitulo, Scanner scanner) {
        int puntaje;
        do {
            System.out.println("Ingrese un puntaje del 1 al 10: ");
            puntaje = pedirInt(scanner, "Ingrese un puntaje valido");
        } while (puntaje < 1 || puntaje > 10);

        capitulo.setCalificacion(puntaje);
    }

    private static void mirarCapitulo(Serie serie, Capitulo capitulo, Scanner scanner) {

        System.out.println("Duracion del capitulo: " + capitulo.getDuracion());
        int minutosVistos = 0;
        while (minutosVistos <= 0 || minutosVistos > capitulo.getDuracion()) {
            System.out.println("Ingrese la cantidad de minutos vistos (de 1 a " + capitulo.getDuracion() + "): ");
            minutosVistos = pedirInt(scanner, "Ingrese un valor valido");
        }
        capitulo.setTiempoVisto(minutosVistos);

        if (minutosVistos > 0 || minutosVistos <= capitulo.getDuracion()) {
//            Si el capitulo fue visto
            capitulo.setVisto(true);
//            Se setea la serie a la que pertenece como vista
            serie.setVisto(true);
        } else {
            capitulo.setVisto(false);
        }
    }

    // Métodos de listado
    private static void listarPeliculasVistas() {
        int vioUna = 0;

        encabezadoQuickMovie();
        System.out.println("                                    P E L I C U L A S    V I S T A S");
        System.out.println("      -------------------------------------------------------------------------------------------");
        System.out.println("");
        for (int i = 0; i < listaPeliculas.length; i++) {
            Pelicula pelicula = listaPeliculas[i];

            if (pelicula != null && pelicula.isVisto()) {
                System.out.println("      " + pelicula.getTitulo() + " | " + pelicula.getAnio() + " | " + pelicula.getDuracion() + " min." + " | " + pelicula.getGenero());
                System.out.println("");
                vioUna++;
            }
        }

        if (vioUna == 0) {
            System.out.println("      NO HAY PELICULAS VISTAS...");
        }
    }

    private static void listarSeriesVistas() {
        int vioUna = 0;
        System.out.println("      -------------------------------------------------------------------------------------------");
        System.out.println("                                       S E R I E S    V I S T A S");
        System.out.println("      -------------------------------------------------------------------------------------------");
        System.out.println("");

        for (int i = 0; i < listaSeries.length; i++) {
            Serie serie = listaSeries[i];

            if (serie != null && serie.isVisto()) {
                System.out.println("      " + serie.getTitulo() + " | " + serie.getTemporadas() + " temporadas | Estreno: " + serie.getAnio());
                System.out.println("");
                vioUna++;
            }
        }

        if (vioUna == 0) {
            System.out.println("      NO HAY SERIES VISTAS...");
            System.out.println("");
            System.out.println("");
        }
    }

    private static void videosPendientes(Scanner scanner) {
        boolean hayPeliculas = false;

        encabezadoQuickMovie();
        System.out.println("                                 V I D E O S    N O    T E R M I N A D O S");
        System.out.println("      -------------------------------------------------------------------------------------------");
        System.out.println("");
        System.out.println("      P E L I C U L A S:");
        System.out.println("");

        for (int i = 0; i < listaPeliculas.length; i++) {
            if (listaPeliculas[i] != null) {
                hayPeliculas = true;
                Pelicula pelicula = listaPeliculas[i];
                if (pelicula.isVisto() && pelicula.getTiempoVisto() < pelicula.getDuracion()) {
                    System.out.println("      Haz visto " + pelicula.getTitulo() + " por " + pelicula.getTiempoVisto() + " minutos, la duracion total es de " + pelicula.getDuracion());
                    System.out.println("");
                }
                break;
            }
        }

        if (!hayPeliculas) {
            System.out.println("      No hay Peliculas registradas.");
        }

//        Series que restan por ver
        boolean haySeries = false;
        boolean hayCapitulos = false;

        System.out.println("");
        System.out.println("      -------------------------------------------------------------------------------------------");
        System.out.println("      C A P I T U L O S:");
        System.out.println("");

        for (int i = 0; i < listaSeries.length; i++) {
            if (listaSeries[i] != null) {
                haySeries = true;

                Serie serie = listaSeries[i];

                for (int j = 0; j < listaSeries[i].listaCapitulos.length; j++) {

                    Capitulo capitulo = listaSeries[i].listaCapitulos[j];

                    if (capitulo!= null && capitulo.isVisto() && capitulo.getTiempoVisto() < capitulo.getDuracion()) {
                        System.out.println("      Haz visto " + capitulo.getTitulo() + " de la serie " + serie.getTitulo() + " por " + capitulo.getTiempoVisto() + " minutos, la duracion total es de " + capitulo.getDuracion());
                        System.out.println("");
                        hayCapitulos=true;
                    }
                    break;
                }
            }
        }

        if (!haySeries) {
            System.out.println("      No hay Series aun.");
        } else if (!hayCapitulos) {
            System.out.println("      No hay capitulos aun.");
        }

    }

    private static void misFavoritos(Scanner scanner) {
        encabezadoQuickMovie();
        System.out.println("                                       M I S   F A V O R I T O S");
        System.out.println("      -------------------------------------------------------------------------------------------");
        System.out.println("");

        // Lista de películas favoritas
        System.out.println("");
        System.out.println("      P E L I C U L A S:");
        System.out.println("");
        boolean hayPeliculasFavoritas = false;
        for (int i = 0; i < listaPeliculas.length; i++) {
            Pelicula pelicula = listaPeliculas[i];

            if (pelicula != null && pelicula.getCalificacion() >= 8) {
                System.out.println("      " + pelicula.getTitulo() + " | " + pelicula.getCalificacion() + " estrellas.");
                hayPeliculasFavoritas = true;
            }
        }
        if (!hayPeliculasFavoritas) {
            System.out.println("      No hay peliculas favoritas registradas...");
            System.out.println("");
        }

        // Lista de capítulos favoritos
        System.out.println("      -------------------------------------------------------------------------------------------");
        System.out.println("      C A P I T U L O S:");
        System.out.println("");

        boolean hayCapitulosFavoritos = false;

        for (int i = 0; i < listaSeries.length; i++) {
            Serie serie = listaSeries[i];

            if (serie != null) {
                for (int j = 0; j < serie.listaCapitulos.length; j++) {
                    Capitulo capitulo = serie.listaCapitulos[j];
                    if (capitulo != null && capitulo.getCalificacion() != null && capitulo.getCalificacion() >= 8) {
                        System.out.println("      "+serie.getTitulo() +" | " +capitulo.getTitulo() + " | " + capitulo.getCalificacion() + " estrellas.");
                        hayCapitulosFavoritos = true;
                    }
                }
            }
        }
        if (!hayCapitulosFavoritos) {
            System.out.println("      No hay capitulos favoritos registrados...");
            System.out.println("");
            System.out.println("");
        }
    }

    private static void serieConMasCapitulos() {

        encabezadoQuickMovie();
        System.out.println("                              S E R I E    C O N    M A S    C A P I T U L O S");
        System.out.println("      -------------------------------------------------------------------------------------------");
        System.out.println("");
        Serie serieConMasCapitulos = null;
        int maxCapitulos = 0;

        for (int i = 0; i < listaSeries.length; i++) {
            Serie serie = listaSeries[i];

            if (serie != null && serie.listaCapitulos != null) {
                int numeroCapitulos = 0;

                // Contar solo los valores del arreglo lista capitulos, que no sean nulos
                for (int j = 0; j < serie.listaCapitulos.length; j++) {
                    if (serie.listaCapitulos[j] != null) {
                        numeroCapitulos++;
                    }
                }

                if (numeroCapitulos > maxCapitulos) {
                    maxCapitulos = numeroCapitulos;
                    serieConMasCapitulos = serie;
                }
            }
        }

        if (serieConMasCapitulos != null) {
            System.out.println("      Esta es la serie con mas capitulos: " + serieConMasCapitulos.getTitulo() + " con " + maxCapitulos + " capitulos.");
            System.out.println("");
        } else {
            System.out.println("      No se registraron series con capitulos aun...");
            System.out.println("");
        }
    }

    private static void peliculaMasCorta() {

        Pelicula peliculaMasCorta = null;
//        Se declara una variable local con un valor maximo, para que la primera pelicula tome
//        el valor minimo y luego empezar a comparar.

        encabezadoQuickMovie();
        System.out.println("                              P E L I C U L A    M A S    C O R T A");
        System.out.println("      -------------------------------------------------------------------------------------------");
        System.out.println("");
        
        int duracionMinima = Integer.MAX_VALUE;

        for (int i = 0; i < listaPeliculas.length; i++) {

            Pelicula pelicula = listaPeliculas[i];

            if (pelicula != null && pelicula.getDuracion() < duracionMinima) {
                duracionMinima = pelicula.getDuracion();
                peliculaMasCorta = pelicula;
            }
        }

        if (peliculaMasCorta != null) {
            System.out.println("      Pelicula mas corta: " + peliculaMasCorta.getTitulo() + " con " + duracionMinima + " minutos.");
            System.out.println("");
        } else {
            System.out.println("      No se registro ninguna pelicula.");
            System.out.println("");
        }
    }

    // Métodos auxiliares
    private static void mensaje(Scanner scanner) {
        System.out.print("Presione ENTER para continuar... ");
        scanner.nextLine(); // Esperar a que el usuario presione enter
    }

    private static int pedirInt(Scanner scanner, String mensajeError) {
        int numero = -1;
        boolean valido = false;
        while (!valido) {
            try {
                numero = scanner.nextInt();
                valido = true;
            } catch (InputMismatchException e) {
                System.out.println(mensajeError);
                scanner.nextLine();
            }
        }
        return numero;
    }

    private static void bienvenido(Scanner scanner) {
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println(" ______     __  __     __     ______     __  __        __    __     ______     __   __   __     ______    \n"
                + "/\\  __ \\   /\\ \\/\\ \\   /\\ \\   /\\  ___\\   /\\ \\/ /       /\\ \"-./  \\   /\\  __ \\   /\\ \\ / /  /\\ \\   /\\  ___\\   \n"
                + "\\ \\ \\/\\_\\  \\ \\ \\_\\ \\  \\ \\ \\  \\ \\ \\____  \\ \\  _\"-.     \\ \\ \\-./\\ \\  \\ \\ \\/\\ \\  \\ \\ \\'/   \\ \\ \\  \\ \\  __\\   \n"
                + " \\ \\___\\_\\  \\ \\_____\\  \\ \\_\\  \\ \\_____\\  \\ \\_\\ \\_\\     \\ \\_\\ \\ \\_\\  \\ \\_____\\  \\ \\__|    \\ \\_\\  \\ \\_____\\ \n"
                + "  \\/___/_/   \\/_____/   \\/_/   \\/_____/   \\/_/\\/_/      \\/_/  \\/_/   \\/_____/   \\/_/      \\/_/   \\/_____/ \n"
                + "                                                                                                          ");
        System.out.println("");
        System.out.println("            Desarrollado por: Mauro Rosales, Antonela Marisol Colque, Federico Steinaker");
        System.out.println("");
        System.out.println("                        Programacion Basica - TUTI - UTN FR Santa Fe - 2024");
        System.out.println("                                 Grupo: 31 - Trabajo Practico Nro. 1");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        mensaje(scanner);
        System.out.println("");
        System.out.println("");
        System.out.println("");
    }

    ;
        
        private static void tituloRegistrar() {
        System.out.println(
                "                ___             __ _     _              _                             \n"
                + "               | _ \\    ___    / _` |   (_)     ___    | |_      _ _   __ _      _ _  \n"
                + "               |   /   / -_)   \\__, |   | |    (_-<    |  _|    | '_| / _` |    | '_| \n"
                + "               |_|_\\   \\___|   |___/   _|_|_   /__/_   _\\__|   _|_|_  \\__,_|   _|_|_  \n"
                + "               _|\"\"\"\"\"|_|\"\"\"\"\"|_|\"\"\"\"\"|_|\"\"\"\"\"|_|\"\"\"\"\"|_|\"\"\"\"\"|_|\"\"\"\"\"|_|\"\"\"\"\"|_|\"\"\"\"\"| \n"
                + "               \"`-0-0-'\"`-0-0-'\"`-0-0-'\"`-0-0-'\"`-0-0-'\"`-0-0-'\"`-0-0-'\"`-0-0-'\"`-0-0-' \n"
                + "");
        System.out.println("");
    }

    ;
        
        private static void tituloActualizar() {
        System.out.println(
                "                  __    ___  ____  __  __    __    __    ____  ____    __    ____ \n"
                + "                 /__\\  / __)(_  _)(  )(  )  /__\\  (  )  (_  _)(_   )  /__\\  (  _ \\\n"
                + "                /(__)\\( (__   )(   )(__)(  /(__)\\  )(__  _)(_  / /_  /(__)\\  )   /\n"
                + "               (__)(__)\\___) (__) (______)(__)(__)(____)(____)(____)(__)(__)(_)\\_)");
        System.out.println("");
        System.out.println("");
    }

    ;
        
        private static void encabezadoQuickMovie() {
        System.out.println("");
        System.out.println("      -------------------------------------------------------------------------------------------");
        System.out.println("      -------------------------------------------------------------------------------------------\n"
                + "                        ____       _      _                           _      \n"
                + "                       /___ \\_   _(_) ___| | __  _ __ ___   _____   _(_) ___ \n"
                + "                      //  / / | | | |/ __| |/ / | '_ ` _ \\ / _ \\ \\ / / |/ _ \\\n"
                + "                     / \\_/ /| |_| | | (__|   <  | | | | | | (_) \\ V /| |  __/\n"
                + "                     \\___,_\\ \\__,_|_|\\___|_|\\_\\ |_| |_| |_|\\___/ \\_/ |_|\\___|\n"
                + "                                                                 \n"
                + ""
                + "      -------------------------------------------------------------------------------------------");
    }

    ;
        
      private static void salida() {
        System.out.println(
                "                                                                                          \n"
                + "                                                                                          \n"
                + "                   =###########        =###########+        ###########=                  \n"
                + "                   +@@@@@@@@@@@.       +@@@@@@@@@@@#       .@@@@@@@@@@@+                  \n"
                + "                   -@@@@@@@@@@@+       +@@@@@@@@@@@#       =@@@@@@@@@@@=                  \n"
                + "                   .@@@@@@@@@@@@.      +@@@@@@@@@@@#       %@@@@@@@@@@@:                  \n"
                + "                    #@@@@@@@@@@@%      +@@@@@@@@@@@#      #@@@@@@@@@@@@                   \n"
                + "                    :@@@@@@@@@@@@#.    +@@@@@@@@@@@#    .#@@@@@@@@@@@@=                   \n"
                + "                     +@@@@@@@@@@@@@=   +@@@@@@@@@@@#   -@@@@@@@@@@@@@#                    \n"
                + "                      #@@@@@@@@@@@@@@=.+@@@@@@@@@@@# =%@@@@@@@@@@@@@#                     \n"
                + "                       %@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@%                      \n"
                + "                        *@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@#.                      \n"
                + "                         :%@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@%-                        \n"
                + "                           +@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@+                          \n"
                + "                             =%@@@@@@@@@@@@@@@@@@@@@@@@@@@@@%=.                           \n"
                + "                   ............-#@@@@@@@@@@@@@@@@@@@@@@@@@#=............                  \n"
                + "                   #@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@#                  \n"
                + "                   #@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@#                  \n"
                + "                   #@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@#                  \n"
                + "                   #@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@#                  \n"
                + "                   #@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@#                  \n"
                + "                   #@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@#                  \n"
                + "                              .+#@@@@@@@@@@@@@@@@@@@@@@@@@%+.                             \n"
                + "                            :#@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@#-                           \n"
                + "                          :#@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@#:                         \n"
                + "                         =@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@*                        \n"
                + "                       .#@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@%:                      \n"
                + "                      :@@@@@@@@@@@@@@@#%@@@@@@@@@@@%#@@@@@@@@@@@@@@@:                     \n"
                + "                      %@@@@@@@@@@@@@#. +@@@@@@@@@@@# .+@@@@@@@@@@@@@@.                    \n"
                + "                     #@@@@@@@@@@@@#:   +@@@@@@@@@@@#   .#@@@@@@@@@@@@%                    \n"
                + "                    -@@@@@@@@@@@@*     +@@@@@@@@@@@#     +@@@@@@@@@@@@+                   \n"
                + "                    %@@@@@@@@@@@#      +@@@@@@@@@@@#      +@@@@@@@@@@@@                   \n"
                + "                   :@@@@@@@@@@@%       +@@@@@@@@@@@#       #@@@@@@@@@@@-                  \n"
                + "                   =@@@@@@@@@@@=       +@@@@@@@@@@@#       -@@@@@@@@@@@+                  \n"
                + "                   +@@@@@@@@@@@        +@@@@@@@@@@@#       .@@@@@@@@@@@+                  \n"
                + "                   :===========        :===========-        ===========:                  \n"
                + "                                                                                          \n"
                + "                         =@@@+   .@@@@ +@@@@@@@@@@@@ %@@@*    @@@@                        \n"
                + "                         =@@@+   .@@@@ -###%@@@@###* %@@@@%:  @@@@                        \n"
                + "                         =@@@+   .@@@@     -@@@#     %@@@@@@- @@@@                        \n"
                + "                         =@@@+   .@@@@     -@@@#     %@@@=@@@*@@@@                        \n"
                + "                         :@@@#   :@@@@     -@@@#     %@@@ .#@@@@@@                        \n"
                + "                          *@@@@#%@@@@-     -@@@#     %@@@   *@@@@@                        \n"
                + "                           .=+****+-       .+++=     =+++    :++++                        \n"
                + "                                                                                          ");
        System.out.println("");
        System.out.println("                          G R A C I A S   P O R   S U   T I E M P O");
        System.out.println("");
        System.out.println("");
    }
;

}
