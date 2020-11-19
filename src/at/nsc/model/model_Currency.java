package at.nsc.model;

/**Übung 8 - Model
 * @author Niklas Schachl
 * @version 1.0 , 19.11.2020
 */
public class model_Currency
{
    private String sign;
    private double value;

    public model_Currency(String sign, double value)
    {
        this.sign = sign;
        this.value = value;
    }

    public String getSign()
    {
        return sign;
    }

    public double getValue()
    {
        return value;
    }
}
