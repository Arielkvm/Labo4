package aritmetica;

import conversor.Conversor;
import factory.AbstractFactory;

/**
 *
 * @author kevin
 */
public class FactoryAritmetica implements AbstractFactory {
   @Override
    public Aritmetica getAritmetica(String type) {
        switch (type) {
            case "suma":
                return new Suma();
            case "resta":
                return new Resta();
            case "multiplicacion":
                return new Multiplicacion();
            case "division":
                return new Division();
        }
        return null;
    }
    
    @Override
    public Conversor getConversor(String type){
        return null;
    }
}
