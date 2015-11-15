// generics/Fill.java
// �2016 MindView LLC: see Copyright.txt
// We make no guarantees that this code is fit for any purpose.
// Visit http://mindviewinc.com/Books/OnJava/ for more book information.
// Generalizing the FilledList idea
// {main: FillTest}
import java.util.*;

// Doesn't work with "anything that has an add()." There is
// no "Addable" interface so we are narrowed to using a
// Collection. We cannot generalize using generics in
// this case.
public class Fill {
  public static <T> void fill(Collection<T> collection,
  Class<? extends T> classToken, int size) {
    for(int i = 0; i < size; i++)
      // Assumes no-arg constructor:
      try {
        collection.add(classToken.newInstance());
      } catch(InstantiationException |
              IllegalAccessException e) {
        throw new RuntimeException(e);
      }
  }
}

class Contract {
  private static long counter = 0;
  private final long id = counter++;
  @Override
  public String toString() {
    return getClass().getName() + " " + id;
  }
}

class TitleTransfer extends Contract {}

class FillTest {
  public static void main(String[] args) {
    List<Contract> contracts = new ArrayList<>();
    Fill.fill(contracts, Contract.class, 3);
    Fill.fill(contracts, TitleTransfer.class, 2);
    for(Contract c: contracts)
      System.out.println(c);
    SimpleQueue<Contract> contractQueue =
      new SimpleQueue<>();
    // Won't work. fill() is not generic enough:
    // Fill.fill(contractQueue, Contract.class, 3);
  }
}
/* Output:
Contract 0
Contract 1
Contract 2
TitleTransfer 3
TitleTransfer 4
*/
