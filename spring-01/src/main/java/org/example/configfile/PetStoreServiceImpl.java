package org.example.configfile;

public class PetStoreServiceImpl {

    private JpaAccountDao accountDao;

    private JpaItemDao itemDao;

    public void setAccountDao(JpaAccountDao accountDao) {
        this.accountDao = accountDao;
    }

    public void setItemDao(JpaItemDao itemDao) {
        this.itemDao = itemDao;
    }
}
