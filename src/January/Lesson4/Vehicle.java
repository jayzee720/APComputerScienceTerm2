package January.Lesson4;

/**
 * @author andrewrusso
 */
public class Vehicle
{
    private int location = 0;

    public Vehicle()
    {
        location = 0;
    }

    public Vehicle(int loc)
    {
        if (loc > 20)
            location = 20;
        else if (loc < -20)
            location = -20;
        else
            location = loc;
    }

    void forward()
    {
        if (location < 20)
            location = location + 1;
    }

    void backward()
    {
        if (location > -20)
            location = location - 1;
    }

    int getLocation()
    {
        return location;
    }

    @Override
    public String toString() //created by @GooseJS
    {
        String finalString = "";
        for (int i = -20; i < location; i++)
        {
            finalString = finalString.concat(" ");
        }

        return finalString.concat("@");
    }

}
