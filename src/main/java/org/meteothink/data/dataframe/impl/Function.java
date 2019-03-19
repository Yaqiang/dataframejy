/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.meteothink.data.dataframe.impl;

/**
 * A function that is applied to objects (rows or values) in a
 * DataFrame.
 *
 * <p>
 * Implementors define {@link #apply(Object)} to perform the desired calculation
 * and return the result.</p>
 *
 * @param <I> the type of the input values
 * @param <O> the type of the output values
 */
public interface Function<I, O> {

    /**
     * Perform computation on the specified input value and return the result.
     *
     * @param value the input value
     * @return the result
     */
    O apply(I value);
}
