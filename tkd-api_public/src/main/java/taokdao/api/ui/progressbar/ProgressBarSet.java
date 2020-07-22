package taokdao.api.ui.progressbar;

import androidx.annotation.NonNull;

import java.util.ArrayList;

public enum ProgressBarSet {
    /**
     * 控制底部的横向进度条
     */
    BOTTOM_HORIZONTAL("bottom");

    public String label;
    private ArrayList<Observer> observerList = new ArrayList<>();
    private ArrayList<String> userList = new ArrayList<>();

    ProgressBarSet(@NonNull String label) {
        this.label = label;
    }

    public static void clearAllUser() {
        for (ProgressBarSet value : values()) {
            value.clearUser();
        }
    }

    public static void clearAllObserver() {
        for (ProgressBarSet value : values()) {
            value.clearObserver();
        }
    }

    public void addUser(@NonNull String id) {
        userList.add(id);
        for (Observer observer : observerList) {
            observer.onAdded(this, id);
        }
    }

    public void removeUser(@NonNull String id) {
        userList.remove(id);
        for (Observer observer : observerList) {
            observer.onRemoved(this, id);
        }
    }

    public void clearUser() {
        userList.clear();
    }

    public boolean hasUser(@NonNull String id) {
        return userList.contains(id);
    }

    public boolean hasUser() {
        return !userList.isEmpty();
    }

    public void addObserver(@NonNull Observer observer) {
        observerList.add(observer);
    }

    public void removeObserver(@NonNull Observer observer) {
        observerList.remove(observer);
    }

    public void clearObserver() {
        observerList.clear();
    }

    @NonNull
    @Override
    public String toString() {
        return "ProgressBar{" + label + "}";
    }

    public interface Observer {
        void onAdded(@NonNull ProgressBarSet bar, @NonNull String id);

        void onRemoved(@NonNull ProgressBarSet bar, @NonNull String id);
    }
}
