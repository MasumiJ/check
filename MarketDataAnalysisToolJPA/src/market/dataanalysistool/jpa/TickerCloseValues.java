package market.dataanalysistool.jpa;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class TickerCloseValues implements Serializable{
	List<DataPoint> stockCloseValueList= new ArrayList<DataPoint>();
	public List<DataPoint> getStockCloseValueList() {
		return stockCloseValueList;
	}
	public void setStockCloseValueList(List<DataPoint> stockCloseValueList) {
		this.stockCloseValueList = stockCloseValueList;
	}
}
