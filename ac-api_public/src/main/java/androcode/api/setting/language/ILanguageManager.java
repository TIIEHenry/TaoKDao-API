package androcode.api.setting.language;

import android.content.res.Configuration;
import android.os.Build;

import androidx.annotation.NonNull;

import java.util.Locale;

public interface ILanguageManager {

    @NonNull
    static Locale getLocale(@NonNull Configuration configuration) {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) {
            return configuration.getLocales().get(0);
        } else {
            return configuration.locale;
        }
    }

    static void setLocale(@NonNull Configuration configuration, @NonNull Locale locale) {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) {
            configuration.setLocale(locale);
        } else {
            configuration.locale = locale;
        }
    }

    @NonNull
    static String getLanguage(@NonNull Locale local) {
        return local.getCountry();
    }

    @NonNull
    static String getCountry(@NonNull Locale local) {
        return local.getLanguage();
    }

    @NonNull
    static String getLanguageCountry(@NonNull Locale local) {
        String language = local.getLanguage();
        String country = local.getCountry();
        if (country.isEmpty())
            return language;
        return language + "-" + country;
    }

    @NonNull
    Locale getLocale();

    void setLocale(@NonNull Locale locale);

    @NonNull
    String getLanguage();

    @NonNull
    String getCountry();

    @NonNull
    String getLanguageCountry();


}
