package org.jzy3d.junit;
import java.awt.image.BufferedImage;
import java.util.ArrayList;
import java.util.List;

import org.jzy3d.maths.IntegerCoord2d;


public class ChartTestFailed extends Exception{
	/**
     * 
     */
    private static final long serialVersionUID = 3514756078633688965L;
    public ChartTestFailed() {
		super();
	}

	public ChartTestFailed(String message, Throwable cause) {
		super(message, cause);
	}

	public ChartTestFailed(String message) {
		super(message);
	}

	public ChartTestFailed(Throwable cause) {
		super(cause);
	}
	
	public ChartTestFailed(String message, BufferedImage actual, BufferedImage expected) {
		super(message);
		this.actual = actual;
		this.expected = expected;
	}

	public BufferedImage getActualImage() {
		return actual;
	}

	public BufferedImage getExpectedImage() {
		return expected;
	}
	
	public void addDiffCoordinates(int i, int j){
	    if(diffs==null)
	        diffs = new ArrayList<IntegerCoord2d>();
	    diffs.add(new IntegerCoord2d(i, j));
	}
	
	public List<IntegerCoord2d> getDiffCoordinates(){
	    return diffs;
	}

	protected BufferedImage actual;
	protected BufferedImage expected;
	protected List<IntegerCoord2d> diffs;
}

