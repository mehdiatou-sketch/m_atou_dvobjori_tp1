package Présentation;
import IDao.IDAOImpl;
import Métier.ImétierImpl;


public class Présentation {
    public static void main(String[] args) {
        IDAOImpl d = new IDAOImpl();
        ImétierImpl métier = new ImétierImpl(d);
        System.out.println("RES = " + métier.calcul());
    }
}
