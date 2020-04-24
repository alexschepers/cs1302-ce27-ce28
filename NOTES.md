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