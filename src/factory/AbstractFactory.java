package factory;

import aritmetica.Aritmetica;
import conversor.Conversor;

/**
 *
 * @author kevin
 */
public interface AbstractFactory {
    Aritmetica getAritmetica(String type);
    Conversor getConversor(String type);
    
}
