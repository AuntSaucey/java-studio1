import java.util.ArrayList;
import java.util.Date;

public class Menu {
    private Date lastUpdated;
    private ArrayList<MenuItem> menuItems;

    public Menu() {
        this.menuItems = new ArrayList<>();
        this.lastUpdated = new Date();
    }

    public void addMenuItem(MenuItem menuItem) {
        menuItems.add(menuItem);
        lastUpdated = new Date();
    }
}

