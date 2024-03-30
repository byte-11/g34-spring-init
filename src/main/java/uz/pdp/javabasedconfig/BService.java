package uz.pdp.javabasedconfig;

public class BService {

    private final BDao bDao;

    public BService(BDao bDao) {
        this.bDao = bDao;
    }

    public void serve() {
        System.out.println("[" + BService.class.getName() + "] serve() method called");
        bDao.accessData();
    }

}
