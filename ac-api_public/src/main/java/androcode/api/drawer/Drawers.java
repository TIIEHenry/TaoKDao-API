package androcode.api.drawer;

public enum Drawers {
    //各种drawer
    START("START"), END("END"),
    TOP("TOP"), BOTTOM("BOTTOM");

    public String name;
    public IDrawer drawer;

    Drawers(String name) {
        this.name = name;
    }

    public static void hideAll() {
        if (START.drawer != null) {
            START.drawer.hideDrawer();
        }
        if (END.drawer != null) {
            END.drawer.hideDrawer();
        }
        if (TOP.drawer != null) {
            TOP.drawer.hideDrawer();
        }
        if (BOTTOM.drawer != null) {
            BOTTOM.drawer.hideDrawer();
        }
    }

    public static void showAll() {
        if (START.drawer != null) {
            START.drawer.showDrawer();
        }
        if (END.drawer != null) {
            END.drawer.showDrawer();
        }
        if (TOP.drawer != null) {
            TOP.drawer.showDrawer();
        }
        if (BOTTOM.drawer != null) {
            BOTTOM.drawer.showDrawer();
        }
    }

    public static boolean isAnyDrawerShow() {
        if (START.drawer != null && START.drawer.isDrawerShown()) {
            return true;
        }
        if (END.drawer != null && END.drawer.isDrawerShown()) {
            return true;
        }
        if (TOP.drawer != null && TOP.drawer.isDrawerShown()) {
            return true;
        }
        if (BOTTOM.drawer != null && BOTTOM.drawer.isDrawerShown()) {
            return true;
        }
        return false;
    }
//
//    public ArrayList<Observer> list = new ArrayList<>();
//
//    public void addObserver(Observer o) {
//        list.add(o);
//    }
//
//    public void removeObserver(Observer o) {
//        list.remove(o);
//    }
//
//    public void runObservers(IMainActivity main) {
//        for (Observer o : list) {
//            o.onAction(main);
//        }
//    }
//
//    interface Observer {
//        void onAction(IMainActivity main);
//    }
}
