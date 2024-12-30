package taokdao.api.file.provider;

import android.net.Uri;
import android.os.Environment;
import android.provider.MediaStore;
import android.webkit.MimeTypeMap;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.io.File;

import taokdao.api.file.util.FileUtils;

public interface IFileProvider {
    /**
     * 获取 文件MimeType
     *
     * @param name
     * @return
     */
    static String getMimeType(@NonNull String name) {
        return MimeTypeMap.getSingleton().getMimeTypeFromExtension(FileUtils.getExtension(name));
    }

    static Uri getContentUri(String mimeType) {
        Uri contentUri;
        if (mimeType.startsWith("image")) {
            contentUri = MediaStore.Images.Media.EXTERNAL_CONTENT_URI;
        } else if (mimeType.startsWith("video")) {
            contentUri = MediaStore.Video.Media.EXTERNAL_CONTENT_URI;
        } else if (mimeType.startsWith("audio")) {
            contentUri = MediaStore.Audio.Media.EXTERNAL_CONTENT_URI;
        } else {
            contentUri = MediaStore.Files.getContentUri("external");
        }
        return contentUri;
    }

    /**
     * 获取 文件夹名称(根据mimeType)
     *
     * @param mimeType mimeType
     * @return String dirName
     */
    public static String getDirName(@NonNull String mimeType) {
        String dirName;
        if (mimeType.startsWith("image")) {
            dirName = Environment.DIRECTORY_PICTURES;
        } else if (mimeType.startsWith("video")) {
            dirName = Environment.DIRECTORY_PICTURES;
        } else if (mimeType.startsWith("audio")) {
            dirName = Environment.DIRECTORY_MUSIC;
        } else {
            dirName = Environment.DIRECTORY_DOCUMENTS;
        }
        return dirName;
    }

    @NonNull
    String getAuthority();

    /**
     * 获取 FileUri
     *
     * @param file
     * @return
     */
    Uri getFileUri(@NonNull File file);

    /**
     * 获取 ContentUri
     *
     * @param file
     * @return
     */
    @Nullable
    Uri getContentUri(@NonNull File file);

    /**
     * 获取 重复文件Uri
     *
     * @param file
     * @return
     */
    @Nullable
    Uri getDuplicateFileUri(@NonNull File file);

    /**
     * 获取 Name
     *
     * @param uri
     * @return
     */
    @Nullable
    String getName(@NonNull Uri uri);

    /**
     * 获取 文件MimeType
     *
     * @param uri
     * @return
     */
    @Nullable
    String getMimeType(@NonNull Uri uri);

    /**
     * 复制文件到外部
     * <p>
     * 访问共享存储空间中的媒体文件：https://developer.android.com/training/data-storage/shared/media#add-item
     *
     * @param dirName 目录名(例如："/Pictures/WeChat"中的"WeChat")
     * @param file    file
     * @return Uri
     */
    @Nullable
    Uri copyFileToExternal(@NonNull File file, @Nullable String dirName);

    /**
     * 删除
     * <p>
     * 注意：
     * 只适用于系统文件选择器返回的Uri，其他Uri会报错
     * <p>
     * 从共享存储空间访问文档和其他文件：https://developer.android.com/training/data-storage/shared/documents-files#delete
     *
     * @param uri uri
     * @return boolean
     */
    boolean deleteSystem(@NonNull Uri uri);


    /**
     * 删除
     * <p>
     * 注意：
     * 只适用于应用自身创建的媒体文件；
     * 文档等其他类型文件无法删除，其他App的文件也无法删除成功，只能删除媒体库里的Uri数据，实际文件并没有删除。
     * 操作其他App的数据需要用户授予权限，catch RecoverableSecurityException 异常，然后请求权限，具体见官方文档。
     * <p>
     * 访问共享存储空间中的媒体文件：https://developer.android.com/training/data-storage/shared/media#remove-item
     *
     * @param uri uri
     * @return boolean
     */
    public boolean delete(@NonNull Uri uri);
}
