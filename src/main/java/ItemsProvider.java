import java.util.ArrayList;
import java.util.Arrays;

public class ItemsProvider {
    ArrayList<String> items;

    public ItemsProvider(ArrayList<String> items) {
        this.items = items;
    }

    public ItemsProvider() {
        this.items = new ArrayList<>(Arrays.asList("just", "a", "default", "list", "of", "items"));
    }

    @Override
    public String toString() {
        return "ItemsProvider{" +
                "items=" + items +
                '}';
    }
}
