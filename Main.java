public class Main {
    public static void main(String[] args) {
        Thing rubiksCube = new Thing("Rubik's Cube", "multi-color", "cube");
        System.out.println(rubiksCube.getName());
        Thing duck = new Thing("Duck", "yellow", "large rubber duck");
        System.out.println(duck.getName());
        Thing hammer = new Thing("Hammer", "Brown", "like a hammer");
        System.out.println(hammer.getName());
        Thing aMysteriousUnnamedObject = new Thing("Unnamed", "all of the above", "all of the above");
        System.out.println(aMysteriousUnnamedObject.getName());
        Thing chair = new Thing("chair", "orange", "rounded");
        System.out.println(chair.getName());
        Thing dylan = new Thing("Dylan", "white", "human-shaped");
        System.out.println(dylan.getName());
        Thing golfClub = new Thing("Golf Club", "White", "ball");
        System.out.println(golfClub.getName());
        Thing human = new Thing("Bob", "orange", "square");
        System.out.println(human.getName());
        Thing wall = new Thing("wall", "white", "Long wall");
        System.out.println(wall.getName());
        Thing shovel = new Thing("Shovel", "Brown", "shovel-shaped");
        System.out.println(shovel.getName());
        Thing banana = new Thing("MONKEY FUEL", "yellow", "banana-shaped");
        System.out.println(banana.getName());
        Thing teemo = new Thing("Teemo", "Green, Brown", "Lil-Hooman shaped");
	    System.out.println(teemo.getName());
        Thing HYDROFLASK = new Thing("Hydroflask","peach", "Cylinder");
        System.out.println(HYDROFLASK.getName());
        
    }
}