package modelo;

/**
 *
 * @author Johnny
 */
public class Ruta {

    public static final String EQUIS = "/resourses/Equis.png";
    public static final String CIRCULO = "/resourses/Circulo.png";
    public static final String JUGADOREQUIS = "/resourses/JugadorEquis.png";
    public static final String JUGADORCIRCULO = "/resourses/JugadorCirculo.png";

    public static String LINEA1 = "/resourses/CirculoLinea1.png";
    public static String LINEA2 = "/resourses/CirculoLinea2.png";
    public static String LINEA3 = "/resourses/CirculoLinea3.png";
    public static String LINEA4 = "/resourses/CirculoLinea4.png";
    public static String LINEA5 = "/resourses/CirculoLinea5.png";
    public static String LINEA6 = "/resourses/CirculoLinea6.png";
    public static String LINEA7 = "/resourses/CirculoLinea7.png";
    public static String LINEA8 = "/resourses/CirculoLinea8.png";

    public static void cambiarRutas(TipoImagen tipoImagen) {
        if (tipoImagen == TipoImagen.CIRCULO) {
            LINEA1 = "/resourses/CirculoLinea1.png";
            LINEA2 = "/resourses/CirculoLinea2.png";
            LINEA3 = "/resourses/CirculoLinea3.png";
            LINEA4 = "/resourses/CirculoLinea4.png";
            LINEA5 = "/resourses/CirculoLinea5.png";
            LINEA6 = "/resourses/CirculoLinea6.png";
            LINEA7 = "/resourses/CirculoLinea7.png";
            LINEA8 = "/resourses/CirculoLinea8.png";
        }else if(tipoImagen == TipoImagen.EQUIS){
            LINEA1 = "/resourses/EquisLinea1.png";
            LINEA2 = "/resourses/EquisLinea2.png";
            LINEA3 = "/resourses/EquisLinea3.png";
            LINEA4 = "/resourses/EquisLinea4.png";
            LINEA5 = "/resourses/EquisLinea5.png";
            LINEA6 = "/resourses/EquisLinea6.png";
            LINEA7 = "/resourses/EquisLinea7.png";
            LINEA8 = "/resourses/EquisLinea8.png";
        }
    }

}
