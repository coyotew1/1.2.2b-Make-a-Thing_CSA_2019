public class Main {
    public static void main(String[] args) {

        //creates a bunch of things for us to screw with
        Thing[] things = new Thing[]{
            new Thing("Rubik's Cube", "multi-color", "cube"),
            new Thing("Duck", "yellow", "large rubber duck"),
            new Thing("Hammer", "Brown", "like a hammer"),
            new Thing("Unnamed", "all of the above", "all of the above"),
            new Thing("chair", "orange", "rounded"),
            new Thing("Dylan", "white", "human-shaped"),
            new Thing("Golf Club", "White", "ball"),
            new Thing("Bob", "orange", "square"),
            new Thing("wall", "white", "Long wall"),
            new Thing("Shovel", "Brown", "shovel-shaped"),
            new Thing("MONKEY FUEL", "yellow", "banana-shaped"),
            new Thing("Teemo", "Green, Brown", "Lil-Hooman shaped"),
            new Thing("Hydroflask","peach", "Cylinder"),
            new Food("Ham and Cheese", "Tan", "Flattened rectangular prism", "cheesy and hammy", 200),
        };

        Thing[] schools = new Thing[] {
            new School("Purple and Gold", "Sentinel (AKA the best)", 1169, 4, 0.0),
            new School("Red and Gold", "Hellgate", 1203, 4, 0.0),
            new School("Blue and Gold", "Big Sky", 1138, 4, 0.0),
        };

        /*
        for (int i = 0; i< things.length; i++) 
        {
            System.out.println(things[i]);
        }
        */

        for (int i = 0; i<schools.length; i++) 
        {
            System.out.println("\n\n" + schools[i]);
        }

        /* fine 
        while (1==1)
        {
            System.out.println("\n" + "GOO SPARTANS!!");
        }
        */
    }
}