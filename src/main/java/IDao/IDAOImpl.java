package IDao;

public class IDAOImpl  implements IDao{
    @Override
    public double getData() {
        System.out.println("Bonjour, voici les données dont vous avez demandé.");
        System.out.println("C'est la version base de données");
        int data = 52;
        System.out.println("La/Le/L' (si applicable) température/age/prix/heure/rating etc... est " + data);
        return data;
    }
}
