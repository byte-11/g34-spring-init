package uz.pdp.xmlbasedconfig;

public class CService implements XMLService{

    private final CDao cDao;

    public CService(CDao cDaoBean) {
        this.cDao = cDaoBean;
    }

    /*private CDao cDao;*/

    public void serve() {
        System.out.println("[" + CService.class.getName() + "] serve() method called");
        cDao.accessData();
    }

    /*public void setcDao(CDao cDao) {
        this.cDao = cDao;
    }*/
}
