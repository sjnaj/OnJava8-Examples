// containersindepth/CollectionDataTest.java
// �2015 MindView LLC: see Copyright.txt
import java.util.*;
import com.mindviewinc.util.*;

class Government implements Generator<String> {
  String[] foundation = ("strange women lying in ponds " +
    "distributing swords is no basis for a system of " +
    "government").split(" ");
  private int index;
  @Override
  public String next() { return foundation[index++]; }
}

public class CollectionDataTest {
  public static void main(String[] args) {
    Set<String> set = new LinkedHashSet<>(
      new CollectionData<>(new Government(), 15));
    // Using the convenience method:
    set.addAll(CollectionData.list(new Government(), 15));
    System.out.println(set);
  }
}
/* Output:
[strange, women, lying, in, ponds, distributing, swords,
is, no, basis, for, a, system, of, government]
*/