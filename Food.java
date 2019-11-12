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
}