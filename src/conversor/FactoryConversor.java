package conversor;

import aritmetica.Aritmetica;
import factory.AbstractFactory;

/**
 *
 * @author kevin
 */
public class FactoryConversor implements AbstractFactory{
    @Override
    public Aritmetica getAritmetica(String type){
        return null;
    }
    
    @Override
    public Conversor getConversor(String type){
        switch (type) {
            case "binario":
            return new Binario();
        }
        return null;
    }
}
