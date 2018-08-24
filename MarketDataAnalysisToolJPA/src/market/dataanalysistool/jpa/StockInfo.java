package market.dataanalysistool.jpa;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;

public class StockInfo implements Serializable {
	public MarketIndicators marketIndicators;
	public BigDecimal get52WeekHigh;
	public BigDecimal get52WeekLow;

	public BigDecimal getGet52WeekHigh() {
		return get52WeekHigh;
	}

	public MarketIndicators getMarketIndicators() {
		return marketIndicators;
	}

	public void setMarketIndicators(MarketIndicators marketIndicators) {
		this.marketIndicators = marketIndicators;
	}

	public void setGet52WeekHigh(BigDecimal get52WeekHigh) {
		this.get52WeekHigh = get52WeekHigh;
	}

	public BigDecimal getGet52WeekLow() {
		return get52WeekLow;
	}

	public void setGet52WeekLow(BigDecimal get52WeekLow) {
		this.get52WeekLow = get52WeekLow;
	}
}
