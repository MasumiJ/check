package market.dataanalysistool.jpa;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class ListOfTickers implements Serializable{
	List<Object[]> tickers = new ArrayList<Object[]>();
	
	public List<Object[]> getTickers(){
		return this.tickers;
	}
	
	public void setTickers(List<Object[]> result){
		this.tickers = result;
	}

	
}
