// com/mindviewinc/util/CollectionData.java
// �2015 MindView LLC: see Copyright.txt
// A Collection filled with data using a generator object.
package com.mindviewinc.util;
import java.util.*;

public class CollectionData<T> extends ArrayList<T> {
  public CollectionData(Generator<T> gen, int quantity) {
    for(int i = 0; i < quantity; i++)
      add(gen.next());
  }
  // A generic convenience method:
  public static <T> CollectionData<T>
  list(Generator<T> gen, int quantity) {
    return new CollectionData<>(gen, quantity);
  }
}