import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.IntStream;

public class Main {
	public static void main(String[] args) {
	    // Create an arraylist
        List<Person> objectsList = new ArrayList<>();
        objectsList.add(new Person("Najwa"));
        objectsList.add(new Person("Zulema"));
        objectsList.add(new Person("Goya"));

        String toCompareProperty = "Goya";

        // Search for the property in the objectList and return the index
        int index = IntStream.range(0, objectsList.size())
                .filter(i -> objectsList.get(i).getName().equals(toCompareProperty))
                .findFirst()
                .orElse(-1);

		System.out.println(index);
	}
}
