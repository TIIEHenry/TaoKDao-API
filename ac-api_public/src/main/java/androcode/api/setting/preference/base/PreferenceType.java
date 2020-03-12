package androcode.api.setting.preference.base;

public enum PreferenceType {
    TYPE_CATEGORY(-2),
    TYPE_TITLE(-1),
    TYPE_VIEW(0),
    TYPE_SWITCH(2), TYPE_CHECKBOX(3),
    TYPE_TEXT(1), TYPE_EDIT_TEXT(4),
    TYPE_CHOICE_SINGLE(5), TYPE_CHOICE_MULTI(6);

    public final int id;

    PreferenceType(int id) {
        this.id = id;
    }
}
