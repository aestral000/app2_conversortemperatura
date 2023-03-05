package br.edu.ifsp.dmos5.model;

import br.edu.ifsp.dmos5.interfaces.ConversorTemperatura;

public class CelsiusStrategy implements ConversorTemperatura {

    private static CelsiusStrategy celsiusStrategy = null;
    private CelsiusStrategy(){
    }

    public static CelsiusStrategy getInstance(){
        if(celsiusStrategy == null){
           celsiusStrategy = new CelsiusStrategy();
        }
        return celsiusStrategy;
    }
    @Override
    public double getConversion(double temperature) throws RuntimeException{
        try {
            return (temperature - 32) / 1.8;
        }catch (RuntimeException ex){
            throw ex;
        }
    }
}
