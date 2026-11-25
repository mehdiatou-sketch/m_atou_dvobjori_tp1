package IDao;

public class IDAOImplVe  implements IDao{
    @Override
    public double getData(){
        System.out.println("C'est la version web service qui ne fait rien");
        return 97;
    }
}
