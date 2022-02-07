
class cb9 {
    private String diet;
    String species;
    private String name;

    public cb9(String d, String s, String n) {
        diet = d;
        species = s;
        name = n;
    }

    public String toString() {
        return name + " the " + species + " is a " + diet;
    }
}
class herbivore extends cb9 {

    public herbivore(String s, String n) {
        super("hervibore", s, n);
    }
}
class Unit9Elephant extends herbivore {
    private double tuskLength;

    public Unit9Elephant(String n, double t) {
        super("elephant", n);
        tuskLength = t;
    }

    public String toString() {
        return super.toString() + " with tusks " + tuskLength + " meters long";
    }
}


