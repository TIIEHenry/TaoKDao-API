package tiiehenry.android.ui.dialogs.mddialogs.list.base

import com.afollestad.materialdialogs.MaterialDialog
import tiiehenry.android.ui.dialogs.api.IDialog

abstract class ListTemp {

    //arrayres
    var itemsRes: Int? = null
    var itemList: List<CharSequence>? = null
    var itemsIds: IntArray? = null

    //    var itemsIdsRes: Int? = null
    var disabledIndices: IntArray? = null

    abstract fun apply(builder: MaterialDialog, idialog: IDialog)

}