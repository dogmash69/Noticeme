public class Movies {
    public static void main(String[] args) {
        String[] movies = {
                "Les Aventuriers de l'Arche perdue ",
                "Indiana Jones et le Temple maudit", "Indiana Jones et la Dernière Croisade "};

        String[][] actors;
        actors = new String[][]{
                {"Harrison Ford", "River Phoenix", "Reynald El Martiniki"},
                {"Harrison Ford", "Demi-Lune", "Marion Corboule"},
                {"Harrison Ford", "Sean Connery", "Dylone Biroute"}
        };
        for (int i = 0; i < movies.length; i++) {
            System.out.println("Dans le film"  + movies[i] + " les acteurs principaux sont");
            for (int j = 0; j < actors.length; j++) {
                System.out.println(actors[i][j]);
            }
        }
    }
}
