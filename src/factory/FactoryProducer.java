package factory;

import aritmetica.FactoryAritmetica;
import conversor.FactoryConversor;

/**
 *
 * @author kevin
 */
public class FactoryProducer {
        public static AbstractFactory getFactory(String type){
        switch (type){
            case "aritmetica":
                return new FactoryAritmetica();
            case "conversor":
                return new FactoryConversor();
        }
        return null;
    }
}
