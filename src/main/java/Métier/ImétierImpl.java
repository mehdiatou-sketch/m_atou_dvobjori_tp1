package Métier;

import IDao.IDao;

public class ImétierImpl implements IMétier{
    private IDao dao;

    public ImétierImpl(IDao dao){
        this.dao = dao;
    }

    @Override
    public double calcul(){
        double t = dao.getData();
        return t * 43 / 3;
    }
}
