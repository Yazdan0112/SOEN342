import java.util.ArrayList;
import java.util.List;

class ObjectOfInterest {
    String title, category;
    boolean owned;

    public ObjectOfInterest(String title, String category, boolean owned) {
        this.title = title;
        this.category = category;
        this.owned = owned;
    }

     public String getInfo() {
        String status;
        if (owned) {
            status = "Owned";
        } else {
            status = "Not Owned";
        }
        return title + " - " + category + " - " + status;
    }
}
