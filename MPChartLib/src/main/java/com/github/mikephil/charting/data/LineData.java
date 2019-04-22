
package com.github.mikephil.charting.data;

import java.util.List;

import com.github.mikephil.charting.interfaces.datasets.ILineDataSet;

/**
 * Data object that encapsulates all data associated with a LineChart.
 * 
 * @author Philipp Jahoda
 */
public class LineData extends BarLineScatterCandleBubbleData<ILineDataSet> {

    public LineData() {
        super();
    }

    public LineData(ILineDataSet... dataSets) {
        super(dataSets);
    }

    public LineData(List<ILineDataSet> dataSets) {
        super(dataSets);
    }

    /**
     * Adds an Entry to the DataSet dynamically.
     * Entries are added to the end of the list.
     * This will also recalculate the current minimum and maximum
     * values of the DataSet and the value-sum.
     *
     * @param x
     * @param y
     * @param dataSetIndex
     */
    public void addEntry(float x, float y, int dataSetIndex) {
        super.addEntry(new Entry(x, y), dataSetIndex);
    }
}
