/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.meteothink.data.dataframe;

import org.meteothink.data.dataframe.impl.Grouping;

/**
 *
 * @author Yaqiang Wang
 */
public abstract class GroupBy {
    // <editor-fold desc="Variables">
    protected Grouping groups;
    // </editor-fold>
    // <editor-fold desc="Constructor">
    // </editor-fold>
    // <editor-fold desc="Get Set Methods">
    // </editor-fold>
    // <editor-fold desc="Methods">
    public abstract Object count();
    
    public abstract Object sum();
    
    public abstract Object mean();
    
    public abstract Object min();
    
    public abstract Object max();
    
    public abstract Object median();
    
    public abstract Object stdDev();
    // </editor-fold>
}
