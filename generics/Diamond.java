// generics/Diamond.java
// �2016 MindView LLC: see Copyright.txt
// We make no guarantees that this code is fit for any purpose.
// Visit http://mindviewinc.com/Books/OnJava/ for more book information.

class Bob {}

public class Diamond<T> {
  public static void main(String[] args) {
    GenericHolder<Bob> h3 = new GenericHolder<>();
    h3.set(new Bob());
  }
}
/* Output: (None) */
