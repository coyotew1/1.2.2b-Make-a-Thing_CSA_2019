public class Main {
    public static void main(String[] args) {

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
        };

        for (int i = 0; i< things.length; i++) 
        {
            System.out.println(things[i]);
        }
        
    }
}