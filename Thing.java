public class Thing {
    // Fields or instance variables
    private String name;
    private String color;
    private String shape;

    // Constructor(s)
    public Thing() {
        this("", "", "");
    }

    public Thing(String name, String color, String shape) {
        this.name = name;
        this.color = color;
        this.shape = shape;
    }

    public Thing(String name, String color)
    {
        this.name;
        this.color;
    }

    // Method(s)
    // Getters (Accessors)
    public String getName(){
        return this.name;
    }

    public String getColor() {
        return this.color;
    }

    public String getShape() {
        return this.shape;
    }

    // Setters (Mutators)
    public void setName(String name) {
        this.name = name;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setShape(String shape) {
        this.shape = shape;
    }

    @Override
    public String toString() {
        return "Name: " + this.name + "  Color: " + this.color + "  Shape: " + this.shape + "\n";
    }

    @Override
    public boolean equals(Object o) 
    {
        if(this == o)
        {
            return true;
        }

        else if (o == null || this.getClass() != o.getClass())
        {
            return false;
        }

        Thing secondThing = (Thing) o;

        return this.name == secondThing.name &&
        this.shape == secondThing.shape &&
        this.color == secondThing.color;
    } 
}