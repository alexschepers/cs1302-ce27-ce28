# Notes

## Bubble Sort Algo

```java
void bubble(array, lo, hi, c) {
        for (int i = lo; i < hi; i++) { ------------------------------
            if (c.compare(array[i], array[i + 1]) > 0) {-------> 1     \
                T temp = array[i];                                      |
                array[i] = array[i + 1];                                i ->U(N) =  1 * i
                array[i + 1] = temp;                                    |        = 1 * n [since n = i]
            } // if                                                     |        = n
        } // for -----------------------------------------------------/
} // bubble
```

```java
void bubbleSort(array, lo, hi, c)
 for (int i = lo; i <= hi; i++) { --------------\
            bubble(array, lo, hi, c); ---> U(n) n -> T(n) = U(n) * n
        } // for -------------------------------/         = n * n
} // bubble                                                = n^2
```


## Selection Sort Algo

```java
void selectMin(array, lo, hi, c) {
    // REMEMBER, n = hi - lo + 1
          for (int i = lo; i < hi; i++) {   --------------------\
            if (c.compare(array[lo], array[i + 1]) > 0) {---> 1 |
                T temp = array[i + 1];                          |
                array[i + 1] = array[lo];                       n  -> U(n) = 1 * n
                array[lo] = temp;                               |          = n
            } // if                                             |
        } // for ----------------------------------------------/
} // selectMin
```

```java
void selectionSort(array, lo, hi, c)
    // REMEMBER, n = hi - lo + 1
    for (int i = lo; i < hi; i++) { ------------\
        selectMin(array, i, hi, c);  ----> U(n) n -> T(n) = U(n) * n
    } // for ----------------------------------/          = n * n
} //                                                      = n^2



 ## Partition Algo

```java
void partition(array, lo, pivot, hi, c) {
    // REMEMBER, n = hi - lo + 1
         T temp = array[pivot];
        array[pivot] = array[hi]; --------------------> 1
        array[hi] = temp;
        int i = lo;
        for (int j = lo; j < hi; j++) { -------------------\
            if (c.compare(array[j], array[hi]) < 0) {       |
                T temp1 = array[j];                         |
                array[j] = array[i];                        |
                array[i] = temp1; -------------.> 1          n -> T(n) = n + 2 (i. swapping)
                i++;                                         |
            } // if                                          |
        } // for --------------------------------------------/
        T temp2 = array[i];
        array[i] = array[hi]; -----------------------> 1
        array[hi] = temp2;
        return i;
} // partition
```


 ```java
void partition(array, lo, pivot, hi, c) {
    // REMEMBER, n = hi - lo + 1
         T temp = array[pivot];
        array[pivot] = array[hi];
        array[hi] = temp;
        int i = lo;
        for (int j = lo; j < hi; j++) { --------------------\
            if (c.compare(array[j], array[hi]) < 0) {--> 1  n  -> T(n) = n * 1
                T temp1 = array[j];                         |           = n (ii. comparison)
                array[j] = array[i];                        |
                array[i] = temp1;                           |
                i++;                                        |
            } // if                                         /
        } // for-------------------------------------------
        T temp2 = array[i];
        array[i] = array[hi];
        array[hi] = temp2;
        return i;
} // partition
```
