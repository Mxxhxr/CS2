public class Chair
{
    private int height;
    private double temperature;

    private final int MIN_HEIGHT = 1;
    private final double MINTEMP = 0;

    public void setHeight(int m)
    {
        if (m >= MIN_HEIGHT)
        {
            height = m;
        }
        else
        {
            height = MIN_HEIGHT;
        }
    }

    public int getHeight()
    {
        return height;
    }

    public void setTemp(double t)
    {
        if (t >= MINTEMP) 
        {
            temperature = t;
        }
        else
        {
            temperature = MINTEMP;
        }
    }

    public double getTemp()
    {
        return temperature;
    }

}