package aritmetica;

/**
 *
 * @author kevin
 */
public class Division implements Aritmetica{
    @Override
    public float operacion(int a,int b){
        float division = (float) a/b;
        return division;
    }
}
