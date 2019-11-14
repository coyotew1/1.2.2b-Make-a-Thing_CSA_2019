/**
 * Food
 */
public class Food extends Thing 
{
    private String flavor;
    private int calories;

    //Default Constructor
    public Food()
    {
        
    }

    public Food(String color, String name, String shape, String flavor, int calories)
    {
        super(name, color, shape);

        this.flavor = flavor;
        this.calories = calories;
    }

    //accessors
    public String getFlavor()
    {
        return this.flavor;
    }

    public int getCalories()
    {
        return this.calories;
    }

    //end accessors


    //mutators

    public void setFlavor(String flavor)
    {
        this.flavor = flavor;
    }

    public void setCalories(int calories)
    {
        this.calories = calories;
    }
}