package at.nsc.model;

import java.util.ArrayList;

/**Übung 8 - Model
 * @author Niklas Schachl
 * @version 1.0 , 19.11.2020
 */
public class model_CurrencyConverter
{
    private ArrayList<model_Currency> list_Currencies = new ArrayList();

    public model_CurrencyConverter()
    {
        list_Currencies.add(new model_Currency("Yen", 124));
        list_Currencies.add(new model_Currency("Dollar", 1.1853));
        list_Currencies.add(new model_Currency("Schweizer Franken", 1.0802));
    }

    public String getCurrencies(int index)
    {
        return list_Currencies.get(index).getSign();
    }

    public double doConversion(double euro, String currency)
    {
        model_Currency currentCurrency = null;
        //Search for wanted currency
        for (int i = 0; i < list_Currencies.size(); i++)
        {
            if(list_Currencies.get(i).getSign().equals(currency))
            {
                currentCurrency = list_Currencies.get(i);
            }
        }

        return euro * currentCurrency.getValue();
    }
}
