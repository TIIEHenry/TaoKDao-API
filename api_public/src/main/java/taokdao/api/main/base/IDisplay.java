package taokdao.api.main.base;

public interface IDisplay {
    int getWidth();

    int getHeight();


    float dp2px(float dpValue);

    float px2dp(float pxValue);

    float sp2px(float spValue);

    float px2sp(float pxValue);
}
