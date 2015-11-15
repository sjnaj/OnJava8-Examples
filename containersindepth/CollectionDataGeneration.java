// containersindepth/CollectionDataGeneration.java
// �2016 MindView LLC: see Copyright.txt
// We make no guarantees that this code is fit for any purpose.
// Visit http://mindviewinc.com/Books/OnJava/ for more book information.
// Using the Suppliers defined in the Arrays chapter.
import java.util.*;
import onjava.*;

public class CollectionDataGeneration {
  public static void main(String[] args) {
    System.out.println(new ArrayList<>(
      CollectionData.list( // Convenience method
        new RandomSupplier.String(9), 10)));
    System.out.println(new HashSet<>(
      new CollectionData<>(
        new RandomSupplier.Integer(), 10)));
  }
}
/* Output:
[YNzbrnyGc, FOWZnTcQr, GseGZMmJM, RoEsuEcUO, neOEdLsmw,
HLGEahKcx, rEqUCBbkI, naMesbtWH, kjUrUkZPg, wsqPzDyCy]
[2017, 8037, 871, 7882, 6090, 4779, 299, 573, 4367, 3455]
*/
