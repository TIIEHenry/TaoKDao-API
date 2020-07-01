package taokdao.api.ui.content;

import taokdao.base.annotation.maintain.ShortTerm;

@ShortTerm
public interface IContentIOController {
    /**
     * 异步保存当前文件
     */
    void saveCurrentAsync();

    /**
     * 同步保存当前文件
     */
    void saveCurrent();

    /**
     * 异步保存所有文件
     */
    void saveAllAsync();

    /**
     * 同步保存所有文件
     */
    void saveAll();

    /**
     * @param path file
     * @return handled
     */


//    List<String> getOpenedFilePaths();


}
