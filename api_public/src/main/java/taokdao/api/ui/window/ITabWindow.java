package taokdao.api.ui.window;

import taokdao.api.base.identifiable.Identifiable;
import taokdao.api.ui.base.ITab;

public interface ITabWindow<WINDOW extends IWindow<?>, TAB extends Identifiable<String>> extends IWindow<WINDOW>, ITab<String, TAB> {

}
