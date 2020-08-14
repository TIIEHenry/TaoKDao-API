package taokdao.api.data.mmkv;

import android.os.Parcelable;

import java.util.Set;

public interface IMMKV {
    boolean encode(String key, boolean value);

    boolean decodeBool(String key);

    boolean decodeBool(String key, boolean defaultValue);

    boolean encode(String key, int value);

    int decodeInt(String key);

    int decodeInt(String key, int defaultValue);

    boolean encode(String key, long value);

    long decodeLong(String key);

    long decodeLong(String key, long defaultValue);

    boolean encode(String key, float value);

    float decodeFloat(String key);

    float decodeFloat(String key, float defaultValue);

    boolean encode(String key, double value);

    double decodeDouble(String key);

    double decodeDouble(String key, double defaultValue);

    boolean encode(String key, String value);

    String decodeString(String key);

    String decodeString(String key, String defaultValue);

    boolean encode(String key, Set<String> value);

    Set<String> decodeStringSet(String key);

    Set<String> decodeStringSet(String key, Set<String> defaultValue);

    Set<String> decodeStringSet(String key, Set<String> defaultValue, Class<? extends Set> cls);

    boolean encode(String key, byte[] value);

    byte[] decodeBytes(String key);

    byte[] decodeBytes(String key, byte[] defaultValue);

    boolean encode(String key, Parcelable value);

    <T extends Parcelable> T decodeParcelable(String key, Class<T> tClass);

    <T extends Parcelable> T decodeParcelable(String key, Class<T> tClass, T defaultValue);

    int getValueSize(String key);

    int getValueActualSize(String key);

    boolean containsKey(String key);

    String[] allKeys();

    long count();

    long totalSize();

    void removeValueForKey(String key);

    void clearAll();

    void trim();

    void close();

    void clearMemoryCache();

    void sync();

    void async();
}
