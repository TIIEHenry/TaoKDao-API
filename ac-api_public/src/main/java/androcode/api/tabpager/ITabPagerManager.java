package androcode.api.tabpager;

public interface ITabPagerManager {
    ITabPagerManager addTabPager(ITabPager data,boolean select);

    void removeTabPager(ITabPager data);

    boolean isShown();

    boolean show();

    boolean hide();
}
