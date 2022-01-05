package org.lamda;
@FunctionalInterface
public interface GenericAdd<T> {
    T add(T a, T b);
}
