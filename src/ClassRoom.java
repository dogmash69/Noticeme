public class ClassRoom {
    public static void main(String[] args) {

        Wilder rey = new Wilder("Reynald", true);
        Wilder marion = new Wilder("Marion", true);
        Wilder dylan = new Wilder("Dylan", false);
        Wilder romain = new Wilder("Romain ", false);
        Wilder arthur = new Wilder("Arthur", true);

        arthur.setName("Zorro");

        System.out.println(rey.whoAmI());
        System.out.println(marion.whoAmI());
        System.out.println(dylan.whoAmI());
        System.out.println(romain.whoAmI());
        System.out.println(arthur.whoAmI());
    }
}