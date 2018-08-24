package market.dataanalysistool.jpa;

import java.io.Serializable;

public class DataPoint implements Serializable {
	private static final long serialVersionUID = 1L;
	private int date;
	private Double yCoordinate;
	
	
	public int getDate() {
		return date;
	}
	public void setDate(int date) {
		this.date = date;
	}
	public Double getyCoordinate() {
		return yCoordinate;
	}
	public void setyCoordinate(Double yCoordinate) {
		this.yCoordinate = yCoordinate;
	}
	
}
