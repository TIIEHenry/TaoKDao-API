package tiiehenry.android.ui.dialogs.mddialogs.list.regular

import com.afollestad.materialdialogs.MaterialDialog
import com.afollestad.materialdialogs.list.listItems
import tiiehenry.android.ui.dialogs.api.IDialog
import tiiehenry.android.ui.dialogs.api.callback.ListCallback
import tiiehenry.android.ui.dialogs.mddialogs.list.base.ListTemp

class RegularListTemp : ListTemp() {
    var itemCallback: ListCallback? = null

    override fun apply(builder: MaterialDialog, idialog: IDialog) {

        builder.listItems(
            res = itemsRes, items = itemList ?: itemsIds?.map { builder.context.getString(it) },
            disabledIndices = disabledIndices,
            waitForPositiveButton = false
        ) { dialog, index, text ->
            itemCallback?.onSelection(idialog, index, text.toString())
        }
    }

}