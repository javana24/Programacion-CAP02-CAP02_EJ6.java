public class CAP02_EJ6 {
    // Reset
    public static final String RESET = "\033[0m";  // Text Reset
 
    // Regular Colors
   // Códigos ANSI para colores de texto
public static final String NEGRO = "\u001B[30m";
public static final String ROJO = "\u001B[31m";
public static final String VERDE = "\u001B[32m";
public static final String AMARILLO = "\u001B[33m";
public static final String AZUL = "\u001B[34m";
public static final String PURPURA = "\u001B[35m";
public static final String BLANCO = "\u001B[37m";
    // Bold
    public static final String BLACK_BOLD = "\033[1;30m";  // BLACK
    public static final String RED_BOLD = "\033[1;31m";    // RED
    public static final String GREEN_BOLD = "\033[1;32m";  // GREEN
    public static final String YELLOW_BOLD = "\033[1;33m"; // YELLOW
    public static final String BLUE_BOLD = "\033[1;34m";   // BLUE
    public static final String PURPLE_BOLD = "\033[1;35m"; // PURPLE
    public static final String CYAN_BOLD = "\033[1;36m";   // CYAN
    public static final String WHITE_BOLD = "\033[1;37m";  // WHITE
 
    // Underline
    public static final String BLACK_UNDERLINED = "\033[4;30m";  // BLACK
    public static final String RED_UNDERLINED = "\033[4;31m";    // RED
    public static final String GREEN_UNDERLINED = "\033[4;32m";  // GREEN
    public static final String YELLOW_UNDERLINED = "\033[4;33m"; // YELLOW
    public static final String BLUE_UNDERLINED = "\033[4;34m";   // BLUE
    public static final String PURPLE_UNDERLINED = "\033[4;35m"; // PURPLE
    public static final String CYAN_UNDERLINED = "\033[4;36m";   // CYAN
    public static final String WHITE_UNDERLINED = "\033[4;37m";  // WHITE
 
 // Códigos ANSI para colores de fondo
public static final String FONDO_NEGRO = "\u001B[40m";
public static final String FONDO_ROJO = "\u001B[41m";
public static final String FONDO_VERDE = "\u001B[42m";
public static final String FONDO_AMARILLO = "\u001B[43m";
public static final String FONDO_AZUL = "\u001B[44m";
public static final String FONDO_PURPURA = "\u001B[45m";
public static final String FONDO_CYAN = "\u001B[46m";
public static final String FONDO_BLANCO = "\u001B[47m";
    // High Intensity
    public static final String BLACK_BRIGHT = "\033[0;90m";  // BLACK
    public static final String RED_BRIGHT = "\033[0;91m";    // RED
    public static final String GREEN_BRIGHT = "\033[0;92m";  // GREEN
    public static final String YELLOW_BRIGHT = "\033[0;93m"; // YELLOW
    public static final String BLUE_BRIGHT = "\033[0;94m";   // BLUE
    public static final String PURPLE_BRIGHT = "\033[0;95m"; // PURPLE
    public static final String CYAN_BRIGHT = "\033[0;96m";   // CYAN
    public static final String WHITE_BRIGHT = "\033[0;97m";  // WHITE
 
    // Bold High Intensity
    public static final String BLACK_BOLD_BRIGHT = "\033[1;90m"; // BLACK
    public static final String RED_BOLD_BRIGHT = "\033[1;91m";   // RED
    public static final String GREEN_BOLD_BRIGHT = "\033[1;92m"; // GREEN
    public static final String YELLOW_BOLD_BRIGHT = "\033[1;93m";// YELLOW
    public static final String BLUE_BOLD_BRIGHT = "\033[1;94m";  // BLUE
    public static final String PURPLE_BOLD_BRIGHT = "\033[1;95m";// PURPLE
    public static final String CYAN_BOLD_BRIGHT = "\033[1;96m";  // CYAN
    public static final String WHITE_BOLD_BRIGHT = "\033[1;97m"; // WHITE
 
    // High Intensity backgrounds
    public static final String BLACK_BACKGROUND_BRIGHT = "\033[0;100m";// BLACK
    public static final String RED_BACKGROUND_BRIGHT = "\033[0;101m";// RED
    public static final String GREEN_BACKGROUND_BRIGHT = "\033[0;102m";// GREEN
    public static final String YELLOW_BACKGROUND_BRIGHT = "\033[0;103m";// YELLOW
    public static final String BLUE_BACKGROUND_BRIGHT = "\033[0;104m";// BLUE
    public static final String PURPLE_BACKGROUND_BRIGHT = "\033[0;105m"; // PURPLE
    public static final String CYAN_BACKGROUND_BRIGHT = "\033[0;106m";  // CYAN
    public static final String WHITE_BACKGROUND_BRIGHT = "\033[0;107m";   // WHITE

    public static void main(String[] args) {
        System.out.println("                                "+ FONDO_ROJO+ "   "+ RESET+ " ");
        
        System.out.println("    "+ROJO+"APRENDE JAVA"+  "             "+ FONDO_ROJO+ "   "+ RESET+ " ");
        
        System.out.println("   "+ROJO+"CON EJERCICIOS"+"               "+ FONDO_ROJO+ "   "+ RESET+ " ");

        System.out.println("");

        System.out.println("   "+AMARILLO+"Luis Jose Sanchez"+"        "+ FONDO_AZUL+ "             "+ RESET+ " ");

        System.out.println("                            "+ FONDO_AZUL+ "        "+ RESET+ "   "+ FONDO_AZUL+ "  "+ RESET);
        
        System.out.println("                            "+ FONDO_AZUL+ "             "+ RESET+ " ");

        System.out.println("                            "+ FONDO_AZUL+ "        "+ RESET+ " ");

        System.out.println(FONDO_PURPURA+"                            "+ FONDO_AZUL+ "        "+ FONDO_PURPURA+"                         " +RESET);

        System.out.println( FONDO_PURPURA+"                                                             "  +RESET);
        System.out.println( FONDO_PURPURA+"                                                             "  +RESET);



    }

}


