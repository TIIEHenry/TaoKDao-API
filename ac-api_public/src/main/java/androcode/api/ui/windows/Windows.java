package androcode.api.ui.windows;

public enum Windows {
    //各种drawer
    EXPLORER("START"), END("END"),
    TOP("TOP"), TABTOOL("BOTTOM");

    public String name;
    public IWindow window;

    Windows(String name) {
        this.name = name;
    }

    public static void hideAll() {
        if (EXPLORER.window != null) {
            EXPLORER.window.hideWindow();
        }
        if (END.window != null) {
            END.window.hideWindow();
        }
        if (TOP.window != null) {
            TOP.window.hideWindow();
        }
        if (TABTOOL.window != null) {
            TABTOOL.window.hideWindow();
        }
    }

    public static void showAll() {
        if (EXPLORER.window != null) {
            EXPLORER.window.showWindow();
        }
        if (END.window != null) {
            END.window.showWindow();
        }
        if (TOP.window != null) {
            TOP.window.showWindow();
        }
        if (TABTOOL.window != null) {
            TABTOOL.window.showWindow();
        }
    }

    public static boolean isAnyDrawerShow() {
        if (EXPLORER.window != null && EXPLORER.window.isWindowShown()) {
            return true;
        }
        if (END.window != null && END.window.isWindowShown()) {
            return true;
        }
        if (TOP.window != null && TOP.window.isWindowShown()) {
            return true;
        }
        return TABTOOL.window != null && TABTOOL.window.isWindowShown();
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
